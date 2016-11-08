
package com.xmg.mall.product.vo;

import java.util.Date;

public class TotalCatalog {

    protected Integer rows;
    protected Date createdDate;

    public Integer getRows() {
        return this.rows;
    }

    public TotalCatalog setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalCatalog setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

}
