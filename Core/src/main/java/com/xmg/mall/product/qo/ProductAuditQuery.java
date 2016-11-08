
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;
import com.xmg.mall.employee.qo.EmployeeQuery;

public class ProductAuditQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.JoinType joinProduct;
    protected ProductQuery productQuery;
    protected com.xmg.mall.base.query.JoinType joinEmployee;
    protected EmployeeQuery employeeQuery;
    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long productId;
    protected Long employeeId;
    protected Integer[] includeStates;
    protected Integer[] excludeStates;

    public boolean hasIds() {
        return (this.ids.length!= 0);
    }

    public com.xmg.mall.base.query.JoinType getJoinProduct() {
        return this.joinProduct;
    }

    public ProductAuditQuery setJoinProduct(com.xmg.mall.base.query.JoinType joinProduct) {
        this.joinProduct = joinProduct;
        return this;
    }

    public ProductQuery getProductQuery() {
        return this.productQuery;
    }

    public ProductAuditQuery setProductQuery(ProductQuery productQuery) {
        this.productQuery = productQuery;
        return this;
    }

    public ProductAuditQuery setJoinProduct() {
        this.setJoinProduct(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinEmployee() {
        return this.joinEmployee;
    }

    public ProductAuditQuery setJoinEmployee(com.xmg.mall.base.query.JoinType joinEmployee) {
        this.joinEmployee = joinEmployee;
        return this;
    }

    public EmployeeQuery getEmployeeQuery() {
        return this.employeeQuery;
    }

    public ProductAuditQuery setEmployeeQuery(EmployeeQuery employeeQuery) {
        this.employeeQuery = employeeQuery;
        return this;
    }

    public ProductAuditQuery setJoinEmployee() {
        this.setJoinEmployee(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public ProductAuditQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public ProductAuditQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public ProductAuditQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public Long getProductId() {
        return this.productId;
    }

    public ProductAuditQuery setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Long getEmployeeId() {
        return this.employeeId;
    }

    public ProductAuditQuery setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public Integer[] getIncludeStates() {
        return this.includeStates;
    }

    public ProductAuditQuery setIncludeStates(Integer[] includeStates) {
        this.includeStates = includeStates;
        return this;
    }

    public Integer[] getExcludeStates() {
        return this.excludeStates;
    }

    public ProductAuditQuery setExcludeStates(Integer[] excludeStates) {
        this.excludeStates = excludeStates;
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
