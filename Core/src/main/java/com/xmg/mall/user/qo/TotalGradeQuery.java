
package com.xmg.mall.user.qo;

import java.math.BigDecimal;
import java.util.Date;
import com.xmg.mall.base.query.DateGroupBy;
import com.xmg.mall.base.query.QueryCondition;

public class TotalGradeQuery
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
    protected Integer minUpperLimit;
    protected Integer maxUpperLimit;
    protected Integer upperLimit;
    protected Integer minLowerLimit;
    protected Integer maxLowerLimit;
    protected Integer lowerLimit;
    protected BigDecimal minDiscount;
    protected BigDecimal maxDiscount;
    protected BigDecimal discount;
    protected Boolean totalSumUpperLimit;
    protected Boolean totalMaxUpperLimit;
    protected Boolean totalMinUpperLimit;
    protected Boolean totalAvgUpperLimit;
    protected Integer maxTotalSumUpperLimit;
    protected Integer minTotalSumUpperLimit;
    protected Integer minTotalMinUpperLimit;
    protected Integer maxTotalMinUpperLimit;
    protected Integer minTotalMaxUpperLimit;
    protected Integer maxTotalMaxUpperLimit;
    protected Integer minTotalAvgUpperLimit;
    protected Integer maxTotalAvgUpperLimit;
    protected Boolean totalSumLowerLimit;
    protected Boolean totalMaxLowerLimit;
    protected Boolean totalMinLowerLimit;
    protected Boolean totalAvgLowerLimit;
    protected Integer maxTotalSumLowerLimit;
    protected Integer minTotalSumLowerLimit;
    protected Integer minTotalMinLowerLimit;
    protected Integer maxTotalMinLowerLimit;
    protected Integer minTotalMaxLowerLimit;
    protected Integer maxTotalMaxLowerLimit;
    protected Integer minTotalAvgLowerLimit;
    protected Integer maxTotalAvgLowerLimit;
    protected Boolean totalSumDiscount;
    protected Boolean totalMaxDiscount;
    protected Boolean totalMinDiscount;
    protected Boolean totalAvgDiscount;
    protected BigDecimal maxTotalSumDiscount;
    protected BigDecimal minTotalSumDiscount;
    protected BigDecimal minTotalMinDiscount;
    protected BigDecimal maxTotalMinDiscount;
    protected BigDecimal minTotalMaxDiscount;
    protected BigDecimal maxTotalMaxDiscount;
    protected BigDecimal minTotalAvgDiscount;
    protected BigDecimal maxTotalAvgDiscount;
    protected Boolean totalSumProportionalScoreValue;
    protected Boolean totalMaxProportionalScoreValue;
    protected Boolean totalMinProportionalScoreValue;
    protected Boolean totalAvgProportionalScoreValue;
    protected Integer maxTotalSumProportionalScoreValue;
    protected Integer minTotalSumProportionalScoreValue;
    protected Integer minTotalMinProportionalScoreValue;
    protected Integer maxTotalMinProportionalScoreValue;
    protected Integer minTotalMaxProportionalScoreValue;
    protected Integer maxTotalMaxProportionalScoreValue;
    protected Integer minTotalAvgProportionalScoreValue;
    protected Integer maxTotalAvgProportionalScoreValue;
    protected Boolean totalSumProportionalAmountValue;
    protected Boolean totalMaxProportionalAmountValue;
    protected Boolean totalMinProportionalAmountValue;
    protected Boolean totalAvgProportionalAmountValue;
    protected Integer maxTotalSumProportionalAmountValue;
    protected Integer minTotalSumProportionalAmountValue;
    protected Integer minTotalMinProportionalAmountValue;
    protected Integer maxTotalMinProportionalAmountValue;
    protected Integer minTotalMaxProportionalAmountValue;
    protected Integer maxTotalMaxProportionalAmountValue;
    protected Integer minTotalAvgProportionalAmountValue;
    protected Integer maxTotalAvgProportionalAmountValue;
    protected Long[] includeMods;
    protected Long[] excludeMods;

    public com.xmg.mall.base.query.GroupBys getGroupBys() {
        return this.groupBys;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public TotalGradeQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Integer getMinTotalCountRows() {
        return this.minTotalCountRows;
    }

    public TotalGradeQuery setMinTotalCountRows(Integer minTotalCountRows) {
        this.minTotalCountRows = minTotalCountRows;
        return this;
    }

    public Integer getMaxTotalCountRows() {
        return this.maxTotalCountRows;
    }

    public TotalGradeQuery setMaxTotalCountRows(Integer maxTotalCountRows) {
        this.maxTotalCountRows = maxTotalCountRows;
        return this;
    }

    public Boolean getTotalCountRows() {
        return this.totalCountRows;
    }

    public TotalGradeQuery setTotalCountRows(Boolean totalCountRows) {
        this.totalCountRows = totalCountRows;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public TotalGradeQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public TotalGradeQuery setEndCreatedDate(Date endCreatedDate) {
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

    public TotalGradeQuery setLikeName(String likeName) {
        this.likeName = likeName;
        return this;
    }

    public Integer getMinUpperLimit() {
        return this.minUpperLimit;
    }

    public TotalGradeQuery setMinUpperLimit(Integer minUpperLimit) {
        this.minUpperLimit = minUpperLimit;
        return this;
    }

    public Integer getMaxUpperLimit() {
        return this.maxUpperLimit;
    }

    public TotalGradeQuery setMaxUpperLimit(Integer maxUpperLimit) {
        this.maxUpperLimit = maxUpperLimit;
        return this;
    }

    public Integer getUpperLimit() {
        return this.upperLimit;
    }

    public TotalGradeQuery setUpperLimit(Integer upperLimit) {
        this.upperLimit = upperLimit;
        return this;
    }

    public Integer getMinLowerLimit() {
        return this.minLowerLimit;
    }

    public TotalGradeQuery setMinLowerLimit(Integer minLowerLimit) {
        this.minLowerLimit = minLowerLimit;
        return this;
    }

    public Integer getMaxLowerLimit() {
        return this.maxLowerLimit;
    }

    public TotalGradeQuery setMaxLowerLimit(Integer maxLowerLimit) {
        this.maxLowerLimit = maxLowerLimit;
        return this;
    }

    public Integer getLowerLimit() {
        return this.lowerLimit;
    }

    public TotalGradeQuery setLowerLimit(Integer lowerLimit) {
        this.lowerLimit = lowerLimit;
        return this;
    }

    public BigDecimal getMinDiscount() {
        return this.minDiscount;
    }

    public TotalGradeQuery setMinDiscount(BigDecimal minDiscount) {
        this.minDiscount = minDiscount;
        return this;
    }

    public BigDecimal getMaxDiscount() {
        return this.maxDiscount;
    }

    public TotalGradeQuery setMaxDiscount(BigDecimal maxDiscount) {
        this.maxDiscount = maxDiscount;
        return this;
    }

    public BigDecimal getDiscount() {
        return this.discount;
    }

    public TotalGradeQuery setDiscount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }

    public Boolean getTotalSumUpperLimit() {
        return this.totalSumUpperLimit;
    }

    public TotalGradeQuery setTotalSumUpperLimit(Boolean totalSumUpperLimit) {
        this.totalSumUpperLimit = totalSumUpperLimit;
        return this;
    }

    public Boolean getTotalMaxUpperLimit() {
        return this.totalMaxUpperLimit;
    }

    public TotalGradeQuery setTotalMaxUpperLimit(Boolean totalMaxUpperLimit) {
        this.totalMaxUpperLimit = totalMaxUpperLimit;
        return this;
    }

    public Boolean getTotalMinUpperLimit() {
        return this.totalMinUpperLimit;
    }

    public TotalGradeQuery setTotalMinUpperLimit(Boolean totalMinUpperLimit) {
        this.totalMinUpperLimit = totalMinUpperLimit;
        return this;
    }

    public Boolean getTotalAvgUpperLimit() {
        return this.totalAvgUpperLimit;
    }

    public TotalGradeQuery setTotalAvgUpperLimit(Boolean totalAvgUpperLimit) {
        this.totalAvgUpperLimit = totalAvgUpperLimit;
        return this;
    }

    public Integer getMaxTotalSumUpperLimit() {
        return this.maxTotalSumUpperLimit;
    }

    public TotalGradeQuery setMaxTotalSumUpperLimit(Integer maxTotalSumUpperLimit) {
        this.maxTotalSumUpperLimit = maxTotalSumUpperLimit;
        return this;
    }

    public Integer getMinTotalSumUpperLimit() {
        return this.minTotalSumUpperLimit;
    }

    public TotalGradeQuery setMinTotalSumUpperLimit(Integer minTotalSumUpperLimit) {
        this.minTotalSumUpperLimit = minTotalSumUpperLimit;
        return this;
    }

    public Integer getMinTotalMinUpperLimit() {
        return this.minTotalMinUpperLimit;
    }

    public TotalGradeQuery setMinTotalMinUpperLimit(Integer minTotalMinUpperLimit) {
        this.minTotalMinUpperLimit = minTotalMinUpperLimit;
        return this;
    }

    public Integer getMaxTotalMinUpperLimit() {
        return this.maxTotalMinUpperLimit;
    }

    public TotalGradeQuery setMaxTotalMinUpperLimit(Integer maxTotalMinUpperLimit) {
        this.maxTotalMinUpperLimit = maxTotalMinUpperLimit;
        return this;
    }

    public Integer getMinTotalMaxUpperLimit() {
        return this.minTotalMaxUpperLimit;
    }

    public TotalGradeQuery setMinTotalMaxUpperLimit(Integer minTotalMaxUpperLimit) {
        this.minTotalMaxUpperLimit = minTotalMaxUpperLimit;
        return this;
    }

    public Integer getMaxTotalMaxUpperLimit() {
        return this.maxTotalMaxUpperLimit;
    }

    public TotalGradeQuery setMaxTotalMaxUpperLimit(Integer maxTotalMaxUpperLimit) {
        this.maxTotalMaxUpperLimit = maxTotalMaxUpperLimit;
        return this;
    }

    public Integer getMinTotalAvgUpperLimit() {
        return this.minTotalAvgUpperLimit;
    }

    public TotalGradeQuery setMinTotalAvgUpperLimit(Integer minTotalAvgUpperLimit) {
        this.minTotalAvgUpperLimit = minTotalAvgUpperLimit;
        return this;
    }

    public Integer getMaxTotalAvgUpperLimit() {
        return this.maxTotalAvgUpperLimit;
    }

    public TotalGradeQuery setMaxTotalAvgUpperLimit(Integer maxTotalAvgUpperLimit) {
        this.maxTotalAvgUpperLimit = maxTotalAvgUpperLimit;
        return this;
    }

    public Boolean getTotalSumLowerLimit() {
        return this.totalSumLowerLimit;
    }

    public TotalGradeQuery setTotalSumLowerLimit(Boolean totalSumLowerLimit) {
        this.totalSumLowerLimit = totalSumLowerLimit;
        return this;
    }

    public Boolean getTotalMaxLowerLimit() {
        return this.totalMaxLowerLimit;
    }

    public TotalGradeQuery setTotalMaxLowerLimit(Boolean totalMaxLowerLimit) {
        this.totalMaxLowerLimit = totalMaxLowerLimit;
        return this;
    }

    public Boolean getTotalMinLowerLimit() {
        return this.totalMinLowerLimit;
    }

    public TotalGradeQuery setTotalMinLowerLimit(Boolean totalMinLowerLimit) {
        this.totalMinLowerLimit = totalMinLowerLimit;
        return this;
    }

    public Boolean getTotalAvgLowerLimit() {
        return this.totalAvgLowerLimit;
    }

    public TotalGradeQuery setTotalAvgLowerLimit(Boolean totalAvgLowerLimit) {
        this.totalAvgLowerLimit = totalAvgLowerLimit;
        return this;
    }

    public Integer getMaxTotalSumLowerLimit() {
        return this.maxTotalSumLowerLimit;
    }

    public TotalGradeQuery setMaxTotalSumLowerLimit(Integer maxTotalSumLowerLimit) {
        this.maxTotalSumLowerLimit = maxTotalSumLowerLimit;
        return this;
    }

    public Integer getMinTotalSumLowerLimit() {
        return this.minTotalSumLowerLimit;
    }

    public TotalGradeQuery setMinTotalSumLowerLimit(Integer minTotalSumLowerLimit) {
        this.minTotalSumLowerLimit = minTotalSumLowerLimit;
        return this;
    }

    public Integer getMinTotalMinLowerLimit() {
        return this.minTotalMinLowerLimit;
    }

    public TotalGradeQuery setMinTotalMinLowerLimit(Integer minTotalMinLowerLimit) {
        this.minTotalMinLowerLimit = minTotalMinLowerLimit;
        return this;
    }

    public Integer getMaxTotalMinLowerLimit() {
        return this.maxTotalMinLowerLimit;
    }

    public TotalGradeQuery setMaxTotalMinLowerLimit(Integer maxTotalMinLowerLimit) {
        this.maxTotalMinLowerLimit = maxTotalMinLowerLimit;
        return this;
    }

    public Integer getMinTotalMaxLowerLimit() {
        return this.minTotalMaxLowerLimit;
    }

    public TotalGradeQuery setMinTotalMaxLowerLimit(Integer minTotalMaxLowerLimit) {
        this.minTotalMaxLowerLimit = minTotalMaxLowerLimit;
        return this;
    }

    public Integer getMaxTotalMaxLowerLimit() {
        return this.maxTotalMaxLowerLimit;
    }

    public TotalGradeQuery setMaxTotalMaxLowerLimit(Integer maxTotalMaxLowerLimit) {
        this.maxTotalMaxLowerLimit = maxTotalMaxLowerLimit;
        return this;
    }

    public Integer getMinTotalAvgLowerLimit() {
        return this.minTotalAvgLowerLimit;
    }

    public TotalGradeQuery setMinTotalAvgLowerLimit(Integer minTotalAvgLowerLimit) {
        this.minTotalAvgLowerLimit = minTotalAvgLowerLimit;
        return this;
    }

    public Integer getMaxTotalAvgLowerLimit() {
        return this.maxTotalAvgLowerLimit;
    }

    public TotalGradeQuery setMaxTotalAvgLowerLimit(Integer maxTotalAvgLowerLimit) {
        this.maxTotalAvgLowerLimit = maxTotalAvgLowerLimit;
        return this;
    }

    public Boolean getTotalSumDiscount() {
        return this.totalSumDiscount;
    }

    public TotalGradeQuery setTotalSumDiscount(Boolean totalSumDiscount) {
        this.totalSumDiscount = totalSumDiscount;
        return this;
    }

    public Boolean getTotalMaxDiscount() {
        return this.totalMaxDiscount;
    }

    public TotalGradeQuery setTotalMaxDiscount(Boolean totalMaxDiscount) {
        this.totalMaxDiscount = totalMaxDiscount;
        return this;
    }

    public Boolean getTotalMinDiscount() {
        return this.totalMinDiscount;
    }

    public TotalGradeQuery setTotalMinDiscount(Boolean totalMinDiscount) {
        this.totalMinDiscount = totalMinDiscount;
        return this;
    }

    public Boolean getTotalAvgDiscount() {
        return this.totalAvgDiscount;
    }

    public TotalGradeQuery setTotalAvgDiscount(Boolean totalAvgDiscount) {
        this.totalAvgDiscount = totalAvgDiscount;
        return this;
    }

    public BigDecimal getMaxTotalSumDiscount() {
        return this.maxTotalSumDiscount;
    }

    public TotalGradeQuery setMaxTotalSumDiscount(BigDecimal maxTotalSumDiscount) {
        this.maxTotalSumDiscount = maxTotalSumDiscount;
        return this;
    }

    public BigDecimal getMinTotalSumDiscount() {
        return this.minTotalSumDiscount;
    }

    public TotalGradeQuery setMinTotalSumDiscount(BigDecimal minTotalSumDiscount) {
        this.minTotalSumDiscount = minTotalSumDiscount;
        return this;
    }

    public BigDecimal getMinTotalMinDiscount() {
        return this.minTotalMinDiscount;
    }

    public TotalGradeQuery setMinTotalMinDiscount(BigDecimal minTotalMinDiscount) {
        this.minTotalMinDiscount = minTotalMinDiscount;
        return this;
    }

    public BigDecimal getMaxTotalMinDiscount() {
        return this.maxTotalMinDiscount;
    }

    public TotalGradeQuery setMaxTotalMinDiscount(BigDecimal maxTotalMinDiscount) {
        this.maxTotalMinDiscount = maxTotalMinDiscount;
        return this;
    }

    public BigDecimal getMinTotalMaxDiscount() {
        return this.minTotalMaxDiscount;
    }

    public TotalGradeQuery setMinTotalMaxDiscount(BigDecimal minTotalMaxDiscount) {
        this.minTotalMaxDiscount = minTotalMaxDiscount;
        return this;
    }

    public BigDecimal getMaxTotalMaxDiscount() {
        return this.maxTotalMaxDiscount;
    }

    public TotalGradeQuery setMaxTotalMaxDiscount(BigDecimal maxTotalMaxDiscount) {
        this.maxTotalMaxDiscount = maxTotalMaxDiscount;
        return this;
    }

    public BigDecimal getMinTotalAvgDiscount() {
        return this.minTotalAvgDiscount;
    }

    public TotalGradeQuery setMinTotalAvgDiscount(BigDecimal minTotalAvgDiscount) {
        this.minTotalAvgDiscount = minTotalAvgDiscount;
        return this;
    }

    public BigDecimal getMaxTotalAvgDiscount() {
        return this.maxTotalAvgDiscount;
    }

    public TotalGradeQuery setMaxTotalAvgDiscount(BigDecimal maxTotalAvgDiscount) {
        this.maxTotalAvgDiscount = maxTotalAvgDiscount;
        return this;
    }

    public Boolean getTotalSumProportionalScoreValue() {
        return this.totalSumProportionalScoreValue;
    }

    public TotalGradeQuery setTotalSumProportionalScoreValue(Boolean totalSumProportionalScoreValue) {
        this.totalSumProportionalScoreValue = totalSumProportionalScoreValue;
        return this;
    }

    public Boolean getTotalMaxProportionalScoreValue() {
        return this.totalMaxProportionalScoreValue;
    }

    public TotalGradeQuery setTotalMaxProportionalScoreValue(Boolean totalMaxProportionalScoreValue) {
        this.totalMaxProportionalScoreValue = totalMaxProportionalScoreValue;
        return this;
    }

    public Boolean getTotalMinProportionalScoreValue() {
        return this.totalMinProportionalScoreValue;
    }

    public TotalGradeQuery setTotalMinProportionalScoreValue(Boolean totalMinProportionalScoreValue) {
        this.totalMinProportionalScoreValue = totalMinProportionalScoreValue;
        return this;
    }

    public Boolean getTotalAvgProportionalScoreValue() {
        return this.totalAvgProportionalScoreValue;
    }

    public TotalGradeQuery setTotalAvgProportionalScoreValue(Boolean totalAvgProportionalScoreValue) {
        this.totalAvgProportionalScoreValue = totalAvgProportionalScoreValue;
        return this;
    }

    public Integer getMaxTotalSumProportionalScoreValue() {
        return this.maxTotalSumProportionalScoreValue;
    }

    public TotalGradeQuery setMaxTotalSumProportionalScoreValue(Integer maxTotalSumProportionalScoreValue) {
        this.maxTotalSumProportionalScoreValue = maxTotalSumProportionalScoreValue;
        return this;
    }

    public Integer getMinTotalSumProportionalScoreValue() {
        return this.minTotalSumProportionalScoreValue;
    }

    public TotalGradeQuery setMinTotalSumProportionalScoreValue(Integer minTotalSumProportionalScoreValue) {
        this.minTotalSumProportionalScoreValue = minTotalSumProportionalScoreValue;
        return this;
    }

    public Integer getMinTotalMinProportionalScoreValue() {
        return this.minTotalMinProportionalScoreValue;
    }

    public TotalGradeQuery setMinTotalMinProportionalScoreValue(Integer minTotalMinProportionalScoreValue) {
        this.minTotalMinProportionalScoreValue = minTotalMinProportionalScoreValue;
        return this;
    }

    public Integer getMaxTotalMinProportionalScoreValue() {
        return this.maxTotalMinProportionalScoreValue;
    }

    public TotalGradeQuery setMaxTotalMinProportionalScoreValue(Integer maxTotalMinProportionalScoreValue) {
        this.maxTotalMinProportionalScoreValue = maxTotalMinProportionalScoreValue;
        return this;
    }

    public Integer getMinTotalMaxProportionalScoreValue() {
        return this.minTotalMaxProportionalScoreValue;
    }

    public TotalGradeQuery setMinTotalMaxProportionalScoreValue(Integer minTotalMaxProportionalScoreValue) {
        this.minTotalMaxProportionalScoreValue = minTotalMaxProportionalScoreValue;
        return this;
    }

    public Integer getMaxTotalMaxProportionalScoreValue() {
        return this.maxTotalMaxProportionalScoreValue;
    }

    public TotalGradeQuery setMaxTotalMaxProportionalScoreValue(Integer maxTotalMaxProportionalScoreValue) {
        this.maxTotalMaxProportionalScoreValue = maxTotalMaxProportionalScoreValue;
        return this;
    }

    public Integer getMinTotalAvgProportionalScoreValue() {
        return this.minTotalAvgProportionalScoreValue;
    }

    public TotalGradeQuery setMinTotalAvgProportionalScoreValue(Integer minTotalAvgProportionalScoreValue) {
        this.minTotalAvgProportionalScoreValue = minTotalAvgProportionalScoreValue;
        return this;
    }

    public Integer getMaxTotalAvgProportionalScoreValue() {
        return this.maxTotalAvgProportionalScoreValue;
    }

    public TotalGradeQuery setMaxTotalAvgProportionalScoreValue(Integer maxTotalAvgProportionalScoreValue) {
        this.maxTotalAvgProportionalScoreValue = maxTotalAvgProportionalScoreValue;
        return this;
    }

    public Boolean getTotalSumProportionalAmountValue() {
        return this.totalSumProportionalAmountValue;
    }

    public TotalGradeQuery setTotalSumProportionalAmountValue(Boolean totalSumProportionalAmountValue) {
        this.totalSumProportionalAmountValue = totalSumProportionalAmountValue;
        return this;
    }

    public Boolean getTotalMaxProportionalAmountValue() {
        return this.totalMaxProportionalAmountValue;
    }

    public TotalGradeQuery setTotalMaxProportionalAmountValue(Boolean totalMaxProportionalAmountValue) {
        this.totalMaxProportionalAmountValue = totalMaxProportionalAmountValue;
        return this;
    }

    public Boolean getTotalMinProportionalAmountValue() {
        return this.totalMinProportionalAmountValue;
    }

    public TotalGradeQuery setTotalMinProportionalAmountValue(Boolean totalMinProportionalAmountValue) {
        this.totalMinProportionalAmountValue = totalMinProportionalAmountValue;
        return this;
    }

    public Boolean getTotalAvgProportionalAmountValue() {
        return this.totalAvgProportionalAmountValue;
    }

    public TotalGradeQuery setTotalAvgProportionalAmountValue(Boolean totalAvgProportionalAmountValue) {
        this.totalAvgProportionalAmountValue = totalAvgProportionalAmountValue;
        return this;
    }

    public Integer getMaxTotalSumProportionalAmountValue() {
        return this.maxTotalSumProportionalAmountValue;
    }

    public TotalGradeQuery setMaxTotalSumProportionalAmountValue(Integer maxTotalSumProportionalAmountValue) {
        this.maxTotalSumProportionalAmountValue = maxTotalSumProportionalAmountValue;
        return this;
    }

    public Integer getMinTotalSumProportionalAmountValue() {
        return this.minTotalSumProportionalAmountValue;
    }

    public TotalGradeQuery setMinTotalSumProportionalAmountValue(Integer minTotalSumProportionalAmountValue) {
        this.minTotalSumProportionalAmountValue = minTotalSumProportionalAmountValue;
        return this;
    }

    public Integer getMinTotalMinProportionalAmountValue() {
        return this.minTotalMinProportionalAmountValue;
    }

    public TotalGradeQuery setMinTotalMinProportionalAmountValue(Integer minTotalMinProportionalAmountValue) {
        this.minTotalMinProportionalAmountValue = minTotalMinProportionalAmountValue;
        return this;
    }

    public Integer getMaxTotalMinProportionalAmountValue() {
        return this.maxTotalMinProportionalAmountValue;
    }

    public TotalGradeQuery setMaxTotalMinProportionalAmountValue(Integer maxTotalMinProportionalAmountValue) {
        this.maxTotalMinProportionalAmountValue = maxTotalMinProportionalAmountValue;
        return this;
    }

    public Integer getMinTotalMaxProportionalAmountValue() {
        return this.minTotalMaxProportionalAmountValue;
    }

    public TotalGradeQuery setMinTotalMaxProportionalAmountValue(Integer minTotalMaxProportionalAmountValue) {
        this.minTotalMaxProportionalAmountValue = minTotalMaxProportionalAmountValue;
        return this;
    }

    public Integer getMaxTotalMaxProportionalAmountValue() {
        return this.maxTotalMaxProportionalAmountValue;
    }

    public TotalGradeQuery setMaxTotalMaxProportionalAmountValue(Integer maxTotalMaxProportionalAmountValue) {
        this.maxTotalMaxProportionalAmountValue = maxTotalMaxProportionalAmountValue;
        return this;
    }

    public Integer getMinTotalAvgProportionalAmountValue() {
        return this.minTotalAvgProportionalAmountValue;
    }

    public TotalGradeQuery setMinTotalAvgProportionalAmountValue(Integer minTotalAvgProportionalAmountValue) {
        this.minTotalAvgProportionalAmountValue = minTotalAvgProportionalAmountValue;
        return this;
    }

    public Integer getMaxTotalAvgProportionalAmountValue() {
        return this.maxTotalAvgProportionalAmountValue;
    }

    public TotalGradeQuery setMaxTotalAvgProportionalAmountValue(Integer maxTotalAvgProportionalAmountValue) {
        this.maxTotalAvgProportionalAmountValue = maxTotalAvgProportionalAmountValue;
        return this;
    }

    public TotalGradeQuery setGroupByCreatedDate(DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("createdDate", dateGroupBy);
        return this;
    }

    public Long[] getIncludeMods() {
        return this.includeMods;
    }

    public TotalGradeQuery setIncludeMods(Long[] includeMods) {
        this.includeMods = includeMods;
        return this;
    }

    public Long[] getExcludeMods() {
        return this.excludeMods;
    }

    public TotalGradeQuery setExcludeMods(Long[] excludeMods) {
        this.excludeMods = excludeMods;
        return this;
    }

    public TotalGradeQuery setGroupByMods(Long mods) {
        if (mods!= null) {
            groupBys.addModsGroupBy("mods", mods);
        } else {
            groupBys.removeGroupBy("mods");
        }
        return this;
    }

}
