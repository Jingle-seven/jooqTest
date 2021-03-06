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
public class ErrorInfo implements Serializable {

    private static final long serialVersionUID = -713061261;

    private Long   traceId;
    private Long   spanId;
    private String aKey;
    private byte[] aValue;
    private Long   aTimestamp;
    private String endpointServiceName;

    public ErrorInfo() {}

    public ErrorInfo(ErrorInfo value) {
        this.traceId = value.traceId;
        this.spanId = value.spanId;
        this.aKey = value.aKey;
        this.aValue = value.aValue;
        this.aTimestamp = value.aTimestamp;
        this.endpointServiceName = value.endpointServiceName;
    }

    public ErrorInfo(
        Long   traceId,
        Long   spanId,
        String aKey,
        byte[] aValue,
        Long   aTimestamp,
        String endpointServiceName
    ) {
        this.traceId = traceId;
        this.spanId = spanId;
        this.aKey = aKey;
        this.aValue = aValue;
        this.aTimestamp = aTimestamp;
        this.endpointServiceName = endpointServiceName;
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

    public String getAKey() {
        return this.aKey;
    }

    public void setAKey(String aKey) {
        this.aKey = aKey;
    }

    public byte[] getAValue() {
        return this.aValue;
    }

    public void setAValue(byte[] aValue) {
        this.aValue = aValue;
    }

    public Long getATimestamp() {
        return this.aTimestamp;
    }

    public void setATimestamp(Long aTimestamp) {
        this.aTimestamp = aTimestamp;
    }

    public String getEndpointServiceName() {
        return this.endpointServiceName;
    }

    public void setEndpointServiceName(String endpointServiceName) {
        this.endpointServiceName = endpointServiceName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ErrorInfoTable (");

        sb.append(traceId);
        sb.append(", ").append(spanId);
        sb.append(", ").append(aKey);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(aTimestamp);
        sb.append(", ").append(endpointServiceName);

        sb.append(")");
        return sb.toString();
    }
}
