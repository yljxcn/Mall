
package com.xmg.mall.product.vo;

import java.util.Date;

public class TotalSkuPropertyRelationshipValue {

    protected Integer rows;
    protected Integer totalSumSequence;
    protected Integer totalAvgSequence;
    protected Integer totalMaxSequence;
    protected Integer totalMinSequence;
    protected Date createdDate;

    public Integer getRows() {
        return this.rows;
    }

    public TotalSkuPropertyRelationshipValue setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Integer getTotalSumSequence() {
        return this.totalSumSequence;
    }

    public TotalSkuPropertyRelationshipValue setTotalSumSequence(Integer totalSumSequence) {
        this.totalSumSequence = totalSumSequence;
        return this;
    }

    public Integer getTotalAvgSequence() {
        return this.totalAvgSequence;
    }

    public TotalSkuPropertyRelationshipValue setTotalAvgSequence(Integer totalAvgSequence) {
        this.totalAvgSequence = totalAvgSequence;
        return this;
    }

    public Integer getTotalMaxSequence() {
        return this.totalMaxSequence;
    }

    public TotalSkuPropertyRelationshipValue setTotalMaxSequence(Integer totalMaxSequence) {
        this.totalMaxSequence = totalMaxSequence;
        return this;
    }

    public Integer getTotalMinSequence() {
        return this.totalMinSequence;
    }

    public TotalSkuPropertyRelationshipValue setTotalMinSequence(Integer totalMinSequence) {
        this.totalMinSequence = totalMinSequence;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalSkuPropertyRelationshipValue setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

}
