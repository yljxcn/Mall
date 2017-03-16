
package com.xmg.mall.system.vo;

import java.util.Date;

public class TotalStreet {

    protected Integer rows;
    protected Date createdDate;

    public Integer getRows() {
        return this.rows;
    }

    public TotalStreet setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalStreet setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

}
