
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.DateGroupBy;
import com.xmg.mall.base.query.QueryCondition;
import com.xmg.mall.employee.qo.EmployeeQuery;

public class TotalProductAuditQuery
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
    protected Long employeeId;
    protected Integer[] includeStates;
    protected Integer[] excludeStates;
    protected com.xmg.mall.base.query.JoinType joinProduct;
    protected ProductQuery productQuery;
    protected com.xmg.mall.base.query.JoinType joinEmployee;
    protected EmployeeQuery employeeQuery;

    public com.xmg.mall.base.query.GroupBys getGroupBys() {
        return this.groupBys;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public TotalProductAuditQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Integer getMinTotalCountRows() {
        return this.minTotalCountRows;
    }

    public TotalProductAuditQuery setMinTotalCountRows(Integer minTotalCountRows) {
        this.minTotalCountRows = minTotalCountRows;
        return this;
    }

    public Integer getMaxTotalCountRows() {
        return this.maxTotalCountRows;
    }

    public TotalProductAuditQuery setMaxTotalCountRows(Integer maxTotalCountRows) {
        this.maxTotalCountRows = maxTotalCountRows;
        return this;
    }

    public Boolean getTotalCountRows() {
        return this.totalCountRows;
    }

    public TotalProductAuditQuery setTotalCountRows(Boolean totalCountRows) {
        this.totalCountRows = totalCountRows;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public TotalProductAuditQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public TotalProductAuditQuery setEndCreatedDate(Date endCreatedDate) {
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

    public TotalProductAuditQuery setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Long getEmployeeId() {
        return this.employeeId;
    }

    public TotalProductAuditQuery setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public TotalProductAuditQuery setGroupByCreatedDate(DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("createdDate", dateGroupBy);
        return this;
    }

    public Integer[] getIncludeStates() {
        return this.includeStates;
    }

    public TotalProductAuditQuery setIncludeStates(Integer[] includeStates) {
        this.includeStates = includeStates;
        return this;
    }

    public Integer[] getExcludeStates() {
        return this.excludeStates;
    }

    public TotalProductAuditQuery setExcludeStates(Integer[] excludeStates) {
        this.excludeStates = excludeStates;
        return this;
    }

    public TotalProductAuditQuery setGroupByState(Boolean groupBy) {
        if (groupBy) {
            groupBys.addGroupBy("state");
        } else {
            groupBys.removeGroupBy("state");
        }
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinProduct() {
        return this.joinProduct;
    }

    public TotalProductAuditQuery setJoinProduct(com.xmg.mall.base.query.JoinType joinProduct) {
        this.joinProduct = joinProduct;
        return this;
    }

    public ProductQuery getProductQuery() {
        return this.productQuery;
    }

    public TotalProductAuditQuery setProductQuery(ProductQuery productQuery) {
        this.productQuery = productQuery;
        return this;
    }

    public TotalProductAuditQuery setJoinProduct() {
        this.setJoinProduct(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinEmployee() {
        return this.joinEmployee;
    }

    public TotalProductAuditQuery setJoinEmployee(com.xmg.mall.base.query.JoinType joinEmployee) {
        this.joinEmployee = joinEmployee;
        return this;
    }

    public EmployeeQuery getEmployeeQuery() {
        return this.employeeQuery;
    }

    public TotalProductAuditQuery setEmployeeQuery(EmployeeQuery employeeQuery) {
        this.employeeQuery = employeeQuery;
        return this;
    }

    public TotalProductAuditQuery setJoinEmployee() {
        this.setJoinEmployee(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

}
