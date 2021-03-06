/**
 * This class is generated by jOOQ
 */
package jooq.data.tables.records;


import javax.annotation.Generated;

import jooq.data.tables.ZipkinSpans;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


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
public class ZipkinSpansRecord extends TableRecordImpl<ZipkinSpansRecord> implements Record8<Long, Long, String, Long, Boolean, Long, Long, Long> {

    private static final long serialVersionUID = -1007447047;

    /**
     * Setter for <code>cloudins_apm.zipkin_spans.trace_id</code>.
     */
    public void setTraceId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cloudins_apm.zipkin_spans.trace_id</code>.
     */
    public Long getTraceId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cloudins_apm.zipkin_spans.id</code>.
     */
    public void setId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>cloudins_apm.zipkin_spans.id</code>.
     */
    public Long getId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>cloudins_apm.zipkin_spans.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>cloudins_apm.zipkin_spans.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>cloudins_apm.zipkin_spans.parent_id</code>.
     */
    public void setParentId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>cloudins_apm.zipkin_spans.parent_id</code>.
     */
    public Long getParentId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>cloudins_apm.zipkin_spans.debug</code>.
     */
    public void setDebug(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>cloudins_apm.zipkin_spans.debug</code>.
     */
    public Boolean getDebug() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>cloudins_apm.zipkin_spans.start_ts</code>. Span.timestamp(): epoch micros used for endTs query and to implement TTL
     */
    public void setStartTs(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>cloudins_apm.zipkin_spans.start_ts</code>. Span.timestamp(): epoch micros used for endTs query and to implement TTL
     */
    public Long getStartTs() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>cloudins_apm.zipkin_spans.record_ts</code>.
     */
    public void setRecordTs(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>cloudins_apm.zipkin_spans.record_ts</code>.
     */
    public Long getRecordTs() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>cloudins_apm.zipkin_spans.duration</code>. Span.duration(): micros used for minDuration and maxDuration query
     */
    public void setDuration(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>cloudins_apm.zipkin_spans.duration</code>. Span.duration(): micros used for minDuration and maxDuration query
     */
    public Long getDuration() {
        return (Long) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Long, String, Long, Boolean, Long, Long, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Long, String, Long, Boolean, Long, Long, Long> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ZipkinSpans.ZIPKIN_SPANS.TRACE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return ZipkinSpans.ZIPKIN_SPANS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ZipkinSpans.ZIPKIN_SPANS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return ZipkinSpans.ZIPKIN_SPANS.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return ZipkinSpans.ZIPKIN_SPANS.DEBUG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return ZipkinSpans.ZIPKIN_SPANS.START_TS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return ZipkinSpans.ZIPKIN_SPANS.RECORD_TS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return ZipkinSpans.ZIPKIN_SPANS.DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getTraceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getDebug();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getStartTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getRecordTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ZipkinSpansRecord value1(Long value) {
        setTraceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ZipkinSpansRecord value2(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ZipkinSpansRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ZipkinSpansRecord value4(Long value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ZipkinSpansRecord value5(Boolean value) {
        setDebug(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ZipkinSpansRecord value6(Long value) {
        setStartTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ZipkinSpansRecord value7(Long value) {
        setRecordTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ZipkinSpansRecord value8(Long value) {
        setDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ZipkinSpansRecord values(Long value1, Long value2, String value3, Long value4, Boolean value5, Long value6, Long value7, Long value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ZipkinSpansRecord
     */
    public ZipkinSpansRecord() {
        super(ZipkinSpans.ZIPKIN_SPANS);
    }

    /**
     * Create a detached, initialised ZipkinSpansRecord
     */
    public ZipkinSpansRecord(Long traceId, Long id, String name, Long parentId, Boolean debug, Long startTs, Long recordTs, Long duration) {
        super(ZipkinSpans.ZIPKIN_SPANS);

        set(0, traceId);
        set(1, id);
        set(2, name);
        set(3, parentId);
        set(4, debug);
        set(5, startTs);
        set(6, recordTs);
        set(7, duration);
    }
}
