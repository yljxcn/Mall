
package com.xmg.mall.user.qo;

import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;

public class UserGradeQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.JoinType joinUser;
    protected UserQuery userQuery;
    protected com.xmg.mall.base.query.JoinType joinGrade;
    protected GradeQuery gradeQuery;
    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long userId;
    protected Long gradeId;
    protected Integer score;
    protected Integer minScore;
    protected Integer maxScore;
    protected Integer consumeScore;
    protected Integer minConsumeScore;
    protected Integer maxConsumeScore;

    public boolean hasIds() {
        return (this.ids.length!= 0);
    }

    public com.xmg.mall.base.query.JoinType getJoinUser() {
        return this.joinUser;
    }

    public UserGradeQuery setJoinUser(com.xmg.mall.base.query.JoinType joinUser) {
        this.joinUser = joinUser;
        return this;
    }

    public UserQuery getUserQuery() {
        return this.userQuery;
    }

    public UserGradeQuery setUserQuery(UserQuery userQuery) {
        this.userQuery = userQuery;
        return this;
    }

    public UserGradeQuery setJoinUser() {
        this.setJoinUser(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinGrade() {
        return this.joinGrade;
    }

    public UserGradeQuery setJoinGrade(com.xmg.mall.base.query.JoinType joinGrade) {
        this.joinGrade = joinGrade;
        return this;
    }

    public GradeQuery getGradeQuery() {
        return this.gradeQuery;
    }

    public UserGradeQuery setGradeQuery(GradeQuery gradeQuery) {
        this.gradeQuery = gradeQuery;
        return this;
    }

    public UserGradeQuery setJoinGrade() {
        this.setJoinGrade(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public UserGradeQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public UserGradeQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public UserGradeQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public Long getUserId() {
        return this.userId;
    }

    public UserGradeQuery setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getGradeId() {
        return this.gradeId;
    }

    public UserGradeQuery setGradeId(Long gradeId) {
        this.gradeId = gradeId;
        return this;
    }

    public Integer getScore() {
        return this.score;
    }

    public UserGradeQuery setScore(Integer score) {
        this.score = score;
        return this;
    }

    public Integer getMinScore() {
        return this.minScore;
    }

    public UserGradeQuery setMinScore(Integer minScore) {
        this.minScore = minScore;
        return this;
    }

    public Integer getMaxScore() {
        return this.maxScore;
    }

    public UserGradeQuery setMaxScore(Integer maxScore) {
        this.maxScore = maxScore;
        return this;
    }

    public Integer getConsumeScore() {
        return this.consumeScore;
    }

    public UserGradeQuery setConsumeScore(Integer consumeScore) {
        this.consumeScore = consumeScore;
        return this;
    }

    public Integer getMinConsumeScore() {
        return this.minConsumeScore;
    }

    public UserGradeQuery setMinConsumeScore(Integer minConsumeScore) {
        this.minConsumeScore = minConsumeScore;
        return this;
    }

    public Integer getMaxConsumeScore() {
        return this.maxConsumeScore;
    }

    public UserGradeQuery setMaxConsumeScore(Integer maxConsumeScore) {
        this.maxConsumeScore = maxConsumeScore;
        return this;
    }

    public void setOrderById(int keyword) {
        setOrderBy("id", keyword);
    }

    public int getOrderById() {
        return getOrderByKeyword("id");
    }

    public void setOrderByCreatedDate(int keyword) {
        setOrderBy("createdDate", keyword);
    }

    public int getOrderByCreatedDate() {
        return getOrderByKeyword("createdDate");
    }

}
