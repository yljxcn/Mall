
package com.xmg.mall.user.service;


public interface UserModuleService {


    public UserService getUserService();

    public TotalUserService getTotalUserService();

    public AddressService getAddressService();

    public TotalAddressService getTotalAddressService();

    public GradeService getGradeService();

    public TotalGradeService getTotalGradeService();

    public UserGradeService getUserGradeService();

    public TotalUserGradeService getTotalUserGradeService();

}
