
package com.xmg.mall.user.qo;

import java.util.Date;
import com.xmg.mall.base.query.DateGroupBy;
import com.xmg.mall.base.query.QueryCondition;
import com.xmg.mall.system.qo.AreaQuery;
import com.xmg.mall.system.qo.CityQuery;
import com.xmg.mall.system.qo.ProvinceQuery;
import com.xmg.mall.system.qo.StreetQuery;

public class TotalAddressQuery
    extends QueryCondition
{

    protected com.xmg.mall.base.query.GroupBys groupBys = new com.xmg.mall.base.query.GroupBys();
    protected Long[] ids;
    protected Integer minTotalCountRows;
    protected Integer maxTotalCountRows;
    protected Boolean totalCountRows;
    protected Date startCreatedDate;
    protected Date endCreatedDate;
    protected Long userId;
    protected Long provinceId;
    protected Long cityId;
    protected Long areaId;
    protected Long streetId;
    protected String likeDetail;
    protected String detail;
    protected String likeRealname;
    protected String realname;
    protected String likePhoneNumber;
    protected String phoneNumber;
    protected String likeEmail;
    protected String email;
    protected String likeZipCode;
    protected String zipCode;
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

    public com.xmg.mall.base.query.GroupBys getGroupBys() {
        return this.groupBys;
    }

    public Long[] getIds() {
        return this.ids;
    }

    public TotalAddressQuery setIds(Long[] ids) {
        this.ids = ids;
        return this;
    }

    public Integer getMinTotalCountRows() {
        return this.minTotalCountRows;
    }

    public TotalAddressQuery setMinTotalCountRows(Integer minTotalCountRows) {
        this.minTotalCountRows = minTotalCountRows;
        return this;
    }

    public Integer getMaxTotalCountRows() {
        return this.maxTotalCountRows;
    }

    public TotalAddressQuery setMaxTotalCountRows(Integer maxTotalCountRows) {
        this.maxTotalCountRows = maxTotalCountRows;
        return this;
    }

    public Boolean getTotalCountRows() {
        return this.totalCountRows;
    }

    public TotalAddressQuery setTotalCountRows(Boolean totalCountRows) {
        this.totalCountRows = totalCountRows;
        return this;
    }

    public Date getStartCreatedDate() {
        return this.startCreatedDate;
    }

    public TotalAddressQuery setStartCreatedDate(Date startCreatedDate) {
        this.startCreatedDate = startCreatedDate;
        return this;
    }

    public Date getEndCreatedDate() {
        return this.endCreatedDate;
    }

    public TotalAddressQuery setEndCreatedDate(Date endCreatedDate) {
        this.endCreatedDate = endCreatedDate;
        return this;
    }

    public void setOrderByCreatedDate(int keyword) {
        setOrderBy("createdDate", keyword);
    }

    public int getOrderByCreatedDate() {
        return getOrderByKeyword("createdDate");
    }

    public Long getUserId() {
        return this.userId;
    }

    public TotalAddressQuery setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getProvinceId() {
        return this.provinceId;
    }

    public TotalAddressQuery setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
        return this;
    }

    public Long getCityId() {
        return this.cityId;
    }

    public TotalAddressQuery setCityId(Long cityId) {
        this.cityId = cityId;
        return this;
    }

    public Long getAreaId() {
        return this.areaId;
    }

    public TotalAddressQuery setAreaId(Long areaId) {
        this.areaId = areaId;
        return this;
    }

    public Long getStreetId() {
        return this.streetId;
    }

    public TotalAddressQuery setStreetId(Long streetId) {
        this.streetId = streetId;
        return this;
    }

    public String getLikeDetail() {
        return this.likeDetail;
    }

    public TotalAddressQuery setLikeDetail(String likeDetail) {
        this.likeDetail = likeDetail;
        return this;
    }

    public String getDetail() {
        return this.detail;
    }

    public TotalAddressQuery setDetail(String detail) {
        this.detail = detail;
        return this;
    }

    public String getLikeRealname() {
        return this.likeRealname;
    }

    public TotalAddressQuery setLikeRealname(String likeRealname) {
        this.likeRealname = likeRealname;
        return this;
    }

    public String getRealname() {
        return this.realname;
    }

    public TotalAddressQuery setRealname(String realname) {
        this.realname = realname;
        return this;
    }

    public String getLikePhoneNumber() {
        return this.likePhoneNumber;
    }

    public TotalAddressQuery setLikePhoneNumber(String likePhoneNumber) {
        this.likePhoneNumber = likePhoneNumber;
        return this;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public TotalAddressQuery setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getLikeEmail() {
        return this.likeEmail;
    }

    public TotalAddressQuery setLikeEmail(String likeEmail) {
        this.likeEmail = likeEmail;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public TotalAddressQuery setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getLikeZipCode() {
        return this.likeZipCode;
    }

    public TotalAddressQuery setLikeZipCode(String likeZipCode) {
        this.likeZipCode = likeZipCode;
        return this;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public TotalAddressQuery setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public TotalAddressQuery setGroupByCreatedDate(DateGroupBy dateGroupBy) {
        groupBys.addDateGroupBy("createdDate", dateGroupBy);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinUser() {
        return this.joinUser;
    }

    public TotalAddressQuery setJoinUser(com.xmg.mall.base.query.JoinType joinUser) {
        this.joinUser = joinUser;
        return this;
    }

    public UserQuery getUserQuery() {
        return this.userQuery;
    }

    public TotalAddressQuery setUserQuery(UserQuery userQuery) {
        this.userQuery = userQuery;
        return this;
    }

    public TotalAddressQuery setJoinUser() {
        this.setJoinUser(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinProvince() {
        return this.joinProvince;
    }

    public TotalAddressQuery setJoinProvince(com.xmg.mall.base.query.JoinType joinProvince) {
        this.joinProvince = joinProvince;
        return this;
    }

    public ProvinceQuery getProvinceQuery() {
        return this.provinceQuery;
    }

    public TotalAddressQuery setProvinceQuery(ProvinceQuery provinceQuery) {
        this.provinceQuery = provinceQuery;
        return this;
    }

    public TotalAddressQuery setJoinProvince() {
        this.setJoinProvince(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinCity() {
        return this.joinCity;
    }

    public TotalAddressQuery setJoinCity(com.xmg.mall.base.query.JoinType joinCity) {
        this.joinCity = joinCity;
        return this;
    }

    public CityQuery getCityQuery() {
        return this.cityQuery;
    }

    public TotalAddressQuery setCityQuery(CityQuery cityQuery) {
        this.cityQuery = cityQuery;
        return this;
    }

    public TotalAddressQuery setJoinCity() {
        this.setJoinCity(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinArea() {
        return this.joinArea;
    }

    public TotalAddressQuery setJoinArea(com.xmg.mall.base.query.JoinType joinArea) {
        this.joinArea = joinArea;
        return this;
    }

    public AreaQuery getAreaQuery() {
        return this.areaQuery;
    }

    public TotalAddressQuery setAreaQuery(AreaQuery areaQuery) {
        this.areaQuery = areaQuery;
        return this;
    }

    public TotalAddressQuery setJoinArea() {
        this.setJoinArea(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

    public com.xmg.mall.base.query.JoinType getJoinStreet() {
        return this.joinStreet;
    }

    public TotalAddressQuery setJoinStreet(com.xmg.mall.base.query.JoinType joinStreet) {
        this.joinStreet = joinStreet;
        return this;
    }

    public StreetQuery getStreetQuery() {
        return this.streetQuery;
    }

    public TotalAddressQuery setStreetQuery(StreetQuery streetQuery) {
        this.streetQuery = streetQuery;
        return this;
    }

    public TotalAddressQuery setJoinStreet() {
        this.setJoinStreet(com.xmg.mall.base.query.JoinType.LEFT);
        return this;
    }

}
