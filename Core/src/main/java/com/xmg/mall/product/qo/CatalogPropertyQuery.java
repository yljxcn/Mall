
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;

public class CatalogPropertyQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.JoinType joinCatalog;
    protected CatalogQuery catalogQuery;
    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long catalogId;
    protected String name;
    protected String likeName;
    protected Integer[] includeTypes;
    protected Integer[] excludeTypes;

    public boolean hasIds() {
        return (this.ids.length!= 0);
    }

    public com.xmg.mall.base.query.JoinType getJoinCatalog() {
        return this.joinCatalog;
    }

    public CatalogPropertyQuery setJoinCatalog(com.xmg.mall.base.query.JoinType joinCatalog) {
        this.joinCatalog = joinCatalog;
        return this;
    }

    public CatalogQuery getCatalogQuery() {
        return this.catalogQuery;
    }

    public CatalogPropertyQuery setCatalogQuery(CatalogQuery catalogQuery) {
        this.catalogQuery = catalogQuery;
        return this;
    }

    public CatalogPropertyQuery setJoinCatalog() {
        this.setJoinCatalog(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public CatalogPropertyQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public CatalogPropertyQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public CatalogPropertyQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public Long getCatalogId() {
        return this.catalogId;
    }

    public CatalogPropertyQuery setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public CatalogPropertyQuery setName(String name) {
        this.name = name;
        return this;
    }

    public String getLikeName() {
        return this.likeName;
    }

    public CatalogPropertyQuery setLikeName(String likeName) {
        this.likeName = likeName;
        return this;
    }

    public Integer[] getIncludeTypes() {
        return this.includeTypes;
    }

    public CatalogPropertyQuery setIncludeTypes(Integer[] includeTypes) {
        this.includeTypes = includeTypes;
        return this;
    }

    public Integer[] getExcludeTypes() {
        return this.excludeTypes;
    }

    public CatalogPropertyQuery setExcludeTypes(Integer[] excludeTypes) {
        this.excludeTypes = excludeTypes;
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

    public void setOrderBySequence(int keyword) {
        setOrderBy("sequence", keyword);
    }

    public int getOrderBySequence() {
        return getOrderByKeyword("sequence");
    }

}
