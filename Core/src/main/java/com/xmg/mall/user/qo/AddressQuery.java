
package com.xmg.mall.user.qo;

import java.util.Date;
import com.xmg.mall.base.query.QueryCondition;
import com.xmg.mall.system.qo.AreaQuery;
import com.xmg.mall.system.qo.CityQuery;
import com.xmg.mall.system.qo.ProvinceQuery;
import com.xmg.mall.system.qo.StreetQuery;

public class AddressQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.JoinType joinUser;
    protected UserQuery userQuery;
    protected com.xmg.mall.base.query.JoinType joinProvince;
    protected ProvinceQuery provinceQuery;
    protected com.xmg.mall.base.query.JoinType joinCity;
    protected CityQuery cityQuery;
    protected com.xmg.mall.base.query.JoinType joinArea;
    protected AreaQuery areaQuery;
    protected com.xmg.mall.base.query.JoinType joinStreet;
    protected StreetQuery streetQuery;
    protected Long[] ids;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long userId;
    protected Long provinceId;
    protected Long cityId;
    protected Long areaId;
    protected Long streetId;
    protected String detail;
    protected String likeDetail;
    protected String realname;
    protected String likeRealname;
    protected String phoneNumber;
    protected String likePhoneNumber;
    protected String email;
    protected String likeEmail;
    protected String zipCode;
    protected String likeZipCode;

    public boolean hasIds() {
        return (this.ids.length!= 0);
    }

    public com.xmg.mall.base.query.JoinType getJoinUser() {
        return this.joinUser;
    }

    public AddressQuery setJoinUser(com.xmg.mall.base.query.JoinType joinUser) {
        this.joinUser = joinUser;
        return this;
    }

    public UserQuery getUserQuery() {
        return this.userQuery;
    }

    public AddressQuery setUserQuery(UserQuery userQuery) {
        this.userQuery = userQuery;
        return this;
    }

    public AddressQuery setJoinUser() {
        this.setJoinUser(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinProvince() {
        return this.joinProvince;
    }

    public AddressQuery setJoinProvince(com.xmg.mall.base.query.JoinType joinProvince) {
        this.joinProvince = joinProvince;
        return this;
    }

    public ProvinceQuery getProvinceQuery() {
        return this.provinceQuery;
    }

    public AddressQuery setProvinceQuery(ProvinceQuery provinceQuery) {
        this.provinceQuery = provinceQuery;
        return this;
    }

    public AddressQuery setJoinProvince() {
        this.setJoinProvince(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinCity() {
        return this.joinCity;
    }

    public AddressQuery setJoinCity(com.xmg.mall.base.query.JoinType joinCity) {
        this.joinCity = joinCity;
        return this;
    }

    public CityQuery getCityQuery() {
        return this.cityQuery;
    }

    public AddressQuery setCityQuery(CityQuery cityQuery) {
        this.cityQuery = cityQuery;
        return this;
    }

    public AddressQuery setJoinCity() {
        this.setJoinCity(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinArea() {
        return this.joinArea;
    }

    public AddressQuery setJoinArea(com.xmg.mall.base.query.JoinType joinArea) {
        this.joinArea = joinArea;
        return this;
    }

    public AreaQuery getAreaQuery() {
        return this.areaQuery;
    }

    public AddressQuery setAreaQuery(AreaQuery areaQuery) {
        this.areaQuery = areaQuery;
        return this;
    }

    public AddressQuery setJoinArea() {
        this.setJoinArea(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinStreet() {
        return this.joinStreet;
    }

    public AddressQuery setJoinStreet(com.xmg.mall.base.query.JoinType joinStreet) {
        this.joinStreet = joinStreet;
        return this;
    }

    public StreetQuery getStreetQuery() {
        return this.streetQuery;
    }

    public AddressQuery setStreetQuery(StreetQuery streetQuery) {
        this.streetQuery = streetQuery;
        return this;
    }

    public AddressQuery setJoinStreet() {
        this.setJoinStreet(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public AddressQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public AddressQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public AddressQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public Long getUserId() {
        return this.userId;
    }

    public AddressQuery setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getProvinceId() {
        return this.provinceId;
    }

    public AddressQuery setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
        return this;
    }

    public Long getCityId() {
        return this.cityId;
    }

    public AddressQuery setCityId(Long cityId) {
        this.cityId = cityId;
        return this;
    }

    public Long getAreaId() {
        return this.areaId;
    }

    public AddressQuery setAreaId(Long areaId) {
        this.areaId = areaId;
        return this;
    }

    public Long getStreetId() {
        return this.streetId;
    }

    public AddressQuery setStreetId(Long streetId) {
        this.streetId = streetId;
        return this;
    }

    public String getDetail() {
        return this.detail;
    }

    public AddressQuery setDetail(String detail) {
        this.detail = detail;
        return this;
    }

    public String getLikeDetail() {
        return this.likeDetail;
    }

    public AddressQuery setLikeDetail(String likeDetail) {
        this.likeDetail = likeDetail;
        return this;
    }

    public String getRealname() {
        return this.realname;
    }

    public AddressQuery setRealname(String realname) {
        this.realname = realname;
        return this;
    }

    public String getLikeRealname() {
        return this.likeRealname;
    }

    public AddressQuery setLikeRealname(String likeRealname) {
        this.likeRealname = likeRealname;
        return this;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public AddressQuery setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getLikePhoneNumber() {
        return this.likePhoneNumber;
    }

    public AddressQuery setLikePhoneNumber(String likePhoneNumber) {
        this.likePhoneNumber = likePhoneNumber;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public AddressQuery setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getLikeEmail() {
        return this.likeEmail;
    }

    public AddressQuery setLikeEmail(String likeEmail) {
        this.likeEmail = likeEmail;
        return this;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public AddressQuery setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public String getLikeZipCode() {
        return this.likeZipCode;
    }

    public AddressQuery setLikeZipCode(String likeZipCode) {
        this.likeZipCode = likeZipCode;
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
