
package com.xmg.mall.product.vo;

import java.math.BigDecimal;
import java.util.Date;

public class TotalSku {

    protected Integer rows;
    protected BigDecimal totalSumPrice;
    protected BigDecimal totalAvgPrice;
    protected BigDecimal totalMaxPrice;
    protected BigDecimal totalMinPrice;
    protected Date createdDate;
    protected Long mods;

    public Integer getRows() {
        return this.rows;
    }

    public TotalSku setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public BigDecimal getTotalSumPrice() {
        return this.totalSumPrice;
    }

    public TotalSku setTotalSumPrice(BigDecimal totalSumPrice) {
        this.totalSumPrice = totalSumPrice;
        return this;
    }

    public BigDecimal getTotalAvgPrice() {
        return this.totalAvgPrice;
    }

    public TotalSku setTotalAvgPrice(BigDecimal totalAvgPrice) {
        this.totalAvgPrice = totalAvgPrice;
        return this;
    }

    public BigDecimal getTotalMaxPrice() {
        return this.totalMaxPrice;
    }

    public TotalSku setTotalMaxPrice(BigDecimal totalMaxPrice) {
        this.totalMaxPrice = totalMaxPrice;
        return this;
    }

    public BigDecimal getTotalMinPrice() {
        return this.totalMinPrice;
    }

    public TotalSku setTotalMinPrice(BigDecimal totalMinPrice) {
        this.totalMinPrice = totalMinPrice;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalSku setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public Long getMods() {
        return this.mods;
    }

    public TotalSku setMods(Long mods) {
        this.mods = mods;
        return this;
    }

}
