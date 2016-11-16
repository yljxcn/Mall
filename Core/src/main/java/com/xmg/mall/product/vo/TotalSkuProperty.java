
package com.xmg.mall.product.vo;

import java.util.Date;

public class TotalSkuProperty {

    protected Integer rows;
    protected Date createdDate;
    protected Long mods;

    public Integer getRows() {
        return this.rows;
    }

    public TotalSkuProperty setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalSkuProperty setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public Long getMods() {
        return this.mods;
    }

    public TotalSkuProperty setMods(Long mods) {
        this.mods = mods;
        return this;
    }

}
