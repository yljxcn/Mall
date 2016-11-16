
package com.xmg.mall.product.vo;

import java.math.BigDecimal;
import java.util.Date;

public class TotalProductCatalogPropertyValue {

    protected Integer rows;
    protected BigDecimal totalSumLowerLimit;
    protected BigDecimal totalAvgLowerLimit;
    protected BigDecimal totalMaxLowerLimit;
    protected BigDecimal totalMinLowerLimit;
    protected BigDecimal totalSumFreight;
    protected BigDecimal totalAvgFreight;
    protected BigDecimal totalMaxFreight;
    protected BigDecimal totalMinFreight;
    protected Date createdDate;
    protected Long mods;

    public Integer getRows() {
        return this.rows;
    }

    public TotalProductCatalogPropertyValue setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public BigDecimal getTotalSumLowerLimit() {
        return this.totalSumLowerLimit;
    }

    public TotalProductCatalogPropertyValue setTotalSumLowerLimit(BigDecimal totalSumLowerLimit) {
        this.totalSumLowerLimit = totalSumLowerLimit;
        return this;
    }

    public BigDecimal getTotalAvgLowerLimit() {
        return this.totalAvgLowerLimit;
    }

    public TotalProductCatalogPropertyValue setTotalAvgLowerLimit(BigDecimal totalAvgLowerLimit) {
        this.totalAvgLowerLimit = totalAvgLowerLimit;
        return this;
    }

    public BigDecimal getTotalMaxLowerLimit() {
        return this.totalMaxLowerLimit;
    }

    public TotalProductCatalogPropertyValue setTotalMaxLowerLimit(BigDecimal totalMaxLowerLimit) {
        this.totalMaxLowerLimit = totalMaxLowerLimit;
        return this;
    }

    public BigDecimal getTotalMinLowerLimit() {
        return this.totalMinLowerLimit;
    }

    public TotalProductCatalogPropertyValue setTotalMinLowerLimit(BigDecimal totalMinLowerLimit) {
        this.totalMinLowerLimit = totalMinLowerLimit;
        return this;
    }

    public BigDecimal getTotalSumFreight() {
        return this.totalSumFreight;
    }

    public TotalProductCatalogPropertyValue setTotalSumFreight(BigDecimal totalSumFreight) {
        this.totalSumFreight = totalSumFreight;
        return this;
    }

    public BigDecimal getTotalAvgFreight() {
        return this.totalAvgFreight;
    }

    public TotalProductCatalogPropertyValue setTotalAvgFreight(BigDecimal totalAvgFreight) {
        this.totalAvgFreight = totalAvgFreight;
        return this;
    }

    public BigDecimal getTotalMaxFreight() {
        return this.totalMaxFreight;
    }

    public TotalProductCatalogPropertyValue setTotalMaxFreight(BigDecimal totalMaxFreight) {
        this.totalMaxFreight = totalMaxFreight;
        return this;
    }

    public BigDecimal getTotalMinFreight() {
        return this.totalMinFreight;
    }

    public TotalProductCatalogPropertyValue setTotalMinFreight(BigDecimal totalMinFreight) {
        this.totalMinFreight = totalMinFreight;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalProductCatalogPropertyValue setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public Long getMods() {
        return this.mods;
    }

    public TotalProductCatalogPropertyValue setMods(Long mods) {
        this.mods = mods;
        return this;
    }

}
