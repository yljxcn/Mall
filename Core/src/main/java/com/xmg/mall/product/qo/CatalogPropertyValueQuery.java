
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;

public class CatalogPropertyValueQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.JoinType joinCatalogProperty;
    protected CatalogPropertyQuery catalogPropertyQuery;
    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long catalogPropertyId;
    protected String value;
    protected String likeValue;

    public boolean hasIds() {
        return (this.ids.length!= 0);
    }

    public com.xmg.mall.base.query.JoinType getJoinCatalogProperty() {
        return this.joinCatalogProperty;
    }

    public CatalogPropertyValueQuery setJoinCatalogProperty(com.xmg.mall.base.query.JoinType joinCatalogProperty) {
        this.joinCatalogProperty = joinCatalogProperty;
        return this;
    }

    public CatalogPropertyQuery getCatalogPropertyQuery() {
        return this.catalogPropertyQuery;
    }

    public CatalogPropertyValueQuery setCatalogPropertyQuery(CatalogPropertyQuery catalogPropertyQuery) {
        this.catalogPropertyQuery = catalogPropertyQuery;
        return this;
    }

    public CatalogPropertyValueQuery setJoinCatalogProperty() {
        this.setJoinCatalogProperty(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public CatalogPropertyValueQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public CatalogPropertyValueQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public CatalogPropertyValueQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public Long getCatalogPropertyId() {
        return this.catalogPropertyId;
    }

    public CatalogPropertyValueQuery setCatalogPropertyId(Long catalogPropertyId) {
        this.catalogPropertyId = catalogPropertyId;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public CatalogPropertyValueQuery setValue(String value) {
        this.value = value;
        return this;
    }

    public String getLikeValue() {
        return this.likeValue;
    }

    public CatalogPropertyValueQuery setLikeValue(String likeValue) {
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

    public void setOrderBySequence(int keyword) {
        setOrderBy("sequence", keyword);
    }

    public int getOrderBySequence() {
        return getOrderByKeyword("sequence");
    }

}
