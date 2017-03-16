
package com.xmg.mall.system.qo;

import java.util.Date;
import com.xmg.mall.base.query.DateGroupBy;
import com.xmg.mall.base.query.QueryCondition;

public class TotalStreetQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.GroupBys groupBys = new com.xmg.mall.base.query.GroupBys();
    protected Long[] ids;
    protected Integer minTotalCountRows;
    protected Integer maxTotalCountRows;
    protected Boolean totalCountRows;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long areaId;
    protected String likeName;
    protected String name;
    protected com.xmg.mall.base.query.JoinType joinArea;
    protected AreaQuery areaQuery;

    public com.xmg.mall.base.query.GroupBys getGroupBys() {
        return this.groupBys;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public TotalStreetQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Integer getMinTotalCountRows() {
        return this.minTotalCountRows;
    }

    public TotalStreetQuery setMinTotalCountRows(Integer minTotalCountRows) {
        this.minTotalCountRows = minTotalCountRows;
        return this;
    }

    public Integer getMaxTotalCountRows() {
        return this.maxTotalCountRows;
    }

    public TotalStreetQuery setMaxTotalCountRows(Integer maxTotalCountRows) {
        this.maxTotalCountRows = maxTotalCountRows;
        return this;
    }

    public Boolean getTotalCountRows() {
        return this.totalCountRows;
    }

    public TotalStreetQuery setTotalCountRows(Boolean totalCountRows) {
        this.totalCountRows = totalCountRows;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public TotalStreetQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public TotalStreetQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public void setOrderByCreatedDate(int keyword) {
        setOrderBy("createdDate", keyword);
    }

    public int getOrderByCreatedDate() {
        return getOrderByKeyword("createdDate");
    }

    public Long getAreaId() {
        return this.areaId;
    }

    public TotalStreetQuery setAreaId(Long areaId) {
        this.areaId = areaId;
        return this;
    }

    public String getLikeName() {
        return this.likeName;
    }

    public TotalStreetQuery setLikeName(String likeName) {
        this.likeName = likeName;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public TotalStreetQuery setName(String name) {
        this.name = name;
        return this;
    }

    public TotalStreetQuery setGroupByCreatedDate(DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("createdDate", dateGroupBy);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinArea() {
        return this.joinArea;
    }

    public TotalStreetQuery setJoinArea(com.xmg.mall.base.query.JoinType joinArea) {
        this.joinArea = joinArea;
        return this;
    }

    public AreaQuery getAreaQuery() {
        return this.areaQuery;
    }

    public TotalStreetQuery setAreaQuery(AreaQuery areaQuery) {
        this.areaQuery = areaQuery;
        return this;
    }

    public TotalStreetQuery setJoinArea() {
        this.setJoinArea(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

}
