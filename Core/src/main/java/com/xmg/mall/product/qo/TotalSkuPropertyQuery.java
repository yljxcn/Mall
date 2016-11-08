
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.DateGroupBy;
import com.xmg.mall.base.query.QueryCondition;

public class TotalSkuPropertyQuery
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
    protected String likeCode;
    protected String code;
    protected Long[] includeFlags;
    protected Long[] excludeFlags;

    public com.xmg.mall.base.query.GroupBys getGroupBys() {
        return this.groupBys;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public TotalSkuPropertyQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Integer getMinTotalCountRows() {
        return this.minTotalCountRows;
    }

    public TotalSkuPropertyQuery setMinTotalCountRows(Integer minTotalCountRows) {
        this.minTotalCountRows = minTotalCountRows;
        return this;
    }

    public Integer getMaxTotalCountRows() {
        return this.maxTotalCountRows;
    }

    public TotalSkuPropertyQuery setMaxTotalCountRows(Integer maxTotalCountRows) {
        this.maxTotalCountRows = maxTotalCountRows;
        return this;
    }

    public Boolean getTotalCountRows() {
        return this.totalCountRows;
    }

    public TotalSkuPropertyQuery setTotalCountRows(Boolean totalCountRows) {
        this.totalCountRows = totalCountRows;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public TotalSkuPropertyQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public TotalSkuPropertyQuery setEndCreatedDate(Date endCreatedDate) {
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

    public TotalSkuPropertyQuery setLikeName(String likeName) {
        this.likeName = likeName;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public TotalSkuPropertyQuery setName(String name) {
        this.name = name;
        return this;
    }

    public String getLikeCode() {
        return this.likeCode;
    }

    public TotalSkuPropertyQuery setLikeCode(String likeCode) {
        this.likeCode = likeCode;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public TotalSkuPropertyQuery setCode(String code) {
        this.code = code;
        return this;
    }

    public TotalSkuPropertyQuery setGroupByCreatedDate(DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("createdDate", dateGroupBy);
        return this;
    }

    public Long[] getIncludeFlags() {
        return this.includeFlags;
    }

    public TotalSkuPropertyQuery setIncludeFlags(Long[] includeFlags) {
        this.includeFlags = includeFlags;
        return this;
    }

    public Long[] getExcludeFlags() {
        return this.excludeFlags;
    }

    public TotalSkuPropertyQuery setExcludeFlags(Long[] excludeFlags) {
        this.excludeFlags = excludeFlags;
        return this;
    }

    public TotalSkuPropertyQuery setGroupByFlags(Long mods) {
        if (mods!= null) {
            groupBys.addModsGroupBy("flags", mods);
        } else {
            groupBys.removeGroupBy("flags");
        }
        return this;
    }

}
