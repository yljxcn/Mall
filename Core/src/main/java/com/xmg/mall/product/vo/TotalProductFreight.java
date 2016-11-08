
package com.xmg.mall.product.vo;

import java.util.Date;

public class TotalProductFreight {

    protected Integer rows;
    protected Date createdDate;

    public Integer getRows() {
        return this.rows;
    }

    public TotalProductFreight setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalProductFreight setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

}
