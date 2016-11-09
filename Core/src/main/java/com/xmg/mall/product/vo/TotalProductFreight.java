
package com.xmg.mall.product.vo;

import java.util.Date;

public class TotalProductFreight {

    protected Integer rows;
    protected Integer totalSumCount;
    protected Integer totalAvgCount;
    protected Integer totalMaxCount;
    protected Integer totalMinCount;
    protected Date createdDate;

    public Integer getRows() {
        return this.rows;
    }

    public TotalProductFreight setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Integer getTotalSumCount() {
        return this.totalSumCount;
    }

    public TotalProductFreight setTotalSumCount(Integer totalSumCount) {
        this.totalSumCount = totalSumCount;
        return this;
    }

    public Integer getTotalAvgCount() {
        return this.totalAvgCount;
    }

    public TotalProductFreight setTotalAvgCount(Integer totalAvgCount) {
        this.totalAvgCount = totalAvgCount;
        return this;
    }

    public Integer getTotalMaxCount() {
        return this.totalMaxCount;
    }

    public TotalProductFreight setTotalMaxCount(Integer totalMaxCount) {
        this.totalMaxCount = totalMaxCount;
        return this;
    }

    public Integer getTotalMinCount() {
        return this.totalMinCount;
    }

    public TotalProductFreight setTotalMinCount(Integer totalMinCount) {
        this.totalMinCount = totalMinCount;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalProductFreight setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

}
