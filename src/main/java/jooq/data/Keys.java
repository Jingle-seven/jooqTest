/**
 * This class is generated by jOOQ
 */
package jooq.data;


import javax.annotation.Generated;

import jooq.data.tables.CloudinsConfig;
import jooq.data.tables.CloudinsField;
import jooq.data.tables.CloudinsLog;
import jooq.data.tables.CloudinsRole;
import jooq.data.tables.CloudinsUser;
import jooq.data.tables.HistoricalPeak;
import jooq.data.tables.JobSummaryBasic;
import jooq.data.tables.JobTypeSummary;
import jooq.data.tables.PlayEvolutions;
import jooq.data.tables.SysConfigs;
import jooq.data.tables.UserJobSummary;
import jooq.data.tables.YarnAppCheckLog;
import jooq.data.tables.YarnAppCheckSetting;
import jooq.data.tables.YarnAppHeuristicResult;
import jooq.data.tables.YarnAppHeuristicResultDetails;
import jooq.data.tables.YarnAppResult;
import jooq.data.tables.ZipkinAnnotations;
import jooq.data.tables.ZipkinDependencies;
import jooq.data.tables.ZipkinSpans;
import jooq.data.tables.records.CloudinsConfigRecord;
import jooq.data.tables.records.CloudinsFieldRecord;
import jooq.data.tables.records.CloudinsLogRecord;
import jooq.data.tables.records.CloudinsRoleRecord;
import jooq.data.tables.records.CloudinsUserRecord;
import jooq.data.tables.records.HistoricalPeakRecord;
import jooq.data.tables.records.JobSummaryBasicRecord;
import jooq.data.tables.records.JobTypeSummaryRecord;
import jooq.data.tables.records.PlayEvolutionsRecord;
import jooq.data.tables.records.SysConfigsRecord;
import jooq.data.tables.records.UserJobSummaryRecord;
import jooq.data.tables.records.YarnAppCheckLogRecord;
import jooq.data.tables.records.YarnAppCheckSettingRecord;
import jooq.data.tables.records.YarnAppHeuristicResultDetailsRecord;
import jooq.data.tables.records.YarnAppHeuristicResultRecord;
import jooq.data.tables.records.YarnAppResultRecord;
import jooq.data.tables.records.ZipkinAnnotationsRecord;
import jooq.data.tables.records.ZipkinDependenciesRecord;
import jooq.data.tables.records.ZipkinSpansRecord;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>cloudins</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<CloudinsFieldRecord, Integer> IDENTITY_CLOUDINS_FIELD = Identities0.IDENTITY_CLOUDINS_FIELD;
    public static final Identity<CloudinsLogRecord, Long> IDENTITY_CLOUDINS_LOG = Identities0.IDENTITY_CLOUDINS_LOG;
    public static final Identity<CloudinsRoleRecord, Integer> IDENTITY_CLOUDINS_ROLE = Identities0.IDENTITY_CLOUDINS_ROLE;
    public static final Identity<CloudinsUserRecord, Integer> IDENTITY_CLOUDINS_USER = Identities0.IDENTITY_CLOUDINS_USER;
    public static final Identity<YarnAppCheckLogRecord, Long> IDENTITY_YARN_APP_CHECK_LOG = Identities0.IDENTITY_YARN_APP_CHECK_LOG;
    public static final Identity<YarnAppCheckSettingRecord, Long> IDENTITY_YARN_APP_CHECK_SETTING = Identities0.IDENTITY_YARN_APP_CHECK_SETTING;
    public static final Identity<YarnAppHeuristicResultRecord, Integer> IDENTITY_YARN_APP_HEURISTIC_RESULT = Identities0.IDENTITY_YARN_APP_HEURISTIC_RESULT;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CloudinsConfigRecord> KEY_CLOUDINS_CONFIG_PRIMARY = UniqueKeys0.KEY_CLOUDINS_CONFIG_PRIMARY;
    public static final UniqueKey<CloudinsFieldRecord> KEY_CLOUDINS_FIELD_PRIMARY = UniqueKeys0.KEY_CLOUDINS_FIELD_PRIMARY;
    public static final UniqueKey<CloudinsLogRecord> KEY_CLOUDINS_LOG_PRIMARY = UniqueKeys0.KEY_CLOUDINS_LOG_PRIMARY;
    public static final UniqueKey<CloudinsRoleRecord> KEY_CLOUDINS_ROLE_PRIMARY = UniqueKeys0.KEY_CLOUDINS_ROLE_PRIMARY;
    public static final UniqueKey<CloudinsUserRecord> KEY_CLOUDINS_USER_PRIMARY = UniqueKeys0.KEY_CLOUDINS_USER_PRIMARY;
    public static final UniqueKey<HistoricalPeakRecord> KEY_HISTORICAL_PEAK_PRIMARY = UniqueKeys0.KEY_HISTORICAL_PEAK_PRIMARY;
    public static final UniqueKey<JobSummaryBasicRecord> KEY_JOB_SUMMARY_BASIC_PRIMARY = UniqueKeys0.KEY_JOB_SUMMARY_BASIC_PRIMARY;
    public static final UniqueKey<JobTypeSummaryRecord> KEY_JOB_TYPE_SUMMARY_PRIMARY = UniqueKeys0.KEY_JOB_TYPE_SUMMARY_PRIMARY;
    public static final UniqueKey<PlayEvolutionsRecord> KEY_PLAY_EVOLUTIONS_PRIMARY = UniqueKeys0.KEY_PLAY_EVOLUTIONS_PRIMARY;
    public static final UniqueKey<SysConfigsRecord> KEY_SYS_CONFIGS_PRIMARY = UniqueKeys0.KEY_SYS_CONFIGS_PRIMARY;
    public static final UniqueKey<UserJobSummaryRecord> KEY_USER_JOB_SUMMARY_PRIMARY = UniqueKeys0.KEY_USER_JOB_SUMMARY_PRIMARY;
    public static final UniqueKey<YarnAppCheckLogRecord> KEY_YARN_APP_CHECK_LOG_PRIMARY = UniqueKeys0.KEY_YARN_APP_CHECK_LOG_PRIMARY;
    public static final UniqueKey<YarnAppCheckSettingRecord> KEY_YARN_APP_CHECK_SETTING_PRIMARY = UniqueKeys0.KEY_YARN_APP_CHECK_SETTING_PRIMARY;
    public static final UniqueKey<YarnAppHeuristicResultRecord> KEY_YARN_APP_HEURISTIC_RESULT_PRIMARY = UniqueKeys0.KEY_YARN_APP_HEURISTIC_RESULT_PRIMARY;
    public static final UniqueKey<YarnAppHeuristicResultDetailsRecord> KEY_YARN_APP_HEURISTIC_RESULT_DETAILS_PRIMARY = UniqueKeys0.KEY_YARN_APP_HEURISTIC_RESULT_DETAILS_PRIMARY;
    public static final UniqueKey<YarnAppResultRecord> KEY_YARN_APP_RESULT_PRIMARY = UniqueKeys0.KEY_YARN_APP_RESULT_PRIMARY;
    public static final UniqueKey<ZipkinAnnotationsRecord> KEY_ZIPKIN_ANNOTATIONS_TRACE_ID = UniqueKeys0.KEY_ZIPKIN_ANNOTATIONS_TRACE_ID;
    public static final UniqueKey<ZipkinDependenciesRecord> KEY_ZIPKIN_DEPENDENCIES_DAY = UniqueKeys0.KEY_ZIPKIN_DEPENDENCIES_DAY;
    public static final UniqueKey<ZipkinSpansRecord> KEY_ZIPKIN_SPANS_TRACE_ID = UniqueKeys0.KEY_ZIPKIN_SPANS_TRACE_ID;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<JobTypeSummaryRecord, JobSummaryBasicRecord> FK_JOB_TYPE_SUMMARY_JOB_SUMMARY_BASIC = ForeignKeys0.FK_JOB_TYPE_SUMMARY_JOB_SUMMARY_BASIC;
    public static final ForeignKey<UserJobSummaryRecord, JobSummaryBasicRecord> FK_USER_JOB_SUMMARY_JOB_SUMMARY_BASIC = ForeignKeys0.FK_USER_JOB_SUMMARY_JOB_SUMMARY_BASIC;
    public static final ForeignKey<YarnAppHeuristicResultRecord, YarnAppResultRecord> YARN_APP_HEURISTIC_RESULT_F1 = ForeignKeys0.YARN_APP_HEURISTIC_RESULT_F1;
    public static final ForeignKey<YarnAppHeuristicResultDetailsRecord, YarnAppHeuristicResultRecord> YARN_APP_HEURISTIC_RESULT_DETAILS_F1 = ForeignKeys0.YARN_APP_HEURISTIC_RESULT_DETAILS_F1;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<CloudinsFieldRecord, Integer> IDENTITY_CLOUDINS_FIELD = createIdentity(CloudinsField.CLOUDINS_FIELD, CloudinsField.CLOUDINS_FIELD.ID);
        public static Identity<CloudinsLogRecord, Long> IDENTITY_CLOUDINS_LOG = createIdentity(CloudinsLog.CLOUDINS_LOG, CloudinsLog.CLOUDINS_LOG.ID);
        public static Identity<CloudinsRoleRecord, Integer> IDENTITY_CLOUDINS_ROLE = createIdentity(CloudinsRole.CLOUDINS_ROLE, CloudinsRole.CLOUDINS_ROLE.ID);
        public static Identity<CloudinsUserRecord, Integer> IDENTITY_CLOUDINS_USER = createIdentity(CloudinsUser.CLOUDINS_USER, CloudinsUser.CLOUDINS_USER.ID);
        public static Identity<YarnAppCheckLogRecord, Long> IDENTITY_YARN_APP_CHECK_LOG = createIdentity(YarnAppCheckLog.YARN_APP_CHECK_LOG, YarnAppCheckLog.YARN_APP_CHECK_LOG.ID);
        public static Identity<YarnAppCheckSettingRecord, Long> IDENTITY_YARN_APP_CHECK_SETTING = createIdentity(YarnAppCheckSetting.YARN_APP_CHECK_SETTING, YarnAppCheckSetting.YARN_APP_CHECK_SETTING.ID);
        public static Identity<YarnAppHeuristicResultRecord, Integer> IDENTITY_YARN_APP_HEURISTIC_RESULT = createIdentity(YarnAppHeuristicResult.YARN_APP_HEURISTIC_RESULT, YarnAppHeuristicResult.YARN_APP_HEURISTIC_RESULT.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<CloudinsConfigRecord> KEY_CLOUDINS_CONFIG_PRIMARY = createUniqueKey(CloudinsConfig.CLOUDINS_CONFIG, "KEY_cloudins_config_PRIMARY", CloudinsConfig.CLOUDINS_CONFIG.ID);
        public static final UniqueKey<CloudinsFieldRecord> KEY_CLOUDINS_FIELD_PRIMARY = createUniqueKey(CloudinsField.CLOUDINS_FIELD, "KEY_cloudins_field_PRIMARY", CloudinsField.CLOUDINS_FIELD.ID);
        public static final UniqueKey<CloudinsLogRecord> KEY_CLOUDINS_LOG_PRIMARY = createUniqueKey(CloudinsLog.CLOUDINS_LOG, "KEY_cloudins_log_PRIMARY", CloudinsLog.CLOUDINS_LOG.ID);
        public static final UniqueKey<CloudinsRoleRecord> KEY_CLOUDINS_ROLE_PRIMARY = createUniqueKey(CloudinsRole.CLOUDINS_ROLE, "KEY_cloudins_role_PRIMARY", CloudinsRole.CLOUDINS_ROLE.ID);
        public static final UniqueKey<CloudinsUserRecord> KEY_CLOUDINS_USER_PRIMARY = createUniqueKey(CloudinsUser.CLOUDINS_USER, "KEY_cloudins_user_PRIMARY", CloudinsUser.CLOUDINS_USER.ID);
        public static final UniqueKey<HistoricalPeakRecord> KEY_HISTORICAL_PEAK_PRIMARY = createUniqueKey(HistoricalPeak.HISTORICAL_PEAK, "KEY_historical_peak_PRIMARY", HistoricalPeak.HISTORICAL_PEAK.ID);
        public static final UniqueKey<JobSummaryBasicRecord> KEY_JOB_SUMMARY_BASIC_PRIMARY = createUniqueKey(JobSummaryBasic.JOB_SUMMARY_BASIC, "KEY_job_summary_basic_PRIMARY", JobSummaryBasic.JOB_SUMMARY_BASIC.ID);
        public static final UniqueKey<JobTypeSummaryRecord> KEY_JOB_TYPE_SUMMARY_PRIMARY = createUniqueKey(JobTypeSummary.JOB_TYPE_SUMMARY, "KEY_job_type_summary_PRIMARY", JobTypeSummary.JOB_TYPE_SUMMARY.ID);
        public static final UniqueKey<PlayEvolutionsRecord> KEY_PLAY_EVOLUTIONS_PRIMARY = createUniqueKey(PlayEvolutions.PLAY_EVOLUTIONS, "KEY_play_evolutions_PRIMARY", PlayEvolutions.PLAY_EVOLUTIONS.ID);
        public static final UniqueKey<SysConfigsRecord> KEY_SYS_CONFIGS_PRIMARY = createUniqueKey(SysConfigs.SYS_CONFIGS, "KEY_sys_configs_PRIMARY", SysConfigs.SYS_CONFIGS.CONFIG_NAME);
        public static final UniqueKey<UserJobSummaryRecord> KEY_USER_JOB_SUMMARY_PRIMARY = createUniqueKey(UserJobSummary.USER_JOB_SUMMARY, "KEY_user_job_summary_PRIMARY", UserJobSummary.USER_JOB_SUMMARY.ID);
        public static final UniqueKey<YarnAppCheckLogRecord> KEY_YARN_APP_CHECK_LOG_PRIMARY = createUniqueKey(YarnAppCheckLog.YARN_APP_CHECK_LOG, "KEY_yarn_app_check_log_PRIMARY", YarnAppCheckLog.YARN_APP_CHECK_LOG.ID);
        public static final UniqueKey<YarnAppCheckSettingRecord> KEY_YARN_APP_CHECK_SETTING_PRIMARY = createUniqueKey(YarnAppCheckSetting.YARN_APP_CHECK_SETTING, "KEY_yarn_app_check_setting_PRIMARY", YarnAppCheckSetting.YARN_APP_CHECK_SETTING.ID);
        public static final UniqueKey<YarnAppHeuristicResultRecord> KEY_YARN_APP_HEURISTIC_RESULT_PRIMARY = createUniqueKey(YarnAppHeuristicResult.YARN_APP_HEURISTIC_RESULT, "KEY_yarn_app_heuristic_result_PRIMARY", YarnAppHeuristicResult.YARN_APP_HEURISTIC_RESULT.ID);
        public static final UniqueKey<YarnAppHeuristicResultDetailsRecord> KEY_YARN_APP_HEURISTIC_RESULT_DETAILS_PRIMARY = createUniqueKey(YarnAppHeuristicResultDetails.YARN_APP_HEURISTIC_RESULT_DETAILS, "KEY_yarn_app_heuristic_result_details_PRIMARY", YarnAppHeuristicResultDetails.YARN_APP_HEURISTIC_RESULT_DETAILS.YARN_APP_HEURISTIC_RESULT_ID, YarnAppHeuristicResultDetails.YARN_APP_HEURISTIC_RESULT_DETAILS.NAME);
        public static final UniqueKey<YarnAppResultRecord> KEY_YARN_APP_RESULT_PRIMARY = createUniqueKey(YarnAppResult.YARN_APP_RESULT, "KEY_yarn_app_result_PRIMARY", YarnAppResult.YARN_APP_RESULT.ID);
        public static final UniqueKey<ZipkinAnnotationsRecord> KEY_ZIPKIN_ANNOTATIONS_TRACE_ID = createUniqueKey(ZipkinAnnotations.ZIPKIN_ANNOTATIONS, "KEY_zipkin_annotations_trace_id", ZipkinAnnotations.ZIPKIN_ANNOTATIONS.TRACE_ID, ZipkinAnnotations.ZIPKIN_ANNOTATIONS.SPAN_ID, ZipkinAnnotations.ZIPKIN_ANNOTATIONS.A_KEY, ZipkinAnnotations.ZIPKIN_ANNOTATIONS.A_TIMESTAMP);
        public static final UniqueKey<ZipkinDependenciesRecord> KEY_ZIPKIN_DEPENDENCIES_DAY = createUniqueKey(ZipkinDependencies.ZIPKIN_DEPENDENCIES, "KEY_zipkin_dependencies_day", ZipkinDependencies.ZIPKIN_DEPENDENCIES.DAY, ZipkinDependencies.ZIPKIN_DEPENDENCIES.PARENT, ZipkinDependencies.ZIPKIN_DEPENDENCIES.CHILD);
        public static final UniqueKey<ZipkinSpansRecord> KEY_ZIPKIN_SPANS_TRACE_ID = createUniqueKey(ZipkinSpans.ZIPKIN_SPANS, "KEY_zipkin_spans_trace_id", ZipkinSpans.ZIPKIN_SPANS.TRACE_ID, ZipkinSpans.ZIPKIN_SPANS.ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<JobTypeSummaryRecord, JobSummaryBasicRecord> FK_JOB_TYPE_SUMMARY_JOB_SUMMARY_BASIC = createForeignKey(jooq.data.Keys.KEY_JOB_SUMMARY_BASIC_PRIMARY, JobTypeSummary.JOB_TYPE_SUMMARY, "fk_job_type_summary_job_summary_basic", JobTypeSummary.JOB_TYPE_SUMMARY.JOB_SUMMARY_BASIC_ID);
        public static final ForeignKey<UserJobSummaryRecord, JobSummaryBasicRecord> FK_USER_JOB_SUMMARY_JOB_SUMMARY_BASIC = createForeignKey(jooq.data.Keys.KEY_JOB_SUMMARY_BASIC_PRIMARY, UserJobSummary.USER_JOB_SUMMARY, "fk_user_job_summary_job_summary_basic", UserJobSummary.USER_JOB_SUMMARY.JOB_SUMMARY_BASIC_ID);
        public static final ForeignKey<YarnAppHeuristicResultRecord, YarnAppResultRecord> YARN_APP_HEURISTIC_RESULT_F1 = createForeignKey(jooq.data.Keys.KEY_YARN_APP_RESULT_PRIMARY, YarnAppHeuristicResult.YARN_APP_HEURISTIC_RESULT, "yarn_app_heuristic_result_f1", YarnAppHeuristicResult.YARN_APP_HEURISTIC_RESULT.YARN_APP_RESULT_ID);
        public static final ForeignKey<YarnAppHeuristicResultDetailsRecord, YarnAppHeuristicResultRecord> YARN_APP_HEURISTIC_RESULT_DETAILS_F1 = createForeignKey(jooq.data.Keys.KEY_YARN_APP_HEURISTIC_RESULT_PRIMARY, YarnAppHeuristicResultDetails.YARN_APP_HEURISTIC_RESULT_DETAILS, "yarn_app_heuristic_result_details_f1", YarnAppHeuristicResultDetails.YARN_APP_HEURISTIC_RESULT_DETAILS.YARN_APP_HEURISTIC_RESULT_ID);
    }
}