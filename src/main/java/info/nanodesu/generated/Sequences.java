/**
 * This class is generated by jOOQ
 */
package info.nanodesu.generated;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all sequences in public
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

	/**
	 * The sequence <code>public.team_id</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> TEAM_ID = new org.jooq.impl.SequenceImpl<java.lang.Long>("team_id", info.nanodesu.generated.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.v2_army_events_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> V2_ARMY_EVENTS_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("v2_army_events_id_seq", info.nanodesu.generated.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.v2_display_name_history_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> V2_DISPLAY_NAME_HISTORY_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("v2_display_name_history_id_seq", info.nanodesu.generated.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.v2_game_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> V2_GAME_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("v2_game_id_seq", info.nanodesu.generated.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.v2_planet_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> V2_PLANET_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("v2_planet_id_seq", info.nanodesu.generated.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.v2_player_display_name_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> V2_PLAYER_DISPLAY_NAME_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("v2_player_display_name_id_seq", info.nanodesu.generated.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.v2_player_game_rel_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> V2_PLAYER_GAME_REL_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("v2_player_game_rel_id_seq", info.nanodesu.generated.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.v2_player_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> V2_PLAYER_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("v2_player_id_seq", info.nanodesu.generated.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.v2_spec_keys_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> V2_SPEC_KEYS_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("v2_spec_keys_id_seq", info.nanodesu.generated.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.v2_timepoint_stats_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> V2_TIMEPOINT_STATS_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("v2_timepoint_stats_id_seq", info.nanodesu.generated.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
