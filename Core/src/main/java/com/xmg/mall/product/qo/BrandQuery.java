
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;

public class BrandQuery
    extends QueryCondition
{

    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Date foundTime;
    protected Date startFoundTime;
    protected Date endFoundTime;
    protected String chineseName;
    protected String likeChineseName;
    protected String englishName;
    protected String likeEnglishName;
    protected Long[] includeVisibilityState;
    protected Long[] excludeVisibilityState;

    public boolean hasIds() {
        return (this.ids.length!= 0);
    }

    public BrandQuery setFoundTime(Date startFoundTime, Date endFoundTime) {
        setStartFoundTime(startFoundTime);
        setEndFoundTime(endFoundTime);
        return this;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public BrandQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public BrandQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public BrandQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public Date getFoundTime() {
        return this.foundTime;
    }

    public BrandQuery setFoundTime(Date foundTime) {
        this.foundTime = foundTime;
        return this;
    }

    public Date getStartFoundTime() {
        return this.startFoundTime;
    }

    public BrandQuery setStartFoundTime(Date startFoundTime) {
        this.startFoundTime = startFoundTime;
        return this;
    }

    public Date getEndFoundTime() {
        return this.endFoundTime;
    }

    public BrandQuery setEndFoundTime(Date endFoundTime) {
        this.endFoundTime = endFoundTime;
        return this;
    }

    public String getChineseName() {
        return this.chineseName;
    }

    public BrandQuery setChineseName(String chineseName) {
        this.chineseName = chineseName;
        return this;
    }

    public String getLikeChineseName() {
        return this.likeChineseName;
    }

    public BrandQuery setLikeChineseName(String likeChineseName) {
        this.likeChineseName = likeChineseName;
        return this;
    }

    public String getEnglishName() {
        return this.englishName;
    }

    public BrandQuery setEnglishName(String englishName) {
        this.englishName = englishName;
        return this;
    }

    public String getLikeEnglishName() {
        return this.likeEnglishName;
    }

    public BrandQuery setLikeEnglishName(String likeEnglishName) {
        this.likeEnglishName = likeEnglishName;
        return this;
    }

    public Long[] getIncludeVisibilityState() {
        return this.includeVisibilityState;
    }

    public BrandQuery setIncludeVisibilityState(Long[] includeVisibilityState) {
        this.includeVisibilityState = includeVisibilityState;
        return this;
    }

    public Long[] getExcludeVisibilityState() {
        return this.excludeVisibilityState;
    }

    public BrandQuery setExcludeVisibilityState(Long[] excludeVisibilityState) {
        this.excludeVisibilityState = excludeVisibilityState;
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

    public void setOrderBySequence(int keyword) {
        setOrderBy("sequence", keyword);
    }

    public int getOrderBySequence() {
        return getOrderByKeyword("sequence");
    }

}
