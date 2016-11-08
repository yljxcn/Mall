
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
    protected java.lang.Integer level;
    protected String likeName;
    protected String name;
    protected String likeCode;
    protected String code;
    protected Long parentCatalogId;
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

    public java.lang.Integer getLevel() {
        return this.level;
    }

    public TotalCatalogQuery setLevel(java.lang.Integer level) {
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
