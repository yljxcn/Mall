
package com.xmg.mall.product.vo;

import java.util.Date;

public class TotalSkuProperty {

    protected Integer rows;
    protected Date createdDate;
    protected Long flags;

    public Integer getRows() {
        return this.rows;
    }

    public TotalSkuProperty setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalSkuProperty setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public Long getFlags() {
        return this.flags;
    }

    public TotalSkuProperty setFlags(Long flags) {
        this.flags = flags;
        return this;
    }

}
