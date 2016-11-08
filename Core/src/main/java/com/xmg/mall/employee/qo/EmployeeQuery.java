
package com.xmg.mall.employee.qo;

import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;

public class EmployeeQuery
    extends QueryCondition
{

    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected String name;
    protected String likeName;
    protected Integer[] includeStates;
    protected Integer[] excludeStates;

    public boolean hasIds() {
        return (this.ids.length!= 0);
    }

    public Long[] getIds() {
        return this.ids;
    }

    public EmployeeQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public EmployeeQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public EmployeeQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public EmployeeQuery setName(String name) {
        this.name = name;
        return this;
    }

    public String getLikeName() {
        return this.likeName;
    }

    public EmployeeQuery setLikeName(String likeName) {
        this.likeName = likeName;
        return this;
    }

    public Integer[] getIncludeStates() {
        return this.includeStates;
    }

    public EmployeeQuery setIncludeStates(Integer[] includeStates) {
        this.includeStates = includeStates;
        return this;
    }

    public Integer[] getExcludeStates() {
        return this.excludeStates;
    }

    public EmployeeQuery setExcludeStates(Integer[] excludeStates) {
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

    public void setOrderByName(int keyword) {
        setOrderBy("name", keyword);
    }

    public int getOrderByName() {
        return getOrderByKeyword("name");
    }

}
