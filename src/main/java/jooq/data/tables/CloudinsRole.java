/**
 * This class is generated by jOOQ
 */
package jooq.data.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.data.CloudinsApm;
import jooq.data.Keys;
import jooq.data.tables.records.CloudinsRoleRecord;

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
public class CloudinsRole extends TableImpl<CloudinsRoleRecord> {

    private static final long serialVersionUID = 501098223;

    /**
     * The reference instance of <code>cloudins_apm.cloudins_role</code>
     */
    public static final CloudinsRole CLOUDINS_ROLE = new CloudinsRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CloudinsRoleRecord> getRecordType() {
        return CloudinsRoleRecord.class;
    }

    /**
     * The column <code>cloudins_apm.cloudins_role.id</code>.
     */
    public final TableField<CloudinsRoleRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cloudins_apm.cloudins_role.name</code>.
     */
    public final TableField<CloudinsRoleRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>cloudins_apm.cloudins_role.auth</code>.
     */
    public final TableField<CloudinsRoleRecord, String> AUTH = createField("auth", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>cloudins_apm.cloudins_role.remark</code>.
     */
    public final TableField<CloudinsRoleRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>cloudins_apm.cloudins_role</code> table reference
     */
    public CloudinsRole() {
        this("cloudins_role", null);
    }

    /**
     * Create an aliased <code>cloudins_apm.cloudins_role</code> table reference
     */
    public CloudinsRole(String alias) {
        this(alias, CLOUDINS_ROLE);
    }

    private CloudinsRole(String alias, Table<CloudinsRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private CloudinsRole(String alias, Table<CloudinsRoleRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CloudinsRoleRecord, Long> getIdentity() {
        return Keys.IDENTITY_CLOUDINS_ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CloudinsRoleRecord> getPrimaryKey() {
        return Keys.KEY_CLOUDINS_ROLE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CloudinsRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<CloudinsRoleRecord>>asList(Keys.KEY_CLOUDINS_ROLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudinsRole as(String alias) {
        return new CloudinsRole(alias, this);
    }

    /**
     * Rename this table
     */
    public CloudinsRole rename(String name) {
        return new CloudinsRole(name, null);
    }
}
