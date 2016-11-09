
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.DateGroupBy;
import com.xmg.mall.base.query.QueryCondition;

public class TotalCatalogPropertyValueQuery
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
    protected String likeValue;
    protected String value;
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
    protected com.xmg.mall.base.query.JoinType joinCatalog;
    protected CatalogPropertyQuery catalogQuery;

    public com.xmg.mall.base.query.GroupBys getGroupBys() {
        return this.groupBys;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public TotalCatalogPropertyValueQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Integer getMinTotalCountRows() {
        return this.minTotalCountRows;
    }

    public TotalCatalogPropertyValueQuery setMinTotalCountRows(Integer minTotalCountRows) {
        this.minTotalCountRows = minTotalCountRows;
        return this;
    }

    public Integer getMaxTotalCountRows() {
        return this.maxTotalCountRows;
    }

    public TotalCatalogPropertyValueQuery setMaxTotalCountRows(Integer maxTotalCountRows) {
        this.maxTotalCountRows = maxTotalCountRows;
        return this;
    }

    public Boolean getTotalCountRows() {
        return this.totalCountRows;
    }

    public TotalCatalogPropertyValueQuery setTotalCountRows(Boolean totalCountRows) {
        this.totalCountRows = totalCountRows;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public TotalCatalogPropertyValueQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public TotalCatalogPropertyValueQuery setEndCreatedDate(Date endCreatedDate) {
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

    public TotalCatalogPropertyValueQuery setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    public String getLikeValue() {
        return this.likeValue;
    }

    public TotalCatalogPropertyValueQuery setLikeValue(String likeValue) {
        this.likeValue = likeValue;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public TotalCatalogPropertyValueQuery setValue(String value) {
        this.value = value;
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

    public TotalCatalogPropertyValueQuery setTotalSumSequence(Boolean totalSumSequence) {
        this.totalSumSequence = totalSumSequence;
        return this;
    }

    public Boolean getTotalMaxSequence() {
        return this.totalMaxSequence;
    }

    public TotalCatalogPropertyValueQuery setTotalMaxSequence(Boolean totalMaxSequence) {
        this.totalMaxSequence = totalMaxSequence;
        return this;
    }

    public Boolean getTotalMinSequence() {
        return this.totalMinSequence;
    }

    public TotalCatalogPropertyValueQuery setTotalMinSequence(Boolean totalMinSequence) {
        this.totalMinSequence = totalMinSequence;
        return this;
    }

    public Boolean getTotalAvgSequence() {
        return this.totalAvgSequence;
    }

    public TotalCatalogPropertyValueQuery setTotalAvgSequence(Boolean totalAvgSequence) {
        this.totalAvgSequence = totalAvgSequence;
        return this;
    }

    public Integer getMaxTotalSumSequence() {
        return this.maxTotalSumSequence;
    }

    public TotalCatalogPropertyValueQuery setMaxTotalSumSequence(Integer maxTotalSumSequence) {
        this.maxTotalSumSequence = maxTotalSumSequence;
        return this;
    }

    public Integer getMinTotalSumSequence() {
        return this.minTotalSumSequence;
    }

    public TotalCatalogPropertyValueQuery setMinTotalSumSequence(Integer minTotalSumSequence) {
        this.minTotalSumSequence = minTotalSumSequence;
        return this;
    }

    public Integer getMinTotalMinSequence() {
        return this.minTotalMinSequence;
    }

    public TotalCatalogPropertyValueQuery setMinTotalMinSequence(Integer minTotalMinSequence) {
        this.minTotalMinSequence = minTotalMinSequence;
        return this;
    }

    public Integer getMaxTotalMinSequence() {
        return this.maxTotalMinSequence;
    }

    public TotalCatalogPropertyValueQuery setMaxTotalMinSequence(Integer maxTotalMinSequence) {
        this.maxTotalMinSequence = maxTotalMinSequence;
        return this;
    }

    public Integer getMinTotalMaxSequence() {
        return this.minTotalMaxSequence;
    }

    public TotalCatalogPropertyValueQuery setMinTotalMaxSequence(Integer minTotalMaxSequence) {
        this.minTotalMaxSequence = minTotalMaxSequence;
        return this;
    }

    public Integer getMaxTotalMaxSequence() {
        return this.maxTotalMaxSequence;
    }

    public TotalCatalogPropertyValueQuery setMaxTotalMaxSequence(Integer maxTotalMaxSequence) {
        this.maxTotalMaxSequence = maxTotalMaxSequence;
        return this;
    }

    public Integer getMinTotalAvgSequence() {
        return this.minTotalAvgSequence;
    }

    public TotalCatalogPropertyValueQuery setMinTotalAvgSequence(Integer minTotalAvgSequence) {
        this.minTotalAvgSequence = minTotalAvgSequence;
        return this;
    }

    public Integer getMaxTotalAvgSequence() {
        return this.maxTotalAvgSequence;
    }

    public TotalCatalogPropertyValueQuery setMaxTotalAvgSequence(Integer maxTotalAvgSequence) {
        this.maxTotalAvgSequence = maxTotalAvgSequence;
        return this;
    }

    public TotalCatalogPropertyValueQuery setGroupByCreatedDate(DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("createdDate", dateGroupBy);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinCatalog() {
        return this.joinCatalog;
    }

    public TotalCatalogPropertyValueQuery setJoinCatalog(com.xmg.mall.base.query.JoinType joinCatalog) {
        this.joinCatalog = joinCatalog;
        return this;
    }

    public CatalogPropertyQuery getCatalogQuery() {
        return this.catalogQuery;
    }

    public TotalCatalogPropertyValueQuery setCatalogQuery(CatalogPropertyQuery catalogQuery) {
        this.catalogQuery = catalogQuery;
        return this;
    }

    public TotalCatalogPropertyValueQuery setJoinCatalog() {
        this.setJoinCatalog(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

}
