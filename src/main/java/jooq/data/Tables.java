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


/**
 * Convenience access to all tables in cloudins
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>cloudins.cloudins_config</code>.
     */
    public static final CloudinsConfig CLOUDINS_CONFIG = jooq.data.tables.CloudinsConfig.CLOUDINS_CONFIG;

    /**
     * The table <code>cloudins.cloudins_field</code>.
     */
    public static final CloudinsField CLOUDINS_FIELD = jooq.data.tables.CloudinsField.CLOUDINS_FIELD;

    /**
     * The table <code>cloudins.cloudins_log</code>.
     */
    public static final CloudinsLog CLOUDINS_LOG = jooq.data.tables.CloudinsLog.CLOUDINS_LOG;

    /**
     * The table <code>cloudins.cloudins_role</code>.
     */
    public static final CloudinsRole CLOUDINS_ROLE = jooq.data.tables.CloudinsRole.CLOUDINS_ROLE;

    /**
     * The table <code>cloudins.cloudins_user</code>.
     */
    public static final CloudinsUser CLOUDINS_USER = jooq.data.tables.CloudinsUser.CLOUDINS_USER;

    /**
     * The table <code>cloudins.historical_peak</code>.
     */
    public static final HistoricalPeak HISTORICAL_PEAK = jooq.data.tables.HistoricalPeak.HISTORICAL_PEAK;

    /**
     * The table <code>cloudins.job_summary_basic</code>.
     */
    public static final JobSummaryBasic JOB_SUMMARY_BASIC = jooq.data.tables.JobSummaryBasic.JOB_SUMMARY_BASIC;

    /**
     * The table <code>cloudins.job_type_summary</code>.
     */
    public static final JobTypeSummary JOB_TYPE_SUMMARY = jooq.data.tables.JobTypeSummary.JOB_TYPE_SUMMARY;

    /**
     * The table <code>cloudins.play_evolutions</code>.
     */
    public static final PlayEvolutions PLAY_EVOLUTIONS = jooq.data.tables.PlayEvolutions.PLAY_EVOLUTIONS;

    /**
     * The table <code>cloudins.sys_configs</code>.
     */
    public static final SysConfigs SYS_CONFIGS = jooq.data.tables.SysConfigs.SYS_CONFIGS;

    /**
     * The table <code>cloudins.user_job_summary</code>.
     */
    public static final UserJobSummary USER_JOB_SUMMARY = jooq.data.tables.UserJobSummary.USER_JOB_SUMMARY;

    /**
     * The table <code>cloudins.yarn_app_check_log</code>.
     */
    public static final YarnAppCheckLog YARN_APP_CHECK_LOG = jooq.data.tables.YarnAppCheckLog.YARN_APP_CHECK_LOG;

    /**
     * The table <code>cloudins.yarn_app_check_setting</code>.
     */
    public static final YarnAppCheckSetting YARN_APP_CHECK_SETTING = jooq.data.tables.YarnAppCheckSetting.YARN_APP_CHECK_SETTING;

    /**
     * The table <code>cloudins.yarn_app_heuristic_result</code>.
     */
    public static final YarnAppHeuristicResult YARN_APP_HEURISTIC_RESULT = jooq.data.tables.YarnAppHeuristicResult.YARN_APP_HEURISTIC_RESULT;

    /**
     * The table <code>cloudins.yarn_app_heuristic_result_details</code>.
     */
    public static final YarnAppHeuristicResultDetails YARN_APP_HEURISTIC_RESULT_DETAILS = jooq.data.tables.YarnAppHeuristicResultDetails.YARN_APP_HEURISTIC_RESULT_DETAILS;

    /**
     * The table <code>cloudins.yarn_app_result</code>.
     */
    public static final YarnAppResult YARN_APP_RESULT = jooq.data.tables.YarnAppResult.YARN_APP_RESULT;

    /**
     * The table <code>cloudins.zipkin_annotations</code>.
     */
    public static final ZipkinAnnotations ZIPKIN_ANNOTATIONS = jooq.data.tables.ZipkinAnnotations.ZIPKIN_ANNOTATIONS;

    /**
     * The table <code>cloudins.zipkin_dependencies</code>.
     */
    public static final ZipkinDependencies ZIPKIN_DEPENDENCIES = jooq.data.tables.ZipkinDependencies.ZIPKIN_DEPENDENCIES;

    /**
     * The table <code>cloudins.zipkin_spans</code>.
     */
    public static final ZipkinSpans ZIPKIN_SPANS = jooq.data.tables.ZipkinSpans.ZIPKIN_SPANS;
}
