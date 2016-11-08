
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;

public class CatalogQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.JoinType joinParentCatalog;
    protected com.xmg.mall.product.qo.CatalogQuery parentCatalogQuery;
    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Integer level;
    protected String name;
    protected String likeName;
    protected String code;
    protected String likeCode;
    protected Long parentCatalogId;

    public boolean hasIds() {
        return (this.ids.length!= 0);
    }

    public com.xmg.mall.base.query.JoinType getJoinParentCatalog() {
        return this.joinParentCatalog;
    }

    public CatalogQuery setJoinParentCatalog(com.xmg.mall.base.query.JoinType joinParentCatalog) {
        this.joinParentCatalog = joinParentCatalog;
        return this;
    }

    public com.xmg.mall.product.qo.CatalogQuery getParentCatalogQuery() {
        return this.parentCatalogQuery;
    }

    public CatalogQuery setParentCatalogQuery(com.xmg.mall.product.qo.CatalogQuery parentCatalogQuery) {
        this.parentCatalogQuery = parentCatalogQuery;
        return this;
    }

    public CatalogQuery setJoinParentCatalog() {
        this.setJoinParentCatalog(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public CatalogQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public CatalogQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public CatalogQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public Integer getLevel() {
        return this.level;
    }

    public CatalogQuery setLevel(Integer level) {
        this.level = level;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public CatalogQuery setName(String name) {
        this.name = name;
        return this;
    }

    public String getLikeName() {
        return this.likeName;
    }

    public CatalogQuery setLikeName(String likeName) {
        this.likeName = likeName;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public CatalogQuery setCode(String code) {
        this.code = code;
        return this;
    }

    public String getLikeCode() {
        return this.likeCode;
    }

    public CatalogQuery setLikeCode(String likeCode) {
        this.likeCode = likeCode;
        return this;
    }

    public Long getParentCatalogId() {
        return this.parentCatalogId;
    }

    public CatalogQuery setParentCatalogId(Long parentCatalogId) {
        this.parentCatalogId = parentCatalogId;
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

}
