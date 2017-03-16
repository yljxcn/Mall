
package com.xmg.mall.user.mapper;

import java.util.List;
import com.xmg.mall.user.domain.User;
import com.xmg.mall.user.qo.UserQuery;
import com.xmg.mall.user.vo.ExtendedUser;

public interface UserMapper {


    public User get(Long id);

    public int update(User user);

    public int add(User user);

    public int delete(Long id);

    public int count(UserQuery qo);

    public List<ExtendedUser> query(UserQuery qo);

}
