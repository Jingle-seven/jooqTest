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
public class StatisticsSpans implements Serializable {

    private static final long serialVersionUID = 687333457;

    private Integer id;
    private String  startTime;
    private String  endTime;
    private String  spanName;
    private String  calledNum;
    private String  avgTime;
    private String  slowestId;
    private String  slowestTime;
    private String  slowestHost;

    public StatisticsSpans() {}

    public StatisticsSpans(StatisticsSpans value) {
        this.id = value.id;
        this.startTime = value.startTime;
        this.endTime = value.endTime;
        this.spanName = value.spanName;
        this.calledNum = value.calledNum;
        this.avgTime = value.avgTime;
        this.slowestId = value.slowestId;
        this.slowestTime = value.slowestTime;
        this.slowestHost = value.slowestHost;
    }

    public StatisticsSpans(
        Integer id,
        String  startTime,
        String  endTime,
        String  spanName,
        String  calledNum,
        String  avgTime,
        String  slowestId,
        String  slowestTime,
        String  slowestHost
    ) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.spanName = spanName;
        this.calledNum = calledNum;
        this.avgTime = avgTime;
        this.slowestId = slowestId;
        this.slowestTime = slowestTime;
        this.slowestHost = slowestHost;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getSpanName() {
        return this.spanName;
    }

    public void setSpanName(String spanName) {
        this.spanName = spanName;
    }

    public String getCalledNum() {
        return this.calledNum;
    }

    public void setCalledNum(String calledNum) {
        this.calledNum = calledNum;
    }

    public String getAvgTime() {
        return this.avgTime;
    }

    public void setAvgTime(String avgTime) {
        this.avgTime = avgTime;
    }

    public String getSlowestId() {
        return this.slowestId;
    }

    public void setSlowestId(String slowestId) {
        this.slowestId = slowestId;
    }

    public String getSlowestTime() {
        return this.slowestTime;
    }

    public void setSlowestTime(String slowestTime) {
        this.slowestTime = slowestTime;
    }

    public String getSlowestHost() {
        return this.slowestHost;
    }

    public void setSlowestHost(String slowestHost) {
        this.slowestHost = slowestHost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StatisticsSpans (");

        sb.append(id);
        sb.append(", ").append(startTime);
        sb.append(", ").append(endTime);
        sb.append(", ").append(spanName);
        sb.append(", ").append(calledNum);
        sb.append(", ").append(avgTime);
        sb.append(", ").append(slowestId);
        sb.append(", ").append(slowestTime);
        sb.append(", ").append(slowestHost);

        sb.append(")");
        return sb.toString();
    }
}
