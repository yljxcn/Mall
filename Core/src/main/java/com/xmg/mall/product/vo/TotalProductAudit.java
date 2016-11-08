
package com.xmg.mall.product.vo;

import java.util.Date;

public class TotalProductAudit {

    protected Integer rows;
    protected Date createdDate;
    protected Integer state;

    public Integer getRows() {
        return this.rows;
    }

    public TotalProductAudit setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalProductAudit setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public Integer getState() {
        return this.state;
    }

    public TotalProductAudit setState(Integer state) {
        this.state = state;
        return this;
    }

}
