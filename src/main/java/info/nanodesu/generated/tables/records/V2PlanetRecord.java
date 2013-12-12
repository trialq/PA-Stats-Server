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
public class V2PlanetRecord extends org.jooq.impl.UpdatableRecordImpl<info.nanodesu.generated.tables.records.V2PlanetRecord> implements org.jooq.Record8<java.lang.Integer, java.lang.Integer, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 770837199;

	/**
	 * Setter for <code>public.v2_planet.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.v2_planet.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.v2_planet.seed</code>. 
	 */
	public void setSeed(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.v2_planet.seed</code>. 
	 */
	public java.lang.Integer getSeed() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.v2_planet.temperature</code>. 
	 */
	public void setTemperature(java.math.BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.v2_planet.temperature</code>. 
	 */
	public java.math.BigDecimal getTemperature() {
		return (java.math.BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>public.v2_planet.water_height</code>. 
	 */
	public void setWaterHeight(java.math.BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.v2_planet.water_height</code>. 
	 */
	public java.math.BigDecimal getWaterHeight() {
		return (java.math.BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>public.v2_planet.height_range</code>. 
	 */
	public void setHeightRange(java.math.BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.v2_planet.height_range</code>. 
	 */
	public java.math.BigDecimal getHeightRange() {
		return (java.math.BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>public.v2_planet.radius</code>. 
	 */
	public void setRadius(java.math.BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.v2_planet.radius</code>. 
	 */
	public java.math.BigDecimal getRadius() {
		return (java.math.BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>public.v2_planet.biome</code>. 
	 */
	public void setBiome(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.v2_planet.biome</code>. 
	 */
	public java.lang.String getBiome() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>public.v2_planet.planet_name</code>. 
	 */
	public void setPlanetName(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.v2_planet.planet_name</code>. 
	 */
	public java.lang.String getPlanetName() {
		return (java.lang.String) getValue(7);
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
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Integer, java.lang.Integer, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Integer, java.lang.Integer, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return info.nanodesu.generated.tables.V2Planet.V2_PLANET.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return info.nanodesu.generated.tables.V2Planet.V2_PLANET.SEED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field3() {
		return info.nanodesu.generated.tables.V2Planet.V2_PLANET.TEMPERATURE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field4() {
		return info.nanodesu.generated.tables.V2Planet.V2_PLANET.WATER_HEIGHT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field5() {
		return info.nanodesu.generated.tables.V2Planet.V2_PLANET.HEIGHT_RANGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field6() {
		return info.nanodesu.generated.tables.V2Planet.V2_PLANET.RADIUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return info.nanodesu.generated.tables.V2Planet.V2_PLANET.BIOME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return info.nanodesu.generated.tables.V2Planet.V2_PLANET.PLANET_NAME;
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
		return getSeed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value3() {
		return getTemperature();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value4() {
		return getWaterHeight();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value5() {
		return getHeightRange();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value6() {
		return getRadius();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getBiome();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getPlanetName();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached V2PlanetRecord
	 */
	public V2PlanetRecord() {
		super(info.nanodesu.generated.tables.V2Planet.V2_PLANET);
	}

	/**
	 * Create a detached, initialised V2PlanetRecord
	 */
	public V2PlanetRecord(java.lang.Integer id, java.lang.Integer seed, java.math.BigDecimal temperature, java.math.BigDecimal waterHeight, java.math.BigDecimal heightRange, java.math.BigDecimal radius, java.lang.String biome, java.lang.String planetName) {
		super(info.nanodesu.generated.tables.V2Planet.V2_PLANET);

		setValue(0, id);
		setValue(1, seed);
		setValue(2, temperature);
		setValue(3, waterHeight);
		setValue(4, heightRange);
		setValue(5, radius);
		setValue(6, biome);
		setValue(7, planetName);
	}
}