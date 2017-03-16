
package com.xmg.mall.user.vo;

import java.util.Date;

public class TotalAddress {

    protected Integer rows;
    protected Date createdDate;

    public Integer getRows() {
        return this.rows;
    }

    public TotalAddress setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalAddress setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

}
