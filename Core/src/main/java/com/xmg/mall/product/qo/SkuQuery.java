
package com.xmg.mall.product.qo;

import java.math.BigDecimal;
import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;

public class SkuQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.JoinType joinProduct;
    protected ProductQuery productQuery;
    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long productId;
    protected String code;
    protected String likeCode;
    protected BigDecimal price;
    protected BigDecimal minPrice;
    protected BigDecimal maxPrice;
    protected Long[] includeMods;
    protected Long[] excludeMods;

    public boolean hasIds() {
        return (this.ids.length!= 0);
    }

    public com.xmg.mall.base.query.JoinType getJoinProduct() {
        return this.joinProduct;
    }

    public SkuQuery setJoinProduct(com.xmg.mall.base.query.JoinType joinProduct) {
        this.joinProduct = joinProduct;
        return this;
    }

    public ProductQuery getProductQuery() {
        return this.productQuery;
    }

    public SkuQuery setProductQuery(ProductQuery productQuery) {
        this.productQuery = productQuery;
        return this;
    }

    public SkuQuery setJoinProduct() {
        this.setJoinProduct(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public SkuQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public SkuQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public SkuQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public Long getProductId() {
        return this.productId;
    }

    public SkuQuery setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public SkuQuery setCode(String code) {
        this.code = code;
        return this;
    }

    public String getLikeCode() {
        return this.likeCode;
    }

    public SkuQuery setLikeCode(String likeCode) {
        this.likeCode = likeCode;
        return this;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public SkuQuery setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public BigDecimal getMinPrice() {
        return this.minPrice;
    }

    public SkuQuery setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
        return this;
    }

    public BigDecimal getMaxPrice() {
        return this.maxPrice;
    }

    public SkuQuery setMaxPrice(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }

    public Long[] getIncludeMods() {
        return this.includeMods;
    }

    public SkuQuery setIncludeMods(Long[] includeMods) {
        this.includeMods = includeMods;
        return this;
    }

    public Long[] getExcludeMods() {
        return this.excludeMods;
    }

    public SkuQuery setExcludeMods(Long[] excludeMods) {
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

    public void setOrderByPrice(int keyword) {
        setOrderBy("price", keyword);
    }

    public int getOrderByPrice() {
        return getOrderByKeyword("price");
    }

}
