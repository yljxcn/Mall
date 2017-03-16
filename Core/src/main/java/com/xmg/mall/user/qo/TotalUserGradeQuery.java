
package com.xmg.mall.user.qo;

import java.util.Date;
import com.xmg.mall.base.query.DateGroupBy;
import com.xmg.mall.base.query.QueryCondition;

public class TotalUserGradeQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.GroupBys groupBys = new com.xmg.mall.base.query.GroupBys();
    protected Long[] ids;
    protected Integer minTotalCountRows;
    protected Integer maxTotalCountRows;
    protected Boolean totalCountRows;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long userId;
    protected Long gradeId;
    protected Integer minScore;
    protected Integer maxScore;
    protected Integer score;
    protected Integer minConsumeScore;
    protected Integer maxConsumeScore;
    protected Integer consumeScore;
    protected Boolean totalSumScore;
    protected Boolean totalMaxScore;
    protected Boolean totalMinScore;
    protected Boolean totalAvgScore;
    protected Integer maxTotalSumScore;
    protected Integer minTotalSumScore;
    protected Integer minTotalMinScore;
    protected Integer maxTotalMinScore;
    protected Integer minTotalMaxScore;
    protected Integer maxTotalMaxScore;
    protected Integer minTotalAvgScore;
    protected Integer maxTotalAvgScore;
    protected Boolean totalSumConsumeScore;
    protected Boolean totalMaxConsumeScore;
    protected Boolean totalMinConsumeScore;
    protected Boolean totalAvgConsumeScore;
    protected Integer maxTotalSumConsumeScore;
    protected Integer minTotalSumConsumeScore;
    protected Integer minTotalMinConsumeScore;
    protected Integer maxTotalMinConsumeScore;
    protected Integer minTotalMaxConsumeScore;
    protected Integer maxTotalMaxConsumeScore;
    protected Integer minTotalAvgConsumeScore;
    protected Integer maxTotalAvgConsumeScore;
    protected com.xmg.mall.base.query.JoinType joinUser;
    protected UserQuery userQuery;
    protected com.xmg.mall.base.query.JoinType joinGrade;
    protected GradeQuery gradeQuery;

    public com.xmg.mall.base.query.GroupBys getGroupBys() {
        return this.groupBys;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public TotalUserGradeQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Integer getMinTotalCountRows() {
        return this.minTotalCountRows;
    }

    public TotalUserGradeQuery setMinTotalCountRows(Integer minTotalCountRows) {
        this.minTotalCountRows = minTotalCountRows;
        return this;
    }

    public Integer getMaxTotalCountRows() {
        return this.maxTotalCountRows;
    }

    public TotalUserGradeQuery setMaxTotalCountRows(Integer maxTotalCountRows) {
        this.maxTotalCountRows = maxTotalCountRows;
        return this;
    }

    public Boolean getTotalCountRows() {
        return this.totalCountRows;
    }

    public TotalUserGradeQuery setTotalCountRows(Boolean totalCountRows) {
        this.totalCountRows = totalCountRows;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public TotalUserGradeQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public TotalUserGradeQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public void setOrderByCreatedDate(int keyword) {
        setOrderBy("createdDate", keyword);
    }

    public int getOrderByCreatedDate() {
        return getOrderByKeyword("createdDate");
    }

    public Long getUserId() {
        return this.userId;
    }

    public TotalUserGradeQuery setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getGradeId() {
        return this.gradeId;
    }

    public TotalUserGradeQuery setGradeId(Long gradeId) {
        this.gradeId = gradeId;
        return this;
    }

    public Integer getMinScore() {
        return this.minScore;
    }

    public TotalUserGradeQuery setMinScore(Integer minScore) {
        this.minScore = minScore;
        return this;
    }

    public Integer getMaxScore() {
        return this.maxScore;
    }

    public TotalUserGradeQuery setMaxScore(Integer maxScore) {
        this.maxScore = maxScore;
        return this;
    }

    public Integer getScore() {
        return this.score;
    }

    public TotalUserGradeQuery setScore(Integer score) {
        this.score = score;
        return this;
    }

    public Integer getMinConsumeScore() {
        return this.minConsumeScore;
    }

    public TotalUserGradeQuery setMinConsumeScore(Integer minConsumeScore) {
        this.minConsumeScore = minConsumeScore;
        return this;
    }

    public Integer getMaxConsumeScore() {
        return this.maxConsumeScore;
    }

    public TotalUserGradeQuery setMaxConsumeScore(Integer maxConsumeScore) {
        this.maxConsumeScore = maxConsumeScore;
        return this;
    }

    public Integer getConsumeScore() {
        return this.consumeScore;
    }

    public TotalUserGradeQuery setConsumeScore(Integer consumeScore) {
        this.consumeScore = consumeScore;
        return this;
    }

    public Boolean getTotalSumScore() {
        return this.totalSumScore;
    }

    public TotalUserGradeQuery setTotalSumScore(Boolean totalSumScore) {
        this.totalSumScore = totalSumScore;
        return this;
    }

    public Boolean getTotalMaxScore() {
        return this.totalMaxScore;
    }

    public TotalUserGradeQuery setTotalMaxScore(Boolean totalMaxScore) {
        this.totalMaxScore = totalMaxScore;
        return this;
    }

    public Boolean getTotalMinScore() {
        return this.totalMinScore;
    }

    public TotalUserGradeQuery setTotalMinScore(Boolean totalMinScore) {
        this.totalMinScore = totalMinScore;
        return this;
    }

    public Boolean getTotalAvgScore() {
        return this.totalAvgScore;
    }

    public TotalUserGradeQuery setTotalAvgScore(Boolean totalAvgScore) {
        this.totalAvgScore = totalAvgScore;
        return this;
    }

    public Integer getMaxTotalSumScore() {
        return this.maxTotalSumScore;
    }

    public TotalUserGradeQuery setMaxTotalSumScore(Integer maxTotalSumScore) {
        this.maxTotalSumScore = maxTotalSumScore;
        return this;
    }

    public Integer getMinTotalSumScore() {
        return this.minTotalSumScore;
    }

    public TotalUserGradeQuery setMinTotalSumScore(Integer minTotalSumScore) {
        this.minTotalSumScore = minTotalSumScore;
        return this;
    }

    public Integer getMinTotalMinScore() {
        return this.minTotalMinScore;
    }

    public TotalUserGradeQuery setMinTotalMinScore(Integer minTotalMinScore) {
        this.minTotalMinScore = minTotalMinScore;
        return this;
    }

    public Integer getMaxTotalMinScore() {
        return this.maxTotalMinScore;
    }

    public TotalUserGradeQuery setMaxTotalMinScore(Integer maxTotalMinScore) {
        this.maxTotalMinScore = maxTotalMinScore;
        return this;
    }

    public Integer getMinTotalMaxScore() {
        return this.minTotalMaxScore;
    }

    public TotalUserGradeQuery setMinTotalMaxScore(Integer minTotalMaxScore) {
        this.minTotalMaxScore = minTotalMaxScore;
        return this;
    }

    public Integer getMaxTotalMaxScore() {
        return this.maxTotalMaxScore;
    }

    public TotalUserGradeQuery setMaxTotalMaxScore(Integer maxTotalMaxScore) {
        this.maxTotalMaxScore = maxTotalMaxScore;
        return this;
    }

    public Integer getMinTotalAvgScore() {
        return this.minTotalAvgScore;
    }

    public TotalUserGradeQuery setMinTotalAvgScore(Integer minTotalAvgScore) {
        this.minTotalAvgScore = minTotalAvgScore;
        return this;
    }

    public Integer getMaxTotalAvgScore() {
        return this.maxTotalAvgScore;
    }

    public TotalUserGradeQuery setMaxTotalAvgScore(Integer maxTotalAvgScore) {
        this.maxTotalAvgScore = maxTotalAvgScore;
        return this;
    }

    public Boolean getTotalSumConsumeScore() {
        return this.totalSumConsumeScore;
    }

    public TotalUserGradeQuery setTotalSumConsumeScore(Boolean totalSumConsumeScore) {
        this.totalSumConsumeScore = totalSumConsumeScore;
        return this;
    }

    public Boolean getTotalMaxConsumeScore() {
        return this.totalMaxConsumeScore;
    }

    public TotalUserGradeQuery setTotalMaxConsumeScore(Boolean totalMaxConsumeScore) {
        this.totalMaxConsumeScore = totalMaxConsumeScore;
        return this;
    }

    public Boolean getTotalMinConsumeScore() {
        return this.totalMinConsumeScore;
    }

    public TotalUserGradeQuery setTotalMinConsumeScore(Boolean totalMinConsumeScore) {
        this.totalMinConsumeScore = totalMinConsumeScore;
        return this;
    }

    public Boolean getTotalAvgConsumeScore() {
        return this.totalAvgConsumeScore;
    }

    public TotalUserGradeQuery setTotalAvgConsumeScore(Boolean totalAvgConsumeScore) {
        this.totalAvgConsumeScore = totalAvgConsumeScore;
        return this;
    }

    public Integer getMaxTotalSumConsumeScore() {
        return this.maxTotalSumConsumeScore;
    }

    public TotalUserGradeQuery setMaxTotalSumConsumeScore(Integer maxTotalSumConsumeScore) {
        this.maxTotalSumConsumeScore = maxTotalSumConsumeScore;
        return this;
    }

    public Integer getMinTotalSumConsumeScore() {
        return this.minTotalSumConsumeScore;
    }

    public TotalUserGradeQuery setMinTotalSumConsumeScore(Integer minTotalSumConsumeScore) {
        this.minTotalSumConsumeScore = minTotalSumConsumeScore;
        return this;
    }

    public Integer getMinTotalMinConsumeScore() {
        return this.minTotalMinConsumeScore;
    }

    public TotalUserGradeQuery setMinTotalMinConsumeScore(Integer minTotalMinConsumeScore) {
        this.minTotalMinConsumeScore = minTotalMinConsumeScore;
        return this;
    }

    public Integer getMaxTotalMinConsumeScore() {
        return this.maxTotalMinConsumeScore;
    }

    public TotalUserGradeQuery setMaxTotalMinConsumeScore(Integer maxTotalMinConsumeScore) {
        this.maxTotalMinConsumeScore = maxTotalMinConsumeScore;
        return this;
    }

    public Integer getMinTotalMaxConsumeScore() {
        return this.minTotalMaxConsumeScore;
    }

    public TotalUserGradeQuery setMinTotalMaxConsumeScore(Integer minTotalMaxConsumeScore) {
        this.minTotalMaxConsumeScore = minTotalMaxConsumeScore;
        return this;
    }

    public Integer getMaxTotalMaxConsumeScore() {
        return this.maxTotalMaxConsumeScore;
    }

    public TotalUserGradeQuery setMaxTotalMaxConsumeScore(Integer maxTotalMaxConsumeScore) {
        this.maxTotalMaxConsumeScore = maxTotalMaxConsumeScore;
        return this;
    }

    public Integer getMinTotalAvgConsumeScore() {
        return this.minTotalAvgConsumeScore;
    }

    public TotalUserGradeQuery setMinTotalAvgConsumeScore(Integer minTotalAvgConsumeScore) {
        this.minTotalAvgConsumeScore = minTotalAvgConsumeScore;
        return this;
    }

    public Integer getMaxTotalAvgConsumeScore() {
        return this.maxTotalAvgConsumeScore;
    }

    public TotalUserGradeQuery setMaxTotalAvgConsumeScore(Integer maxTotalAvgConsumeScore) {
        this.maxTotalAvgConsumeScore = maxTotalAvgConsumeScore;
        return this;
    }

    public TotalUserGradeQuery setGroupByCreatedDate(DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("createdDate", dateGroupBy);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinUser() {
        return this.joinUser;
    }

    public TotalUserGradeQuery setJoinUser(com.xmg.mall.base.query.JoinType joinUser) {
        this.joinUser = joinUser;
        return this;
    }

    public UserQuery getUserQuery() {
        return this.userQuery;
    }

    public TotalUserGradeQuery setUserQuery(UserQuery userQuery) {
        this.userQuery = userQuery;
        return this;
    }

    public TotalUserGradeQuery setJoinUser() {
        this.setJoinUser(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinGrade() {
        return this.joinGrade;
    }

    public TotalUserGradeQuery setJoinGrade(com.xmg.mall.base.query.JoinType joinGrade) {
        this.joinGrade = joinGrade;
        return this;
    }

    public GradeQuery getGradeQuery() {
        return this.gradeQuery;
    }

    public TotalUserGradeQuery setGradeQuery(GradeQuery gradeQuery) {
        this.gradeQuery = gradeQuery;
        return this;
    }

    public TotalUserGradeQuery setJoinGrade() {
        this.setJoinGrade(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

}
