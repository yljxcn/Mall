
package com.xmg.mall.product.vo;

import java.util.Date;

public class TotalSkuPropertyRelationshipValue {

    protected Integer rows;
    protected Date createdDate;

    public Integer getRows() {
        return this.rows;
    }

    public TotalSkuPropertyRelationshipValue setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalSkuPropertyRelationshipValue setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

}
