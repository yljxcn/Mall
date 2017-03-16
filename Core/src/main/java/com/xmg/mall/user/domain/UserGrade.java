
package com.xmg.mall.user.domain;

import com.xmg.mall.base.domain.BasicDomain;

public class UserGrade
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long userId;
    protected Long gradeId;
    protected Integer score;
    protected Integer consumeScore;

    public Long getUserId() {
        return this.userId;
    }

    public UserGrade setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getGradeId() {
        return this.gradeId;
    }

    public UserGrade setGradeId(Long gradeId) {
        this.gradeId = gradeId;
        return this;
    }

    public Integer getScore() {
        return this.score;
    }

    public UserGrade setScore(Integer score) {
        this.score = score;
        return this;
    }

    public Integer getConsumeScore() {
        return this.consumeScore;
    }

    public UserGrade setConsumeScore(Integer consumeScore) {
        this.consumeScore = consumeScore;
        return this;
    }

}
