
package com.xmg.mall.user.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.user.domain.User;
import com.xmg.mall.user.qo.UserQuery;
import com.xmg.mall.user.vo.ExtendedUser;

public interface UserService {


    public User getUser(Long id);

    public ExtendedUser queryOneUser(UserQuery qo);

    public List<ExtendedUser> listUsers(UserQuery qo);

    public Pagination<ExtendedUser> queryUsers(UserQuery qo);

    public int countUsers(UserQuery qo);

}
