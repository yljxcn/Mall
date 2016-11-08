
package com.xmg.mall.product.vo;

import java.util.Date;

public class TotalBrand {

    protected Integer rows;
    protected Date createdDate;
    protected Long visibilityState;

    public Integer getRows() {
        return this.rows;
    }

    public TotalBrand setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalBrand setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public Long getVisibilityState() {
        return this.visibilityState;
    }

    public TotalBrand setVisibilityState(Long visibilityState) {
        this.visibilityState = visibilityState;
        return this;
    }

}
