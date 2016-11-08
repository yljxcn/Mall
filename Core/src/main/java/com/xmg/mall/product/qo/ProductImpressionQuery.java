
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;

public class ProductImpressionQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.JoinType joinProduct;
    protected ProductQuery productQuery;
    protected com.xmg.mall.base.query.JoinType joinImpression;
    protected ImpressionQuery impressionQuery;
    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long productId;
    protected Long impressionId;

    public boolean hasIds() {
        return (this.ids.length!= 0);
    }

    public com.xmg.mall.base.query.JoinType getJoinProduct() {
        return this.joinProduct;
    }

    public ProductImpressionQuery setJoinProduct(com.xmg.mall.base.query.JoinType joinProduct) {
        this.joinProduct = joinProduct;
        return this;
    }

    public ProductQuery getProductQuery() {
        return this.productQuery;
    }

    public ProductImpressionQuery setProductQuery(ProductQuery productQuery) {
        this.productQuery = productQuery;
        return this;
    }

    public ProductImpressionQuery setJoinProduct() {
        this.setJoinProduct(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinImpression() {
        return this.joinImpression;
    }

    public ProductImpressionQuery setJoinImpression(com.xmg.mall.base.query.JoinType joinImpression) {
        this.joinImpression = joinImpression;
        return this;
    }

    public ImpressionQuery getImpressionQuery() {
        return this.impressionQuery;
    }

    public ProductImpressionQuery setImpressionQuery(ImpressionQuery impressionQuery) {
        this.impressionQuery = impressionQuery;
        return this;
    }

    public ProductImpressionQuery setJoinImpression() {
        this.setJoinImpression(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public ProductImpressionQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public ProductImpressionQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public ProductImpressionQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public Long getProductId() {
        return this.productId;
    }

    public ProductImpressionQuery setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Long getImpressionId() {
        return this.impressionId;
    }

    public ProductImpressionQuery setImpressionId(Long impressionId) {
        this.impressionId = impressionId;
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

    public void setOrderByCount(int keyword) {
        setOrderBy("count", keyword);
    }

    public int getOrderByCount() {
        return getOrderByKeyword("count");
    }

}
