
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.DateGroupBy;
import com.xmg.mall.base.query.QueryCondition;

public class TotalBrandQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.GroupBys groupBys = new com.xmg.mall.base.query.GroupBys();
    protected Long[] ids;
    protected Integer minTotalCountRows;
    protected Integer maxTotalCountRows;
    protected Boolean totalCountRows;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected String likeChineseName;
    protected String chineseName;
    protected String likeEnglishName;
    protected String englishName;
    protected Long[] includeVisibilityStates;
    protected Long[] excludeVisibilityStates;

    public com.xmg.mall.base.query.GroupBys getGroupBys() {
        return this.groupBys;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public TotalBrandQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Integer getMinTotalCountRows() {
        return this.minTotalCountRows;
    }

    public TotalBrandQuery setMinTotalCountRows(Integer minTotalCountRows) {
        this.minTotalCountRows = minTotalCountRows;
        return this;
    }

    public Integer getMaxTotalCountRows() {
        return this.maxTotalCountRows;
    }

    public TotalBrandQuery setMaxTotalCountRows(Integer maxTotalCountRows) {
        this.maxTotalCountRows = maxTotalCountRows;
        return this;
    }

    public Boolean getTotalCountRows() {
        return this.totalCountRows;
    }

    public TotalBrandQuery setTotalCountRows(Boolean totalCountRows) {
        this.totalCountRows = totalCountRows;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public TotalBrandQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public TotalBrandQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public void setOrderByCreatedDate(int keyword) {
        setOrderBy("createdDate", keyword);
    }

    public int getOrderByCreatedDate() {
        return getOrderByKeyword("createdDate");
    }

    public String getLikeChineseName() {
        return this.likeChineseName;
    }

    public TotalBrandQuery setLikeChineseName(String likeChineseName) {
        this.likeChineseName = likeChineseName;
        return this;
    }

    public String getChineseName() {
        return this.chineseName;
    }

    public TotalBrandQuery setChineseName(String chineseName) {
        this.chineseName = chineseName;
        return this;
    }

    public String getLikeEnglishName() {
        return this.likeEnglishName;
    }

    public TotalBrandQuery setLikeEnglishName(String likeEnglishName) {
        this.likeEnglishName = likeEnglishName;
        return this;
    }

    public String getEnglishName() {
        return this.englishName;
    }

    public TotalBrandQuery setEnglishName(String englishName) {
        this.englishName = englishName;
        return this;
    }

    public void setOrderBySequence(int keyword) {
        setOrderBy("sequence", keyword);
    }

    public int getOrderBySequence() {
        return getOrderByKeyword("sequence");
    }

    public TotalBrandQuery setGroupByCreatedDate(DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("createdDate", dateGroupBy);
        return this;
    }

    public Long[] getIncludeVisibilityStates() {
        return this.includeVisibilityStates;
    }

    public TotalBrandQuery setIncludeVisibilityStates(Long[] includeVisibilityStates) {
        this.includeVisibilityStates = includeVisibilityStates;
        return this;
    }

    public Long[] getExcludeVisibilityStates() {
        return this.excludeVisibilityStates;
    }

    public TotalBrandQuery setExcludeVisibilityStates(Long[] excludeVisibilityStates) {
        this.excludeVisibilityStates = excludeVisibilityStates;
        return this;
    }

    public TotalBrandQuery setGroupByVisibilityState(Long mods) {
        if (mods!= null) {
            groupBys.addModsGroupBy("visibilityState", mods);
        } else {
            groupBys.removeGroupBy("visibilityState");
        }
        return this;
    }

}
