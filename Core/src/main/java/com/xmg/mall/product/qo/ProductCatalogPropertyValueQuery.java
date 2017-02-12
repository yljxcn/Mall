
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;

public class ProductCatalogPropertyValueQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.JoinType joinProduct;
    protected ProductQuery productQuery;
    protected com.xmg.mall.base.query.JoinType joinCatalogProperty;
    protected CatalogPropertyQuery catalogPropertyQuery;
    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long productId;
    protected Long catalogPropertyId;
    protected String value;
    protected String likeValue;

    public boolean hasIds() {
        return (this.ids.length!= 0);
    }

    public com.xmg.mall.base.query.JoinType getJoinProduct() {
        return this.joinProduct;
    }

    public ProductCatalogPropertyValueQuery setJoinProduct(com.xmg.mall.base.query.JoinType joinProduct) {
        this.joinProduct = joinProduct;
        return this;
    }

    public ProductQuery getProductQuery() {
        return this.productQuery;
    }

    public ProductCatalogPropertyValueQuery setProductQuery(ProductQuery productQuery) {
        this.productQuery = productQuery;
        return this;
    }

    public ProductCatalogPropertyValueQuery setJoinProduct() {
        this.setJoinProduct(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinCatalogProperty() {
        return this.joinCatalogProperty;
    }

    public ProductCatalogPropertyValueQuery setJoinCatalogProperty(com.xmg.mall.base.query.JoinType joinCatalogProperty) {
        this.joinCatalogProperty = joinCatalogProperty;
        return this;
    }

    public CatalogPropertyQuery getCatalogPropertyQuery() {
        return this.catalogPropertyQuery;
    }

    public ProductCatalogPropertyValueQuery setCatalogPropertyQuery(CatalogPropertyQuery catalogPropertyQuery) {
        this.catalogPropertyQuery = catalogPropertyQuery;
        return this;
    }

    public ProductCatalogPropertyValueQuery setJoinCatalogProperty() {
        this.setJoinCatalogProperty(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public ProductCatalogPropertyValueQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public ProductCatalogPropertyValueQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public ProductCatalogPropertyValueQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public Long getProductId() {
        return this.productId;
    }

    public ProductCatalogPropertyValueQuery setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Long getCatalogPropertyId() {
        return this.catalogPropertyId;
    }

    public ProductCatalogPropertyValueQuery setCatalogPropertyId(Long catalogPropertyId) {
        this.catalogPropertyId = catalogPropertyId;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public ProductCatalogPropertyValueQuery setValue(String value) {
        this.value = value;
        return this;
    }

    public String getLikeValue() {
        return this.likeValue;
    }

    public ProductCatalogPropertyValueQuery setLikeValue(String likeValue) {
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
