/**
 * This class is generated by jOOQ
 */
package info.nanodesu.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class V2Planet extends org.jooq.impl.TableImpl<info.nanodesu.generated.tables.records.V2PlanetRecord> {

	private static final long serialVersionUID = 876042059;

	/**
	 * The singleton instance of <code>public.v2_planet</code>
	 */
	public static final info.nanodesu.generated.tables.V2Planet V2_PLANET = new info.nanodesu.generated.tables.V2Planet();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<info.nanodesu.generated.tables.records.V2PlanetRecord> getRecordType() {
		return info.nanodesu.generated.tables.records.V2PlanetRecord.class;
	}

	/**
	 * The column <code>public.v2_planet.id</code>. 
	 */
	public final org.jooq.TableField<info.nanodesu.generated.tables.records.V2PlanetRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>public.v2_planet.seed</code>. 
	 */
	public final org.jooq.TableField<info.nanodesu.generated.tables.records.V2PlanetRecord, java.lang.Integer> SEED = createField("seed", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>public.v2_planet.temperature</code>. 
	 */
	public final org.jooq.TableField<info.nanodesu.generated.tables.records.V2PlanetRecord, java.math.BigDecimal> TEMPERATURE = createField("temperature", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this);

	/**
	 * The column <code>public.v2_planet.water_height</code>. 
	 */
	public final org.jooq.TableField<info.nanodesu.generated.tables.records.V2PlanetRecord, java.math.BigDecimal> WATER_HEIGHT = createField("water_height", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this);

	/**
	 * The column <code>public.v2_planet.height_range</code>. 
	 */
	public final org.jooq.TableField<info.nanodesu.generated.tables.records.V2PlanetRecord, java.math.BigDecimal> HEIGHT_RANGE = createField("height_range", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this);

	/**
	 * The column <code>public.v2_planet.radius</code>. 
	 */
	public final org.jooq.TableField<info.nanodesu.generated.tables.records.V2PlanetRecord, java.math.BigDecimal> RADIUS = createField("radius", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this);

	/**
	 * The column <code>public.v2_planet.biome</code>. 
	 */
	public final org.jooq.TableField<info.nanodesu.generated.tables.records.V2PlanetRecord, java.lang.String> BIOME = createField("biome", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this);

	/**
	 * The column <code>public.v2_planet.planet_name</code>. 
	 */
	public final org.jooq.TableField<info.nanodesu.generated.tables.records.V2PlanetRecord, java.lang.String> PLANET_NAME = createField("planet_name", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this);

	/**
	 * Create a <code>public.v2_planet</code> table reference
	 */
	public V2Planet() {
		super("v2_planet", info.nanodesu.generated.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.v2_planet</code> table reference
	 */
	public V2Planet(java.lang.String alias) {
		super(alias, info.nanodesu.generated.Public.PUBLIC, info.nanodesu.generated.tables.V2Planet.V2_PLANET);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<info.nanodesu.generated.tables.records.V2PlanetRecord, java.lang.Integer> getIdentity() {
		return info.nanodesu.generated.Keys.IDENTITY_V2_PLANET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<info.nanodesu.generated.tables.records.V2PlanetRecord> getPrimaryKey() {
		return info.nanodesu.generated.Keys.V2_PLANET_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<info.nanodesu.generated.tables.records.V2PlanetRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<info.nanodesu.generated.tables.records.V2PlanetRecord>>asList(info.nanodesu.generated.Keys.V2_PLANET_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public info.nanodesu.generated.tables.V2Planet as(java.lang.String alias) {
		return new info.nanodesu.generated.tables.V2Planet(alias);
	}
}
