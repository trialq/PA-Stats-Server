/**
 * This class is generated by jOOQ
 */
package info.nanodesu.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class V2TimepointStatsRecord extends org.jooq.impl.UpdatableRecordImpl<info.nanodesu.generated.tables.records.V2TimepointStatsRecord> implements org.jooq.Record17<java.lang.Integer, java.lang.Integer, java.sql.Timestamp, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 499672077;

	/**
	 * Setter for <code>public.v2_timepoint_stats.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.v2_timepoint_stats.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.v2_timepoint_stats.player_game</code>. 
	 */
	public void setPlayerGame(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.v2_timepoint_stats.player_game</code>. 
	 */
	public java.lang.Integer getPlayerGame() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.v2_timepoint_stats.timepoint</code>. 
	 */
	public void setTimepoint(java.sql.Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.v2_timepoint_stats.timepoint</code>. 
	 */
	public java.sql.Timestamp getTimepoint() {
		return (java.sql.Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>public.v2_timepoint_stats.army_count</code>. 
	 */
	public void setArmyCount(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.v2_timepoint_stats.army_count</code>. 
	 */
	public java.lang.Integer getArmyCount() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>public.v2_timepoint_stats.metal_income</code>. 
	 */
	public void setMetalIncome(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.v2_timepoint_stats.metal_income</code>. 
	 */
	public java.lang.Integer getMetalIncome() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>public.v2_timepoint_stats.energy_income</code>. 
	 */
	public void setEnergyIncome(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.v2_timepoint_stats.energy_income</code>. 
	 */
	public java.lang.Integer getEnergyIncome() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>public.v2_timepoint_stats.metal_income_net</code>. 
	 */
	public void setMetalIncomeNet(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.v2_timepoint_stats.metal_income_net</code>. 
	 */
	public java.lang.Integer getMetalIncomeNet() {
		return (java.lang.Integer) getValue(6);
	}

	/**
	 * Setter for <code>public.v2_timepoint_stats.energy_income_net</code>. 
	 */
	public void setEnergyIncomeNet(java.lang.Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.v2_timepoint_stats.energy_income_net</code>. 
	 */
	public java.lang.Integer getEnergyIncomeNet() {
		return (java.lang.Integer) getValue(7);
	}

	/**
	 * Setter for <code>public.v2_timepoint_stats.metal_spending</code>. 
	 */
	public void setMetalSpending(java.lang.Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>public.v2_timepoint_stats.metal_spending</code>. 
	 */
	public java.lang.Integer getMetalSpending() {
		return (java.lang.Integer) getValue(8);
	}

	/**
	 * Setter for <code>public.v2_timepoint_stats.energy_spending</code>. 
	 */
	public void setEnergySpending(java.lang.Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>public.v2_timepoint_stats.energy_spending</code>. 
	 */
	public java.lang.Integer getEnergySpending() {
		return (java.lang.Integer) getValue(9);
	}

	/**
	 * Setter for <code>public.v2_timepoint_stats.metal_stored</code>. 
	 */
	public void setMetalStored(java.lang.Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>public.v2_timepoint_stats.metal_stored</code>. 
	 */
	public java.lang.Integer getMetalStored() {
		return (java.lang.Integer) getValue(10);
	}

	/**
	 * Setter for <code>public.v2_timepoint_stats.energy_stored</code>. 
	 */
	public void setEnergyStored(java.lang.Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>public.v2_timepoint_stats.energy_stored</code>. 
	 */
	public java.lang.Integer getEnergyStored() {
		return (java.lang.Integer) getValue(11);
	}

	/**
	 * Setter for <code>public.v2_timepoint_stats.metal_collected</code>. 
	 */
	public void setMetalCollected(java.lang.Integer value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>public.v2_timepoint_stats.metal_collected</code>. 
	 */
	public java.lang.Integer getMetalCollected() {
		return (java.lang.Integer) getValue(12);
	}

	/**
	 * Setter for <code>public.v2_timepoint_stats.energy_collected</code>. 
	 */
	public void setEnergyCollected(java.lang.Integer value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>public.v2_timepoint_stats.energy_collected</code>. 
	 */
	public java.lang.Integer getEnergyCollected() {
		return (java.lang.Integer) getValue(13);
	}

	/**
	 * Setter for <code>public.v2_timepoint_stats.metal_wasted</code>. 
	 */
	public void setMetalWasted(java.lang.Integer value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>public.v2_timepoint_stats.metal_wasted</code>. 
	 */
	public java.lang.Integer getMetalWasted() {
		return (java.lang.Integer) getValue(14);
	}

	/**
	 * Setter for <code>public.v2_timepoint_stats.energy_wasted</code>. 
	 */
	public void setEnergyWasted(java.lang.Integer value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>public.v2_timepoint_stats.energy_wasted</code>. 
	 */
	public java.lang.Integer getEnergyWasted() {
		return (java.lang.Integer) getValue(15);
	}

	/**
	 * Setter for <code>public.v2_timepoint_stats.apm</code>. 
	 */
	public void setApm(java.lang.Integer value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>public.v2_timepoint_stats.apm</code>. 
	 */
	public java.lang.Integer getApm() {
		return (java.lang.Integer) getValue(16);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record17 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row17<java.lang.Integer, java.lang.Integer, java.sql.Timestamp, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row17) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row17<java.lang.Integer, java.lang.Integer, java.sql.Timestamp, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row17) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return info.nanodesu.generated.tables.V2TimepointStats.V2_TIMEPOINT_STATS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return info.nanodesu.generated.tables.V2TimepointStats.V2_TIMEPOINT_STATS.PLAYER_GAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field3() {
		return info.nanodesu.generated.tables.V2TimepointStats.V2_TIMEPOINT_STATS.TIMEPOINT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return info.nanodesu.generated.tables.V2TimepointStats.V2_TIMEPOINT_STATS.ARMY_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return info.nanodesu.generated.tables.V2TimepointStats.V2_TIMEPOINT_STATS.METAL_INCOME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return info.nanodesu.generated.tables.V2TimepointStats.V2_TIMEPOINT_STATS.ENERGY_INCOME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return info.nanodesu.generated.tables.V2TimepointStats.V2_TIMEPOINT_STATS.METAL_INCOME_NET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field8() {
		return info.nanodesu.generated.tables.V2TimepointStats.V2_TIMEPOINT_STATS.ENERGY_INCOME_NET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field9() {
		return info.nanodesu.generated.tables.V2TimepointStats.V2_TIMEPOINT_STATS.METAL_SPENDING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field10() {
		return info.nanodesu.generated.tables.V2TimepointStats.V2_TIMEPOINT_STATS.ENERGY_SPENDING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field11() {
		return info.nanodesu.generated.tables.V2TimepointStats.V2_TIMEPOINT_STATS.METAL_STORED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field12() {
		return info.nanodesu.generated.tables.V2TimepointStats.V2_TIMEPOINT_STATS.ENERGY_STORED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field13() {
		return info.nanodesu.generated.tables.V2TimepointStats.V2_TIMEPOINT_STATS.METAL_COLLECTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field14() {
		return info.nanodesu.generated.tables.V2TimepointStats.V2_TIMEPOINT_STATS.ENERGY_COLLECTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field15() {
		return info.nanodesu.generated.tables.V2TimepointStats.V2_TIMEPOINT_STATS.METAL_WASTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field16() {
		return info.nanodesu.generated.tables.V2TimepointStats.V2_TIMEPOINT_STATS.ENERGY_WASTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field17() {
		return info.nanodesu.generated.tables.V2TimepointStats.V2_TIMEPOINT_STATS.APM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getPlayerGame();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value3() {
		return getTimepoint();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getArmyCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getMetalIncome();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getEnergyIncome();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getMetalIncomeNet();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value8() {
		return getEnergyIncomeNet();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value9() {
		return getMetalSpending();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value10() {
		return getEnergySpending();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value11() {
		return getMetalStored();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value12() {
		return getEnergyStored();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value13() {
		return getMetalCollected();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value14() {
		return getEnergyCollected();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value15() {
		return getMetalWasted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value16() {
		return getEnergyWasted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value17() {
		return getApm();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached V2TimepointStatsRecord
	 */
	public V2TimepointStatsRecord() {
		super(info.nanodesu.generated.tables.V2TimepointStats.V2_TIMEPOINT_STATS);
	}

	/**
	 * Create a detached, initialised V2TimepointStatsRecord
	 */
	public V2TimepointStatsRecord(java.lang.Integer id, java.lang.Integer playerGame, java.sql.Timestamp timepoint, java.lang.Integer armyCount, java.lang.Integer metalIncome, java.lang.Integer energyIncome, java.lang.Integer metalIncomeNet, java.lang.Integer energyIncomeNet, java.lang.Integer metalSpending, java.lang.Integer energySpending, java.lang.Integer metalStored, java.lang.Integer energyStored, java.lang.Integer metalCollected, java.lang.Integer energyCollected, java.lang.Integer metalWasted, java.lang.Integer energyWasted, java.lang.Integer apm) {
		super(info.nanodesu.generated.tables.V2TimepointStats.V2_TIMEPOINT_STATS);

		setValue(0, id);
		setValue(1, playerGame);
		setValue(2, timepoint);
		setValue(3, armyCount);
		setValue(4, metalIncome);
		setValue(5, energyIncome);
		setValue(6, metalIncomeNet);
		setValue(7, energyIncomeNet);
		setValue(8, metalSpending);
		setValue(9, energySpending);
		setValue(10, metalStored);
		setValue(11, energyStored);
		setValue(12, metalCollected);
		setValue(13, energyCollected);
		setValue(14, metalWasted);
		setValue(15, energyWasted);
		setValue(16, apm);
	}
}
