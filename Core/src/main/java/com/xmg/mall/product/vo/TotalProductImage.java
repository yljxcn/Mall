
package com.xmg.mall.product.vo;

import java.util.Date;

public class TotalProductImage {

    protected Integer rows;
    protected Date createdDate;
    protected Long flags;

    public Integer getRows() {
        return this.rows;
    }

    public TotalProductImage setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalProductImage setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public Long getFlags() {
        return this.flags;
    }

    public TotalProductImage setFlags(Long flags) {
        this.flags = flags;
        return this;
    }

}
