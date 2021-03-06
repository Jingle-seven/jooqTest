/**
 * This class is generated by jOOQ
 */
package jooq.data.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import jooq.data.tables.AlarmMessage;
import jooq.data.tables.records.AlarmMessageRecord;

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
public class AlarmMessageDao extends DAOImpl<AlarmMessageRecord, jooq.data.tables.pojos.AlarmMessage, Long> {

    /**
     * Create a new AlarmMessageDao without any configuration
     */
    public AlarmMessageDao() {
        super(AlarmMessage.ALARM_MESSAGE, jooq.data.tables.pojos.AlarmMessage.class);
    }

    /**
     * Create a new AlarmMessageDao with an attached configuration
     */
    public AlarmMessageDao(Configuration configuration) {
        super(AlarmMessage.ALARM_MESSAGE, jooq.data.tables.pojos.AlarmMessage.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(jooq.data.tables.pojos.AlarmMessage object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<jooq.data.tables.pojos.AlarmMessage> fetchById(Long... values) {
        return fetch(AlarmMessage.ALARM_MESSAGE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public jooq.data.tables.pojos.AlarmMessage fetchOneById(Long value) {
        return fetchOne(AlarmMessage.ALARM_MESSAGE.ID, value);
    }

    /**
     * Fetch records that have <code>trace_id IN (values)</code>
     */
    public List<jooq.data.tables.pojos.AlarmMessage> fetchByTraceId(String... values) {
        return fetch(AlarmMessage.ALARM_MESSAGE.TRACE_ID, values);
    }

    /**
     * Fetch records that have <code>region IN (values)</code>
     */
    public List<jooq.data.tables.pojos.AlarmMessage> fetchByRegion(Long... values) {
        return fetch(AlarmMessage.ALARM_MESSAGE.REGION, values);
    }

    /**
     * Fetch records that have <code>message IN (values)</code>
     */
    public List<jooq.data.tables.pojos.AlarmMessage> fetchByMessage(String... values) {
        return fetch(AlarmMessage.ALARM_MESSAGE.MESSAGE, values);
    }

    /**
     * Fetch records that have <code>time IN (values)</code>
     */
    public List<jooq.data.tables.pojos.AlarmMessage> fetchByTime(String... values) {
        return fetch(AlarmMessage.ALARM_MESSAGE.TIME, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<jooq.data.tables.pojos.AlarmMessage> fetchByStatus(Short... values) {
        return fetch(AlarmMessage.ALARM_MESSAGE.STATUS, values);
    }
}
