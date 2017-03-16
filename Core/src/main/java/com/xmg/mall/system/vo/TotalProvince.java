
package com.xmg.mall.system.vo;

import java.util.Date;

public class TotalProvince {

    protected Integer rows;
    protected Date createdDate;

    public Integer getRows() {
        return this.rows;
    }

    public TotalProvince setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalProvince setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

}
