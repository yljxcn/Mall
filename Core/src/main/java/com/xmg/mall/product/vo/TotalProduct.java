
package com.xmg.mall.product.vo;

import java.math.BigDecimal;
import java.util.Date;

public class TotalProduct {

    protected Integer rows;
    protected BigDecimal totalSumMarketPrice;
    protected BigDecimal totalAvgMarketPrice;
    protected BigDecimal totalMaxMarketPrice;
    protected BigDecimal totalMinMarketPrice;
    protected BigDecimal totalSumBasePrice;
    protected BigDecimal totalAvgBasePrice;
    protected BigDecimal totalMaxBasePrice;
    protected BigDecimal totalMinBasePrice;
    protected Date createdDate;
    protected Long mods;

    public Integer getRows() {
        return this.rows;
    }

    public TotalProduct setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public BigDecimal getTotalSumMarketPrice() {
        return this.totalSumMarketPrice;
    }

    public TotalProduct setTotalSumMarketPrice(BigDecimal totalSumMarketPrice) {
        this.totalSumMarketPrice = totalSumMarketPrice;
        return this;
    }

    public BigDecimal getTotalAvgMarketPrice() {
        return this.totalAvgMarketPrice;
    }

    public TotalProduct setTotalAvgMarketPrice(BigDecimal totalAvgMarketPrice) {
        this.totalAvgMarketPrice = totalAvgMarketPrice;
        return this;
    }

    public BigDecimal getTotalMaxMarketPrice() {
        return this.totalMaxMarketPrice;
    }

    public TotalProduct setTotalMaxMarketPrice(BigDecimal totalMaxMarketPrice) {
        this.totalMaxMarketPrice = totalMaxMarketPrice;
        return this;
    }

    public BigDecimal getTotalMinMarketPrice() {
        return this.totalMinMarketPrice;
    }

    public TotalProduct setTotalMinMarketPrice(BigDecimal totalMinMarketPrice) {
        this.totalMinMarketPrice = totalMinMarketPrice;
        return this;
    }

    public BigDecimal getTotalSumBasePrice() {
        return this.totalSumBasePrice;
    }

    public TotalProduct setTotalSumBasePrice(BigDecimal totalSumBasePrice) {
        this.totalSumBasePrice = totalSumBasePrice;
        return this;
    }

    public BigDecimal getTotalAvgBasePrice() {
        return this.totalAvgBasePrice;
    }

    public TotalProduct setTotalAvgBasePrice(BigDecimal totalAvgBasePrice) {
        this.totalAvgBasePrice = totalAvgBasePrice;
        return this;
    }

    public BigDecimal getTotalMaxBasePrice() {
        return this.totalMaxBasePrice;
    }

    public TotalProduct setTotalMaxBasePrice(BigDecimal totalMaxBasePrice) {
        this.totalMaxBasePrice = totalMaxBasePrice;
        return this;
    }

    public BigDecimal getTotalMinBasePrice() {
        return this.totalMinBasePrice;
    }

    public TotalProduct setTotalMinBasePrice(BigDecimal totalMinBasePrice) {
        this.totalMinBasePrice = totalMinBasePrice;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalProduct setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public Long getMods() {
        return this.mods;
    }

    public TotalProduct setMods(Long mods) {
        this.mods = mods;
        return this;
    }

}
