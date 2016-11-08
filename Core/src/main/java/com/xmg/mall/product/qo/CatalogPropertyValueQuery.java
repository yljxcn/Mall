
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;

public class CatalogPropertyValueQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.JoinType joinCatalog;
    protected CatalogPropertyQuery catalogQuery;
    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long catalogId;
    protected String value;
    protected String likeValue;

    public boolean hasIds() {
        return (this.ids.length!= 0);
    }

    public com.xmg.mall.base.query.JoinType getJoinCatalog() {
        return this.joinCatalog;
    }

    public CatalogPropertyValueQuery setJoinCatalog(com.xmg.mall.base.query.JoinType joinCatalog) {
        this.joinCatalog = joinCatalog;
        return this;
    }

    public CatalogPropertyQuery getCatalogQuery() {
        return this.catalogQuery;
    }

    public CatalogPropertyValueQuery setCatalogQuery(CatalogPropertyQuery catalogQuery) {
        this.catalogQuery = catalogQuery;
        return this;
    }

    public CatalogPropertyValueQuery setJoinCatalog() {
        this.setJoinCatalog(com.xmg.mall.base.query.JoinType.LEFT);
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

    public Long getCatalogId() {
        return this.catalogId;
    }

    public CatalogPropertyValueQuery setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
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
