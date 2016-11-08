
package com.xmg.mall.product.vo;

import java.util.Date;

public class TotalImpression {

    protected Integer rows;
    protected Date createdDate;

    public Integer getRows() {
        return this.rows;
    }

    public TotalImpression setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalImpression setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

}
