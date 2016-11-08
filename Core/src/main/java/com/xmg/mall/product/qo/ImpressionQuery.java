
package com.xmg.mall.product.qo;

import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;

public class ImpressionQuery
    extends QueryCondition
{

    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected String name;
    protected String likeName;

    public boolean hasIds() {
        return (this.ids.length!= 0);
    }

    public Long[] getIds() {
        return this.ids;
    }

    public ImpressionQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public ImpressionQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public ImpressionQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ImpressionQuery setName(String name) {
        this.name = name;
        return this;
    }

    public String getLikeName() {
        return this.likeName;
    }

    public ImpressionQuery setLikeName(String likeName) {
        this.likeName = likeName;
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
