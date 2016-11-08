
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;

public class ProductDescriptionQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.JoinType joinProduct;
    protected ProductQuery productQuery;
    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long productId;
    protected Boolean selectDescription;

    public boolean hasIds() {
        return (this.ids.length!= 0);
    }

    public com.xmg.mall.base.query.JoinType getJoinProduct() {
        return this.joinProduct;
    }

    public ProductDescriptionQuery setJoinProduct(com.xmg.mall.base.query.JoinType joinProduct) {
        this.joinProduct = joinProduct;
        return this;
    }

    public ProductQuery getProductQuery() {
        return this.productQuery;
    }

    public ProductDescriptionQuery setProductQuery(ProductQuery productQuery) {
        this.productQuery = productQuery;
        return this;
    }

    public ProductDescriptionQuery setJoinProduct() {
        this.setJoinProduct(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public ProductDescriptionQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public ProductDescriptionQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public ProductDescriptionQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public Long getProductId() {
        return this.productId;
    }

    public ProductDescriptionQuery setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Boolean isSelectDescription() {
        return this.selectDescription;
    }

    public ProductDescriptionQuery setSelectDescription(Boolean selectDescription) {
        this.selectDescription = selectDescription;
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

}
