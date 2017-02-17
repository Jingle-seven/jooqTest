/**
 * This class is generated by jOOQ
 */
package jooq.data.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.data.Cloudins;
import jooq.data.Keys;
import jooq.data.tables.records.CloudinsUserRecord;

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
public class CloudinsUser extends TableImpl<CloudinsUserRecord> {

    private static final long serialVersionUID = 1406222278;

    /**
     * The reference instance of <code>cloudins.cloudins_user</code>
     */
    public static final CloudinsUser CLOUDINS_USER = new CloudinsUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CloudinsUserRecord> getRecordType() {
        return CloudinsUserRecord.class;
    }

    /**
     * The column <code>cloudins.cloudins_user.id</code>.
     */
    public final TableField<CloudinsUserRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>cloudins.cloudins_user.role_id</code>.
     */
    public final TableField<CloudinsUserRecord, Integer> ROLE_ID = createField("role_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>cloudins.cloudins_user.field_id</code>.
     */
    public final TableField<CloudinsUserRecord, String> FIELD_ID = createField("field_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>cloudins.cloudins_user.name</code>.
     */
    public final TableField<CloudinsUserRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CHAR.length(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>cloudins.cloudins_user.password</code>.
     */
    public final TableField<CloudinsUserRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>cloudins.cloudins_user.mail</code>.
     */
    public final TableField<CloudinsUserRecord, String> MAIL = createField("mail", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>cloudins.cloudins_user.status</code>.
     */
    public final TableField<CloudinsUserRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cloudins.cloudins_user.remark</code>.
     */
    public final TableField<CloudinsUserRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>cloudins.cloudins_user</code> table reference
     */
    public CloudinsUser() {
        this("cloudins_user", null);
    }

    /**
     * Create an aliased <code>cloudins.cloudins_user</code> table reference
     */
    public CloudinsUser(String alias) {
        this(alias, CLOUDINS_USER);
    }

    private CloudinsUser(String alias, Table<CloudinsUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private CloudinsUser(String alias, Table<CloudinsUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Cloudins.CLOUDINS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CloudinsUserRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CLOUDINS_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CloudinsUserRecord> getPrimaryKey() {
        return Keys.KEY_CLOUDINS_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CloudinsUserRecord>> getKeys() {
        return Arrays.<UniqueKey<CloudinsUserRecord>>asList(Keys.KEY_CLOUDINS_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudinsUser as(String alias) {
        return new CloudinsUser(alias, this);
    }

    /**
     * Rename this table
     */
    public CloudinsUser rename(String name) {
        return new CloudinsUser(name, null);
    }
}
