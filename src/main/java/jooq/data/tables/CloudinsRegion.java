/**
 * This class is generated by jOOQ
 */
package jooq.data.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.data.CloudinsApm;
import jooq.data.Keys;
import jooq.data.tables.records.CloudinsRegionRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CloudinsRegion extends TableImpl<CloudinsRegionRecord> {

    private static final long serialVersionUID = -590200440;

    /**
     * The reference instance of <code>cloudins_apm.cloudins_region</code>
     */
    public static final CloudinsRegion CLOUDINS_REGION = new CloudinsRegion();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CloudinsRegionRecord> getRecordType() {
        return CloudinsRegionRecord.class;
    }

    /**
     * The column <code>cloudins_apm.cloudins_region.id</code>.
     */
    public final TableField<CloudinsRegionRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cloudins_apm.cloudins_region.name</code>.
     */
    public final TableField<CloudinsRegionRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>cloudins_apm.cloudins_region.manager_id</code>.
     */
    public final TableField<CloudinsRegionRecord, Long> MANAGER_ID = createField("manager_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>cloudins_apm.cloudins_region.manager_name</code>.
     */
    public final TableField<CloudinsRegionRecord, String> MANAGER_NAME = createField("manager_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>cloudins_apm.cloudins_region.host_ip</code>.
     */
    public final TableField<CloudinsRegionRecord, String> HOST_IP = createField("host_ip", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>cloudins_apm.cloudins_region.host_username</code>.
     */
    public final TableField<CloudinsRegionRecord, String> HOST_USERNAME = createField("host_username", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>cloudins_apm.cloudins_region.host_password</code>.
     */
    public final TableField<CloudinsRegionRecord, String> HOST_PASSWORD = createField("host_password", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>cloudins_apm.cloudins_region.company</code>.
     */
    public final TableField<CloudinsRegionRecord, String> COMPANY = createField("company", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>cloudins_apm.cloudins_region.remark</code>.
     */
    public final TableField<CloudinsRegionRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>cloudins_apm.cloudins_region</code> table reference
     */
    public CloudinsRegion() {
        this("cloudins_region", null);
    }

    /**
     * Create an aliased <code>cloudins_apm.cloudins_region</code> table reference
     */
    public CloudinsRegion(String alias) {
        this(alias, CLOUDINS_REGION);
    }

    private CloudinsRegion(String alias, Table<CloudinsRegionRecord> aliased) {
        this(alias, aliased, null);
    }

    private CloudinsRegion(String alias, Table<CloudinsRegionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return CloudinsApm.CLOUDINS_APM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CloudinsRegionRecord, Long> getIdentity() {
        return Keys.IDENTITY_CLOUDINS_REGION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CloudinsRegionRecord> getPrimaryKey() {
        return Keys.KEY_CLOUDINS_REGION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CloudinsRegionRecord>> getKeys() {
        return Arrays.<UniqueKey<CloudinsRegionRecord>>asList(Keys.KEY_CLOUDINS_REGION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudinsRegion as(String alias) {
        return new CloudinsRegion(alias, this);
    }

    /**
     * Rename this table
     */
    public CloudinsRegion rename(String name) {
        return new CloudinsRegion(name, null);
    }
}
