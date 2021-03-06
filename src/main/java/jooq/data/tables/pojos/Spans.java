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
public class Spans implements Serializable {

    private static final long serialVersionUID = 734259744;

    private Long    traceId;
    private Long    spanId;
    private Integer endpointIpv4;
    private String  endpointServiceName;
    private Long    startTs;
    private Long    duration;
    private Long    recordTs;

    public Spans() {}

    public Spans(Spans value) {
        this.traceId = value.traceId;
        this.spanId = value.spanId;
        this.endpointIpv4 = value.endpointIpv4;
        this.endpointServiceName = value.endpointServiceName;
        this.startTs = value.startTs;
        this.duration = value.duration;
        this.recordTs = value.recordTs;
    }

    public Spans(
        Long    traceId,
        Long    spanId,
        Integer endpointIpv4,
        String  endpointServiceName,
        Long    startTs,
        Long    duration,
        Long    recordTs
    ) {
        this.traceId = traceId;
        this.spanId = spanId;
        this.endpointIpv4 = endpointIpv4;
        this.endpointServiceName = endpointServiceName;
        this.startTs = startTs;
        this.duration = duration;
        this.recordTs = recordTs;
    }

    public Long getTraceId() {
        return this.traceId;
    }

    public void setTraceId(Long traceId) {
        this.traceId = traceId;
    }

    public Long getSpanId() {
        return this.spanId;
    }

    public void setSpanId(Long spanId) {
        this.spanId = spanId;
    }

    public Integer getEndpointIpv4() {
        return this.endpointIpv4;
    }

    public void setEndpointIpv4(Integer endpointIpv4) {
        this.endpointIpv4 = endpointIpv4;
    }

    public String getEndpointServiceName() {
        return this.endpointServiceName;
    }

    public void setEndpointServiceName(String endpointServiceName) {
        this.endpointServiceName = endpointServiceName;
    }

    public Long getStartTs() {
        return this.startTs;
    }

    public void setStartTs(Long startTs) {
        this.startTs = startTs;
    }

    public Long getDuration() {
        return this.duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Long getRecordTs() {
        return this.recordTs;
    }

    public void setRecordTs(Long recordTs) {
        this.recordTs = recordTs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Spans (");

        sb.append(traceId);
        sb.append(", ").append(spanId);
        sb.append(", ").append(endpointIpv4);
        sb.append(", ").append(endpointServiceName);
        sb.append(", ").append(startTs);
        sb.append(", ").append(duration);
        sb.append(", ").append(recordTs);

        sb.append(")");
        return sb.toString();
    }
}
