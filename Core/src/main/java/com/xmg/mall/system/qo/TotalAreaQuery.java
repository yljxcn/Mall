
package com.xmg.mall.system.qo;

import java.util.Date;
import com.xmg.mall.base.query.DateGroupBy;
import com.xmg.mall.base.query.QueryCondition;

public class TotalAreaQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.GroupBys groupBys = new com.xmg.mall.base.query.GroupBys();
    protected Long[] ids;
    protected Integer minTotalCountRows;
    protected Integer maxTotalCountRows;
    protected Boolean totalCountRows;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long cityId;
    protected String likeName;
    protected String name;
    protected com.xmg.mall.base.query.JoinType joinCity;
    protected CityQuery cityQuery;

    public com.xmg.mall.base.query.GroupBys getGroupBys() {
        return this.groupBys;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public TotalAreaQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Integer getMinTotalCountRows() {
        return this.minTotalCountRows;
    }

    public TotalAreaQuery setMinTotalCountRows(Integer minTotalCountRows) {
        this.minTotalCountRows = minTotalCountRows;
        return this;
    }

    public Integer getMaxTotalCountRows() {
        return this.maxTotalCountRows;
    }

    public TotalAreaQuery setMaxTotalCountRows(Integer maxTotalCountRows) {
        this.maxTotalCountRows = maxTotalCountRows;
        return this;
    }

    public Boolean getTotalCountRows() {
        return this.totalCountRows;
    }

    public TotalAreaQuery setTotalCountRows(Boolean totalCountRows) {
        this.totalCountRows = totalCountRows;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public TotalAreaQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public TotalAreaQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public void setOrderByCreatedDate(int keyword) {
        setOrderBy("createdDate", keyword);
    }

    public int getOrderByCreatedDate() {
        return getOrderByKeyword("createdDate");
    }

    public Long getCityId() {
        return this.cityId;
    }

    public TotalAreaQuery setCityId(Long cityId) {
        this.cityId = cityId;
        return this;
    }

    public String getLikeName() {
        return this.likeName;
    }

    public TotalAreaQuery setLikeName(String likeName) {
        this.likeName = likeName;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public TotalAreaQuery setName(String name) {
        this.name = name;
        return this;
    }

    public TotalAreaQuery setGroupByCreatedDate(DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("createdDate", dateGroupBy);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinCity() {
        return this.joinCity;
    }

    public TotalAreaQuery setJoinCity(com.xmg.mall.base.query.JoinType joinCity) {
        this.joinCity = joinCity;
        return this;
    }

    public CityQuery getCityQuery() {
        return this.cityQuery;
    }

    public TotalAreaQuery setCityQuery(CityQuery cityQuery) {
        this.cityQuery = cityQuery;
        return this;
    }

    public TotalAreaQuery setJoinCity() {
        this.setJoinCity(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

}
