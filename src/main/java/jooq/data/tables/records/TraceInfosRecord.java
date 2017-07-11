/**
 * This class is generated by jOOQ
 */
package jooq.data.tables.records;


import javax.annotation.Generated;

import jooq.data.tables.TraceInfos;

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
public class TraceInfosRecord extends UpdatableRecordImpl<TraceInfosRecord> implements Record9<String, String, String, Short, String, Long, Long, Integer, Long> {

    private static final long serialVersionUID = -835895310;

    /**
     * Setter for <code>cloudins_apm.trace_infos.trace_md5</code>.
     */
    public void setTraceMd5(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>cloudins_apm.trace_infos.trace_md5</code>.
     */
    public String getTraceMd5() {
        return (String) get(0);
    }

    /**
     * Setter for <code>cloudins_apm.trace_infos.root_name</code>.
     */
    public void setRootName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>cloudins_apm.trace_infos.root_name</code>.
     */
    public String getRootName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cloudins_apm.trace_infos.trace_name</code>.
     */
    public void setTraceName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>cloudins_apm.trace_infos.trace_name</code>.
     */
    public String getTraceName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>cloudins_apm.trace_infos.span_count</code>.
     */
    public void setSpanCount(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>cloudins_apm.trace_infos.span_count</code>.
     */
    public Short getSpanCount() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>cloudins_apm.trace_infos.trace_alias</code>.
     */
    public void setTraceAlias(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>cloudins_apm.trace_infos.trace_alias</code>.
     */
    public String getTraceAlias() {
        return (String) get(4);
    }

    /**
     * Setter for <code>cloudins_apm.trace_infos.base_trace_id</code>.
     */
    public void setBaseTraceId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>cloudins_apm.trace_infos.base_trace_id</code>.
     */
    public Long getBaseTraceId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>cloudins_apm.trace_infos.warning_duration</code>. 固定时长
     */
    public void setWarningDuration(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>cloudins_apm.trace_infos.warning_duration</code>. 固定时长
     */
    public Long getWarningDuration() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>cloudins_apm.trace_infos.warning_percentage</code>. 超出基线百分比
     */
    public void setWarningPercentage(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>cloudins_apm.trace_infos.warning_percentage</code>. 超出基线百分比
     */
    public Integer getWarningPercentage() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>cloudins_apm.trace_infos.duration</code>.
     */
    public void setDuration(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>cloudins_apm.trace_infos.duration</code>.
     */
    public Long getDuration() {
        return (Long) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, String, Short, String, Long, Long, Integer, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, String, Short, String, Long, Long, Integer, Long> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TraceInfos.TRACE_INFOS.TRACE_MD5;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TraceInfos.TRACE_INFOS.ROOT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TraceInfos.TRACE_INFOS.TRACE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return TraceInfos.TRACE_INFOS.SPAN_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TraceInfos.TRACE_INFOS.TRACE_ALIAS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return TraceInfos.TRACE_INFOS.BASE_TRACE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return TraceInfos.TRACE_INFOS.WARNING_DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return TraceInfos.TRACE_INFOS.WARNING_PERCENTAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return TraceInfos.TRACE_INFOS.DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getTraceMd5();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRootName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTraceName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getSpanCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTraceAlias();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getBaseTraceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getWarningDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getWarningPercentage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TraceInfosRecord value1(String value) {
        setTraceMd5(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TraceInfosRecord value2(String value) {
        setRootName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TraceInfosRecord value3(String value) {
        setTraceName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TraceInfosRecord value4(Short value) {
        setSpanCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TraceInfosRecord value5(String value) {
        setTraceAlias(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TraceInfosRecord value6(Long value) {
        setBaseTraceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TraceInfosRecord value7(Long value) {
        setWarningDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TraceInfosRecord value8(Integer value) {
        setWarningPercentage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TraceInfosRecord value9(Long value) {
        setDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TraceInfosRecord values(String value1, String value2, String value3, Short value4, String value5, Long value6, Long value7, Integer value8, Long value9) {
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
     * Create a detached TraceInfosRecord
     */
    public TraceInfosRecord() {
        super(TraceInfos.TRACE_INFOS);
    }

    /**
     * Create a detached, initialised TraceInfosRecord
     */
    public TraceInfosRecord(String traceMd5, String rootName, String traceName, Short spanCount, String traceAlias, Long baseTraceId, Long warningDuration, Integer warningPercentage, Long duration) {
        super(TraceInfos.TRACE_INFOS);

        set(0, traceMd5);
        set(1, rootName);
        set(2, traceName);
        set(3, spanCount);
        set(4, traceAlias);
        set(5, baseTraceId);
        set(6, warningDuration);
        set(7, warningPercentage);
        set(8, duration);
    }
}
