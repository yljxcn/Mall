
package com.xmg.mall.product.qo;

import java.math.BigDecimal;
import java.util.Date;
import com.xmg.mall.base.query.DateGroupBy;
import com.xmg.mall.base.query.QueryCondition;

public class TotalSkuQuery
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
    protected String likeCode;
    protected String code;
    protected BigDecimal minPrice;
    protected BigDecimal maxPrice;
    protected BigDecimal price;
    protected Boolean totalSumPrice;
    protected Boolean totalMaxPrice;
    protected Boolean totalMinPrice;
    protected Boolean totalAvgPrice;
    protected BigDecimal maxTotalSumPrice;
    protected BigDecimal minTotalSumPrice;
    protected BigDecimal minTotalMinPrice;
    protected BigDecimal maxTotalMinPrice;
    protected BigDecimal minTotalMaxPrice;
    protected BigDecimal maxTotalMaxPrice;
    protected BigDecimal minTotalAvgPrice;
    protected BigDecimal maxTotalAvgPrice;
    protected Long[] includeMods;
    protected Long[] excludeMods;
    protected com.xmg.mall.base.query.JoinType joinProduct;
    protected ProductQuery productQuery;

    public com.xmg.mall.base.query.GroupBys getGroupBys() {
        return this.groupBys;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public TotalSkuQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Integer getMinTotalCountRows() {
        return this.minTotalCountRows;
    }

    public TotalSkuQuery setMinTotalCountRows(Integer minTotalCountRows) {
        this.minTotalCountRows = minTotalCountRows;
        return this;
    }

    public Integer getMaxTotalCountRows() {
        return this.maxTotalCountRows;
    }

    public TotalSkuQuery setMaxTotalCountRows(Integer maxTotalCountRows) {
        this.maxTotalCountRows = maxTotalCountRows;
        return this;
    }

    public Boolean getTotalCountRows() {
        return this.totalCountRows;
    }

    public TotalSkuQuery setTotalCountRows(Boolean totalCountRows) {
        this.totalCountRows = totalCountRows;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public TotalSkuQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public TotalSkuQuery setEndCreatedDate(Date endCreatedDate) {
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

    public TotalSkuQuery setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public String getLikeCode() {
        return this.likeCode;
    }

    public TotalSkuQuery setLikeCode(String likeCode) {
        this.likeCode = likeCode;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public TotalSkuQuery setCode(String code) {
        this.code = code;
        return this;
    }

    public BigDecimal getMinPrice() {
        return this.minPrice;
    }

    public TotalSkuQuery setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
        return this;
    }

    public BigDecimal getMaxPrice() {
        return this.maxPrice;
    }

    public TotalSkuQuery setMaxPrice(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public TotalSkuQuery setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public void setOrderByPrice(int keyword) {
        setOrderBy("price", keyword);
    }

    public int getOrderByPrice() {
        return getOrderByKeyword("price");
    }

    public Boolean getTotalSumPrice() {
        return this.totalSumPrice;
    }

    public TotalSkuQuery setTotalSumPrice(Boolean totalSumPrice) {
        this.totalSumPrice = totalSumPrice;
        return this;
    }

    public Boolean getTotalMaxPrice() {
        return this.totalMaxPrice;
    }

    public TotalSkuQuery setTotalMaxPrice(Boolean totalMaxPrice) {
        this.totalMaxPrice = totalMaxPrice;
        return this;
    }

    public Boolean getTotalMinPrice() {
        return this.totalMinPrice;
    }

    public TotalSkuQuery setTotalMinPrice(Boolean totalMinPrice) {
        this.totalMinPrice = totalMinPrice;
        return this;
    }

    public Boolean getTotalAvgPrice() {
        return this.totalAvgPrice;
    }

    public TotalSkuQuery setTotalAvgPrice(Boolean totalAvgPrice) {
        this.totalAvgPrice = totalAvgPrice;
        return this;
    }

    public BigDecimal getMaxTotalSumPrice() {
        return this.maxTotalSumPrice;
    }

    public TotalSkuQuery setMaxTotalSumPrice(BigDecimal maxTotalSumPrice) {
        this.maxTotalSumPrice = maxTotalSumPrice;
        return this;
    }

    public BigDecimal getMinTotalSumPrice() {
        return this.minTotalSumPrice;
    }

    public TotalSkuQuery setMinTotalSumPrice(BigDecimal minTotalSumPrice) {
        this.minTotalSumPrice = minTotalSumPrice;
        return this;
    }

    public BigDecimal getMinTotalMinPrice() {
        return this.minTotalMinPrice;
    }

    public TotalSkuQuery setMinTotalMinPrice(BigDecimal minTotalMinPrice) {
        this.minTotalMinPrice = minTotalMinPrice;
        return this;
    }

    public BigDecimal getMaxTotalMinPrice() {
        return this.maxTotalMinPrice;
    }

    public TotalSkuQuery setMaxTotalMinPrice(BigDecimal maxTotalMinPrice) {
        this.maxTotalMinPrice = maxTotalMinPrice;
        return this;
    }

    public BigDecimal getMinTotalMaxPrice() {
        return this.minTotalMaxPrice;
    }

    public TotalSkuQuery setMinTotalMaxPrice(BigDecimal minTotalMaxPrice) {
        this.minTotalMaxPrice = minTotalMaxPrice;
        return this;
    }

    public BigDecimal getMaxTotalMaxPrice() {
        return this.maxTotalMaxPrice;
    }

    public TotalSkuQuery setMaxTotalMaxPrice(BigDecimal maxTotalMaxPrice) {
        this.maxTotalMaxPrice = maxTotalMaxPrice;
        return this;
    }

    public BigDecimal getMinTotalAvgPrice() {
        return this.minTotalAvgPrice;
    }

    public TotalSkuQuery setMinTotalAvgPrice(BigDecimal minTotalAvgPrice) {
        this.minTotalAvgPrice = minTotalAvgPrice;
        return this;
    }

    public BigDecimal getMaxTotalAvgPrice() {
        return this.maxTotalAvgPrice;
    }

    public TotalSkuQuery setMaxTotalAvgPrice(BigDecimal maxTotalAvgPrice) {
        this.maxTotalAvgPrice = maxTotalAvgPrice;
        return this;
    }

    public TotalSkuQuery setGroupByCreatedDate(DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("createdDate", dateGroupBy);
        return this;
    }

    public Long[] getIncludeMods() {
        return this.includeMods;
    }

    public TotalSkuQuery setIncludeMods(Long[] includeMods) {
        this.includeMods = includeMods;
        return this;
    }

    public Long[] getExcludeMods() {
        return this.excludeMods;
    }

    public TotalSkuQuery setExcludeMods(Long[] excludeMods) {
        this.excludeMods = excludeMods;
        return this;
    }

    public TotalSkuQuery setGroupByMods(java.lang.Long mods) {
        if (mods!= null) {
            groupBys.addModsGroupBy("mods", mods);
        } else {
            groupBys.removeGroupBy("mods");
        }
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinProduct() {
        return this.joinProduct;
    }

    public TotalSkuQuery setJoinProduct(com.xmg.mall.base.query.JoinType joinProduct) {
        this.joinProduct = joinProduct;
        return this;
    }

    public ProductQuery getProductQuery() {
        return this.productQuery;
    }

    public TotalSkuQuery setProductQuery(ProductQuery productQuery) {
        this.productQuery = productQuery;
        return this;
    }

    public TotalSkuQuery setJoinProduct() {
        this.setJoinProduct(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

}
