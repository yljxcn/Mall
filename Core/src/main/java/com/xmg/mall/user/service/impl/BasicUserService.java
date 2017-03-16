
package com.xmg.mall.user.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.user.domain.User;
import com.xmg.mall.user.mapper.UserMapper;
import com.xmg.mall.user.qo.UserQuery;
import com.xmg.mall.user.service.UserService;
import com.xmg.mall.user.vo.ExtendedUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class BasicUserService
    implements UserService
{

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUser(Long id) {
        return userMapper.get(id);
    }

    protected void updateUser(User user) {
        int affected = userMapper.update(user);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        user.increaseVersion();
    }

    protected User addUser(User user) {
        user.setCreatedDate(new Date());
        userMapper.add(user);
        return user;
    }

    @Override
    public List<ExtendedUser> listUsers(UserQuery qo) {
        return userMapper.query(qo);
    }

    @Override
    public ExtendedUser queryOneUser(UserQuery qo) {
        qo.setPageSize(1);
        List<ExtendedUser> datas = userMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedUser> queryUsers(UserQuery qo) {
        int rows = userMapper.count(qo);
        List<ExtendedUser> datas = ((rows == 0)?new ArrayList<ExtendedUser>():userMapper.query(qo));
        return new Pagination<ExtendedUser>(rows, datas);
    }

    @Override
    public int countUsers(UserQuery qo) {
        return userMapper.count(qo);
    }

}
