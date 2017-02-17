/**
 * This class is generated by jOOQ
 */
package jooq.data.tables.records;


import javax.annotation.Generated;

import jooq.data.tables.JobSummaryBasic;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class JobSummaryBasicRecord extends UpdatableRecordImpl<JobSummaryBasicRecord> implements Record11<Integer, String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 171949322;

    /**
     * Setter for <code>cloudins.job_summary_basic.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>cloudins.job_summary_basic.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>cloudins.job_summary_basic.summary_date</code>.
     */
    public void setSummaryDate(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>cloudins.job_summary_basic.summary_date</code>.
     */
    public String getSummaryDate() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cloudins.job_summary_basic.start_time</code>.
     */
    public void setStartTime(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>cloudins.job_summary_basic.start_time</code>.
     */
    public String getStartTime() {
        return (String) get(2);
    }

    /**
     * Setter for <code>cloudins.job_summary_basic.last_update_time</code>. 默认每小时生成一条新纪录，每分钟更新当前记录数据
     */
    public void setLastUpdateTime(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>cloudins.job_summary_basic.last_update_time</code>. 默认每小时生成一条新纪录，每分钟更新当前记录数据
     */
    public String getLastUpdateTime() {
        return (String) get(3);
    }

    /**
     * Setter for <code>cloudins.job_summary_basic.job_total_num</code>.
     */
    public void setJobTotalNum(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>cloudins.job_summary_basic.job_total_num</code>.
     */
    public String getJobTotalNum() {
        return (String) get(4);
    }

    /**
     * Setter for <code>cloudins.job_summary_basic.job_critical_num</code>.
     */
    public void setJobCriticalNum(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>cloudins.job_summary_basic.job_critical_num</code>.
     */
    public String getJobCriticalNum() {
        return (String) get(5);
    }

    /**
     * Setter for <code>cloudins.job_summary_basic.job_severe_num</code>.
     */
    public void setJobSevereNum(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>cloudins.job_summary_basic.job_severe_num</code>.
     */
    public String getJobSevereNum() {
        return (String) get(6);
    }

    /**
     * Setter for <code>cloudins.job_summary_basic.job_moderate_num</code>.
     */
    public void setJobModerateNum(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>cloudins.job_summary_basic.job_moderate_num</code>.
     */
    public String getJobModerateNum() {
        return (String) get(7);
    }

    /**
     * Setter for <code>cloudins.job_summary_basic.job_normal_num</code>.
     */
    public void setJobNormalNum(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>cloudins.job_summary_basic.job_normal_num</code>.
     */
    public String getJobNormalNum() {
        return (String) get(8);
    }

    /**
     * Setter for <code>cloudins.job_summary_basic.job_type_num</code>.
     */
    public void setJobTypeNum(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>cloudins.job_summary_basic.job_type_num</code>.
     */
    public String getJobTypeNum() {
        return (String) get(9);
    }

    /**
     * Setter for <code>cloudins.job_summary_basic.user_num</code>.
     */
    public void setUserNum(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>cloudins.job_summary_basic.user_num</code>.
     */
    public String getUserNum() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return JobSummaryBasic.JOB_SUMMARY_BASIC.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return JobSummaryBasic.JOB_SUMMARY_BASIC.SUMMARY_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return JobSummaryBasic.JOB_SUMMARY_BASIC.START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return JobSummaryBasic.JOB_SUMMARY_BASIC.LAST_UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return JobSummaryBasic.JOB_SUMMARY_BASIC.JOB_TOTAL_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return JobSummaryBasic.JOB_SUMMARY_BASIC.JOB_CRITICAL_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return JobSummaryBasic.JOB_SUMMARY_BASIC.JOB_SEVERE_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return JobSummaryBasic.JOB_SUMMARY_BASIC.JOB_MODERATE_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return JobSummaryBasic.JOB_SUMMARY_BASIC.JOB_NORMAL_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return JobSummaryBasic.JOB_SUMMARY_BASIC.JOB_TYPE_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return JobSummaryBasic.JOB_SUMMARY_BASIC.USER_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSummaryDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLastUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getJobTotalNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getJobCriticalNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getJobSevereNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getJobModerateNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getJobNormalNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getJobTypeNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getUserNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobSummaryBasicRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobSummaryBasicRecord value2(String value) {
        setSummaryDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobSummaryBasicRecord value3(String value) {
        setStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobSummaryBasicRecord value4(String value) {
        setLastUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobSummaryBasicRecord value5(String value) {
        setJobTotalNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobSummaryBasicRecord value6(String value) {
        setJobCriticalNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobSummaryBasicRecord value7(String value) {
        setJobSevereNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobSummaryBasicRecord value8(String value) {
        setJobModerateNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobSummaryBasicRecord value9(String value) {
        setJobNormalNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobSummaryBasicRecord value10(String value) {
        setJobTypeNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobSummaryBasicRecord value11(String value) {
        setUserNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobSummaryBasicRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JobSummaryBasicRecord
     */
    public JobSummaryBasicRecord() {
        super(JobSummaryBasic.JOB_SUMMARY_BASIC);
    }

    /**
     * Create a detached, initialised JobSummaryBasicRecord
     */
    public JobSummaryBasicRecord(Integer id, String summaryDate, String startTime, String lastUpdateTime, String jobTotalNum, String jobCriticalNum, String jobSevereNum, String jobModerateNum, String jobNormalNum, String jobTypeNum, String userNum) {
        super(JobSummaryBasic.JOB_SUMMARY_BASIC);

        set(0, id);
        set(1, summaryDate);
        set(2, startTime);
        set(3, lastUpdateTime);
        set(4, jobTotalNum);
        set(5, jobCriticalNum);
        set(6, jobSevereNum);
        set(7, jobModerateNum);
        set(8, jobNormalNum);
        set(9, jobTypeNum);
        set(10, userNum);
    }
}
