
package com.xmg.mall.system.qo;

import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;

public class StreetQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.JoinType joinArea;
    protected AreaQuery areaQuery;
    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long areaId;
    protected String name;
    protected String likeName;

    public boolean hasIds() {
        return (this.ids.length!= 0);
    }

    public com.xmg.mall.base.query.JoinType getJoinArea() {
        return this.joinArea;
    }

    public StreetQuery setJoinArea(com.xmg.mall.base.query.JoinType joinArea) {
        this.joinArea = joinArea;
        return this;
    }

    public AreaQuery getAreaQuery() {
        return this.areaQuery;
    }

    public StreetQuery setAreaQuery(AreaQuery areaQuery) {
        this.areaQuery = areaQuery;
        return this;
    }

    public StreetQuery setJoinArea() {
        this.setJoinArea(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public StreetQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public StreetQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public StreetQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public Long getAreaId() {
        return this.areaId;
    }

    public StreetQuery setAreaId(Long areaId) {
        this.areaId = areaId;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public StreetQuery setName(String name) {
        this.name = name;
        return this;
    }

    public String getLikeName() {
        return this.likeName;
    }

    public StreetQuery setLikeName(String likeName) {
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
