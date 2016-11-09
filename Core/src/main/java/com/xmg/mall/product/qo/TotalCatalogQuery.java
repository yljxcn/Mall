
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.DateGroupBy;
import com.xmg.mall.base.query.QueryCondition;

public class TotalCatalogQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.GroupBys groupBys = new com.xmg.mall.base.query.GroupBys();
    protected Long[] ids;
    protected Integer minTotalCountRows;
    protected Integer maxTotalCountRows;
    protected Boolean totalCountRows;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Integer level;
    protected String likeName;
    protected String name;
    protected String likeCode;
    protected String code;
    protected Long parentCatalogId;
    protected Boolean totalSumLevel;
    protected Boolean totalMaxLevel;
    protected Boolean totalMinLevel;
    protected Boolean totalAvgLevel;
    protected Integer maxTotalSumLevel;
    protected Integer minTotalSumLevel;
    protected Integer minTotalMinLevel;
    protected Integer maxTotalMinLevel;
    protected Integer minTotalMaxLevel;
    protected Integer maxTotalMaxLevel;
    protected Integer minTotalAvgLevel;
    protected Integer maxTotalAvgLevel;
    protected Boolean totalSumSequence;
    protected Boolean totalMaxSequence;
    protected Boolean totalMinSequence;
    protected Boolean totalAvgSequence;
    protected Integer maxTotalSumSequence;
    protected Integer minTotalSumSequence;
    protected Integer minTotalMinSequence;
    protected Integer maxTotalMinSequence;
    protected Integer minTotalMaxSequence;
    protected Integer maxTotalMaxSequence;
    protected Integer minTotalAvgSequence;
    protected Integer maxTotalAvgSequence;
    protected Boolean totalSumChildrenCatalogs;
    protected Boolean totalMaxChildrenCatalogs;
    protected Boolean totalMinChildrenCatalogs;
    protected Boolean totalAvgChildrenCatalogs;
    protected Integer maxTotalSumChildrenCatalogs;
    protected Integer minTotalSumChildrenCatalogs;
    protected Integer minTotalMinChildrenCatalogs;
    protected Integer maxTotalMinChildrenCatalogs;
    protected Integer minTotalMaxChildrenCatalogs;
    protected Integer maxTotalMaxChildrenCatalogs;
    protected Integer minTotalAvgChildrenCatalogs;
    protected Integer maxTotalAvgChildrenCatalogs;
    protected Boolean totalSumProducts;
    protected Boolean totalMaxProducts;
    protected Boolean totalMinProducts;
    protected Boolean totalAvgProducts;
    protected Integer maxTotalSumProducts;
    protected Integer minTotalSumProducts;
    protected Integer minTotalMinProducts;
    protected Integer maxTotalMinProducts;
    protected Integer minTotalMaxProducts;
    protected Integer maxTotalMaxProducts;
    protected Integer minTotalAvgProducts;
    protected Integer maxTotalAvgProducts;
    protected com.xmg.mall.base.query.JoinType joinParentCatalog;
    protected CatalogQuery parentCatalogQuery;

    public com.xmg.mall.base.query.GroupBys getGroupBys() {
        return this.groupBys;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public TotalCatalogQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Integer getMinTotalCountRows() {
        return this.minTotalCountRows;
    }

    public TotalCatalogQuery setMinTotalCountRows(Integer minTotalCountRows) {
        this.minTotalCountRows = minTotalCountRows;
        return this;
    }

    public Integer getMaxTotalCountRows() {
        return this.maxTotalCountRows;
    }

    public TotalCatalogQuery setMaxTotalCountRows(Integer maxTotalCountRows) {
        this.maxTotalCountRows = maxTotalCountRows;
        return this;
    }

    public Boolean getTotalCountRows() {
        return this.totalCountRows;
    }

    public TotalCatalogQuery setTotalCountRows(Boolean totalCountRows) {
        this.totalCountRows = totalCountRows;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public TotalCatalogQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public TotalCatalogQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public void setOrderByCreatedDate(int keyword) {
        setOrderBy("createdDate", keyword);
    }

    public int getOrderByCreatedDate() {
        return getOrderByKeyword("createdDate");
    }

    public Integer getLevel() {
        return this.level;
    }

    public TotalCatalogQuery setLevel(Integer level) {
        this.level = level;
        return this;
    }

    public String getLikeName() {
        return this.likeName;
    }

    public TotalCatalogQuery setLikeName(String likeName) {
        this.likeName = likeName;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public TotalCatalogQuery setName(String name) {
        this.name = name;
        return this;
    }

    public String getLikeCode() {
        return this.likeCode;
    }

    public TotalCatalogQuery setLikeCode(String likeCode) {
        this.likeCode = likeCode;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public TotalCatalogQuery setCode(String code) {
        this.code = code;
        return this;
    }

    public void setOrderBySequence(int keyword) {
        setOrderBy("sequence", keyword);
    }

    public int getOrderBySequence() {
        return getOrderByKeyword("sequence");
    }

    public void setOrderByChildrenCatalogs(int keyword) {
        setOrderBy("childrenCatalogs", keyword);
    }

    public int getOrderByChildrenCatalogs() {
        return getOrderByKeyword("childrenCatalogs");
    }

    public void setOrderByProducts(int keyword) {
        setOrderBy("products", keyword);
    }

    public int getOrderByProducts() {
        return getOrderByKeyword("products");
    }

    public Long getParentCatalogId() {
        return this.parentCatalogId;
    }

    public TotalCatalogQuery setParentCatalogId(Long parentCatalogId) {
        this.parentCatalogId = parentCatalogId;
        return this;
    }

    public Boolean getTotalSumLevel() {
        return this.totalSumLevel;
    }

    public TotalCatalogQuery setTotalSumLevel(Boolean totalSumLevel) {
        this.totalSumLevel = totalSumLevel;
        return this;
    }

    public Boolean getTotalMaxLevel() {
        return this.totalMaxLevel;
    }

    public TotalCatalogQuery setTotalMaxLevel(Boolean totalMaxLevel) {
        this.totalMaxLevel = totalMaxLevel;
        return this;
    }

    public Boolean getTotalMinLevel() {
        return this.totalMinLevel;
    }

    public TotalCatalogQuery setTotalMinLevel(Boolean totalMinLevel) {
        this.totalMinLevel = totalMinLevel;
        return this;
    }

    public Boolean getTotalAvgLevel() {
        return this.totalAvgLevel;
    }

    public TotalCatalogQuery setTotalAvgLevel(Boolean totalAvgLevel) {
        this.totalAvgLevel = totalAvgLevel;
        return this;
    }

    public Integer getMaxTotalSumLevel() {
        return this.maxTotalSumLevel;
    }

    public TotalCatalogQuery setMaxTotalSumLevel(Integer maxTotalSumLevel) {
        this.maxTotalSumLevel = maxTotalSumLevel;
        return this;
    }

    public Integer getMinTotalSumLevel() {
        return this.minTotalSumLevel;
    }

    public TotalCatalogQuery setMinTotalSumLevel(Integer minTotalSumLevel) {
        this.minTotalSumLevel = minTotalSumLevel;
        return this;
    }

    public Integer getMinTotalMinLevel() {
        return this.minTotalMinLevel;
    }

    public TotalCatalogQuery setMinTotalMinLevel(Integer minTotalMinLevel) {
        this.minTotalMinLevel = minTotalMinLevel;
        return this;
    }

    public Integer getMaxTotalMinLevel() {
        return this.maxTotalMinLevel;
    }

    public TotalCatalogQuery setMaxTotalMinLevel(Integer maxTotalMinLevel) {
        this.maxTotalMinLevel = maxTotalMinLevel;
        return this;
    }

    public Integer getMinTotalMaxLevel() {
        return this.minTotalMaxLevel;
    }

    public TotalCatalogQuery setMinTotalMaxLevel(Integer minTotalMaxLevel) {
        this.minTotalMaxLevel = minTotalMaxLevel;
        return this;
    }

    public Integer getMaxTotalMaxLevel() {
        return this.maxTotalMaxLevel;
    }

    public TotalCatalogQuery setMaxTotalMaxLevel(Integer maxTotalMaxLevel) {
        this.maxTotalMaxLevel = maxTotalMaxLevel;
        return this;
    }

    public Integer getMinTotalAvgLevel() {
        return this.minTotalAvgLevel;
    }

    public TotalCatalogQuery setMinTotalAvgLevel(Integer minTotalAvgLevel) {
        this.minTotalAvgLevel = minTotalAvgLevel;
        return this;
    }

    public Integer getMaxTotalAvgLevel() {
        return this.maxTotalAvgLevel;
    }

    public TotalCatalogQuery setMaxTotalAvgLevel(Integer maxTotalAvgLevel) {
        this.maxTotalAvgLevel = maxTotalAvgLevel;
        return this;
    }

    public Boolean getTotalSumSequence() {
        return this.totalSumSequence;
    }

    public TotalCatalogQuery setTotalSumSequence(Boolean totalSumSequence) {
        this.totalSumSequence = totalSumSequence;
        return this;
    }

    public Boolean getTotalMaxSequence() {
        return this.totalMaxSequence;
    }

    public TotalCatalogQuery setTotalMaxSequence(Boolean totalMaxSequence) {
        this.totalMaxSequence = totalMaxSequence;
        return this;
    }

    public Boolean getTotalMinSequence() {
        return this.totalMinSequence;
    }

    public TotalCatalogQuery setTotalMinSequence(Boolean totalMinSequence) {
        this.totalMinSequence = totalMinSequence;
        return this;
    }

    public Boolean getTotalAvgSequence() {
        return this.totalAvgSequence;
    }

    public TotalCatalogQuery setTotalAvgSequence(Boolean totalAvgSequence) {
        this.totalAvgSequence = totalAvgSequence;
        return this;
    }

    public Integer getMaxTotalSumSequence() {
        return this.maxTotalSumSequence;
    }

    public TotalCatalogQuery setMaxTotalSumSequence(Integer maxTotalSumSequence) {
        this.maxTotalSumSequence = maxTotalSumSequence;
        return this;
    }

    public Integer getMinTotalSumSequence() {
        return this.minTotalSumSequence;
    }

    public TotalCatalogQuery setMinTotalSumSequence(Integer minTotalSumSequence) {
        this.minTotalSumSequence = minTotalSumSequence;
        return this;
    }

    public Integer getMinTotalMinSequence() {
        return this.minTotalMinSequence;
    }

    public TotalCatalogQuery setMinTotalMinSequence(Integer minTotalMinSequence) {
        this.minTotalMinSequence = minTotalMinSequence;
        return this;
    }

    public Integer getMaxTotalMinSequence() {
        return this.maxTotalMinSequence;
    }

    public TotalCatalogQuery setMaxTotalMinSequence(Integer maxTotalMinSequence) {
        this.maxTotalMinSequence = maxTotalMinSequence;
        return this;
    }

    public Integer getMinTotalMaxSequence() {
        return this.minTotalMaxSequence;
    }

    public TotalCatalogQuery setMinTotalMaxSequence(Integer minTotalMaxSequence) {
        this.minTotalMaxSequence = minTotalMaxSequence;
        return this;
    }

    public Integer getMaxTotalMaxSequence() {
        return this.maxTotalMaxSequence;
    }

    public TotalCatalogQuery setMaxTotalMaxSequence(Integer maxTotalMaxSequence) {
        this.maxTotalMaxSequence = maxTotalMaxSequence;
        return this;
    }

    public Integer getMinTotalAvgSequence() {
        return this.minTotalAvgSequence;
    }

    public TotalCatalogQuery setMinTotalAvgSequence(Integer minTotalAvgSequence) {
        this.minTotalAvgSequence = minTotalAvgSequence;
        return this;
    }

    public Integer getMaxTotalAvgSequence() {
        return this.maxTotalAvgSequence;
    }

    public TotalCatalogQuery setMaxTotalAvgSequence(Integer maxTotalAvgSequence) {
        this.maxTotalAvgSequence = maxTotalAvgSequence;
        return this;
    }

    public Boolean getTotalSumChildrenCatalogs() {
        return this.totalSumChildrenCatalogs;
    }

    public TotalCatalogQuery setTotalSumChildrenCatalogs(Boolean totalSumChildrenCatalogs) {
        this.totalSumChildrenCatalogs = totalSumChildrenCatalogs;
        return this;
    }

    public Boolean getTotalMaxChildrenCatalogs() {
        return this.totalMaxChildrenCatalogs;
    }

    public TotalCatalogQuery setTotalMaxChildrenCatalogs(Boolean totalMaxChildrenCatalogs) {
        this.totalMaxChildrenCatalogs = totalMaxChildrenCatalogs;
        return this;
    }

    public Boolean getTotalMinChildrenCatalogs() {
        return this.totalMinChildrenCatalogs;
    }

    public TotalCatalogQuery setTotalMinChildrenCatalogs(Boolean totalMinChildrenCatalogs) {
        this.totalMinChildrenCatalogs = totalMinChildrenCatalogs;
        return this;
    }

    public Boolean getTotalAvgChildrenCatalogs() {
        return this.totalAvgChildrenCatalogs;
    }

    public TotalCatalogQuery setTotalAvgChildrenCatalogs(Boolean totalAvgChildrenCatalogs) {
        this.totalAvgChildrenCatalogs = totalAvgChildrenCatalogs;
        return this;
    }

    public Integer getMaxTotalSumChildrenCatalogs() {
        return this.maxTotalSumChildrenCatalogs;
    }

    public TotalCatalogQuery setMaxTotalSumChildrenCatalogs(Integer maxTotalSumChildrenCatalogs) {
        this.maxTotalSumChildrenCatalogs = maxTotalSumChildrenCatalogs;
        return this;
    }

    public Integer getMinTotalSumChildrenCatalogs() {
        return this.minTotalSumChildrenCatalogs;
    }

    public TotalCatalogQuery setMinTotalSumChildrenCatalogs(Integer minTotalSumChildrenCatalogs) {
        this.minTotalSumChildrenCatalogs = minTotalSumChildrenCatalogs;
        return this;
    }

    public Integer getMinTotalMinChildrenCatalogs() {
        return this.minTotalMinChildrenCatalogs;
    }

    public TotalCatalogQuery setMinTotalMinChildrenCatalogs(Integer minTotalMinChildrenCatalogs) {
        this.minTotalMinChildrenCatalogs = minTotalMinChildrenCatalogs;
        return this;
    }

    public Integer getMaxTotalMinChildrenCatalogs() {
        return this.maxTotalMinChildrenCatalogs;
    }

    public TotalCatalogQuery setMaxTotalMinChildrenCatalogs(Integer maxTotalMinChildrenCatalogs) {
        this.maxTotalMinChildrenCatalogs = maxTotalMinChildrenCatalogs;
        return this;
    }

    public Integer getMinTotalMaxChildrenCatalogs() {
        return this.minTotalMaxChildrenCatalogs;
    }

    public TotalCatalogQuery setMinTotalMaxChildrenCatalogs(Integer minTotalMaxChildrenCatalogs) {
        this.minTotalMaxChildrenCatalogs = minTotalMaxChildrenCatalogs;
        return this;
    }

    public Integer getMaxTotalMaxChildrenCatalogs() {
        return this.maxTotalMaxChildrenCatalogs;
    }

    public TotalCatalogQuery setMaxTotalMaxChildrenCatalogs(Integer maxTotalMaxChildrenCatalogs) {
        this.maxTotalMaxChildrenCatalogs = maxTotalMaxChildrenCatalogs;
        return this;
    }

    public Integer getMinTotalAvgChildrenCatalogs() {
        return this.minTotalAvgChildrenCatalogs;
    }

    public TotalCatalogQuery setMinTotalAvgChildrenCatalogs(Integer minTotalAvgChildrenCatalogs) {
        this.minTotalAvgChildrenCatalogs = minTotalAvgChildrenCatalogs;
        return this;
    }

    public Integer getMaxTotalAvgChildrenCatalogs() {
        return this.maxTotalAvgChildrenCatalogs;
    }

    public TotalCatalogQuery setMaxTotalAvgChildrenCatalogs(Integer maxTotalAvgChildrenCatalogs) {
        this.maxTotalAvgChildrenCatalogs = maxTotalAvgChildrenCatalogs;
        return this;
    }

    public Boolean getTotalSumProducts() {
        return this.totalSumProducts;
    }

    public TotalCatalogQuery setTotalSumProducts(Boolean totalSumProducts) {
        this.totalSumProducts = totalSumProducts;
        return this;
    }

    public Boolean getTotalMaxProducts() {
        return this.totalMaxProducts;
    }

    public TotalCatalogQuery setTotalMaxProducts(Boolean totalMaxProducts) {
        this.totalMaxProducts = totalMaxProducts;
        return this;
    }

    public Boolean getTotalMinProducts() {
        return this.totalMinProducts;
    }

    public TotalCatalogQuery setTotalMinProducts(Boolean totalMinProducts) {
        this.totalMinProducts = totalMinProducts;
        return this;
    }

    public Boolean getTotalAvgProducts() {
        return this.totalAvgProducts;
    }

    public TotalCatalogQuery setTotalAvgProducts(Boolean totalAvgProducts) {
        this.totalAvgProducts = totalAvgProducts;
        return this;
    }

    public Integer getMaxTotalSumProducts() {
        return this.maxTotalSumProducts;
    }

    public TotalCatalogQuery setMaxTotalSumProducts(Integer maxTotalSumProducts) {
        this.maxTotalSumProducts = maxTotalSumProducts;
        return this;
    }

    public Integer getMinTotalSumProducts() {
        return this.minTotalSumProducts;
    }

    public TotalCatalogQuery setMinTotalSumProducts(Integer minTotalSumProducts) {
        this.minTotalSumProducts = minTotalSumProducts;
        return this;
    }

    public Integer getMinTotalMinProducts() {
        return this.minTotalMinProducts;
    }

    public TotalCatalogQuery setMinTotalMinProducts(Integer minTotalMinProducts) {
        this.minTotalMinProducts = minTotalMinProducts;
        return this;
    }

    public Integer getMaxTotalMinProducts() {
        return this.maxTotalMinProducts;
    }

    public TotalCatalogQuery setMaxTotalMinProducts(Integer maxTotalMinProducts) {
        this.maxTotalMinProducts = maxTotalMinProducts;
        return this;
    }

    public Integer getMinTotalMaxProducts() {
        return this.minTotalMaxProducts;
    }

    public TotalCatalogQuery setMinTotalMaxProducts(Integer minTotalMaxProducts) {
        this.minTotalMaxProducts = minTotalMaxProducts;
        return this;
    }

    public Integer getMaxTotalMaxProducts() {
        return this.maxTotalMaxProducts;
    }

    public TotalCatalogQuery setMaxTotalMaxProducts(Integer maxTotalMaxProducts) {
        this.maxTotalMaxProducts = maxTotalMaxProducts;
        return this;
    }

    public Integer getMinTotalAvgProducts() {
        return this.minTotalAvgProducts;
    }

    public TotalCatalogQuery setMinTotalAvgProducts(Integer minTotalAvgProducts) {
        this.minTotalAvgProducts = minTotalAvgProducts;
        return this;
    }

    public Integer getMaxTotalAvgProducts() {
        return this.maxTotalAvgProducts;
    }

    public TotalCatalogQuery setMaxTotalAvgProducts(Integer maxTotalAvgProducts) {
        this.maxTotalAvgProducts = maxTotalAvgProducts;
        return this;
    }

    public TotalCatalogQuery setGroupByCreatedDate(DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("createdDate", dateGroupBy);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinParentCatalog() {
        return this.joinParentCatalog;
    }

    public TotalCatalogQuery setJoinParentCatalog(com.xmg.mall.base.query.JoinType joinParentCatalog) {
        this.joinParentCatalog = joinParentCatalog;
        return this;
    }

    public CatalogQuery getParentCatalogQuery() {
        return this.parentCatalogQuery;
    }

    public TotalCatalogQuery setParentCatalogQuery(CatalogQuery parentCatalogQuery) {
        this.parentCatalogQuery = parentCatalogQuery;
        return this;
    }

    public TotalCatalogQuery setJoinParentCatalog() {
        this.setJoinParentCatalog(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

}
