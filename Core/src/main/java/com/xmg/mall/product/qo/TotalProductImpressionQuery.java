
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.DateGroupBy;
import com.xmg.mall.base.query.QueryCondition;

public class TotalProductImpressionQuery
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
    protected Long impressionId;
    protected Boolean totalSumCount;
    protected Boolean totalMaxCount;
    protected Boolean totalMinCount;
    protected Boolean totalAvgCount;
    protected Integer maxTotalSumCount;
    protected Integer minTotalSumCount;
    protected Integer minTotalMinCount;
    protected Integer maxTotalMinCount;
    protected Integer minTotalMaxCount;
    protected Integer maxTotalMaxCount;
    protected Integer minTotalAvgCount;
    protected Integer maxTotalAvgCount;
    protected com.xmg.mall.base.query.JoinType joinProduct;
    protected ProductQuery productQuery;
    protected com.xmg.mall.base.query.JoinType joinImpression;
    protected ImpressionQuery impressionQuery;

    public com.xmg.mall.base.query.GroupBys getGroupBys() {
        return this.groupBys;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public TotalProductImpressionQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Integer getMinTotalCountRows() {
        return this.minTotalCountRows;
    }

    public TotalProductImpressionQuery setMinTotalCountRows(Integer minTotalCountRows) {
        this.minTotalCountRows = minTotalCountRows;
        return this;
    }

    public Integer getMaxTotalCountRows() {
        return this.maxTotalCountRows;
    }

    public TotalProductImpressionQuery setMaxTotalCountRows(Integer maxTotalCountRows) {
        this.maxTotalCountRows = maxTotalCountRows;
        return this;
    }

    public Boolean getTotalCountRows() {
        return this.totalCountRows;
    }

    public TotalProductImpressionQuery setTotalCountRows(Boolean totalCountRows) {
        this.totalCountRows = totalCountRows;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public TotalProductImpressionQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public TotalProductImpressionQuery setEndCreatedDate(Date endCreatedDate) {
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

    public TotalProductImpressionQuery setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Long getImpressionId() {
        return this.impressionId;
    }

    public TotalProductImpressionQuery setImpressionId(Long impressionId) {
        this.impressionId = impressionId;
        return this;
    }

    public void setOrderByCount(int keyword) {
        setOrderBy("count", keyword);
    }

    public int getOrderByCount() {
        return getOrderByKeyword("count");
    }

    public Boolean getTotalSumCount() {
        return this.totalSumCount;
    }

    public TotalProductImpressionQuery setTotalSumCount(Boolean totalSumCount) {
        this.totalSumCount = totalSumCount;
        return this;
    }

    public Boolean getTotalMaxCount() {
        return this.totalMaxCount;
    }

    public TotalProductImpressionQuery setTotalMaxCount(Boolean totalMaxCount) {
        this.totalMaxCount = totalMaxCount;
        return this;
    }

    public Boolean getTotalMinCount() {
        return this.totalMinCount;
    }

    public TotalProductImpressionQuery setTotalMinCount(Boolean totalMinCount) {
        this.totalMinCount = totalMinCount;
        return this;
    }

    public Boolean getTotalAvgCount() {
        return this.totalAvgCount;
    }

    public TotalProductImpressionQuery setTotalAvgCount(Boolean totalAvgCount) {
        this.totalAvgCount = totalAvgCount;
        return this;
    }

    public Integer getMaxTotalSumCount() {
        return this.maxTotalSumCount;
    }

    public TotalProductImpressionQuery setMaxTotalSumCount(Integer maxTotalSumCount) {
        this.maxTotalSumCount = maxTotalSumCount;
        return this;
    }

    public Integer getMinTotalSumCount() {
        return this.minTotalSumCount;
    }

    public TotalProductImpressionQuery setMinTotalSumCount(Integer minTotalSumCount) {
        this.minTotalSumCount = minTotalSumCount;
        return this;
    }

    public Integer getMinTotalMinCount() {
        return this.minTotalMinCount;
    }

    public TotalProductImpressionQuery setMinTotalMinCount(Integer minTotalMinCount) {
        this.minTotalMinCount = minTotalMinCount;
        return this;
    }

    public Integer getMaxTotalMinCount() {
        return this.maxTotalMinCount;
    }

    public TotalProductImpressionQuery setMaxTotalMinCount(Integer maxTotalMinCount) {
        this.maxTotalMinCount = maxTotalMinCount;
        return this;
    }

    public Integer getMinTotalMaxCount() {
        return this.minTotalMaxCount;
    }

    public TotalProductImpressionQuery setMinTotalMaxCount(Integer minTotalMaxCount) {
        this.minTotalMaxCount = minTotalMaxCount;
        return this;
    }

    public Integer getMaxTotalMaxCount() {
        return this.maxTotalMaxCount;
    }

    public TotalProductImpressionQuery setMaxTotalMaxCount(Integer maxTotalMaxCount) {
        this.maxTotalMaxCount = maxTotalMaxCount;
        return this;
    }

    public Integer getMinTotalAvgCount() {
        return this.minTotalAvgCount;
    }

    public TotalProductImpressionQuery setMinTotalAvgCount(Integer minTotalAvgCount) {
        this.minTotalAvgCount = minTotalAvgCount;
        return this;
    }

    public Integer getMaxTotalAvgCount() {
        return this.maxTotalAvgCount;
    }

    public TotalProductImpressionQuery setMaxTotalAvgCount(Integer maxTotalAvgCount) {
        this.maxTotalAvgCount = maxTotalAvgCount;
        return this;
    }

    public TotalProductImpressionQuery setGroupByCreatedDate(DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("createdDate", dateGroupBy);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinProduct() {
        return this.joinProduct;
    }

    public TotalProductImpressionQuery setJoinProduct(com.xmg.mall.base.query.JoinType joinProduct) {
        this.joinProduct = joinProduct;
        return this;
    }

    public ProductQuery getProductQuery() {
        return this.productQuery;
    }

    public TotalProductImpressionQuery setProductQuery(ProductQuery productQuery) {
        this.productQuery = productQuery;
        return this;
    }

    public TotalProductImpressionQuery setJoinProduct() {
        this.setJoinProduct(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinImpression() {
        return this.joinImpression;
    }

    public TotalProductImpressionQuery setJoinImpression(com.xmg.mall.base.query.JoinType joinImpression) {
        this.joinImpression = joinImpression;
        return this;
    }

    public ImpressionQuery getImpressionQuery() {
        return this.impressionQuery;
    }

    public TotalProductImpressionQuery setImpressionQuery(ImpressionQuery impressionQuery) {
        this.impressionQuery = impressionQuery;
        return this;
    }

    public TotalProductImpressionQuery setJoinImpression() {
        this.setJoinImpression(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

}
