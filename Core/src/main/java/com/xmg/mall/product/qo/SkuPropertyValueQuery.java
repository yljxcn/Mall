
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;

public class SkuPropertyValueQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.JoinType joinSku;
    protected SkuQuery skuQuery;
    protected com.xmg.mall.base.query.JoinType joinSkuProperty;
    protected SkuPropertyQuery skuPropertyQuery;
    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long skuId;
    protected Long skuPropertyId;
    protected String value;
    protected String likeValue;

    public boolean hasIds() {
        return (this.ids.length!= 0);
    }

    public com.xmg.mall.base.query.JoinType getJoinSku() {
        return this.joinSku;
    }

    public SkuPropertyValueQuery setJoinSku(com.xmg.mall.base.query.JoinType joinSku) {
        this.joinSku = joinSku;
        return this;
    }

    public SkuQuery getSkuQuery() {
        return this.skuQuery;
    }

    public SkuPropertyValueQuery setSkuQuery(SkuQuery skuQuery) {
        this.skuQuery = skuQuery;
        return this;
    }

    public SkuPropertyValueQuery setJoinSku() {
        this.setJoinSku(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinSkuProperty() {
        return this.joinSkuProperty;
    }

    public SkuPropertyValueQuery setJoinSkuProperty(com.xmg.mall.base.query.JoinType joinSkuProperty) {
        this.joinSkuProperty = joinSkuProperty;
        return this;
    }

    public SkuPropertyQuery getSkuPropertyQuery() {
        return this.skuPropertyQuery;
    }

    public SkuPropertyValueQuery setSkuPropertyQuery(SkuPropertyQuery skuPropertyQuery) {
        this.skuPropertyQuery = skuPropertyQuery;
        return this;
    }

    public SkuPropertyValueQuery setJoinSkuProperty() {
        this.setJoinSkuProperty(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public SkuPropertyValueQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public SkuPropertyValueQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public SkuPropertyValueQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public SkuPropertyValueQuery setSkuId(Long skuId) {
        this.skuId = skuId;
        return this;
    }

    public Long getSkuPropertyId() {
        return this.skuPropertyId;
    }

    public SkuPropertyValueQuery setSkuPropertyId(Long skuPropertyId) {
        this.skuPropertyId = skuPropertyId;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public SkuPropertyValueQuery setValue(String value) {
        this.value = value;
        return this;
    }

    public String getLikeValue() {
        return this.likeValue;
    }

    public SkuPropertyValueQuery setLikeValue(String likeValue) {
        this.likeValue = likeValue;
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
