
package com.xmg.mall.product.vo;

import java.util.Date;

public class TotalProductImpression {

    protected Integer rows;
    protected Integer totalSumCount;
    protected Integer totalAvgCount;
    protected Integer totalMaxCount;
    protected Integer totalMinCount;
    protected Date createdDate;

    public Integer getRows() {
        return this.rows;
    }

    public TotalProductImpression setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Integer getTotalSumCount() {
        return this.totalSumCount;
    }

    public TotalProductImpression setTotalSumCount(Integer totalSumCount) {
        this.totalSumCount = totalSumCount;
        return this;
    }

    public Integer getTotalAvgCount() {
        return this.totalAvgCount;
    }

    public TotalProductImpression setTotalAvgCount(Integer totalAvgCount) {
        this.totalAvgCount = totalAvgCount;
        return this;
    }

    public Integer getTotalMaxCount() {
        return this.totalMaxCount;
    }

    public TotalProductImpression setTotalMaxCount(Integer totalMaxCount) {
        this.totalMaxCount = totalMaxCount;
        return this;
    }

    public Integer getTotalMinCount() {
        return this.totalMinCount;
    }

    public TotalProductImpression setTotalMinCount(Integer totalMinCount) {
        this.totalMinCount = totalMinCount;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalProductImpression setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

}
