/**
 * This class is generated by jOOQ
 */
package jooq.data.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import jooq.data.tables.CloudinsUser;
import jooq.data.tables.records.CloudinsUserRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class CloudinsUserDao extends DAOImpl<CloudinsUserRecord, jooq.data.tables.pojos.CloudinsUser, Integer> {

    /**
     * Create a new CloudinsUserDao without any configuration
     */
    public CloudinsUserDao() {
        super(CloudinsUser.CLOUDINS_USER, jooq.data.tables.pojos.CloudinsUser.class);
    }

    /**
     * Create a new CloudinsUserDao with an attached configuration
     */
    public CloudinsUserDao(Configuration configuration) {
        super(CloudinsUser.CLOUDINS_USER, jooq.data.tables.pojos.CloudinsUser.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(jooq.data.tables.pojos.CloudinsUser object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<jooq.data.tables.pojos.CloudinsUser> fetchById(Integer... values) {
        return fetch(CloudinsUser.CLOUDINS_USER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public jooq.data.tables.pojos.CloudinsUser fetchOneById(Integer value) {
        return fetchOne(CloudinsUser.CLOUDINS_USER.ID, value);
    }

    /**
     * Fetch records that have <code>role_id IN (values)</code>
     */
    public List<jooq.data.tables.pojos.CloudinsUser> fetchByRoleId(Integer... values) {
        return fetch(CloudinsUser.CLOUDINS_USER.ROLE_ID, values);
    }

    /**
     * Fetch records that have <code>field_id IN (values)</code>
     */
    public List<jooq.data.tables.pojos.CloudinsUser> fetchByFieldId(String... values) {
        return fetch(CloudinsUser.CLOUDINS_USER.FIELD_ID, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<jooq.data.tables.pojos.CloudinsUser> fetchByName(String... values) {
        return fetch(CloudinsUser.CLOUDINS_USER.NAME, values);
    }

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    public List<jooq.data.tables.pojos.CloudinsUser> fetchByPassword(String... values) {
        return fetch(CloudinsUser.CLOUDINS_USER.PASSWORD, values);
    }

    /**
     * Fetch records that have <code>mail IN (values)</code>
     */
    public List<jooq.data.tables.pojos.CloudinsUser> fetchByMail(String... values) {
        return fetch(CloudinsUser.CLOUDINS_USER.MAIL, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<jooq.data.tables.pojos.CloudinsUser> fetchByStatus(String... values) {
        return fetch(CloudinsUser.CLOUDINS_USER.STATUS, values);
    }

    /**
     * Fetch records that have <code>remark IN (values)</code>
     */
    public List<jooq.data.tables.pojos.CloudinsUser> fetchByRemark(String... values) {
        return fetch(CloudinsUser.CLOUDINS_USER.REMARK, values);
    }
}