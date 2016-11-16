
package com.xmg.mall.product.qo;

import java.math.BigDecimal;
import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;

public class ProductCatalogPropertyValueQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.JoinType joinProduct;
    protected ProductQuery productQuery;
    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long productId;
    protected BigDecimal lowerLimit;
    protected BigDecimal minLowerLimit;
    protected BigDecimal maxLowerLimit;
    protected BigDecimal freight;
    protected BigDecimal minFreight;
    protected BigDecimal maxFreight;
    protected Long[] includeMods;
    protected Long[] excludeMods;

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

    public BigDecimal getLowerLimit() {
        return this.lowerLimit;
    }

    public ProductCatalogPropertyValueQuery setLowerLimit(BigDecimal lowerLimit) {
        this.lowerLimit = lowerLimit;
        return this;
    }

    public BigDecimal getMinLowerLimit() {
        return this.minLowerLimit;
    }

    public ProductCatalogPropertyValueQuery setMinLowerLimit(BigDecimal minLowerLimit) {
        this.minLowerLimit = minLowerLimit;
        return this;
    }

    public BigDecimal getMaxLowerLimit() {
        return this.maxLowerLimit;
    }

    public ProductCatalogPropertyValueQuery setMaxLowerLimit(BigDecimal maxLowerLimit) {
        this.maxLowerLimit = maxLowerLimit;
        return this;
    }

    public BigDecimal getFreight() {
        return this.freight;
    }

    public ProductCatalogPropertyValueQuery setFreight(BigDecimal freight) {
        this.freight = freight;
        return this;
    }

    public BigDecimal getMinFreight() {
        return this.minFreight;
    }

    public ProductCatalogPropertyValueQuery setMinFreight(BigDecimal minFreight) {
        this.minFreight = minFreight;
        return this;
    }

    public BigDecimal getMaxFreight() {
        return this.maxFreight;
    }

    public ProductCatalogPropertyValueQuery setMaxFreight(BigDecimal maxFreight) {
        this.maxFreight = maxFreight;
        return this;
    }

    public Long[] getIncludeMods() {
        return this.includeMods;
    }

    public ProductCatalogPropertyValueQuery setIncludeMods(Long[] includeMods) {
        this.includeMods = includeMods;
        return this;
    }

    public Long[] getExcludeMods() {
        return this.excludeMods;
    }

    public ProductCatalogPropertyValueQuery setExcludeMods(Long[] excludeMods) {
        this.excludeMods = excludeMods;
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

    public void setOrderByLowerLimit(int keyword) {
        setOrderBy("lowerLimit", keyword);
    }

    public int getOrderByLowerLimit() {
        return getOrderByKeyword("lowerLimit");
    }

    public void setOrderByFreight(int keyword) {
        setOrderBy("freight", keyword);
    }

    public int getOrderByFreight() {
        return getOrderByKeyword("freight");
    }

}
