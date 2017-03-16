
package com.xmg.mall.user.qo;

import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;

public class UserQuery
    extends QueryCondition
{

    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected String username;
    protected String likeUsername;
    protected String phoneNumber;
    protected String likePhoneNumber;
    protected String email;
    protected String likeEmail;

    public boolean hasIds() {
        return (this.ids.length!= 0);
    }

    public Long[] getIds() {
        return this.ids;
    }

    public UserQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public UserQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public UserQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public String getUsername() {
        return this.username;
    }

    public UserQuery setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getLikeUsername() {
        return this.likeUsername;
    }

    public UserQuery setLikeUsername(String likeUsername) {
        this.likeUsername = likeUsername;
        return this;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public UserQuery setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getLikePhoneNumber() {
        return this.likePhoneNumber;
    }

    public UserQuery setLikePhoneNumber(String likePhoneNumber) {
        this.likePhoneNumber = likePhoneNumber;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public UserQuery setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getLikeEmail() {
        return this.likeEmail;
    }

    public UserQuery setLikeEmail(String likeEmail) {
        this.likeEmail = likeEmail;
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
