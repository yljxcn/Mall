
package com.xmg.mall.user.qo;

import java.util.Date;
import com.xmg.mall.base.query.DateGroupBy;
import com.xmg.mall.base.query.QueryCondition;

public class TotalUserQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.GroupBys groupBys = new com.xmg.mall.base.query.GroupBys();
    protected Long[] ids;
    protected Integer minTotalCountRows;
    protected Integer maxTotalCountRows;
    protected Boolean totalCountRows;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected String likeUsername;
    protected String username;
    protected String likePhoneNumber;
    protected String phoneNumber;
    protected String likeEmail;
    protected String email;

    public com.xmg.mall.base.query.GroupBys getGroupBys() {
        return this.groupBys;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public TotalUserQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Integer getMinTotalCountRows() {
        return this.minTotalCountRows;
    }

    public TotalUserQuery setMinTotalCountRows(Integer minTotalCountRows) {
        this.minTotalCountRows = minTotalCountRows;
        return this;
    }

    public Integer getMaxTotalCountRows() {
        return this.maxTotalCountRows;
    }

    public TotalUserQuery setMaxTotalCountRows(Integer maxTotalCountRows) {
        this.maxTotalCountRows = maxTotalCountRows;
        return this;
    }

    public Boolean getTotalCountRows() {
        return this.totalCountRows;
    }

    public TotalUserQuery setTotalCountRows(Boolean totalCountRows) {
        this.totalCountRows = totalCountRows;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public TotalUserQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public TotalUserQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public void setOrderByCreatedDate(int keyword) {
        setOrderBy("createdDate", keyword);
    }

    public int getOrderByCreatedDate() {
        return getOrderByKeyword("createdDate");
    }

    public String getLikeUsername() {
        return this.likeUsername;
    }

    public TotalUserQuery setLikeUsername(String likeUsername) {
        this.likeUsername = likeUsername;
        return this;
    }

    public String getUsername() {
        return this.username;
    }

    public TotalUserQuery setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getLikePhoneNumber() {
        return this.likePhoneNumber;
    }

    public TotalUserQuery setLikePhoneNumber(String likePhoneNumber) {
        this.likePhoneNumber = likePhoneNumber;
        return this;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public TotalUserQuery setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getLikeEmail() {
        return this.likeEmail;
    }

    public TotalUserQuery setLikeEmail(String likeEmail) {
        this.likeEmail = likeEmail;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public TotalUserQuery setEmail(String email) {
        this.email = email;
        return this;
    }

    public TotalUserQuery setGroupByCreatedDate(DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("createdDate", dateGroupBy);
        return this;
    }

}
