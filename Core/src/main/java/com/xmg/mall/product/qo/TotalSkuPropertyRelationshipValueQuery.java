
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.DateGroupBy;
import com.xmg.mall.base.query.QueryCondition;

public class TotalSkuPropertyRelationshipValueQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.GroupBys groupBys = new com.xmg.mall.base.query.GroupBys();
    protected Long[] ids;
    protected Integer minTotalCountRows;
    protected Integer maxTotalCountRows;
    protected Boolean totalCountRows;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long skuPropertyId;
    protected String likeValue;
    protected String value;
    protected com.xmg.mall.base.query.JoinType joinSkuProperty;
    protected SkuPropertyQuery skuPropertyQuery;

    public com.xmg.mall.base.query.GroupBys getGroupBys() {
        return this.groupBys;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public TotalSkuPropertyRelationshipValueQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Integer getMinTotalCountRows() {
        return this.minTotalCountRows;
    }

    public TotalSkuPropertyRelationshipValueQuery setMinTotalCountRows(Integer minTotalCountRows) {
        this.minTotalCountRows = minTotalCountRows;
        return this;
    }

    public Integer getMaxTotalCountRows() {
        return this.maxTotalCountRows;
    }

    public TotalSkuPropertyRelationshipValueQuery setMaxTotalCountRows(Integer maxTotalCountRows) {
        this.maxTotalCountRows = maxTotalCountRows;
        return this;
    }

    public Boolean getTotalCountRows() {
        return this.totalCountRows;
    }

    public TotalSkuPropertyRelationshipValueQuery setTotalCountRows(Boolean totalCountRows) {
        this.totalCountRows = totalCountRows;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public TotalSkuPropertyRelationshipValueQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public TotalSkuPropertyRelationshipValueQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public void setOrderByCreatedDate(int keyword) {
        setOrderBy("createdDate", keyword);
    }

    public int getOrderByCreatedDate() {
        return getOrderByKeyword("createdDate");
    }

    public Long getSkuPropertyId() {
        return this.skuPropertyId;
    }

    public TotalSkuPropertyRelationshipValueQuery setSkuPropertyId(Long skuPropertyId) {
        this.skuPropertyId = skuPropertyId;
        return this;
    }

    public String getLikeValue() {
        return this.likeValue;
    }

    public TotalSkuPropertyRelationshipValueQuery setLikeValue(String likeValue) {
        this.likeValue = likeValue;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public TotalSkuPropertyRelationshipValueQuery setValue(String value) {
        this.value = value;
        return this;
    }

    public void setOrderBySequence(int keyword) {
        setOrderBy("sequence", keyword);
    }

    public int getOrderBySequence() {
        return getOrderByKeyword("sequence");
    }

    public TotalSkuPropertyRelationshipValueQuery setGroupByCreatedDate(DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("createdDate", dateGroupBy);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinSkuProperty() {
        return this.joinSkuProperty;
    }

    public TotalSkuPropertyRelationshipValueQuery setJoinSkuProperty(com.xmg.mall.base.query.JoinType joinSkuProperty) {
        this.joinSkuProperty = joinSkuProperty;
        return this;
    }

    public SkuPropertyQuery getSkuPropertyQuery() {
        return this.skuPropertyQuery;
    }

    public TotalSkuPropertyRelationshipValueQuery setSkuPropertyQuery(SkuPropertyQuery skuPropertyQuery) {
        this.skuPropertyQuery = skuPropertyQuery;
        return this;
    }

    public TotalSkuPropertyRelationshipValueQuery setJoinSkuProperty() {
        this.setJoinSkuProperty(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

}
