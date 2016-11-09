
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.DateGroupBy;
import com.xmg.mall.base.query.QueryCondition;

public class TotalProductSkuPropertySequenceQuery
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
    protected Long skuPropertyId;
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
    protected com.xmg.mall.base.query.JoinType joinProduct;
    protected ProductQuery productQuery;
    protected com.xmg.mall.base.query.JoinType joinSkuProperty;
    protected SkuPropertyQuery skuPropertyQuery;

    public com.xmg.mall.base.query.GroupBys getGroupBys() {
        return this.groupBys;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public TotalProductSkuPropertySequenceQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Integer getMinTotalCountRows() {
        return this.minTotalCountRows;
    }

    public TotalProductSkuPropertySequenceQuery setMinTotalCountRows(Integer minTotalCountRows) {
        this.minTotalCountRows = minTotalCountRows;
        return this;
    }

    public Integer getMaxTotalCountRows() {
        return this.maxTotalCountRows;
    }

    public TotalProductSkuPropertySequenceQuery setMaxTotalCountRows(Integer maxTotalCountRows) {
        this.maxTotalCountRows = maxTotalCountRows;
        return this;
    }

    public Boolean getTotalCountRows() {
        return this.totalCountRows;
    }

    public TotalProductSkuPropertySequenceQuery setTotalCountRows(Boolean totalCountRows) {
        this.totalCountRows = totalCountRows;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public TotalProductSkuPropertySequenceQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public TotalProductSkuPropertySequenceQuery setEndCreatedDate(Date endCreatedDate) {
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

    public TotalProductSkuPropertySequenceQuery setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Long getSkuPropertyId() {
        return this.skuPropertyId;
    }

    public TotalProductSkuPropertySequenceQuery setSkuPropertyId(Long skuPropertyId) {
        this.skuPropertyId = skuPropertyId;
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

    public TotalProductSkuPropertySequenceQuery setTotalSumSequence(Boolean totalSumSequence) {
        this.totalSumSequence = totalSumSequence;
        return this;
    }

    public Boolean getTotalMaxSequence() {
        return this.totalMaxSequence;
    }

    public TotalProductSkuPropertySequenceQuery setTotalMaxSequence(Boolean totalMaxSequence) {
        this.totalMaxSequence = totalMaxSequence;
        return this;
    }

    public Boolean getTotalMinSequence() {
        return this.totalMinSequence;
    }

    public TotalProductSkuPropertySequenceQuery setTotalMinSequence(Boolean totalMinSequence) {
        this.totalMinSequence = totalMinSequence;
        return this;
    }

    public Boolean getTotalAvgSequence() {
        return this.totalAvgSequence;
    }

    public TotalProductSkuPropertySequenceQuery setTotalAvgSequence(Boolean totalAvgSequence) {
        this.totalAvgSequence = totalAvgSequence;
        return this;
    }

    public Integer getMaxTotalSumSequence() {
        return this.maxTotalSumSequence;
    }

    public TotalProductSkuPropertySequenceQuery setMaxTotalSumSequence(Integer maxTotalSumSequence) {
        this.maxTotalSumSequence = maxTotalSumSequence;
        return this;
    }

    public Integer getMinTotalSumSequence() {
        return this.minTotalSumSequence;
    }

    public TotalProductSkuPropertySequenceQuery setMinTotalSumSequence(Integer minTotalSumSequence) {
        this.minTotalSumSequence = minTotalSumSequence;
        return this;
    }

    public Integer getMinTotalMinSequence() {
        return this.minTotalMinSequence;
    }

    public TotalProductSkuPropertySequenceQuery setMinTotalMinSequence(Integer minTotalMinSequence) {
        this.minTotalMinSequence = minTotalMinSequence;
        return this;
    }

    public Integer getMaxTotalMinSequence() {
        return this.maxTotalMinSequence;
    }

    public TotalProductSkuPropertySequenceQuery setMaxTotalMinSequence(Integer maxTotalMinSequence) {
        this.maxTotalMinSequence = maxTotalMinSequence;
        return this;
    }

    public Integer getMinTotalMaxSequence() {
        return this.minTotalMaxSequence;
    }

    public TotalProductSkuPropertySequenceQuery setMinTotalMaxSequence(Integer minTotalMaxSequence) {
        this.minTotalMaxSequence = minTotalMaxSequence;
        return this;
    }

    public Integer getMaxTotalMaxSequence() {
        return this.maxTotalMaxSequence;
    }

    public TotalProductSkuPropertySequenceQuery setMaxTotalMaxSequence(Integer maxTotalMaxSequence) {
        this.maxTotalMaxSequence = maxTotalMaxSequence;
        return this;
    }

    public Integer getMinTotalAvgSequence() {
        return this.minTotalAvgSequence;
    }

    public TotalProductSkuPropertySequenceQuery setMinTotalAvgSequence(Integer minTotalAvgSequence) {
        this.minTotalAvgSequence = minTotalAvgSequence;
        return this;
    }

    public Integer getMaxTotalAvgSequence() {
        return this.maxTotalAvgSequence;
    }

    public TotalProductSkuPropertySequenceQuery setMaxTotalAvgSequence(Integer maxTotalAvgSequence) {
        this.maxTotalAvgSequence = maxTotalAvgSequence;
        return this;
    }

    public TotalProductSkuPropertySequenceQuery setGroupByCreatedDate(DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("createdDate", dateGroupBy);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinProduct() {
        return this.joinProduct;
    }

    public TotalProductSkuPropertySequenceQuery setJoinProduct(com.xmg.mall.base.query.JoinType joinProduct) {
        this.joinProduct = joinProduct;
        return this;
    }

    public ProductQuery getProductQuery() {
        return this.productQuery;
    }

    public TotalProductSkuPropertySequenceQuery setProductQuery(ProductQuery productQuery) {
        this.productQuery = productQuery;
        return this;
    }

    public TotalProductSkuPropertySequenceQuery setJoinProduct() {
        this.setJoinProduct(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinSkuProperty() {
        return this.joinSkuProperty;
    }

    public TotalProductSkuPropertySequenceQuery setJoinSkuProperty(com.xmg.mall.base.query.JoinType joinSkuProperty) {
        this.joinSkuProperty = joinSkuProperty;
        return this;
    }

    public SkuPropertyQuery getSkuPropertyQuery() {
        return this.skuPropertyQuery;
    }

    public TotalProductSkuPropertySequenceQuery setSkuPropertyQuery(SkuPropertyQuery skuPropertyQuery) {
        this.skuPropertyQuery = skuPropertyQuery;
        return this;
    }

    public TotalProductSkuPropertySequenceQuery setJoinSkuProperty() {
        this.setJoinSkuProperty(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

}
