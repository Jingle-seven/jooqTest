/**
 * This class is generated by jOOQ
 */
package jooq.data.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;

import org.jooq.types.UInteger;


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
public class YarnAppHeuristicResult implements Serializable {

    private static final long serialVersionUID = -1564111994;

    private Integer  id;
    private String   yarnAppResultId;
    private String   heuristicClass;
    private String   heuristicName;
    private Boolean  severity;
    private UInteger score;

    public YarnAppHeuristicResult() {}

    public YarnAppHeuristicResult(YarnAppHeuristicResult value) {
        this.id = value.id;
        this.yarnAppResultId = value.yarnAppResultId;
        this.heuristicClass = value.heuristicClass;
        this.heuristicName = value.heuristicName;
        this.severity = value.severity;
        this.score = value.score;
    }

    public YarnAppHeuristicResult(
        Integer  id,
        String   yarnAppResultId,
        String   heuristicClass,
        String   heuristicName,
        Boolean  severity,
        UInteger score
    ) {
        this.id = id;
        this.yarnAppResultId = yarnAppResultId;
        this.heuristicClass = heuristicClass;
        this.heuristicName = heuristicName;
        this.severity = severity;
        this.score = score;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYarnAppResultId() {
        return this.yarnAppResultId;
    }

    public void setYarnAppResultId(String yarnAppResultId) {
        this.yarnAppResultId = yarnAppResultId;
    }

    public String getHeuristicClass() {
        return this.heuristicClass;
    }

    public void setHeuristicClass(String heuristicClass) {
        this.heuristicClass = heuristicClass;
    }

    public String getHeuristicName() {
        return this.heuristicName;
    }

    public void setHeuristicName(String heuristicName) {
        this.heuristicName = heuristicName;
    }

    public Boolean getSeverity() {
        return this.severity;
    }

    public void setSeverity(Boolean severity) {
        this.severity = severity;
    }

    public UInteger getScore() {
        return this.score;
    }

    public void setScore(UInteger score) {
        this.score = score;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("YarnAppHeuristicResult (");

        sb.append(id);
        sb.append(", ").append(yarnAppResultId);
        sb.append(", ").append(heuristicClass);
        sb.append(", ").append(heuristicName);
        sb.append(", ").append(severity);
        sb.append(", ").append(score);

        sb.append(")");
        return sb.toString();
    }
}
