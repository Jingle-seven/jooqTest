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
public class ZipkinSpans implements Serializable {

    private static final long serialVersionUID = 134972162;

    private Long    traceId;
    private Long    id;
    private String  name;
    private Long    parentId;
    private Boolean debug;
    private Long    startTs;
    private Long    duration;

    public ZipkinSpans() {}

    public ZipkinSpans(ZipkinSpans value) {
        this.traceId = value.traceId;
        this.id = value.id;
        this.name = value.name;
        this.parentId = value.parentId;
        this.debug = value.debug;
        this.startTs = value.startTs;
        this.duration = value.duration;
    }

    public ZipkinSpans(
        Long    traceId,
        Long    id,
        String  name,
        Long    parentId,
        Boolean debug,
        Long    startTs,
        Long    duration
    ) {
        this.traceId = traceId;
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.debug = debug;
        this.startTs = startTs;
        this.duration = duration;
    }

    public Long getTraceId() {
        return this.traceId;
    }

    public void setTraceId(Long traceId) {
        this.traceId = traceId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Boolean getDebug() {
        return this.debug;
    }

    public void setDebug(Boolean debug) {
        this.debug = debug;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ZipkinSpans (");

        sb.append(traceId);
        sb.append(", ").append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(parentId);
        sb.append(", ").append(debug);
        sb.append(", ").append(startTs);
        sb.append(", ").append(duration);

        sb.append(")");
        return sb.toString();
    }
}