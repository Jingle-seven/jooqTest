/**
 * This class is generated by jOOQ
 */
package jooq.data.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.data.Cloudins;
import jooq.data.Keys;
import jooq.data.tables.records.JobTypeSummaryRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class JobTypeSummary extends TableImpl<JobTypeSummaryRecord> {

    private static final long serialVersionUID = -1171044863;

    /**
     * The reference instance of <code>cloudins.job_type_summary</code>
     */
    public static final JobTypeSummary JOB_TYPE_SUMMARY = new JobTypeSummary();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JobTypeSummaryRecord> getRecordType() {
        return JobTypeSummaryRecord.class;
    }

    /**
     * The column <code>cloudins.job_type_summary.id</code>.
     */
    public final TableField<JobTypeSummaryRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>cloudins.job_type_summary.job_summary_basic_id</code>.
     */
    public final TableField<JobTypeSummaryRecord, Integer> JOB_SUMMARY_BASIC_ID = createField("job_summary_basic_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>cloudins.job_type_summary.job_type_name</code>.
     */
    public final TableField<JobTypeSummaryRecord, String> JOB_TYPE_NAME = createField("job_type_name", org.jooq.impl.SQLDataType.VARCHAR.length(60), this, "");

    /**
     * The column <code>cloudins.job_type_summary.job_type_num</code>.
     */
    public final TableField<JobTypeSummaryRecord, String> JOB_TYPE_NUM = createField("job_type_num", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>cloudins.job_type_summary.job_total_num</code>.
     */
    public final TableField<JobTypeSummaryRecord, String> JOB_TOTAL_NUM = createField("job_total_num", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>cloudins.job_type_summary.job_critical_num</code>.
     */
    public final TableField<JobTypeSummaryRecord, String> JOB_CRITICAL_NUM = createField("job_critical_num", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>cloudins.job_type_summary.job_severe_num</code>.
     */
    public final TableField<JobTypeSummaryRecord, String> JOB_SEVERE_NUM = createField("job_severe_num", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>cloudins.job_type_summary.job_moderate_num</code>.
     */
    public final TableField<JobTypeSummaryRecord, String> JOB_MODERATE_NUM = createField("job_moderate_num", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>cloudins.job_type_summary.job_normal_num</code>.
     */
    public final TableField<JobTypeSummaryRecord, String> JOB_NORMAL_NUM = createField("job_normal_num", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * Create a <code>cloudins.job_type_summary</code> table reference
     */
    public JobTypeSummary() {
        this("job_type_summary", null);
    }

    /**
     * Create an aliased <code>cloudins.job_type_summary</code> table reference
     */
    public JobTypeSummary(String alias) {
        this(alias, JOB_TYPE_SUMMARY);
    }

    private JobTypeSummary(String alias, Table<JobTypeSummaryRecord> aliased) {
        this(alias, aliased, null);
    }

    private JobTypeSummary(String alias, Table<JobTypeSummaryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Cloudins.CLOUDINS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JobTypeSummaryRecord> getPrimaryKey() {
        return Keys.KEY_JOB_TYPE_SUMMARY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JobTypeSummaryRecord>> getKeys() {
        return Arrays.<UniqueKey<JobTypeSummaryRecord>>asList(Keys.KEY_JOB_TYPE_SUMMARY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<JobTypeSummaryRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JobTypeSummaryRecord, ?>>asList(Keys.FK_JOB_TYPE_SUMMARY_JOB_SUMMARY_BASIC);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobTypeSummary as(String alias) {
        return new JobTypeSummary(alias, this);
    }

    /**
     * Rename this table
     */
    public JobTypeSummary rename(String name) {
        return new JobTypeSummary(name, null);
    }
}