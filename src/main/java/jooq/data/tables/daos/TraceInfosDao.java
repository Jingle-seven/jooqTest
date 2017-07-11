/**
 * This class is generated by jOOQ
 */
package jooq.data.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import jooq.data.tables.TraceInfos;
import jooq.data.tables.records.TraceInfosRecord;

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
public class TraceInfosDao extends DAOImpl<TraceInfosRecord, jooq.data.tables.pojos.TraceInfos, String> {

    /**
     * Create a new TraceInfosDao without any configuration
     */
    public TraceInfosDao() {
        super(TraceInfos.TRACE_INFOS, jooq.data.tables.pojos.TraceInfos.class);
    }

    /**
     * Create a new TraceInfosDao with an attached configuration
     */
    public TraceInfosDao(Configuration configuration) {
        super(TraceInfos.TRACE_INFOS, jooq.data.tables.pojos.TraceInfos.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(jooq.data.tables.pojos.TraceInfos object) {
        return object.getTraceMd5();
    }

    /**
     * Fetch records that have <code>trace_md5 IN (values)</code>
     */
    public List<jooq.data.tables.pojos.TraceInfos> fetchByTraceMd5(String... values) {
        return fetch(TraceInfos.TRACE_INFOS.TRACE_MD5, values);
    }

    /**
     * Fetch a unique record that has <code>trace_md5 = value</code>
     */
    public jooq.data.tables.pojos.TraceInfos fetchOneByTraceMd5(String value) {
        return fetchOne(TraceInfos.TRACE_INFOS.TRACE_MD5, value);
    }

    /**
     * Fetch records that have <code>root_name IN (values)</code>
     */
    public List<jooq.data.tables.pojos.TraceInfos> fetchByRootName(String... values) {
        return fetch(TraceInfos.TRACE_INFOS.ROOT_NAME, values);
    }

    /**
     * Fetch records that have <code>trace_name IN (values)</code>
     */
    public List<jooq.data.tables.pojos.TraceInfos> fetchByTraceName(String... values) {
        return fetch(TraceInfos.TRACE_INFOS.TRACE_NAME, values);
    }

    /**
     * Fetch records that have <code>span_count IN (values)</code>
     */
    public List<jooq.data.tables.pojos.TraceInfos> fetchBySpanCount(Short... values) {
        return fetch(TraceInfos.TRACE_INFOS.SPAN_COUNT, values);
    }

    /**
     * Fetch records that have <code>trace_alias IN (values)</code>
     */
    public List<jooq.data.tables.pojos.TraceInfos> fetchByTraceAlias(String... values) {
        return fetch(TraceInfos.TRACE_INFOS.TRACE_ALIAS, values);
    }

    /**
     * Fetch records that have <code>base_trace_id IN (values)</code>
     */
    public List<jooq.data.tables.pojos.TraceInfos> fetchByBaseTraceId(Long... values) {
        return fetch(TraceInfos.TRACE_INFOS.BASE_TRACE_ID, values);
    }

    /**
     * Fetch records that have <code>warning_duration IN (values)</code>
     */
    public List<jooq.data.tables.pojos.TraceInfos> fetchByWarningDuration(Long... values) {
        return fetch(TraceInfos.TRACE_INFOS.WARNING_DURATION, values);
    }

    /**
     * Fetch records that have <code>warning_percentage IN (values)</code>
     */
    public List<jooq.data.tables.pojos.TraceInfos> fetchByWarningPercentage(Integer... values) {
        return fetch(TraceInfos.TRACE_INFOS.WARNING_PERCENTAGE, values);
    }

    /**
     * Fetch records that have <code>duration IN (values)</code>
     */
    public List<jooq.data.tables.pojos.TraceInfos> fetchByDuration(Long... values) {
        return fetch(TraceInfos.TRACE_INFOS.DURATION, values);
    }
}
