
package com.xmg.mall.product.vo;

import java.util.Date;

public class TotalProductSkuPropertySequence {

    protected Integer rows;
    protected Date createdDate;

    public Integer getRows() {
        return this.rows;
    }

    public TotalProductSkuPropertySequence setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalProductSkuPropertySequence setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

}
