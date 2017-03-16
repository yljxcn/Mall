
package com.xmg.mall.user.vo;

import com.xmg.mall.user.domain.UserGrade;

public class ExtendedUserGrade
    extends UserGrade
{

    private final static long serialVersionUID = 1L;
    protected com.xmg.mall.user.domain.User user;
    protected com.xmg.mall.user.domain.Grade grade;

    public com.xmg.mall.user.domain.User getUser() {
        return this.user;
    }

    public ExtendedUserGrade setUser(com.xmg.mall.user.domain.User user) {
        this.user = user;
        return this;
    }

    public com.xmg.mall.user.domain.Grade getGrade() {
        return this.grade;
    }

    public ExtendedUserGrade setGrade(com.xmg.mall.user.domain.Grade grade) {
        this.grade = grade;
        return this;
    }

}
