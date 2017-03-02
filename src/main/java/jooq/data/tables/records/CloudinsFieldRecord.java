/**
 * This class is generated by jOOQ
 */
package jooq.data.tables.records;


import javax.annotation.Generated;

import jooq.data.tables.CloudinsFieldTable;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


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
public class CloudinsFieldRecord extends UpdatableRecordImpl<CloudinsFieldRecord> implements Record9<Long, String, Long, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1804284233;

    /**
     * Setter for <code>cloudins.cloudins_field.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cloudins.cloudins_field.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cloudins.cloudins_field.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>cloudins.cloudins_field.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cloudins.cloudins_field.manager_id</code>.
     */
    public void setManagerId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>cloudins.cloudins_field.manager_id</code>.
     */
    public Long getManagerId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>cloudins.cloudins_field.manager_name</code>.
     */
    public void setManagerName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>cloudins.cloudins_field.manager_name</code>.
     */
    public String getManagerName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>cloudins.cloudins_field.host_ip</code>.
     */
    public void setHostIp(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>cloudins.cloudins_field.host_ip</code>.
     */
    public String getHostIp() {
        return (String) get(4);
    }

    /**
     * Setter for <code>cloudins.cloudins_field.host_username</code>.
     */
    public void setHostUsername(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>cloudins.cloudins_field.host_username</code>.
     */
    public String getHostUsername() {
        return (String) get(5);
    }

    /**
     * Setter for <code>cloudins.cloudins_field.host_password</code>.
     */
    public void setHostPassword(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>cloudins.cloudins_field.host_password</code>.
     */
    public String getHostPassword() {
        return (String) get(6);
    }

    /**
     * Setter for <code>cloudins.cloudins_field.company</code>.
     */
    public void setCompany(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>cloudins.cloudins_field.company</code>.
     */
    public String getCompany() {
        return (String) get(7);
    }

    /**
     * Setter for <code>cloudins.cloudins_field.remark</code>.
     */
    public void setRemark(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>cloudins.cloudins_field.remark</code>.
     */
    public String getRemark() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String, Long, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String, Long, String, String, String, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return CloudinsFieldTable.CLOUDINS_FIELD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CloudinsFieldTable.CLOUDINS_FIELD.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return CloudinsFieldTable.CLOUDINS_FIELD.MANAGER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CloudinsFieldTable.CLOUDINS_FIELD.MANAGER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CloudinsFieldTable.CLOUDINS_FIELD.HOST_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CloudinsFieldTable.CLOUDINS_FIELD.HOST_USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return CloudinsFieldTable.CLOUDINS_FIELD.HOST_PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return CloudinsFieldTable.CLOUDINS_FIELD.COMPANY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return CloudinsFieldTable.CLOUDINS_FIELD.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getManagerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getManagerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getHostIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getHostUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getHostPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCompany();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudinsFieldRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudinsFieldRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudinsFieldRecord value3(Long value) {
        setManagerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudinsFieldRecord value4(String value) {
        setManagerName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudinsFieldRecord value5(String value) {
        setHostIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudinsFieldRecord value6(String value) {
        setHostUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudinsFieldRecord value7(String value) {
        setHostPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudinsFieldRecord value8(String value) {
        setCompany(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudinsFieldRecord value9(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CloudinsFieldRecord values(Long value1, String value2, Long value3, String value4, String value5, String value6, String value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CloudinsFieldRecord
     */
    public CloudinsFieldRecord() {
        super(CloudinsFieldTable.CLOUDINS_FIELD);
    }

    /**
     * Create a detached, initialised CloudinsFieldRecord
     */
    public CloudinsFieldRecord(Long id, String name, Long managerId, String managerName, String hostIp, String hostUsername, String hostPassword, String company, String remark) {
        super(CloudinsFieldTable.CLOUDINS_FIELD);

        set(0, id);
        set(1, name);
        set(2, managerId);
        set(3, managerName);
        set(4, hostIp);
        set(5, hostUsername);
        set(6, hostPassword);
        set(7, company);
        set(8, remark);
    }
}
