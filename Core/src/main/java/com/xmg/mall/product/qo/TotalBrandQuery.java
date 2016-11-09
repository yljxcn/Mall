
package com.xmg.mall.product.qo;

import java.util.Date;
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
    protected Date startFoundTime;
    protected Date endFoundTime;
    protected Date foundTime;
    protected String likeChineseName;
    protected String chineseName;
    protected String likeEnglishName;
    protected String englishName;
    protected Boolean totalSumSequence;
    protected Boolean totalMaxSequence;
    protected Boolean totalMinSequence;
    protected Boolean totalAvgSequence;
    protected Integer maxTotalSumSequence;
    protected Integer minTotalSumSequence;
    protected Integer minTotalMinSequence;
    protected Integer maxTotalMinSequence;
    protected Integer minTotalMaxSequence;
    protected Integer maxTotalMaxSequence;
    protected Integer minTotalAvgSequence;
    protected Integer maxTotalAvgSequence;
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

    public Date getStartFoundTime() {
        return this.startFoundTime;
    }

    public TotalBrandQuery setStartFoundTime(Date startFoundTime) {
        this.startFoundTime = startFoundTime;
        return this;
    }

    public Date getEndFoundTime() {
        return this.endFoundTime;
    }

    public TotalBrandQuery setEndFoundTime(Date endFoundTime) {
        this.endFoundTime = endFoundTime;
        return this;
    }

    public Date getFoundTime() {
        return this.foundTime;
    }

    public TotalBrandQuery setFoundTime(Date foundTime) {
        this.foundTime = foundTime;
        return this;
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

    public Boolean getTotalSumSequence() {
        return this.totalSumSequence;
    }

    public TotalBrandQuery setTotalSumSequence(Boolean totalSumSequence) {
        this.totalSumSequence = totalSumSequence;
        return this;
    }

    public Boolean getTotalMaxSequence() {
        return this.totalMaxSequence;
    }

    public TotalBrandQuery setTotalMaxSequence(Boolean totalMaxSequence) {
        this.totalMaxSequence = totalMaxSequence;
        return this;
    }

    public Boolean getTotalMinSequence() {
        return this.totalMinSequence;
    }

    public TotalBrandQuery setTotalMinSequence(Boolean totalMinSequence) {
        this.totalMinSequence = totalMinSequence;
        return this;
    }

    public Boolean getTotalAvgSequence() {
        return this.totalAvgSequence;
    }

    public TotalBrandQuery setTotalAvgSequence(Boolean totalAvgSequence) {
        this.totalAvgSequence = totalAvgSequence;
        return this;
    }

    public Integer getMaxTotalSumSequence() {
        return this.maxTotalSumSequence;
    }

    public TotalBrandQuery setMaxTotalSumSequence(Integer maxTotalSumSequence) {
        this.maxTotalSumSequence = maxTotalSumSequence;
        return this;
    }

    public Integer getMinTotalSumSequence() {
        return this.minTotalSumSequence;
    }

    public TotalBrandQuery setMinTotalSumSequence(Integer minTotalSumSequence) {
        this.minTotalSumSequence = minTotalSumSequence;
        return this;
    }

    public Integer getMinTotalMinSequence() {
        return this.minTotalMinSequence;
    }

    public TotalBrandQuery setMinTotalMinSequence(Integer minTotalMinSequence) {
        this.minTotalMinSequence = minTotalMinSequence;
        return this;
    }

    public Integer getMaxTotalMinSequence() {
        return this.maxTotalMinSequence;
    }

    public TotalBrandQuery setMaxTotalMinSequence(Integer maxTotalMinSequence) {
        this.maxTotalMinSequence = maxTotalMinSequence;
        return this;
    }

    public Integer getMinTotalMaxSequence() {
        return this.minTotalMaxSequence;
    }

    public TotalBrandQuery setMinTotalMaxSequence(Integer minTotalMaxSequence) {
        this.minTotalMaxSequence = minTotalMaxSequence;
        return this;
    }

    public Integer getMaxTotalMaxSequence() {
        return this.maxTotalMaxSequence;
    }

    public TotalBrandQuery setMaxTotalMaxSequence(Integer maxTotalMaxSequence) {
        this.maxTotalMaxSequence = maxTotalMaxSequence;
        return this;
    }

    public Integer getMinTotalAvgSequence() {
        return this.minTotalAvgSequence;
    }

    public TotalBrandQuery setMinTotalAvgSequence(Integer minTotalAvgSequence) {
        this.minTotalAvgSequence = minTotalAvgSequence;
        return this;
    }

    public Integer getMaxTotalAvgSequence() {
        return this.maxTotalAvgSequence;
    }

    public TotalBrandQuery setMaxTotalAvgSequence(Integer maxTotalAvgSequence) {
        this.maxTotalAvgSequence = maxTotalAvgSequence;
        return this;
    }

    public TotalBrandQuery setGroupByCreatedDate(com.xmg.mall.base.query.DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("createdDate", dateGroupBy);
        return this;
    }

    public TotalBrandQuery setGroupByFoundTime(com.xmg.mall.base.query.DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("foundTime", dateGroupBy);
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
