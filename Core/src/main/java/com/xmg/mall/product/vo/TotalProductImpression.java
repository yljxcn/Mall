
package com.xmg.mall.product.vo;

import java.util.Date;

public class TotalProductImpression {

    protected Integer rows;
    protected Date createdDate;

    public Integer getRows() {
        return this.rows;
    }

    public TotalProductImpression setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalProductImpression setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

}
