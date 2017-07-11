/**
 * This class is generated by jOOQ
 */
package jooq.data.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.data.CloudinsApm;
import jooq.data.Keys;
import jooq.data.tables.records.StatisticsSpansRecord;

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
public class StatisticsSpans extends TableImpl<StatisticsSpansRecord> {

    private static final long serialVersionUID = 657807585;

    /**
     * The reference instance of <code>cloudins_apm.statistics_spans</code>
     */
    public static final StatisticsSpans STATISTICS_SPANS = new StatisticsSpans();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StatisticsSpansRecord> getRecordType() {
        return StatisticsSpansRecord.class;
    }

    /**
     * The column <code>cloudins_apm.statistics_spans.id</code>.
     */
    public final TableField<StatisticsSpansRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>cloudins_apm.statistics_spans.start_time</code>.
     */
    public final TableField<StatisticsSpansRecord, String> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.VARCHAR.length(45).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>cloudins_apm.statistics_spans.end_time</code>.
     */
    public final TableField<StatisticsSpansRecord, String> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>cloudins_apm.statistics_spans.span_name</code>. 关联到span_infos表中的name
     */
    public final TableField<StatisticsSpansRecord, String> SPAN_NAME = createField("span_name", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "关联到span_infos表中的name");

    /**
     * The column <code>cloudins_apm.statistics_spans.called_num</code>. 特定时间段内特定span被调用的次数
     */
    public final TableField<StatisticsSpansRecord, String> CALLED_NUM = createField("called_num", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "特定时间段内特定span被调用的次数");

    /**
     * The column <code>cloudins_apm.statistics_spans.avg_time</code>.
     */
    public final TableField<StatisticsSpansRecord, String> AVG_TIME = createField("avg_time", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>cloudins_apm.statistics_spans.slowest_id</code>.
     */
    public final TableField<StatisticsSpansRecord, String> SLOWEST_ID = createField("slowest_id", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>cloudins_apm.statistics_spans.slowest_time</code>.
     */
    public final TableField<StatisticsSpansRecord, String> SLOWEST_TIME = createField("slowest_time", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>cloudins_apm.statistics_spans.slowest_host</code>.
     */
    public final TableField<StatisticsSpansRecord, String> SLOWEST_HOST = createField("slowest_host", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * Create a <code>cloudins_apm.statistics_spans</code> table reference
     */
    public StatisticsSpans() {
        this("statistics_spans", null);
    }

    /**
     * Create an aliased <code>cloudins_apm.statistics_spans</code> table reference
     */
    public StatisticsSpans(String alias) {
        this(alias, STATISTICS_SPANS);
    }

    private StatisticsSpans(String alias, Table<StatisticsSpansRecord> aliased) {
        this(alias, aliased, null);
    }

    private StatisticsSpans(String alias, Table<StatisticsSpansRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<StatisticsSpansRecord> getPrimaryKey() {
        return Keys.KEY_STATISTICS_SPANS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StatisticsSpansRecord>> getKeys() {
        return Arrays.<UniqueKey<StatisticsSpansRecord>>asList(Keys.KEY_STATISTICS_SPANS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatisticsSpans as(String alias) {
        return new StatisticsSpans(alias, this);
    }

    /**
     * Rename this table
     */
    public StatisticsSpans rename(String name) {
        return new StatisticsSpans(name, null);
    }
}