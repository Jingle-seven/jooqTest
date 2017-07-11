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
public class AlarmMessage implements Serializable {

    private static final long serialVersionUID = -470244900;

    private Long   id;
    private String traceId;
    private Long   region;
    private String message;
    private String time;
    private Short  status;

    public AlarmMessage() {}

    public AlarmMessage(AlarmMessage value) {
        this.id = value.id;
        this.traceId = value.traceId;
        this.region = value.region;
        this.message = value.message;
        this.time = value.time;
        this.status = value.status;
    }

    public AlarmMessage(
        Long   id,
        String traceId,
        Long   region,
        String message,
        String time,
        Short  status
    ) {
        this.id = id;
        this.traceId = traceId;
        this.region = region;
        this.message = message;
        this.time = time;
        this.status = status;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public Long getRegion() {
        return this.region;
    }

    public void setRegion(Long region) {
        this.region = region;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Short getStatus() {
        return this.status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AlarmMessage (");

        sb.append(id);
        sb.append(", ").append(traceId);
        sb.append(", ").append(region);
        sb.append(", ").append(message);
        sb.append(", ").append(time);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}