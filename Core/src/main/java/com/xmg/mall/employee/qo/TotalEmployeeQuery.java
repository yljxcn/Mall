
package com.xmg.mall.employee.qo;

import java.util.Date;
import com.xmg.mall.base.query.DateGroupBy;
import com.xmg.mall.base.query.QueryCondition;

public class TotalEmployeeQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.GroupBys groupBys = new com.xmg.mall.base.query.GroupBys();
    protected Long[] ids;
    protected Integer minTotalCountRows;
    protected Integer maxTotalCountRows;
    protected Boolean totalCountRows;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected String likeName;
    protected String name;
    protected Integer[] includeStates;
    protected Integer[] excludeStates;

    public com.xmg.mall.base.query.GroupBys getGroupBys() {
        return this.groupBys;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public TotalEmployeeQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Integer getMinTotalCountRows() {
        return this.minTotalCountRows;
    }

    public TotalEmployeeQuery setMinTotalCountRows(Integer minTotalCountRows) {
        this.minTotalCountRows = minTotalCountRows;
        return this;
    }

    public Integer getMaxTotalCountRows() {
        return this.maxTotalCountRows;
    }

    public TotalEmployeeQuery setMaxTotalCountRows(Integer maxTotalCountRows) {
        this.maxTotalCountRows = maxTotalCountRows;
        return this;
    }

    public Boolean getTotalCountRows() {
        return this.totalCountRows;
    }

    public TotalEmployeeQuery setTotalCountRows(Boolean totalCountRows) {
        this.totalCountRows = totalCountRows;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public TotalEmployeeQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public TotalEmployeeQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public void setOrderByCreatedDate(int keyword) {
        setOrderBy("createdDate", keyword);
    }

    public int getOrderByCreatedDate() {
        return getOrderByKeyword("createdDate");
    }

    public String getLikeName() {
        return this.likeName;
    }

    public TotalEmployeeQuery setLikeName(String likeName) {
        this.likeName = likeName;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public TotalEmployeeQuery setName(String name) {
        this.name = name;
        return this;
    }

    public void setOrderByName(int keyword) {
        setOrderBy("name", keyword);
    }

    public int getOrderByName() {
        return getOrderByKeyword("name");
    }

    public TotalEmployeeQuery setGroupByCreatedDate(DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("createdDate", dateGroupBy);
        return this;
    }

    public Integer[] getIncludeStates() {
        return this.includeStates;
    }

    public TotalEmployeeQuery setIncludeStates(Integer[] includeStates) {
        this.includeStates = includeStates;
        return this;
    }

    public Integer[] getExcludeStates() {
        return this.excludeStates;
    }

    public TotalEmployeeQuery setExcludeStates(Integer[] excludeStates) {
        this.excludeStates = excludeStates;
        return this;
    }

    public TotalEmployeeQuery setGroupByState(Boolean groupBy) {
        if (groupBy) {
            groupBys.addGroupBy("state");
        } else {
            groupBys.removeGroupBy("state");
        }
        return this;
    }

}
