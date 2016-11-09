
package com.xmg.mall.product.vo;

import java.util.Date;

public class TotalCatalogProperty {

    protected Integer rows;
    protected Integer totalSumSequence;
    protected Integer totalAvgSequence;
    protected Integer totalMaxSequence;
    protected Integer totalMinSequence;
    protected Date createdDate;
    protected Integer type;

    public Integer getRows() {
        return this.rows;
    }

    public TotalCatalogProperty setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Integer getTotalSumSequence() {
        return this.totalSumSequence;
    }

    public TotalCatalogProperty setTotalSumSequence(Integer totalSumSequence) {
        this.totalSumSequence = totalSumSequence;
        return this;
    }

    public Integer getTotalAvgSequence() {
        return this.totalAvgSequence;
    }

    public TotalCatalogProperty setTotalAvgSequence(Integer totalAvgSequence) {
        this.totalAvgSequence = totalAvgSequence;
        return this;
    }

    public Integer getTotalMaxSequence() {
        return this.totalMaxSequence;
    }

    public TotalCatalogProperty setTotalMaxSequence(Integer totalMaxSequence) {
        this.totalMaxSequence = totalMaxSequence;
        return this;
    }

    public Integer getTotalMinSequence() {
        return this.totalMinSequence;
    }

    public TotalCatalogProperty setTotalMinSequence(Integer totalMinSequence) {
        this.totalMinSequence = totalMinSequence;
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
