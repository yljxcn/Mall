
package com.xmg.mall.product.vo;

import java.util.Date;

public class TotalProductSkuPropertySequence {

    protected Integer rows;
    protected Integer totalSumSequence;
    protected Integer totalAvgSequence;
    protected Integer totalMaxSequence;
    protected Integer totalMinSequence;
    protected Date createdDate;

    public Integer getRows() {
        return this.rows;
    }

    public TotalProductSkuPropertySequence setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Integer getTotalSumSequence() {
        return this.totalSumSequence;
    }

    public TotalProductSkuPropertySequence setTotalSumSequence(Integer totalSumSequence) {
        this.totalSumSequence = totalSumSequence;
        return this;
    }

    public Integer getTotalAvgSequence() {
        return this.totalAvgSequence;
    }

    public TotalProductSkuPropertySequence setTotalAvgSequence(Integer totalAvgSequence) {
        this.totalAvgSequence = totalAvgSequence;
        return this;
    }

    public Integer getTotalMaxSequence() {
        return this.totalMaxSequence;
    }

    public TotalProductSkuPropertySequence setTotalMaxSequence(Integer totalMaxSequence) {
        this.totalMaxSequence = totalMaxSequence;
        return this;
    }

    public Integer getTotalMinSequence() {
        return this.totalMinSequence;
    }

    public TotalProductSkuPropertySequence setTotalMinSequence(Integer totalMinSequence) {
        this.totalMinSequence = totalMinSequence;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalProductSkuPropertySequence setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

}
