
package com.xmg.mall.product.qo;

import java.math.BigDecimal;
import java.util.Date;
import com.xmg.mall.base.query.DateGroupBy;
import com.xmg.mall.base.query.QueryCondition;

public class TotalProductQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.GroupBys groupBys = new com.xmg.mall.base.query.GroupBys();
    protected Long[] ids;
    protected Integer minTotalCountRows;
    protected Integer maxTotalCountRows;
    protected Boolean totalCountRows;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long catalogId;
    protected Long brandId;
    protected String likeName;
    protected String name;
    protected String likeKeyword;
    protected String keyword;
    protected String likeCode;
    protected String code;
    protected BigDecimal minMarketPrice;
    protected BigDecimal maxMarketPrice;
    protected BigDecimal marketPrice;
    protected BigDecimal minBasePrice;
    protected BigDecimal maxBasePrice;
    protected BigDecimal basePrice;
    protected Boolean totalSumMarketPrice;
    protected Boolean totalMaxMarketPrice;
    protected Boolean totalMinMarketPrice;
    protected Boolean totalAvgMarketPrice;
    protected BigDecimal maxTotalSumMarketPrice;
    protected BigDecimal minTotalSumMarketPrice;
    protected BigDecimal minTotalMinMarketPrice;
    protected BigDecimal maxTotalMinMarketPrice;
    protected BigDecimal minTotalMaxMarketPrice;
    protected BigDecimal maxTotalMaxMarketPrice;
    protected BigDecimal minTotalAvgMarketPrice;
    protected BigDecimal maxTotalAvgMarketPrice;
    protected Boolean totalSumBasePrice;
    protected Boolean totalMaxBasePrice;
    protected Boolean totalMinBasePrice;
    protected Boolean totalAvgBasePrice;
    protected BigDecimal maxTotalSumBasePrice;
    protected BigDecimal minTotalSumBasePrice;
    protected BigDecimal minTotalMinBasePrice;
    protected BigDecimal maxTotalMinBasePrice;
    protected BigDecimal minTotalMaxBasePrice;
    protected BigDecimal maxTotalMaxBasePrice;
    protected BigDecimal minTotalAvgBasePrice;
    protected BigDecimal maxTotalAvgBasePrice;
    protected Long[] includeMods;
    protected Long[] excludeMods;
    protected com.xmg.mall.base.query.JoinType joinCatalog;
    protected CatalogQuery catalogQuery;
    protected com.xmg.mall.base.query.JoinType joinBrand;
    protected BrandQuery brandQuery;

    public com.xmg.mall.base.query.GroupBys getGroupBys() {
        return this.groupBys;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public TotalProductQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Integer getMinTotalCountRows() {
        return this.minTotalCountRows;
    }

    public TotalProductQuery setMinTotalCountRows(Integer minTotalCountRows) {
        this.minTotalCountRows = minTotalCountRows;
        return this;
    }

    public Integer getMaxTotalCountRows() {
        return this.maxTotalCountRows;
    }

    public TotalProductQuery setMaxTotalCountRows(Integer maxTotalCountRows) {
        this.maxTotalCountRows = maxTotalCountRows;
        return this;
    }

    public Boolean getTotalCountRows() {
        return this.totalCountRows;
    }

    public TotalProductQuery setTotalCountRows(Boolean totalCountRows) {
        this.totalCountRows = totalCountRows;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public TotalProductQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public TotalProductQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public void setOrderByCreatedDate(int keyword) {
        setOrderBy("createdDate", keyword);
    }

    public int getOrderByCreatedDate() {
        return getOrderByKeyword("createdDate");
    }

    public Long getCatalogId() {
        return this.catalogId;
    }

    public TotalProductQuery setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    public Long getBrandId() {
        return this.brandId;
    }

    public TotalProductQuery setBrandId(Long brandId) {
        this.brandId = brandId;
        return this;
    }

    public String getLikeName() {
        return this.likeName;
    }

    public TotalProductQuery setLikeName(String likeName) {
        this.likeName = likeName;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public TotalProductQuery setName(String name) {
        this.name = name;
        return this;
    }

    public String getLikeKeyword() {
        return this.likeKeyword;
    }

    public TotalProductQuery setLikeKeyword(String likeKeyword) {
        this.likeKeyword = likeKeyword;
        return this;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public TotalProductQuery setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public String getLikeCode() {
        return this.likeCode;
    }

    public TotalProductQuery setLikeCode(String likeCode) {
        this.likeCode = likeCode;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public TotalProductQuery setCode(String code) {
        this.code = code;
        return this;
    }

    public BigDecimal getMinMarketPrice() {
        return this.minMarketPrice;
    }

    public TotalProductQuery setMinMarketPrice(BigDecimal minMarketPrice) {
        this.minMarketPrice = minMarketPrice;
        return this;
    }

    public BigDecimal getMaxMarketPrice() {
        return this.maxMarketPrice;
    }

    public TotalProductQuery setMaxMarketPrice(BigDecimal maxMarketPrice) {
        this.maxMarketPrice = maxMarketPrice;
        return this;
    }

    public BigDecimal getMarketPrice() {
        return this.marketPrice;
    }

    public TotalProductQuery setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
        return this;
    }

    public void setOrderByMarketPrice(int keyword) {
        setOrderBy("marketPrice", keyword);
    }

    public int getOrderByMarketPrice() {
        return getOrderByKeyword("marketPrice");
    }

    public BigDecimal getMinBasePrice() {
        return this.minBasePrice;
    }

    public TotalProductQuery setMinBasePrice(BigDecimal minBasePrice) {
        this.minBasePrice = minBasePrice;
        return this;
    }

    public BigDecimal getMaxBasePrice() {
        return this.maxBasePrice;
    }

    public TotalProductQuery setMaxBasePrice(BigDecimal maxBasePrice) {
        this.maxBasePrice = maxBasePrice;
        return this;
    }

    public BigDecimal getBasePrice() {
        return this.basePrice;
    }

    public TotalProductQuery setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
        return this;
    }

    public void setOrderByBasePrice(int keyword) {
        setOrderBy("basePrice", keyword);
    }

    public int getOrderByBasePrice() {
        return getOrderByKeyword("basePrice");
    }

    public Boolean getTotalSumMarketPrice() {
        return this.totalSumMarketPrice;
    }

    public TotalProductQuery setTotalSumMarketPrice(Boolean totalSumMarketPrice) {
        this.totalSumMarketPrice = totalSumMarketPrice;
        return this;
    }

    public Boolean getTotalMaxMarketPrice() {
        return this.totalMaxMarketPrice;
    }

    public TotalProductQuery setTotalMaxMarketPrice(Boolean totalMaxMarketPrice) {
        this.totalMaxMarketPrice = totalMaxMarketPrice;
        return this;
    }

    public Boolean getTotalMinMarketPrice() {
        return this.totalMinMarketPrice;
    }

    public TotalProductQuery setTotalMinMarketPrice(Boolean totalMinMarketPrice) {
        this.totalMinMarketPrice = totalMinMarketPrice;
        return this;
    }

    public Boolean getTotalAvgMarketPrice() {
        return this.totalAvgMarketPrice;
    }

    public TotalProductQuery setTotalAvgMarketPrice(Boolean totalAvgMarketPrice) {
        this.totalAvgMarketPrice = totalAvgMarketPrice;
        return this;
    }

    public BigDecimal getMaxTotalSumMarketPrice() {
        return this.maxTotalSumMarketPrice;
    }

    public TotalProductQuery setMaxTotalSumMarketPrice(BigDecimal maxTotalSumMarketPrice) {
        this.maxTotalSumMarketPrice = maxTotalSumMarketPrice;
        return this;
    }

    public BigDecimal getMinTotalSumMarketPrice() {
        return this.minTotalSumMarketPrice;
    }

    public TotalProductQuery setMinTotalSumMarketPrice(BigDecimal minTotalSumMarketPrice) {
        this.minTotalSumMarketPrice = minTotalSumMarketPrice;
        return this;
    }

    public BigDecimal getMinTotalMinMarketPrice() {
        return this.minTotalMinMarketPrice;
    }

    public TotalProductQuery setMinTotalMinMarketPrice(BigDecimal minTotalMinMarketPrice) {
        this.minTotalMinMarketPrice = minTotalMinMarketPrice;
        return this;
    }

    public BigDecimal getMaxTotalMinMarketPrice() {
        return this.maxTotalMinMarketPrice;
    }

    public TotalProductQuery setMaxTotalMinMarketPrice(BigDecimal maxTotalMinMarketPrice) {
        this.maxTotalMinMarketPrice = maxTotalMinMarketPrice;
        return this;
    }

    public BigDecimal getMinTotalMaxMarketPrice() {
        return this.minTotalMaxMarketPrice;
    }

    public TotalProductQuery setMinTotalMaxMarketPrice(BigDecimal minTotalMaxMarketPrice) {
        this.minTotalMaxMarketPrice = minTotalMaxMarketPrice;
        return this;
    }

    public BigDecimal getMaxTotalMaxMarketPrice() {
        return this.maxTotalMaxMarketPrice;
    }

    public TotalProductQuery setMaxTotalMaxMarketPrice(BigDecimal maxTotalMaxMarketPrice) {
        this.maxTotalMaxMarketPrice = maxTotalMaxMarketPrice;
        return this;
    }

    public BigDecimal getMinTotalAvgMarketPrice() {
        return this.minTotalAvgMarketPrice;
    }

    public TotalProductQuery setMinTotalAvgMarketPrice(BigDecimal minTotalAvgMarketPrice) {
        this.minTotalAvgMarketPrice = minTotalAvgMarketPrice;
        return this;
    }

    public BigDecimal getMaxTotalAvgMarketPrice() {
        return this.maxTotalAvgMarketPrice;
    }

    public TotalProductQuery setMaxTotalAvgMarketPrice(BigDecimal maxTotalAvgMarketPrice) {
        this.maxTotalAvgMarketPrice = maxTotalAvgMarketPrice;
        return this;
    }

    public Boolean getTotalSumBasePrice() {
        return this.totalSumBasePrice;
    }

    public TotalProductQuery setTotalSumBasePrice(Boolean totalSumBasePrice) {
        this.totalSumBasePrice = totalSumBasePrice;
        return this;
    }

    public Boolean getTotalMaxBasePrice() {
        return this.totalMaxBasePrice;
    }

    public TotalProductQuery setTotalMaxBasePrice(Boolean totalMaxBasePrice) {
        this.totalMaxBasePrice = totalMaxBasePrice;
        return this;
    }

    public Boolean getTotalMinBasePrice() {
        return this.totalMinBasePrice;
    }

    public TotalProductQuery setTotalMinBasePrice(Boolean totalMinBasePrice) {
        this.totalMinBasePrice = totalMinBasePrice;
        return this;
    }

    public Boolean getTotalAvgBasePrice() {
        return this.totalAvgBasePrice;
    }

    public TotalProductQuery setTotalAvgBasePrice(Boolean totalAvgBasePrice) {
        this.totalAvgBasePrice = totalAvgBasePrice;
        return this;
    }

    public BigDecimal getMaxTotalSumBasePrice() {
        return this.maxTotalSumBasePrice;
    }

    public TotalProductQuery setMaxTotalSumBasePrice(BigDecimal maxTotalSumBasePrice) {
        this.maxTotalSumBasePrice = maxTotalSumBasePrice;
        return this;
    }

    public BigDecimal getMinTotalSumBasePrice() {
        return this.minTotalSumBasePrice;
    }

    public TotalProductQuery setMinTotalSumBasePrice(BigDecimal minTotalSumBasePrice) {
        this.minTotalSumBasePrice = minTotalSumBasePrice;
        return this;
    }

    public BigDecimal getMinTotalMinBasePrice() {
        return this.minTotalMinBasePrice;
    }

    public TotalProductQuery setMinTotalMinBasePrice(BigDecimal minTotalMinBasePrice) {
        this.minTotalMinBasePrice = minTotalMinBasePrice;
        return this;
    }

    public BigDecimal getMaxTotalMinBasePrice() {
        return this.maxTotalMinBasePrice;
    }

    public TotalProductQuery setMaxTotalMinBasePrice(BigDecimal maxTotalMinBasePrice) {
        this.maxTotalMinBasePrice = maxTotalMinBasePrice;
        return this;
    }

    public BigDecimal getMinTotalMaxBasePrice() {
        return this.minTotalMaxBasePrice;
    }

    public TotalProductQuery setMinTotalMaxBasePrice(BigDecimal minTotalMaxBasePrice) {
        this.minTotalMaxBasePrice = minTotalMaxBasePrice;
        return this;
    }

    public BigDecimal getMaxTotalMaxBasePrice() {
        return this.maxTotalMaxBasePrice;
    }

    public TotalProductQuery setMaxTotalMaxBasePrice(BigDecimal maxTotalMaxBasePrice) {
        this.maxTotalMaxBasePrice = maxTotalMaxBasePrice;
        return this;
    }

    public BigDecimal getMinTotalAvgBasePrice() {
        return this.minTotalAvgBasePrice;
    }

    public TotalProductQuery setMinTotalAvgBasePrice(BigDecimal minTotalAvgBasePrice) {
        this.minTotalAvgBasePrice = minTotalAvgBasePrice;
        return this;
    }

    public BigDecimal getMaxTotalAvgBasePrice() {
        return this.maxTotalAvgBasePrice;
    }

    public TotalProductQuery setMaxTotalAvgBasePrice(BigDecimal maxTotalAvgBasePrice) {
        this.maxTotalAvgBasePrice = maxTotalAvgBasePrice;
        return this;
    }

    public TotalProductQuery setGroupByCreatedDate(DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("createdDate", dateGroupBy);
        return this;
    }

    public Long[] getIncludeMods() {
        return this.includeMods;
    }

    public TotalProductQuery setIncludeMods(Long[] includeMods) {
        this.includeMods = includeMods;
        return this;
    }

    public Long[] getExcludeMods() {
        return this.excludeMods;
    }

    public TotalProductQuery setExcludeMods(Long[] excludeMods) {
        this.excludeMods = excludeMods;
        return this;
    }

    public TotalProductQuery setGroupByMods(java.lang.Long mods) {
        if (mods!= null) {
            groupBys.addModsGroupBy("mods", mods);
        } else {
            groupBys.removeGroupBy("mods");
        }
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinCatalog() {
        return this.joinCatalog;
    }

    public TotalProductQuery setJoinCatalog(com.xmg.mall.base.query.JoinType joinCatalog) {
        this.joinCatalog = joinCatalog;
        return this;
    }

    public CatalogQuery getCatalogQuery() {
        return this.catalogQuery;
    }

    public TotalProductQuery setCatalogQuery(CatalogQuery catalogQuery) {
        this.catalogQuery = catalogQuery;
        return this;
    }

    public TotalProductQuery setJoinCatalog() {
        this.setJoinCatalog(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinBrand() {
        return this.joinBrand;
    }

    public TotalProductQuery setJoinBrand(com.xmg.mall.base.query.JoinType joinBrand) {
        this.joinBrand = joinBrand;
        return this;
    }

    public BrandQuery getBrandQuery() {
        return this.brandQuery;
    }

    public TotalProductQuery setBrandQuery(BrandQuery brandQuery) {
        this.brandQuery = brandQuery;
        return this;
    }

    public TotalProductQuery setJoinBrand() {
        this.setJoinBrand(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

}
