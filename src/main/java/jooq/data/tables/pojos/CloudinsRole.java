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
public class CloudinsRole implements Serializable {

    private static final long serialVersionUID = 2087079851;

    private Integer id;
    private String  name;
    private String  auth;
    private String  remark;

    public CloudinsRole() {}

    public CloudinsRole(CloudinsRole value) {
        this.id = value.id;
        this.name = value.name;
        this.auth = value.auth;
        this.remark = value.remark;
    }

    public CloudinsRole(
        Integer id,
        String  name,
        String  auth,
        String  remark
    ) {
        this.id = id;
        this.name = name;
        this.auth = auth;
        this.remark = remark;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuth() {
        return this.auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CloudinsRole (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(auth);
        sb.append(", ").append(remark);

        sb.append(")");
        return sb.toString();
    }
}
