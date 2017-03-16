
package com.xmg.mall.user.service.impl;

import com.xmg.mall.user.service.AddressService;
import com.xmg.mall.user.service.GradeService;
import com.xmg.mall.user.service.TotalAddressService;
import com.xmg.mall.user.service.TotalGradeService;
import com.xmg.mall.user.service.TotalUserGradeService;
import com.xmg.mall.user.service.TotalUserService;
import com.xmg.mall.user.service.UserGradeService;
import com.xmg.mall.user.service.UserModuleService;
import com.xmg.mall.user.service.UserService;
import org.springframework.stereotype.Service;

@Service("userModuleService")
public class BasicUserModuleService
    implements UserModuleService
{

    protected UserService userService;
    protected TotalUserService totalUserService;
    protected AddressService addressService;
    protected TotalAddressService totalAddressService;
    protected GradeService gradeService;
    protected TotalGradeService totalGradeService;
    protected UserGradeService userGradeService;
    protected TotalUserGradeService totalUserGradeService;

    public UserService getUserService() {
        return this.userService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicUserModuleService setUserService(UserService userService) {
        this.userService = userService;
        return this;
    }

    public TotalUserService getTotalUserService() {
        return this.totalUserService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicUserModuleService setTotalUserService(TotalUserService totalUserService) {
        this.totalUserService = totalUserService;
        return this;
    }

    public AddressService getAddressService() {
        return this.addressService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicUserModuleService setAddressService(AddressService addressService) {
        this.addressService = addressService;
        return this;
    }

    public TotalAddressService getTotalAddressService() {
        return this.totalAddressService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicUserModuleService setTotalAddressService(TotalAddressService totalAddressService) {
        this.totalAddressService = totalAddressService;
        return this;
    }

    public GradeService getGradeService() {
        return this.gradeService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicUserModuleService setGradeService(GradeService gradeService) {
        this.gradeService = gradeService;
        return this;
    }

    public TotalGradeService getTotalGradeService() {
        return this.totalGradeService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicUserModuleService setTotalGradeService(TotalGradeService totalGradeService) {
        this.totalGradeService = totalGradeService;
        return this;
    }

    public UserGradeService getUserGradeService() {
        return this.userGradeService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicUserModuleService setUserGradeService(UserGradeService userGradeService) {
        this.userGradeService = userGradeService;
        return this;
    }

    public TotalUserGradeService getTotalUserGradeService() {
        return this.totalUserGradeService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicUserModuleService setTotalUserGradeService(TotalUserGradeService totalUserGradeService) {
        this.totalUserGradeService = totalUserGradeService;
        return this;
    }

}
