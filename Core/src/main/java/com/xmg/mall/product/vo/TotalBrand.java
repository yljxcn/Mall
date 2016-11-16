
package com.xmg.mall.product.vo;

import java.util.Date;

public class TotalBrand {

    protected Integer rows;
    protected Integer totalSumSequence;
    protected Integer totalAvgSequence;
    protected Integer totalMaxSequence;
    protected Integer totalMinSequence;
    protected Date createdDate;
    protected Date foundDate;
    protected Long mods;

    public Integer getRows() {
        return this.rows;
    }

    public TotalBrand setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Integer getTotalSumSequence() {
        return this.totalSumSequence;
    }

    public TotalBrand setTotalSumSequence(Integer totalSumSequence) {
        this.totalSumSequence = totalSumSequence;
        return this;
    }

    public Integer getTotalAvgSequence() {
        return this.totalAvgSequence;
    }

    public TotalBrand setTotalAvgSequence(Integer totalAvgSequence) {
        this.totalAvgSequence = totalAvgSequence;
        return this;
    }

    public Integer getTotalMaxSequence() {
        return this.totalMaxSequence;
    }

    public TotalBrand setTotalMaxSequence(Integer totalMaxSequence) {
        this.totalMaxSequence = totalMaxSequence;
        return this;
    }

    public Integer getTotalMinSequence() {
        return this.totalMinSequence;
    }

    public TotalBrand setTotalMinSequence(Integer totalMinSequence) {
        this.totalMinSequence = totalMinSequence;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalBrand setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public Date getFoundDate() {
        return this.foundDate;
    }

    public TotalBrand setFoundDate(Date foundDate) {
        this.foundDate = foundDate;
        return this;
    }

    public Long getMods() {
        return this.mods;
    }

    public TotalBrand setMods(Long mods) {
        this.mods = mods;
        return this;
    }

}
