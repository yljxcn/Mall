
package com.xmg.mall.product.vo;

import java.util.Date;

public class TotalCatalogProperty {

    protected Integer rows;
    protected Date createdDate;
    protected Integer type;

    public Integer getRows() {
        return this.rows;
    }

    public TotalCatalogProperty setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalCatalogProperty setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public Integer getType() {
        return this.type;
    }

    public TotalCatalogProperty setType(Integer type) {
        this.type = type;
        return this;
    }

}
