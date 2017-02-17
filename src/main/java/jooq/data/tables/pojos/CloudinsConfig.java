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
public class CloudinsConfig implements Serializable {

    private static final long serialVersionUID = -1147190358;

    private Long    id;
    private String  product;
    private String  module;
    private String  parmAlias;
    private String  parmName;
    private String  parmValue;
    private Integer flag;
    private String  comment;

    public CloudinsConfig() {}

    public CloudinsConfig(CloudinsConfig value) {
        this.id = value.id;
        this.product = value.product;
        this.module = value.module;
        this.parmAlias = value.parmAlias;
        this.parmName = value.parmName;
        this.parmValue = value.parmValue;
        this.flag = value.flag;
        this.comment = value.comment;
    }

    public CloudinsConfig(
        Long    id,
        String  product,
        String  module,
        String  parmAlias,
        String  parmName,
        String  parmValue,
        Integer flag,
        String  comment
    ) {
        this.id = id;
        this.product = product;
        this.module = module;
        this.parmAlias = parmAlias;
        this.parmName = parmName;
        this.parmValue = parmValue;
        this.flag = flag;
        this.comment = comment;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getModule() {
        return this.module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getParmAlias() {
        return this.parmAlias;
    }

    public void setParmAlias(String parmAlias) {
        this.parmAlias = parmAlias;
    }

    public String getParmName() {
        return this.parmName;
    }

    public void setParmName(String parmName) {
        this.parmName = parmName;
    }

    public String getParmValue() {
        return this.parmValue;
    }

    public void setParmValue(String parmValue) {
        this.parmValue = parmValue;
    }

    public Integer getFlag() {
        return this.flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CloudinsConfig (");

        sb.append(id);
        sb.append(", ").append(product);
        sb.append(", ").append(module);
        sb.append(", ").append(parmAlias);
        sb.append(", ").append(parmName);
        sb.append(", ").append(parmValue);
        sb.append(", ").append(flag);
        sb.append(", ").append(comment);

        sb.append(")");
        return sb.toString();
    }
}