/**
 * This class is generated by jOOQ
 */
package jooq.data.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class TraceInfos implements Serializable {

    private static final long serialVersionUID = -1280407602;

    private String  traceMd5;
    private String  rootName;
    private String  traceName;
    private Short   spanCount;
    private String  traceAlias;
    private Long    baseTraceId;
    private Long    warningDuration;
    private Integer warningPercentage;
    private Long    duration;

    public TraceInfos() {}

    public TraceInfos(TraceInfos value) {
        this.traceMd5 = value.traceMd5;
        this.rootName = value.rootName;
        this.traceName = value.traceName;
        this.spanCount = value.spanCount;
        this.traceAlias = value.traceAlias;
        this.baseTraceId = value.baseTraceId;
        this.warningDuration = value.warningDuration;
        this.warningPercentage = value.warningPercentage;
        this.duration = value.duration;
    }

    public TraceInfos(
        String  traceMd5,
        String  rootName,
        String  traceName,
        Short   spanCount,
        String  traceAlias,
        Long    baseTraceId,
        Long    warningDuration,
        Integer warningPercentage,
        Long    duration
    ) {
        this.traceMd5 = traceMd5;
        this.rootName = rootName;
        this.traceName = traceName;
        this.spanCount = spanCount;
        this.traceAlias = traceAlias;
        this.baseTraceId = baseTraceId;
        this.warningDuration = warningDuration;
        this.warningPercentage = warningPercentage;
        this.duration = duration;
    }

    public String getTraceMd5() {
        return this.traceMd5;
    }

    public void setTraceMd5(String traceMd5) {
        this.traceMd5 = traceMd5;
    }

    public String getRootName() {
        return this.rootName;
    }

    public void setRootName(String rootName) {
        this.rootName = rootName;
    }

    public String getTraceName() {
        return this.traceName;
    }

    public void setTraceName(String traceName) {
        this.traceName = traceName;
    }

    public Short getSpanCount() {
        return this.spanCount;
    }

    public void setSpanCount(Short spanCount) {
        this.spanCount = spanCount;
    }

    public String getTraceAlias() {
        return this.traceAlias;
    }

    public void setTraceAlias(String traceAlias) {
        this.traceAlias = traceAlias;
    }

    public Long getBaseTraceId() {
        return this.baseTraceId;
    }

    public void setBaseTraceId(Long baseTraceId) {
        this.baseTraceId = baseTraceId;
    }

    public Long getWarningDuration() {
        return this.warningDuration;
    }

    public void setWarningDuration(Long warningDuration) {
        this.warningDuration = warningDuration;
    }

    public Integer getWarningPercentage() {
        return this.warningPercentage;
    }

    public void setWarningPercentage(Integer warningPercentage) {
        this.warningPercentage = warningPercentage;
    }

    public Long getDuration() {
        return this.duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TraceInfos (");

        sb.append(traceMd5);
        sb.append(", ").append(rootName);
        sb.append(", ").append(traceName);
        sb.append(", ").append(spanCount);
        sb.append(", ").append(traceAlias);
        sb.append(", ").append(baseTraceId);
        sb.append(", ").append(warningDuration);
        sb.append(", ").append(warningPercentage);
        sb.append(", ").append(duration);

        sb.append(")");
        return sb.toString();
    }
}
