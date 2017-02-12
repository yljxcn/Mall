
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.DateGroupBy;
import com.xmg.mall.base.query.QueryCondition;

public class TotalProductCatalogPropertyValueQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.GroupBys groupBys = new com.xmg.mall.base.query.GroupBys();
    protected Long[] ids;
    protected Integer minTotalCountRows;
    protected Integer maxTotalCountRows;
    protected Boolean totalCountRows;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long productId;
    protected Long catalogPropertyId;
    protected String likeValue;
    protected String value;
    protected com.xmg.mall.base.query.JoinType joinProduct;
    protected ProductQuery productQuery;
    protected com.xmg.mall.base.query.JoinType joinCatalogProperty;
    protected CatalogPropertyQuery catalogPropertyQuery;

    public com.xmg.mall.base.query.GroupBys getGroupBys() {
        return this.groupBys;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public TotalProductCatalogPropertyValueQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Integer getMinTotalCountRows() {
        return this.minTotalCountRows;
    }

    public TotalProductCatalogPropertyValueQuery setMinTotalCountRows(Integer minTotalCountRows) {
        this.minTotalCountRows = minTotalCountRows;
        return this;
    }

    public Integer getMaxTotalCountRows() {
        return this.maxTotalCountRows;
    }

    public TotalProductCatalogPropertyValueQuery setMaxTotalCountRows(Integer maxTotalCountRows) {
        this.maxTotalCountRows = maxTotalCountRows;
        return this;
    }

    public Boolean getTotalCountRows() {
        return this.totalCountRows;
    }

    public TotalProductCatalogPropertyValueQuery setTotalCountRows(Boolean totalCountRows) {
        this.totalCountRows = totalCountRows;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public TotalProductCatalogPropertyValueQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public TotalProductCatalogPropertyValueQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public void setOrderByCreatedDate(int keyword) {
        setOrderBy("createdDate", keyword);
    }

    public int getOrderByCreatedDate() {
        return getOrderByKeyword("createdDate");
    }

    public Long getProductId() {
        return this.productId;
    }

    public TotalProductCatalogPropertyValueQuery setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Long getCatalogPropertyId() {
        return this.catalogPropertyId;
    }

    public TotalProductCatalogPropertyValueQuery setCatalogPropertyId(Long catalogPropertyId) {
        this.catalogPropertyId = catalogPropertyId;
        return this;
    }

    public String getLikeValue() {
        return this.likeValue;
    }

    public TotalProductCatalogPropertyValueQuery setLikeValue(String likeValue) {
        this.likeValue = likeValue;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public TotalProductCatalogPropertyValueQuery setValue(String value) {
        this.value = value;
        return this;
    }

    public TotalProductCatalogPropertyValueQuery setGroupByCreatedDate(DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("createdDate", dateGroupBy);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinProduct() {
        return this.joinProduct;
    }

    public TotalProductCatalogPropertyValueQuery setJoinProduct(com.xmg.mall.base.query.JoinType joinProduct) {
        this.joinProduct = joinProduct;
        return this;
    }

    public ProductQuery getProductQuery() {
        return this.productQuery;
    }

    public TotalProductCatalogPropertyValueQuery setProductQuery(ProductQuery productQuery) {
        this.productQuery = productQuery;
        return this;
    }

    public TotalProductCatalogPropertyValueQuery setJoinProduct() {
        this.setJoinProduct(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinCatalogProperty() {
        return this.joinCatalogProperty;
    }

    public TotalProductCatalogPropertyValueQuery setJoinCatalogProperty(com.xmg.mall.base.query.JoinType joinCatalogProperty) {
        this.joinCatalogProperty = joinCatalogProperty;
        return this;
    }

    public CatalogPropertyQuery getCatalogPropertyQuery() {
        return this.catalogPropertyQuery;
    }

    public TotalProductCatalogPropertyValueQuery setCatalogPropertyQuery(CatalogPropertyQuery catalogPropertyQuery) {
        this.catalogPropertyQuery = catalogPropertyQuery;
        return this;
    }

    public TotalProductCatalogPropertyValueQuery setJoinCatalogProperty() {
        this.setJoinCatalogProperty(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

}
