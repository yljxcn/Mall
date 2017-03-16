
package com.xmg.mall.system.qo;

import java.util.Date;
import com.xmg.mall.base.query.DateGroupBy;
import com.xmg.mall.base.query.QueryCondition;

public class TotalCityQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.GroupBys groupBys = new com.xmg.mall.base.query.GroupBys();
    protected Long[] ids;
    protected Integer minTotalCountRows;
    protected Integer maxTotalCountRows;
    protected Boolean totalCountRows;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long provinceId;
    protected String likeName;
    protected String name;
    protected com.xmg.mall.base.query.JoinType joinProvince;
    protected ProvinceQuery provinceQuery;

    public com.xmg.mall.base.query.GroupBys getGroupBys() {
        return this.groupBys;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public TotalCityQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Integer getMinTotalCountRows() {
        return this.minTotalCountRows;
    }

    public TotalCityQuery setMinTotalCountRows(Integer minTotalCountRows) {
        this.minTotalCountRows = minTotalCountRows;
        return this;
    }

    public Integer getMaxTotalCountRows() {
        return this.maxTotalCountRows;
    }

    public TotalCityQuery setMaxTotalCountRows(Integer maxTotalCountRows) {
        this.maxTotalCountRows = maxTotalCountRows;
        return this;
    }

    public Boolean getTotalCountRows() {
        return this.totalCountRows;
    }

    public TotalCityQuery setTotalCountRows(Boolean totalCountRows) {
        this.totalCountRows = totalCountRows;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public TotalCityQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public TotalCityQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public void setOrderByCreatedDate(int keyword) {
        setOrderBy("createdDate", keyword);
    }

    public int getOrderByCreatedDate() {
        return getOrderByKeyword("createdDate");
    }

    public Long getProvinceId() {
        return this.provinceId;
    }

    public TotalCityQuery setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
        return this;
    }

    public String getLikeName() {
        return this.likeName;
    }

    public TotalCityQuery setLikeName(String likeName) {
        this.likeName = likeName;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public TotalCityQuery setName(String name) {
        this.name = name;
        return this;
    }

    public TotalCityQuery setGroupByCreatedDate(DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("createdDate", dateGroupBy);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinProvince() {
        return this.joinProvince;
    }

    public TotalCityQuery setJoinProvince(com.xmg.mall.base.query.JoinType joinProvince) {
        this.joinProvince = joinProvince;
        return this;
    }

    public ProvinceQuery getProvinceQuery() {
        return this.provinceQuery;
    }

    public TotalCityQuery setProvinceQuery(ProvinceQuery provinceQuery) {
        this.provinceQuery = provinceQuery;
        return this;
    }

    public TotalCityQuery setJoinProvince() {
        this.setJoinProvince(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

}
