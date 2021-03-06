/**
 * This class is generated by jOOQ
 */
package jooq.data.tables.pojos;


import java.io.Serializable;
import java.sql.Date;

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
public class ZipkinDependencies implements Serializable {

    private static final long serialVersionUID = -2054606500;

    private Date   day;
    private String parent;
    private String child;
    private Long   callCount;

    public ZipkinDependencies() {}

    public ZipkinDependencies(ZipkinDependencies value) {
        this.day = value.day;
        this.parent = value.parent;
        this.child = value.child;
        this.callCount = value.callCount;
    }

    public ZipkinDependencies(
        Date   day,
        String parent,
        String child,
        Long   callCount
    ) {
        this.day = day;
        this.parent = parent;
        this.child = child;
        this.callCount = callCount;
    }

    public Date getDay() {
        return this.day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public String getParent() {
        return this.parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getChild() {
        return this.child;
    }

    public void setChild(String child) {
        this.child = child;
    }

    public Long getCallCount() {
        return this.callCount;
    }

    public void setCallCount(Long callCount) {
        this.callCount = callCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ZipkinDependencies (");

        sb.append(day);
        sb.append(", ").append(parent);
        sb.append(", ").append(child);
        sb.append(", ").append(callCount);

        sb.append(")");
        return sb.toString();
    }
}
