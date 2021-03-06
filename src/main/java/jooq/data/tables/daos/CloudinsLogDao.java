/**
 * This class is generated by jOOQ
 */
package jooq.data.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import jooq.data.tables.CloudinsLog;
import jooq.data.tables.records.CloudinsLogRecord;

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
public class CloudinsLogDao extends DAOImpl<CloudinsLogRecord, jooq.data.tables.pojos.CloudinsLog, Long> {

    /**
     * Create a new CloudinsLogDao without any configuration
     */
    public CloudinsLogDao() {
        super(CloudinsLog.CLOUDINS_LOG, jooq.data.tables.pojos.CloudinsLog.class);
    }

    /**
     * Create a new CloudinsLogDao with an attached configuration
     */
    public CloudinsLogDao(Configuration configuration) {
        super(CloudinsLog.CLOUDINS_LOG, jooq.data.tables.pojos.CloudinsLog.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(jooq.data.tables.pojos.CloudinsLog object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<jooq.data.tables.pojos.CloudinsLog> fetchById(Long... values) {
        return fetch(CloudinsLog.CLOUDINS_LOG.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public jooq.data.tables.pojos.CloudinsLog fetchOneById(Long value) {
        return fetchOne(CloudinsLog.CLOUDINS_LOG.ID, value);
    }

    /**
     * Fetch records that have <code>level IN (values)</code>
     */
    public List<jooq.data.tables.pojos.CloudinsLog> fetchByLevel(String... values) {
        return fetch(CloudinsLog.CLOUDINS_LOG.LEVEL, values);
    }

    /**
     * Fetch records that have <code>method IN (values)</code>
     */
    public List<jooq.data.tables.pojos.CloudinsLog> fetchByMethod(String... values) {
        return fetch(CloudinsLog.CLOUDINS_LOG.METHOD, values);
    }

    /**
     * Fetch records that have <code>message IN (values)</code>
     */
    public List<jooq.data.tables.pojos.CloudinsLog> fetchByMessage(String... values) {
        return fetch(CloudinsLog.CLOUDINS_LOG.MESSAGE, values);
    }

    /**
     * Fetch records that have <code>time IN (values)</code>
     */
    public List<jooq.data.tables.pojos.CloudinsLog> fetchByTime(String... values) {
        return fetch(CloudinsLog.CLOUDINS_LOG.TIME, values);
    }

    /**
     * Fetch records that have <code>line IN (values)</code>
     */
    public List<jooq.data.tables.pojos.CloudinsLog> fetchByLine(Integer... values) {
        return fetch(CloudinsLog.CLOUDINS_LOG.LINE, values);
    }

    /**
     * Fetch records that have <code>displayed IN (values)</code>
     */
    public List<jooq.data.tables.pojos.CloudinsLog> fetchByDisplayed(Boolean... values) {
        return fetch(CloudinsLog.CLOUDINS_LOG.DISPLAYED, values);
    }

    /**
     * Fetch records that have <code>isread IN (values)</code>
     */
    public List<jooq.data.tables.pojos.CloudinsLog> fetchByIsread(Boolean... values) {
        return fetch(CloudinsLog.CLOUDINS_LOG.ISREAD, values);
    }
}
