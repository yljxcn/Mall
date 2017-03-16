
package com.xmg.mall.system.qo;

import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;

public class AreaQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.JoinType joinCity;
    protected CityQuery cityQuery;
    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long cityId;
    protected String name;
    protected String likeName;

    public boolean hasIds() {
        return (this.ids.length!= 0);
    }

    public com.xmg.mall.base.query.JoinType getJoinCity() {
        return this.joinCity;
    }

    public AreaQuery setJoinCity(com.xmg.mall.base.query.JoinType joinCity) {
        this.joinCity = joinCity;
        return this;
    }

    public CityQuery getCityQuery() {
        return this.cityQuery;
    }

    public AreaQuery setCityQuery(CityQuery cityQuery) {
        this.cityQuery = cityQuery;
        return this;
    }

    public AreaQuery setJoinCity() {
        this.setJoinCity(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public AreaQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public AreaQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public AreaQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public Long getCityId() {
        return this.cityId;
    }

    public AreaQuery setCityId(Long cityId) {
        this.cityId = cityId;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public AreaQuery setName(String name) {
        this.name = name;
        return this;
    }

    public String getLikeName() {
        return this.likeName;
    }

    public AreaQuery setLikeName(String likeName) {
        this.likeName = likeName;
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
