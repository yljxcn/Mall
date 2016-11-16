
package com.xmg.mall.product.qo;

import java.math.BigDecimal;
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
    protected BigDecimal minLowerLimit;
    protected BigDecimal maxLowerLimit;
    protected BigDecimal lowerLimit;
    protected BigDecimal minFreight;
    protected BigDecimal maxFreight;
    protected BigDecimal freight;
    protected Boolean totalSumLowerLimit;
    protected Boolean totalMaxLowerLimit;
    protected Boolean totalMinLowerLimit;
    protected Boolean totalAvgLowerLimit;
    protected BigDecimal maxTotalSumLowerLimit;
    protected BigDecimal minTotalSumLowerLimit;
    protected BigDecimal minTotalMinLowerLimit;
    protected BigDecimal maxTotalMinLowerLimit;
    protected BigDecimal minTotalMaxLowerLimit;
    protected BigDecimal maxTotalMaxLowerLimit;
    protected BigDecimal minTotalAvgLowerLimit;
    protected BigDecimal maxTotalAvgLowerLimit;
    protected Boolean totalSumFreight;
    protected Boolean totalMaxFreight;
    protected Boolean totalMinFreight;
    protected Boolean totalAvgFreight;
    protected BigDecimal maxTotalSumFreight;
    protected BigDecimal minTotalSumFreight;
    protected BigDecimal minTotalMinFreight;
    protected BigDecimal maxTotalMinFreight;
    protected BigDecimal minTotalMaxFreight;
    protected BigDecimal maxTotalMaxFreight;
    protected BigDecimal minTotalAvgFreight;
    protected BigDecimal maxTotalAvgFreight;
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

    public BigDecimal getMinLowerLimit() {
        return this.minLowerLimit;
    }

    public TotalProductCatalogPropertyValueQuery setMinLowerLimit(BigDecimal minLowerLimit) {
        this.minLowerLimit = minLowerLimit;
        return this;
    }

    public BigDecimal getMaxLowerLimit() {
        return this.maxLowerLimit;
    }

    public TotalProductCatalogPropertyValueQuery setMaxLowerLimit(BigDecimal maxLowerLimit) {
        this.maxLowerLimit = maxLowerLimit;
        return this;
    }

    public BigDecimal getLowerLimit() {
        return this.lowerLimit;
    }

    public TotalProductCatalogPropertyValueQuery setLowerLimit(BigDecimal lowerLimit) {
        this.lowerLimit = lowerLimit;
        return this;
    }

    public void setOrderByLowerLimit(int keyword) {
        setOrderBy("lowerLimit", keyword);
    }

    public int getOrderByLowerLimit() {
        return getOrderByKeyword("lowerLimit");
    }

    public BigDecimal getMinFreight() {
        return this.minFreight;
    }

    public TotalProductCatalogPropertyValueQuery setMinFreight(BigDecimal minFreight) {
        this.minFreight = minFreight;
        return this;
    }

    public BigDecimal getMaxFreight() {
        return this.maxFreight;
    }

    public TotalProductCatalogPropertyValueQuery setMaxFreight(BigDecimal maxFreight) {
        this.maxFreight = maxFreight;
        return this;
    }

    public BigDecimal getFreight() {
        return this.freight;
    }

    public TotalProductCatalogPropertyValueQuery setFreight(BigDecimal freight) {
        this.freight = freight;
        return this;
    }

    public void setOrderByFreight(int keyword) {
        setOrderBy("freight", keyword);
    }

    public int getOrderByFreight() {
        return getOrderByKeyword("freight");
    }

    public Boolean getTotalSumLowerLimit() {
        return this.totalSumLowerLimit;
    }

    public TotalProductCatalogPropertyValueQuery setTotalSumLowerLimit(Boolean totalSumLowerLimit) {
        this.totalSumLowerLimit = totalSumLowerLimit;
        return this;
    }

    public Boolean getTotalMaxLowerLimit() {
        return this.totalMaxLowerLimit;
    }

    public TotalProductCatalogPropertyValueQuery setTotalMaxLowerLimit(Boolean totalMaxLowerLimit) {
        this.totalMaxLowerLimit = totalMaxLowerLimit;
        return this;
    }

    public Boolean getTotalMinLowerLimit() {
        return this.totalMinLowerLimit;
    }

    public TotalProductCatalogPropertyValueQuery setTotalMinLowerLimit(Boolean totalMinLowerLimit) {
        this.totalMinLowerLimit = totalMinLowerLimit;
        return this;
    }

    public Boolean getTotalAvgLowerLimit() {
        return this.totalAvgLowerLimit;
    }

    public TotalProductCatalogPropertyValueQuery setTotalAvgLowerLimit(Boolean totalAvgLowerLimit) {
        this.totalAvgLowerLimit = totalAvgLowerLimit;
        return this;
    }

    public BigDecimal getMaxTotalSumLowerLimit() {
        return this.maxTotalSumLowerLimit;
    }

    public TotalProductCatalogPropertyValueQuery setMaxTotalSumLowerLimit(BigDecimal maxTotalSumLowerLimit) {
        this.maxTotalSumLowerLimit = maxTotalSumLowerLimit;
        return this;
    }

    public BigDecimal getMinTotalSumLowerLimit() {
        return this.minTotalSumLowerLimit;
    }

    public TotalProductCatalogPropertyValueQuery setMinTotalSumLowerLimit(BigDecimal minTotalSumLowerLimit) {
        this.minTotalSumLowerLimit = minTotalSumLowerLimit;
        return this;
    }

    public BigDecimal getMinTotalMinLowerLimit() {
        return this.minTotalMinLowerLimit;
    }

    public TotalProductCatalogPropertyValueQuery setMinTotalMinLowerLimit(BigDecimal minTotalMinLowerLimit) {
        this.minTotalMinLowerLimit = minTotalMinLowerLimit;
        return this;
    }

    public BigDecimal getMaxTotalMinLowerLimit() {
        return this.maxTotalMinLowerLimit;
    }

    public TotalProductCatalogPropertyValueQuery setMaxTotalMinLowerLimit(BigDecimal maxTotalMinLowerLimit) {
        this.maxTotalMinLowerLimit = maxTotalMinLowerLimit;
        return this;
    }

    public BigDecimal getMinTotalMaxLowerLimit() {
        return this.minTotalMaxLowerLimit;
    }

    public TotalProductCatalogPropertyValueQuery setMinTotalMaxLowerLimit(BigDecimal minTotalMaxLowerLimit) {
        this.minTotalMaxLowerLimit = minTotalMaxLowerLimit;
        return this;
    }

    public BigDecimal getMaxTotalMaxLowerLimit() {
        return this.maxTotalMaxLowerLimit;
    }

    public TotalProductCatalogPropertyValueQuery setMaxTotalMaxLowerLimit(BigDecimal maxTotalMaxLowerLimit) {
        this.maxTotalMaxLowerLimit = maxTotalMaxLowerLimit;
        return this;
    }

    public BigDecimal getMinTotalAvgLowerLimit() {
        return this.minTotalAvgLowerLimit;
    }

    public TotalProductCatalogPropertyValueQuery setMinTotalAvgLowerLimit(BigDecimal minTotalAvgLowerLimit) {
        this.minTotalAvgLowerLimit = minTotalAvgLowerLimit;
        return this;
    }

    public BigDecimal getMaxTotalAvgLowerLimit() {
        return this.maxTotalAvgLowerLimit;
    }

    public TotalProductCatalogPropertyValueQuery setMaxTotalAvgLowerLimit(BigDecimal maxTotalAvgLowerLimit) {
        this.maxTotalAvgLowerLimit = maxTotalAvgLowerLimit;
        return this;
    }

    public Boolean getTotalSumFreight() {
        return this.totalSumFreight;
    }

    public TotalProductCatalogPropertyValueQuery setTotalSumFreight(Boolean totalSumFreight) {
        this.totalSumFreight = totalSumFreight;
        return this;
    }

    public Boolean getTotalMaxFreight() {
        return this.totalMaxFreight;
    }

    public TotalProductCatalogPropertyValueQuery setTotalMaxFreight(Boolean totalMaxFreight) {
        this.totalMaxFreight = totalMaxFreight;
        return this;
    }

    public Boolean getTotalMinFreight() {
        return this.totalMinFreight;
    }

    public TotalProductCatalogPropertyValueQuery setTotalMinFreight(Boolean totalMinFreight) {
        this.totalMinFreight = totalMinFreight;
        return this;
    }

    public Boolean getTotalAvgFreight() {
        return this.totalAvgFreight;
    }

    public TotalProductCatalogPropertyValueQuery setTotalAvgFreight(Boolean totalAvgFreight) {
        this.totalAvgFreight = totalAvgFreight;
        return this;
    }

    public BigDecimal getMaxTotalSumFreight() {
        return this.maxTotalSumFreight;
    }

    public TotalProductCatalogPropertyValueQuery setMaxTotalSumFreight(BigDecimal maxTotalSumFreight) {
        this.maxTotalSumFreight = maxTotalSumFreight;
        return this;
    }

    public BigDecimal getMinTotalSumFreight() {
        return this.minTotalSumFreight;
    }

    public TotalProductCatalogPropertyValueQuery setMinTotalSumFreight(BigDecimal minTotalSumFreight) {
        this.minTotalSumFreight = minTotalSumFreight;
        return this;
    }

    public BigDecimal getMinTotalMinFreight() {
        return this.minTotalMinFreight;
    }

    public TotalProductCatalogPropertyValueQuery setMinTotalMinFreight(BigDecimal minTotalMinFreight) {
        this.minTotalMinFreight = minTotalMinFreight;
        return this;
    }

    public BigDecimal getMaxTotalMinFreight() {
        return this.maxTotalMinFreight;
    }

    public TotalProductCatalogPropertyValueQuery setMaxTotalMinFreight(BigDecimal maxTotalMinFreight) {
        this.maxTotalMinFreight = maxTotalMinFreight;
        return this;
    }

    public BigDecimal getMinTotalMaxFreight() {
        return this.minTotalMaxFreight;
    }

    public TotalProductCatalogPropertyValueQuery setMinTotalMaxFreight(BigDecimal minTotalMaxFreight) {
        this.minTotalMaxFreight = minTotalMaxFreight;
        return this;
    }

    public BigDecimal getMaxTotalMaxFreight() {
        return this.maxTotalMaxFreight;
    }

    public TotalProductCatalogPropertyValueQuery setMaxTotalMaxFreight(BigDecimal maxTotalMaxFreight) {
        this.maxTotalMaxFreight = maxTotalMaxFreight;
        return this;
    }

    public BigDecimal getMinTotalAvgFreight() {
        return this.minTotalAvgFreight;
    }

    public TotalProductCatalogPropertyValueQuery setMinTotalAvgFreight(BigDecimal minTotalAvgFreight) {
        this.minTotalAvgFreight = minTotalAvgFreight;
        return this;
    }

    public BigDecimal getMaxTotalAvgFreight() {
        return this.maxTotalAvgFreight;
    }

    public TotalProductCatalogPropertyValueQuery setMaxTotalAvgFreight(BigDecimal maxTotalAvgFreight) {
        this.maxTotalAvgFreight = maxTotalAvgFreight;
        return this;
    }

    public TotalProductCatalogPropertyValueQuery setGroupByCreatedDate(DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("createdDate", dateGroupBy);
        return this;
    }

    public Long[] getIncludeMods() {
        return this.includeMods;
    }

    public TotalProductCatalogPropertyValueQuery setIncludeMods(Long[] includeMods) {
        this.includeMods = includeMods;
        return this;
    }

    public Long[] getExcludeMods() {
        return this.excludeMods;
    }

    public TotalProductCatalogPropertyValueQuery setExcludeMods(Long[] excludeMods) {
        this.excludeMods = excludeMods;
        return this;
    }

    public TotalProductCatalogPropertyValueQuery setGroupByMods(java.lang.Long mods) {
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

}
