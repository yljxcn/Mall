
package com.xmg.mall.user.qo;

import java.math.BigDecimal;
import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;

public class GradeQuery
    extends QueryCondition
{

    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected String likeName;
    protected Integer upperLimit;
    protected Integer minUpperLimit;
    protected Integer maxUpperLimit;
    protected Integer lowerLimit;
    protected Integer minLowerLimit;
    protected Integer maxLowerLimit;
    protected BigDecimal discount;
    protected BigDecimal minDiscount;
    protected BigDecimal maxDiscount;
    protected Long[] includeMods;
    protected Long[] excludeMods;

    public boolean hasIds() {
        return (this.ids.length!= 0);
    }

    public Long[] getIds() {
        return this.ids;
    }

    public GradeQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public GradeQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public GradeQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public String getLikeName() {
        return this.likeName;
    }

    public GradeQuery setLikeName(String likeName) {
        this.likeName = likeName;
        return this;
    }

    public Integer getUpperLimit() {
        return this.upperLimit;
    }

    public GradeQuery setUpperLimit(Integer upperLimit) {
        this.upperLimit = upperLimit;
        return this;
    }

    public Integer getMinUpperLimit() {
        return this.minUpperLimit;
    }

    public GradeQuery setMinUpperLimit(Integer minUpperLimit) {
        this.minUpperLimit = minUpperLimit;
        return this;
    }

    public Integer getMaxUpperLimit() {
        return this.maxUpperLimit;
    }

    public GradeQuery setMaxUpperLimit(Integer maxUpperLimit) {
        this.maxUpperLimit = maxUpperLimit;
        return this;
    }

    public Integer getLowerLimit() {
        return this.lowerLimit;
    }

    public GradeQuery setLowerLimit(Integer lowerLimit) {
        this.lowerLimit = lowerLimit;
        return this;
    }

    public Integer getMinLowerLimit() {
        return this.minLowerLimit;
    }

    public GradeQuery setMinLowerLimit(Integer minLowerLimit) {
        this.minLowerLimit = minLowerLimit;
        return this;
    }

    public Integer getMaxLowerLimit() {
        return this.maxLowerLimit;
    }

    public GradeQuery setMaxLowerLimit(Integer maxLowerLimit) {
        this.maxLowerLimit = maxLowerLimit;
        return this;
    }

    public BigDecimal getDiscount() {
        return this.discount;
    }

    public GradeQuery setDiscount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }

    public BigDecimal getMinDiscount() {
        return this.minDiscount;
    }

    public GradeQuery setMinDiscount(BigDecimal minDiscount) {
        this.minDiscount = minDiscount;
        return this;
    }

    public BigDecimal getMaxDiscount() {
        return this.maxDiscount;
    }

    public GradeQuery setMaxDiscount(BigDecimal maxDiscount) {
        this.maxDiscount = maxDiscount;
        return this;
    }

    public Long[] getIncludeMods() {
        return this.includeMods;
    }

    public GradeQuery setIncludeMods(Long[] includeMods) {
        this.includeMods = includeMods;
        return this;
    }

    public Long[] getExcludeMods() {
        return this.excludeMods;
    }

    public GradeQuery setExcludeMods(Long[] excludeMods) {
        this.excludeMods = excludeMods;
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
