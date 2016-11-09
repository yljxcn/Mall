
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.DateGroupBy;
import com.xmg.mall.base.query.QueryCondition;

public class TotalCatalogPropertyQuery
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
    protected String likeName;
    protected String name;
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
    protected Integer[] includeTypes;
    protected Integer[] excludeTypes;
    protected com.xmg.mall.base.query.JoinType joinCatalog;
    protected CatalogQuery catalogQuery;

    public com.xmg.mall.base.query.GroupBys getGroupBys() {
        return this.groupBys;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public TotalCatalogPropertyQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Integer getMinTotalCountRows() {
        return this.minTotalCountRows;
    }

    public TotalCatalogPropertyQuery setMinTotalCountRows(Integer minTotalCountRows) {
        this.minTotalCountRows = minTotalCountRows;
        return this;
    }

    public Integer getMaxTotalCountRows() {
        return this.maxTotalCountRows;
    }

    public TotalCatalogPropertyQuery setMaxTotalCountRows(Integer maxTotalCountRows) {
        this.maxTotalCountRows = maxTotalCountRows;
        return this;
    }

    public Boolean getTotalCountRows() {
        return this.totalCountRows;
    }

    public TotalCatalogPropertyQuery setTotalCountRows(Boolean totalCountRows) {
        this.totalCountRows = totalCountRows;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public TotalCatalogPropertyQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public TotalCatalogPropertyQuery setEndCreatedDate(Date endCreatedDate) {
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

    public TotalCatalogPropertyQuery setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    public String getLikeName() {
        return this.likeName;
    }

    public TotalCatalogPropertyQuery setLikeName(String likeName) {
        this.likeName = likeName;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public TotalCatalogPropertyQuery setName(String name) {
        this.name = name;
        return this;
    }

    public void setOrderBySequence(int keyword) {
        setOrderBy("sequence", keyword);
    }

    public int getOrderBySequence() {
        return getOrderByKeyword("sequence");
    }

    public Boolean getTotalSumSequence() {
        return this.totalSumSequence;
    }

    public TotalCatalogPropertyQuery setTotalSumSequence(Boolean totalSumSequence) {
        this.totalSumSequence = totalSumSequence;
        return this;
    }

    public Boolean getTotalMaxSequence() {
        return this.totalMaxSequence;
    }

    public TotalCatalogPropertyQuery setTotalMaxSequence(Boolean totalMaxSequence) {
        this.totalMaxSequence = totalMaxSequence;
        return this;
    }

    public Boolean getTotalMinSequence() {
        return this.totalMinSequence;
    }

    public TotalCatalogPropertyQuery setTotalMinSequence(Boolean totalMinSequence) {
        this.totalMinSequence = totalMinSequence;
        return this;
    }

    public Boolean getTotalAvgSequence() {
        return this.totalAvgSequence;
    }

    public TotalCatalogPropertyQuery setTotalAvgSequence(Boolean totalAvgSequence) {
        this.totalAvgSequence = totalAvgSequence;
        return this;
    }

    public Integer getMaxTotalSumSequence() {
        return this.maxTotalSumSequence;
    }

    public TotalCatalogPropertyQuery setMaxTotalSumSequence(Integer maxTotalSumSequence) {
        this.maxTotalSumSequence = maxTotalSumSequence;
        return this;
    }

    public Integer getMinTotalSumSequence() {
        return this.minTotalSumSequence;
    }

    public TotalCatalogPropertyQuery setMinTotalSumSequence(Integer minTotalSumSequence) {
        this.minTotalSumSequence = minTotalSumSequence;
        return this;
    }

    public Integer getMinTotalMinSequence() {
        return this.minTotalMinSequence;
    }

    public TotalCatalogPropertyQuery setMinTotalMinSequence(Integer minTotalMinSequence) {
        this.minTotalMinSequence = minTotalMinSequence;
        return this;
    }

    public Integer getMaxTotalMinSequence() {
        return this.maxTotalMinSequence;
    }

    public TotalCatalogPropertyQuery setMaxTotalMinSequence(Integer maxTotalMinSequence) {
        this.maxTotalMinSequence = maxTotalMinSequence;
        return this;
    }

    public Integer getMinTotalMaxSequence() {
        return this.minTotalMaxSequence;
    }

    public TotalCatalogPropertyQuery setMinTotalMaxSequence(Integer minTotalMaxSequence) {
        this.minTotalMaxSequence = minTotalMaxSequence;
        return this;
    }

    public Integer getMaxTotalMaxSequence() {
        return this.maxTotalMaxSequence;
    }

    public TotalCatalogPropertyQuery setMaxTotalMaxSequence(Integer maxTotalMaxSequence) {
        this.maxTotalMaxSequence = maxTotalMaxSequence;
        return this;
    }

    public Integer getMinTotalAvgSequence() {
        return this.minTotalAvgSequence;
    }

    public TotalCatalogPropertyQuery setMinTotalAvgSequence(Integer minTotalAvgSequence) {
        this.minTotalAvgSequence = minTotalAvgSequence;
        return this;
    }

    public Integer getMaxTotalAvgSequence() {
        return this.maxTotalAvgSequence;
    }

    public TotalCatalogPropertyQuery setMaxTotalAvgSequence(Integer maxTotalAvgSequence) {
        this.maxTotalAvgSequence = maxTotalAvgSequence;
        return this;
    }

    public TotalCatalogPropertyQuery setGroupByCreatedDate(DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("createdDate", dateGroupBy);
        return this;
    }

    public Integer[] getIncludeTypes() {
        return this.includeTypes;
    }

    public TotalCatalogPropertyQuery setIncludeTypes(Integer[] includeTypes) {
        this.includeTypes = includeTypes;
        return this;
    }

    public Integer[] getExcludeTypes() {
        return this.excludeTypes;
    }

    public TotalCatalogPropertyQuery setExcludeTypes(Integer[] excludeTypes) {
        this.excludeTypes = excludeTypes;
        return this;
    }

    public TotalCatalogPropertyQuery setGroupByType(Boolean groupBy) {
        if (groupBy) {
            groupBys.addGroupBy("type");
        } else {
            groupBys.removeGroupBy("type");
        }
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinCatalog() {
        return this.joinCatalog;
    }

    public TotalCatalogPropertyQuery setJoinCatalog(com.xmg.mall.base.query.JoinType joinCatalog) {
        this.joinCatalog = joinCatalog;
        return this;
    }

    public CatalogQuery getCatalogQuery() {
        return this.catalogQuery;
    }

    public TotalCatalogPropertyQuery setCatalogQuery(CatalogQuery catalogQuery) {
        this.catalogQuery = catalogQuery;
        return this;
    }

    public TotalCatalogPropertyQuery setJoinCatalog() {
        this.setJoinCatalog(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

}
