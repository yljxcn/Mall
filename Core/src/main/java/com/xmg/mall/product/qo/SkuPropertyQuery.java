
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;

public class SkuPropertyQuery
    extends QueryCondition
{

    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected String name;
    protected String likeName;
    protected String code;
    protected String likeCode;
    protected Long[] includeFlags;
    protected Long[] excludeFlags;

    public boolean hasIds() {
        return (this.ids.length!= 0);
    }

    public Long[] getIds() {
        return this.ids;
    }

    public SkuPropertyQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public SkuPropertyQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public SkuPropertyQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public SkuPropertyQuery setName(String name) {
        this.name = name;
        return this;
    }

    public String getLikeName() {
        return this.likeName;
    }

    public SkuPropertyQuery setLikeName(String likeName) {
        this.likeName = likeName;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public SkuPropertyQuery setCode(String code) {
        this.code = code;
        return this;
    }

    public String getLikeCode() {
        return this.likeCode;
    }

    public SkuPropertyQuery setLikeCode(String likeCode) {
        this.likeCode = likeCode;
        return this;
    }

    public Long[] getIncludeFlags() {
        return this.includeFlags;
    }

    public SkuPropertyQuery setIncludeFlags(Long[] includeFlags) {
        this.includeFlags = includeFlags;
        return this;
    }

    public Long[] getExcludeFlags() {
        return this.excludeFlags;
    }

    public SkuPropertyQuery setExcludeFlags(Long[] excludeFlags) {
        this.excludeFlags = excludeFlags;
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
