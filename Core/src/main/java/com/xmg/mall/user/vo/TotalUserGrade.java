
package com.xmg.mall.user.vo;

import java.util.Date;

public class TotalUserGrade {

    protected Integer rows;
    protected Integer totalSumScore;
    protected Integer totalAvgScore;
    protected Integer totalMaxScore;
    protected Integer totalMinScore;
    protected Integer totalSumConsumeScore;
    protected Integer totalAvgConsumeScore;
    protected Integer totalMaxConsumeScore;
    protected Integer totalMinConsumeScore;
    protected Date createdDate;

    public Integer getRows() {
        return this.rows;
    }

    public TotalUserGrade setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    public Integer getTotalSumScore() {
        return this.totalSumScore;
    }

    public TotalUserGrade setTotalSumScore(Integer totalSumScore) {
        this.totalSumScore = totalSumScore;
        return this;
    }

    public Integer getTotalAvgScore() {
        return this.totalAvgScore;
    }

    public TotalUserGrade setTotalAvgScore(Integer totalAvgScore) {
        this.totalAvgScore = totalAvgScore;
        return this;
    }

    public Integer getTotalMaxScore() {
        return this.totalMaxScore;
    }

    public TotalUserGrade setTotalMaxScore(Integer totalMaxScore) {
        this.totalMaxScore = totalMaxScore;
        return this;
    }

    public Integer getTotalMinScore() {
        return this.totalMinScore;
    }

    public TotalUserGrade setTotalMinScore(Integer totalMinScore) {
        this.totalMinScore = totalMinScore;
        return this;
    }

    public Integer getTotalSumConsumeScore() {
        return this.totalSumConsumeScore;
    }

    public TotalUserGrade setTotalSumConsumeScore(Integer totalSumConsumeScore) {
        this.totalSumConsumeScore = totalSumConsumeScore;
        return this;
    }

    public Integer getTotalAvgConsumeScore() {
        return this.totalAvgConsumeScore;
    }

    public TotalUserGrade setTotalAvgConsumeScore(Integer totalAvgConsumeScore) {
        this.totalAvgConsumeScore = totalAvgConsumeScore;
        return this;
    }

    public Integer getTotalMaxConsumeScore() {
        return this.totalMaxConsumeScore;
    }

    public TotalUserGrade setTotalMaxConsumeScore(Integer totalMaxConsumeScore) {
        this.totalMaxConsumeScore = totalMaxConsumeScore;
        return this;
    }

    public Integer getTotalMinConsumeScore() {
        return this.totalMinConsumeScore;
    }

    public TotalUserGrade setTotalMinConsumeScore(Integer totalMinConsumeScore) {
        this.totalMinConsumeScore = totalMinConsumeScore;
        return this;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public TotalUserGrade setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

}
