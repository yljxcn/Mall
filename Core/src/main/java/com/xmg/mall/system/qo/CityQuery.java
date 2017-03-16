
package com.xmg.mall.system.qo;

import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;

public class CityQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.JoinType joinProvince;
    protected ProvinceQuery provinceQuery;
    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long provinceId;
    protected String name;
    protected String likeName;

    public boolean hasIds() {
        return (this.ids.length!= 0);
    }

    public com.xmg.mall.base.query.JoinType getJoinProvince() {
        return this.joinProvince;
    }

    public CityQuery setJoinProvince(com.xmg.mall.base.query.JoinType joinProvince) {
        this.joinProvince = joinProvince;
        return this;
    }

    public ProvinceQuery getProvinceQuery() {
        return this.provinceQuery;
    }

    public CityQuery setProvinceQuery(ProvinceQuery provinceQuery) {
        this.provinceQuery = provinceQuery;
        return this;
    }

    public CityQuery setJoinProvince() {
        this.setJoinProvince(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public CityQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public CityQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public CityQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public Long getProvinceId() {
        return this.provinceId;
    }

    public CityQuery setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public CityQuery setName(String name) {
        this.name = name;
        return this;
    }

    public String getLikeName() {
        return this.likeName;
    }

    public CityQuery setLikeName(String likeName) {
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
