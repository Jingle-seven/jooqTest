/**
 * This class is generated by jOOQ
 */
package jooq.data.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import jooq.data.tables.CloudinsRole;
import jooq.data.tables.records.CloudinsRoleRecord;

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
public class CloudinsRoleDao extends DAOImpl<CloudinsRoleRecord, jooq.data.tables.pojos.CloudinsRole, Integer> {

    /**
     * Create a new CloudinsRoleDao without any configuration
     */
    public CloudinsRoleDao() {
        super(CloudinsRole.CLOUDINS_ROLE, jooq.data.tables.pojos.CloudinsRole.class);
    }

    /**
     * Create a new CloudinsRoleDao with an attached configuration
     */
    public CloudinsRoleDao(Configuration configuration) {
        super(CloudinsRole.CLOUDINS_ROLE, jooq.data.tables.pojos.CloudinsRole.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(jooq.data.tables.pojos.CloudinsRole object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<jooq.data.tables.pojos.CloudinsRole> fetchById(Integer... values) {
        return fetch(CloudinsRole.CLOUDINS_ROLE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public jooq.data.tables.pojos.CloudinsRole fetchOneById(Integer value) {
        return fetchOne(CloudinsRole.CLOUDINS_ROLE.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<jooq.data.tables.pojos.CloudinsRole> fetchByName(String... values) {
        return fetch(CloudinsRole.CLOUDINS_ROLE.NAME, values);
    }

    /**
     * Fetch records that have <code>auth IN (values)</code>
     */
    public List<jooq.data.tables.pojos.CloudinsRole> fetchByAuth(String... values) {
        return fetch(CloudinsRole.CLOUDINS_ROLE.AUTH, values);
    }

    /**
     * Fetch records that have <code>remark IN (values)</code>
     */
    public List<jooq.data.tables.pojos.CloudinsRole> fetchByRemark(String... values) {
        return fetch(CloudinsRole.CLOUDINS_ROLE.REMARK, values);
    }
}
