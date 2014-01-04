package info.nanodesu.snippet.lib

import net.liftweb.http.DispatchSnippet
import net.liftweb.util.Helpers._
import info.nanodesu.snippet.GameInfo
import net.liftweb.util.Helpers._
import info.nanodesu.pages.GamePage
import net.liftweb.common.Box
import info.nanodesu.model.db.collectors.gameinfo.loader.ActiveReportersForGameLoader
import info.nanodesu.comet.PlayerGameInfo
import info.nanodesu.lib.db.CookieBox
import info.nanodesu.model.db.collectors.playerinfo.GameAndPlayerInfoCollector
import info.nanodesu.model.db.collectors.gameinfo.loader.GameTimesLoader
import net.liftweb.common.Loggable
import info.nanodesu.snippet.cometrenderer.PlayerInfoRenderer
import net.liftweb.util.CssSel
import info.nanodesu.snippet.cometrenderer.GameInfoRenderer
import info.nanodesu.snippet.cometrenderer.ArmyCompositionRenderer
import info.nanodesu.snippet.cometrenderer.GameChartDataRenderer

object CometInit extends DispatchSnippet with Loggable {
  val cometServePastThreshold = 1800 * 1000 // 30min

  val playerGameInfoKey = "game_player_lines_"
  val gameInfoKey = "game_general_"
  val gameArmyComposition = "game_army_composition_"
  val gameChartComet = "game_chart_comet_"
    
  val dispatch: DispatchIt = {
    case "playerGameInfo" => doPlayerGameInfo
    case "gameGeneralInfo" => doGameGeneralInfo
    case "gameArmyComposition" => doGameArmyComposition
    case "gameChartInfo" => doGameChartInfo
  }

  private def shouldBeConsideredLive(gameId: Int): Boolean = {
    val time = CookieBox withSession (new GameTimesLoader(_).selectEndTimeForGame(gameId))
    val threshold = (time + cometServePastThreshold)
    threshold > System.currentTimeMillis()
  }

  private def doGameChartInfo = doCometOrSnippet(new GameChartDataRenderer(_).render, "GameChartComet", gameChartComet)
  
  private def doPlayerGameInfo = doCometOrSnippet(new PlayerInfoRenderer(_).render, "PlayerGameInfo", playerGameInfoKey)

  private def doCometOrSnippet(renderSnippet: Int => CssSel, cometType: String, cometKey: String) = {
    val renderer = for (gid <- GamePage.getGameId) yield {
      if (shouldBeConsideredLive(gid)) {
        makeShinyComet(cometType, cometKey, gid)
      } else {
        renderSnippet(gid)
      }
    }
    renderer openOr "#noop" #> ""
  }
  
  private def doGameGeneralInfo = doCometOrSnippet(new GameInfoRenderer(_).render, "GeneralGameInfo", gameInfoKey)
  private def doGameArmyComposition = doCometOrSnippet(new ArmyCompositionRenderer(_).render, "GameArmyComposition", gameArmyComposition)

  private def makeShinyComet(typ: String, key: String, gid: Int): net.liftweb.util.CssSel = {
    ".shiny_comet [data-lift]" #> ("comet?type=" + typ + "&name=" + key + gid)
  }
}