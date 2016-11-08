
package com.xmg.mall.employee.vo;

import java.util.Date;

public class TotalEmployee {

    protected Integer rows;
    protected Date createdDate;
    protected Integer state;

    public Integer getRows() {
        return this.rows;
    }

    public TotalEmployee setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalEmployee setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public Integer getState() {
        return this.state;
    }

    public TotalEmployee setState(Integer state) {
        this.state = state;
        return this;
    }

}
