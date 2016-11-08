
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.DateGroupBy;
import com.xmg.mall.base.query.QueryCondition;

public class TotalSkuPropertyValueQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.GroupBys groupBys = new com.xmg.mall.base.query.GroupBys();
    protected Long[] ids;
    protected Integer minTotalCountRows;
    protected Integer maxTotalCountRows;
    protected Boolean totalCountRows;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long skuId;
    protected Long skuPropertyId;
    protected String likeValue;
    protected String value;
    protected com.xmg.mall.base.query.JoinType joinSku;
    protected SkuQuery skuQuery;
    protected com.xmg.mall.base.query.JoinType joinSkuProperty;
    protected SkuPropertyQuery skuPropertyQuery;

    public com.xmg.mall.base.query.GroupBys getGroupBys() {
        return this.groupBys;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public TotalSkuPropertyValueQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Integer getMinTotalCountRows() {
        return this.minTotalCountRows;
    }

    public TotalSkuPropertyValueQuery setMinTotalCountRows(Integer minTotalCountRows) {
        this.minTotalCountRows = minTotalCountRows;
        return this;
    }

    public Integer getMaxTotalCountRows() {
        return this.maxTotalCountRows;
    }

    public TotalSkuPropertyValueQuery setMaxTotalCountRows(Integer maxTotalCountRows) {
        this.maxTotalCountRows = maxTotalCountRows;
        return this;
    }

    public Boolean getTotalCountRows() {
        return this.totalCountRows;
    }

    public TotalSkuPropertyValueQuery setTotalCountRows(Boolean totalCountRows) {
        this.totalCountRows = totalCountRows;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public TotalSkuPropertyValueQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public TotalSkuPropertyValueQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public void setOrderByCreatedDate(int keyword) {
        setOrderBy("createdDate", keyword);
    }

    public int getOrderByCreatedDate() {
        return getOrderByKeyword("createdDate");
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public TotalSkuPropertyValueQuery setSkuId(Long skuId) {
        this.skuId = skuId;
        return this;
    }

    public Long getSkuPropertyId() {
        return this.skuPropertyId;
    }

    public TotalSkuPropertyValueQuery setSkuPropertyId(Long skuPropertyId) {
        this.skuPropertyId = skuPropertyId;
        return this;
    }

    public String getLikeValue() {
        return this.likeValue;
    }

    public TotalSkuPropertyValueQuery setLikeValue(String likeValue) {
        this.likeValue = likeValue;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public TotalSkuPropertyValueQuery setValue(String value) {
        this.value = value;
        return this;
    }

    public TotalSkuPropertyValueQuery setGroupByCreatedDate(DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("createdDate", dateGroupBy);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinSku() {
        return this.joinSku;
    }

    public TotalSkuPropertyValueQuery setJoinSku(com.xmg.mall.base.query.JoinType joinSku) {
        this.joinSku = joinSku;
        return this;
    }

    public SkuQuery getSkuQuery() {
        return this.skuQuery;
    }

    public TotalSkuPropertyValueQuery setSkuQuery(SkuQuery skuQuery) {
        this.skuQuery = skuQuery;
        return this;
    }

    public TotalSkuPropertyValueQuery setJoinSku() {
        this.setJoinSku(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinSkuProperty() {
        return this.joinSkuProperty;
    }

    public TotalSkuPropertyValueQuery setJoinSkuProperty(com.xmg.mall.base.query.JoinType joinSkuProperty) {
        this.joinSkuProperty = joinSkuProperty;
        return this;
    }

    public SkuPropertyQuery getSkuPropertyQuery() {
        return this.skuPropertyQuery;
    }

    public TotalSkuPropertyValueQuery setSkuPropertyQuery(SkuPropertyQuery skuPropertyQuery) {
        this.skuPropertyQuery = skuPropertyQuery;
        return this;
    }

    public TotalSkuPropertyValueQuery setJoinSkuProperty() {
        this.setJoinSkuProperty(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

}
