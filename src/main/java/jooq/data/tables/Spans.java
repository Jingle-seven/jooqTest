/**
 * This class is generated by jOOQ
 */
package jooq.data.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.data.CloudinsApm;
import jooq.data.Keys;
import jooq.data.tables.records.SpansRecord;

import org.jooq.Field;
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
public class Spans extends TableImpl<SpansRecord> {

    private static final long serialVersionUID = -616282721;

    /**
     * The reference instance of <code>cloudins_apm.spans</code>
     */
    public static final Spans SPANS = new Spans();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SpansRecord> getRecordType() {
        return SpansRecord.class;
    }

    /**
     * The column <code>cloudins_apm.spans.trace_id</code>.
     */
    public final TableField<SpansRecord, Long> TRACE_ID = createField("trace_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cloudins_apm.spans.span_id</code>.
     */
    public final TableField<SpansRecord, Long> SPAN_ID = createField("span_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cloudins_apm.spans.endpoint_ipv4</code>.
     */
    public final TableField<SpansRecord, Integer> ENDPOINT_IPV4 = createField("endpoint_ipv4", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>cloudins_apm.spans.endpoint_service_name</code>.
     */
    public final TableField<SpansRecord, String> ENDPOINT_SERVICE_NAME = createField("endpoint_service_name", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>cloudins_apm.spans.start_ts</code>.
     */
    public final TableField<SpansRecord, Long> START_TS = createField("start_ts", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cloudins_apm.spans.duration</code>.
     */
    public final TableField<SpansRecord, Long> DURATION = createField("duration", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cloudins_apm.spans.record_ts</code>.
     */
    public final TableField<SpansRecord, Long> RECORD_TS = createField("record_ts", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>cloudins_apm.spans</code> table reference
     */
    public Spans() {
        this("spans", null);
    }

    /**
     * Create an aliased <code>cloudins_apm.spans</code> table reference
     */
    public Spans(String alias) {
        this(alias, SPANS);
    }

    private Spans(String alias, Table<SpansRecord> aliased) {
        this(alias, aliased, null);
    }

    private Spans(String alias, Table<SpansRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<SpansRecord> getPrimaryKey() {
        return Keys.KEY_SPANS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SpansRecord>> getKeys() {
        return Arrays.<UniqueKey<SpansRecord>>asList(Keys.KEY_SPANS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Spans as(String alias) {
        return new Spans(alias, this);
    }

    /**
     * Rename this table
     */
    public Spans rename(String name) {
        return new Spans(name, null);
    }
}