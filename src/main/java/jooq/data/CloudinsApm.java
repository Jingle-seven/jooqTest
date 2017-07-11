/**
 * This class is generated by jOOQ
 */
package jooq.data;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.data.tables.AlarmMessage;
import jooq.data.tables.CloudinsConfig;
import jooq.data.tables.CloudinsLog;
import jooq.data.tables.CloudinsRegion;
import jooq.data.tables.CloudinsRole;
import jooq.data.tables.CloudinsSpanBaseline;
import jooq.data.tables.CloudinsUser;
import jooq.data.tables.CloudinsUserRegionAppli;
import jooq.data.tables.ErrorInfo;
import jooq.data.tables.SpanInfos;
import jooq.data.tables.SpanTopoTest;
import jooq.data.tables.Spans;
import jooq.data.tables.SpansBackup;
import jooq.data.tables.StatisticsSpans;
import jooq.data.tables.SysConfigs;
import jooq.data.tables.TraceInfos;
import jooq.data.tables.Traces;
import jooq.data.tables.ZipkinAnnotations;
import jooq.data.tables.ZipkinDependencies;
import jooq.data.tables.ZipkinSpans;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class CloudinsApm extends SchemaImpl {

    private static final long serialVersionUID = -1289463921;

    /**
     * The reference instance of <code>cloudins_apm</code>
     */
    public static final CloudinsApm CLOUDINS_APM = new CloudinsApm();

    /**
     * The table <code>cloudins_apm.alarm_message</code>.
     */
    public final AlarmMessage ALARM_MESSAGE = jooq.data.tables.AlarmMessage.ALARM_MESSAGE;

    /**
     * The table <code>cloudins_apm.cloudins_config</code>.
     */
    public final CloudinsConfig CLOUDINS_CONFIG = jooq.data.tables.CloudinsConfig.CLOUDINS_CONFIG;

    /**
     * The table <code>cloudins_apm.cloudins_log</code>.
     */
    public final CloudinsLog CLOUDINS_LOG = jooq.data.tables.CloudinsLog.CLOUDINS_LOG;

    /**
     * The table <code>cloudins_apm.cloudins_region</code>.
     */
    public final CloudinsRegion CLOUDINS_REGION = jooq.data.tables.CloudinsRegion.CLOUDINS_REGION;

    /**
     * The table <code>cloudins_apm.cloudins_role</code>.
     */
    public final CloudinsRole CLOUDINS_ROLE = jooq.data.tables.CloudinsRole.CLOUDINS_ROLE;

    /**
     * The table <code>cloudins_apm.cloudins_span_baseline</code>.
     */
    public final CloudinsSpanBaseline CLOUDINS_SPAN_BASELINE = jooq.data.tables.CloudinsSpanBaseline.CLOUDINS_SPAN_BASELINE;

    /**
     * The table <code>cloudins_apm.cloudins_user</code>.
     */
    public final CloudinsUser CLOUDINS_USER = jooq.data.tables.CloudinsUser.CLOUDINS_USER;

    /**
     * The table <code>cloudins_apm.cloudins_user_region_appli</code>.
     */
    public final CloudinsUserRegionAppli CLOUDINS_USER_REGION_APPLI = jooq.data.tables.CloudinsUserRegionAppli.CLOUDINS_USER_REGION_APPLI;

    /**
     * The table <code>cloudins_apm.error_info</code>.
     */
    public final ErrorInfo ERROR_INFO = jooq.data.tables.ErrorInfo.ERROR_INFO;

    /**
     * The table <code>cloudins_apm.spans</code>.
     */
    public final Spans SPANS = jooq.data.tables.Spans.SPANS;

    /**
     * The table <code>cloudins_apm.spans_backup</code>.
     */
    public final SpansBackup SPANS_BACKUP = jooq.data.tables.SpansBackup.SPANS_BACKUP;

    /**
     * The table <code>cloudins_apm.span_infos</code>.
     */
    public final SpanInfos SPAN_INFOS = jooq.data.tables.SpanInfos.SPAN_INFOS;

    /**
     * The table <code>cloudins_apm.span_topo_test</code>.
     */
    public final SpanTopoTest SPAN_TOPO_TEST = jooq.data.tables.SpanTopoTest.SPAN_TOPO_TEST;

    /**
     * The table <code>cloudins_apm.statistics_spans</code>.
     */
    public final StatisticsSpans STATISTICS_SPANS = jooq.data.tables.StatisticsSpans.STATISTICS_SPANS;

    /**
     * The table <code>cloudins_apm.sys_configs</code>.
     */
    public final SysConfigs SYS_CONFIGS = jooq.data.tables.SysConfigs.SYS_CONFIGS;

    /**
     * The table <code>cloudins_apm.traces</code>.
     */
    public final Traces TRACES = jooq.data.tables.Traces.TRACES;

    /**
     * The table <code>cloudins_apm.trace_infos</code>.
     */
    public final TraceInfos TRACE_INFOS = jooq.data.tables.TraceInfos.TRACE_INFOS;

    /**
     * The table <code>cloudins_apm.zipkin_annotations</code>.
     */
    public final ZipkinAnnotations ZIPKIN_ANNOTATIONS = jooq.data.tables.ZipkinAnnotations.ZIPKIN_ANNOTATIONS;

    /**
     * The table <code>cloudins_apm.zipkin_dependencies</code>.
     */
    public final ZipkinDependencies ZIPKIN_DEPENDENCIES = jooq.data.tables.ZipkinDependencies.ZIPKIN_DEPENDENCIES;

    /**
     * The table <code>cloudins_apm.zipkin_spans</code>.
     */
    public final ZipkinSpans ZIPKIN_SPANS = jooq.data.tables.ZipkinSpans.ZIPKIN_SPANS;

    /**
     * No further instances allowed
     */
    private CloudinsApm() {
        super("cloudins_apm", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            AlarmMessage.ALARM_MESSAGE,
            CloudinsConfig.CLOUDINS_CONFIG,
            CloudinsLog.CLOUDINS_LOG,
            CloudinsRegion.CLOUDINS_REGION,
            CloudinsRole.CLOUDINS_ROLE,
            CloudinsSpanBaseline.CLOUDINS_SPAN_BASELINE,
            CloudinsUser.CLOUDINS_USER,
            CloudinsUserRegionAppli.CLOUDINS_USER_REGION_APPLI,
            ErrorInfo.ERROR_INFO,
            Spans.SPANS,
            SpansBackup.SPANS_BACKUP,
            SpanInfos.SPAN_INFOS,
            SpanTopoTest.SPAN_TOPO_TEST,
            StatisticsSpans.STATISTICS_SPANS,
            SysConfigs.SYS_CONFIGS,
            Traces.TRACES,
            TraceInfos.TRACE_INFOS,
            ZipkinAnnotations.ZIPKIN_ANNOTATIONS,
            ZipkinDependencies.ZIPKIN_DEPENDENCIES,
            ZipkinSpans.ZIPKIN_SPANS);
    }
}
