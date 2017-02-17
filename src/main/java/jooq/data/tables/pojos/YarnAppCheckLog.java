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
public class YarnAppCheckLog implements Serializable {

    private static final long serialVersionUID = 1345098179;

    private Long    id;
    private String  appId;
    private String  message;
    private Long    time;
    private String  type;
    private Boolean displayed;
    private Boolean read;

    public YarnAppCheckLog() {}

    public YarnAppCheckLog(YarnAppCheckLog value) {
        this.id = value.id;
        this.appId = value.appId;
        this.message = value.message;
        this.time = value.time;
        this.type = value.type;
        this.displayed = value.displayed;
        this.read = value.read;
    }

    public YarnAppCheckLog(
        Long    id,
        String  appId,
        String  message,
        Long    time,
        String  type,
        Boolean displayed,
        Boolean read
    ) {
        this.id = id;
        this.appId = appId;
        this.message = message;
        this.time = time;
        this.type = type;
        this.displayed = displayed;
        this.read = read;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTime() {
        return this.time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getDisplayed() {
        return this.displayed;
    }

    public void setDisplayed(Boolean displayed) {
        this.displayed = displayed;
    }

    public Boolean getRead() {
        return this.read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("YarnAppCheckLog (");

        sb.append(id);
        sb.append(", ").append(appId);
        sb.append(", ").append(message);
        sb.append(", ").append(time);
        sb.append(", ").append(type);
        sb.append(", ").append(displayed);
        sb.append(", ").append(read);

        sb.append(")");
        return sb.toString();
    }
}