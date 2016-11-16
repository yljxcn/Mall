
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;

public class BrandQuery
    extends QueryCondition
{

    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Date foundDate;
    protected Date startFoundDate;
    protected Date endFoundDate;
    protected String chineseName;
    protected String likeChineseName;
    protected String englishName;
    protected String likeEnglishName;
    protected Long[] includeMods;
    protected Long[] excludeMods;

    public boolean hasIds() {
        return (this.ids.length!= 0);
    }

    public BrandQuery setFoundDate(Date startFoundDate, Date endFoundDate) {
        setStartFoundDate(startFoundDate);
        setEndFoundDate(endFoundDate);
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

    public Date getFoundDate() {
        return this.foundDate;
    }

    public BrandQuery setFoundDate(Date foundDate) {
        this.foundDate = foundDate;
        return this;
    }

    public Date getStartFoundDate() {
        return this.startFoundDate;
    }

    public BrandQuery setStartFoundDate(Date startFoundDate) {
        this.startFoundDate = startFoundDate;
        return this;
    }

    public Date getEndFoundDate() {
        return this.endFoundDate;
    }

    public BrandQuery setEndFoundDate(Date endFoundDate) {
        this.endFoundDate = endFoundDate;
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

    public Long[] getIncludeMods() {
        return this.includeMods;
    }

    public BrandQuery setIncludeMods(Long[] includeMods) {
        this.includeMods = includeMods;
        return this;
    }

    public Long[] getExcludeMods() {
        return this.excludeMods;
    }

    public BrandQuery setExcludeMods(Long[] excludeMods) {
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

    public void setOrderBySequence(int keyword) {
        setOrderBy("sequence", keyword);
    }

    public int getOrderBySequence() {
        return getOrderByKeyword("sequence");
    }

}
