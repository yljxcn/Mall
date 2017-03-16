
package com.xmg.mall.user.vo;

import java.util.Date;

public class TotalUser {

    protected Integer rows;
    protected Date createdDate;

    public Integer getRows() {
        return this.rows;
    }

    public TotalUser setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalUser setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

}
