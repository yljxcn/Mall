
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.DateGroupBy;
import com.xmg.mall.base.query.QueryCondition;

public class TotalProductFreightQuery
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

    public TotalProductFreightQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Integer getMinTotalCountRows() {
        return this.minTotalCountRows;
    }

    public TotalProductFreightQuery setMinTotalCountRows(Integer minTotalCountRows) {
        this.minTotalCountRows = minTotalCountRows;
        return this;
    }

    public Integer getMaxTotalCountRows() {
        return this.maxTotalCountRows;
    }

    public TotalProductFreightQuery setMaxTotalCountRows(Integer maxTotalCountRows) {
        this.maxTotalCountRows = maxTotalCountRows;
        return this;
    }

    public Boolean getTotalCountRows() {
        return this.totalCountRows;
    }

    public TotalProductFreightQuery setTotalCountRows(Boolean totalCountRows) {
        this.totalCountRows = totalCountRows;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public TotalProductFreightQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public TotalProductFreightQuery setEndCreatedDate(Date endCreatedDate) {
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

    public TotalProductFreightQuery setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Long getImpressionId() {
        return this.impressionId;
    }

    public TotalProductFreightQuery setImpressionId(Long impressionId) {
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

    public TotalProductFreightQuery setTotalSumCount(Boolean totalSumCount) {
        this.totalSumCount = totalSumCount;
        return this;
    }

    public Boolean getTotalMaxCount() {
        return this.totalMaxCount;
    }

    public TotalProductFreightQuery setTotalMaxCount(Boolean totalMaxCount) {
        this.totalMaxCount = totalMaxCount;
        return this;
    }

    public Boolean getTotalMinCount() {
        return this.totalMinCount;
    }

    public TotalProductFreightQuery setTotalMinCount(Boolean totalMinCount) {
        this.totalMinCount = totalMinCount;
        return this;
    }

    public Boolean getTotalAvgCount() {
        return this.totalAvgCount;
    }

    public TotalProductFreightQuery setTotalAvgCount(Boolean totalAvgCount) {
        this.totalAvgCount = totalAvgCount;
        return this;
    }

    public Integer getMaxTotalSumCount() {
        return this.maxTotalSumCount;
    }

    public TotalProductFreightQuery setMaxTotalSumCount(Integer maxTotalSumCount) {
        this.maxTotalSumCount = maxTotalSumCount;
        return this;
    }

    public Integer getMinTotalSumCount() {
        return this.minTotalSumCount;
    }

    public TotalProductFreightQuery setMinTotalSumCount(Integer minTotalSumCount) {
        this.minTotalSumCount = minTotalSumCount;
        return this;
    }

    public Integer getMinTotalMinCount() {
        return this.minTotalMinCount;
    }

    public TotalProductFreightQuery setMinTotalMinCount(Integer minTotalMinCount) {
        this.minTotalMinCount = minTotalMinCount;
        return this;
    }

    public Integer getMaxTotalMinCount() {
        return this.maxTotalMinCount;
    }

    public TotalProductFreightQuery setMaxTotalMinCount(Integer maxTotalMinCount) {
        this.maxTotalMinCount = maxTotalMinCount;
        return this;
    }

    public Integer getMinTotalMaxCount() {
        return this.minTotalMaxCount;
    }

    public TotalProductFreightQuery setMinTotalMaxCount(Integer minTotalMaxCount) {
        this.minTotalMaxCount = minTotalMaxCount;
        return this;
    }

    public Integer getMaxTotalMaxCount() {
        return this.maxTotalMaxCount;
    }

    public TotalProductFreightQuery setMaxTotalMaxCount(Integer maxTotalMaxCount) {
        this.maxTotalMaxCount = maxTotalMaxCount;
        return this;
    }

    public Integer getMinTotalAvgCount() {
        return this.minTotalAvgCount;
    }

    public TotalProductFreightQuery setMinTotalAvgCount(Integer minTotalAvgCount) {
        this.minTotalAvgCount = minTotalAvgCount;
        return this;
    }

    public Integer getMaxTotalAvgCount() {
        return this.maxTotalAvgCount;
    }

    public TotalProductFreightQuery setMaxTotalAvgCount(Integer maxTotalAvgCount) {
        this.maxTotalAvgCount = maxTotalAvgCount;
        return this;
    }

    public TotalProductFreightQuery setGroupByCreatedDate(DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("createdDate", dateGroupBy);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinProduct() {
        return this.joinProduct;
    }

    public TotalProductFreightQuery setJoinProduct(com.xmg.mall.base.query.JoinType joinProduct) {
        this.joinProduct = joinProduct;
        return this;
    }

    public ProductQuery getProductQuery() {
        return this.productQuery;
    }

    public TotalProductFreightQuery setProductQuery(ProductQuery productQuery) {
        this.productQuery = productQuery;
        return this;
    }

    public TotalProductFreightQuery setJoinProduct() {
        this.setJoinProduct(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinImpression() {
        return this.joinImpression;
    }

    public TotalProductFreightQuery setJoinImpression(com.xmg.mall.base.query.JoinType joinImpression) {
        this.joinImpression = joinImpression;
        return this;
    }

    public ImpressionQuery getImpressionQuery() {
        return this.impressionQuery;
    }

    public TotalProductFreightQuery setImpressionQuery(ImpressionQuery impressionQuery) {
        this.impressionQuery = impressionQuery;
        return this;
    }

    public TotalProductFreightQuery setJoinImpression() {
        this.setJoinImpression(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

}
