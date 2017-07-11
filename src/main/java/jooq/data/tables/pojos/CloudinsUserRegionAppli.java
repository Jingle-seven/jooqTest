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
public class CloudinsUserRegionAppli implements Serializable {

    private static final long serialVersionUID = 672590492;

    private Long   id;
    private Long   userId;
    private String userName;
    private Long   regionId;
    private String regionName;
    private String status;
    private String appliMsg;
    private String replyMsg;

    public CloudinsUserRegionAppli() {}

    public CloudinsUserRegionAppli(CloudinsUserRegionAppli value) {
        this.id = value.id;
        this.userId = value.userId;
        this.userName = value.userName;
        this.regionId = value.regionId;
        this.regionName = value.regionName;
        this.status = value.status;
        this.appliMsg = value.appliMsg;
        this.replyMsg = value.replyMsg;
    }

    public CloudinsUserRegionAppli(
        Long   id,
        Long   userId,
        String userName,
        Long   regionId,
        String regionName,
        String status,
        String appliMsg,
        String replyMsg
    ) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.regionId = regionId;
        this.regionName = regionName;
        this.status = status;
        this.appliMsg = appliMsg;
        this.replyMsg = replyMsg;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getRegionId() {
        return this.regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return this.regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAppliMsg() {
        return this.appliMsg;
    }

    public void setAppliMsg(String appliMsg) {
        this.appliMsg = appliMsg;
    }

    public String getReplyMsg() {
        return this.replyMsg;
    }

    public void setReplyMsg(String replyMsg) {
        this.replyMsg = replyMsg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CloudinsUserRegionAppli (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(userName);
        sb.append(", ").append(regionId);
        sb.append(", ").append(regionName);
        sb.append(", ").append(status);
        sb.append(", ").append(appliMsg);
        sb.append(", ").append(replyMsg);

        sb.append(")");
        return sb.toString();
    }
}
