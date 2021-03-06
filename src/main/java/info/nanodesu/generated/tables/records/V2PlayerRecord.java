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
public class V2PlayerRecord extends org.jooq.impl.UpdatableRecordImpl<info.nanodesu.generated.tables.records.V2PlayerRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = 1292607606;

	/**
	 * Setter for <code>public.v2_player.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.v2_player.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.v2_player.uber_name</code>. 
	 */
	public void setUberName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.v2_player.uber_name</code>. 
	 */
	public java.lang.String getUberName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.v2_player.current_display_name</code>. 
	 */
	public void setCurrentDisplayName(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.v2_player.current_display_name</code>. 
	 */
	public java.lang.Integer getCurrentDisplayName() {
		return (java.lang.Integer) getValue(2);
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
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return info.nanodesu.generated.tables.V2Player.V2_PLAYER.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return info.nanodesu.generated.tables.V2Player.V2_PLAYER.UBER_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return info.nanodesu.generated.tables.V2Player.V2_PLAYER.CURRENT_DISPLAY_NAME;
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
	public java.lang.String value2() {
		return getUberName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getCurrentDisplayName();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached V2PlayerRecord
	 */
	public V2PlayerRecord() {
		super(info.nanodesu.generated.tables.V2Player.V2_PLAYER);
	}

	/**
	 * Create a detached, initialised V2PlayerRecord
	 */
	public V2PlayerRecord(java.lang.Integer id, java.lang.String uberName, java.lang.Integer currentDisplayName) {
		super(info.nanodesu.generated.tables.V2Player.V2_PLAYER);

		setValue(0, id);
		setValue(1, uberName);
		setValue(2, currentDisplayName);
	}
}
