
package com.xmg.mall.product.qo;

import java.math.BigDecimal;
import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;

public class ProductQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.JoinType joinCatalog;
    protected CatalogQuery catalogQuery;
    protected com.xmg.mall.base.query.JoinType joinBrand;
    protected BrandQuery brandQuery;
    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long catalogId;
    protected Long brandId;
    protected String name;
    protected String likeName;
    protected String keyword;
    protected String likeKeyword;
    protected String code;
    protected String likeCode;
    protected BigDecimal marketPrice;
    protected BigDecimal minMarketPrice;
    protected BigDecimal maxMarketPrice;
    protected BigDecimal basePrice;
    protected BigDecimal minBasePrice;
    protected BigDecimal maxBasePrice;
    protected Long[] includeMods;
    protected Long[] excludeMods;

    public boolean hasIds() {
        return (this.ids.length!= 0);
    }

    public com.xmg.mall.base.query.JoinType getJoinCatalog() {
        return this.joinCatalog;
    }

    public ProductQuery setJoinCatalog(com.xmg.mall.base.query.JoinType joinCatalog) {
        this.joinCatalog = joinCatalog;
        return this;
    }

    public CatalogQuery getCatalogQuery() {
        return this.catalogQuery;
    }

    public ProductQuery setCatalogQuery(CatalogQuery catalogQuery) {
        this.catalogQuery = catalogQuery;
        return this;
    }

    public ProductQuery setJoinCatalog() {
        this.setJoinCatalog(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinBrand() {
        return this.joinBrand;
    }

    public ProductQuery setJoinBrand(com.xmg.mall.base.query.JoinType joinBrand) {
        this.joinBrand = joinBrand;
        return this;
    }

    public BrandQuery getBrandQuery() {
        return this.brandQuery;
    }

    public ProductQuery setBrandQuery(BrandQuery brandQuery) {
        this.brandQuery = brandQuery;
        return this;
    }

    public ProductQuery setJoinBrand() {
        this.setJoinBrand(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public ProductQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public ProductQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public ProductQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public Long getCatalogId() {
        return this.catalogId;
    }

    public ProductQuery setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    public Long getBrandId() {
        return this.brandId;
    }

    public ProductQuery setBrandId(Long brandId) {
        this.brandId = brandId;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ProductQuery setName(String name) {
        this.name = name;
        return this;
    }

    public String getLikeName() {
        return this.likeName;
    }

    public ProductQuery setLikeName(String likeName) {
        this.likeName = likeName;
        return this;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public ProductQuery setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public String getLikeKeyword() {
        return this.likeKeyword;
    }

    public ProductQuery setLikeKeyword(String likeKeyword) {
        this.likeKeyword = likeKeyword;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public ProductQuery setCode(String code) {
        this.code = code;
        return this;
    }

    public String getLikeCode() {
        return this.likeCode;
    }

    public ProductQuery setLikeCode(String likeCode) {
        this.likeCode = likeCode;
        return this;
    }

    public BigDecimal getMarketPrice() {
        return this.marketPrice;
    }

    public ProductQuery setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
        return this;
    }

    public BigDecimal getMinMarketPrice() {
        return this.minMarketPrice;
    }

    public ProductQuery setMinMarketPrice(BigDecimal minMarketPrice) {
        this.minMarketPrice = minMarketPrice;
        return this;
    }

    public BigDecimal getMaxMarketPrice() {
        return this.maxMarketPrice;
    }

    public ProductQuery setMaxMarketPrice(BigDecimal maxMarketPrice) {
        this.maxMarketPrice = maxMarketPrice;
        return this;
    }

    public BigDecimal getBasePrice() {
        return this.basePrice;
    }

    public ProductQuery setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
        return this;
    }

    public BigDecimal getMinBasePrice() {
        return this.minBasePrice;
    }

    public ProductQuery setMinBasePrice(BigDecimal minBasePrice) {
        this.minBasePrice = minBasePrice;
        return this;
    }

    public BigDecimal getMaxBasePrice() {
        return this.maxBasePrice;
    }

    public ProductQuery setMaxBasePrice(BigDecimal maxBasePrice) {
        this.maxBasePrice = maxBasePrice;
        return this;
    }

    public Long[] getIncludeMods() {
        return this.includeMods;
    }

    public ProductQuery setIncludeMods(Long[] includeMods) {
        this.includeMods = includeMods;
        return this;
    }

    public Long[] getExcludeMods() {
        return this.excludeMods;
    }

    public ProductQuery setExcludeMods(Long[] excludeMods) {
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

    public void setOrderByMarketPrice(int keyword) {
        setOrderBy("marketPrice", keyword);
    }

    public int getOrderByMarketPrice() {
        return getOrderByKeyword("marketPrice");
    }

    public void setOrderByBasePrice(int keyword) {
        setOrderBy("basePrice", keyword);
    }

    public int getOrderByBasePrice() {
        return getOrderByKeyword("basePrice");
    }

}
