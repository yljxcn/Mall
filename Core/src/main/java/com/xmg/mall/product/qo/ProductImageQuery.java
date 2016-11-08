
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;

public class ProductImageQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.JoinType joinProduct;
    protected com.xmg.mall.product.qo.ProductImageQuery productQuery;
    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long productId;
    protected Long[] includeFlags;
    protected Long[] excludeFlags;

    public boolean hasIds() {
        return (this.ids.length!= 0);
    }

    public com.xmg.mall.base.query.JoinType getJoinProduct() {
        return this.joinProduct;
    }

    public ProductImageQuery setJoinProduct(com.xmg.mall.base.query.JoinType joinProduct) {
        this.joinProduct = joinProduct;
        return this;
    }

    public com.xmg.mall.product.qo.ProductImageQuery getProductQuery() {
        return this.productQuery;
    }

    public ProductImageQuery setProductQuery(com.xmg.mall.product.qo.ProductImageQuery productQuery) {
        this.productQuery = productQuery;
        return this;
    }

    public ProductImageQuery setJoinProduct() {
        this.setJoinProduct(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public ProductImageQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public ProductImageQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public ProductImageQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public Long getProductId() {
        return this.productId;
    }

    public ProductImageQuery setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Long[] getIncludeFlags() {
        return this.includeFlags;
    }

    public ProductImageQuery setIncludeFlags(Long[] includeFlags) {
        this.includeFlags = includeFlags;
        return this;
    }

    public Long[] getExcludeFlags() {
        return this.excludeFlags;
    }

    public ProductImageQuery setExcludeFlags(Long[] excludeFlags) {
        this.excludeFlags = excludeFlags;
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
