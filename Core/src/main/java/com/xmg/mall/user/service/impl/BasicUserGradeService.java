
package com.xmg.mall.user.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.user.domain.UserGrade;
import com.xmg.mall.user.mapper.UserGradeMapper;
import com.xmg.mall.user.qo.UserGradeQuery;
import com.xmg.mall.user.service.UserGradeService;
import com.xmg.mall.user.vo.ExtendedUserGrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userGradeService")
public class BasicUserGradeService
    implements UserGradeService
{

    private UserGradeMapper userGradeMapper;

    @Autowired
    public void setUserGradeMapper(UserGradeMapper userGradeMapper) {
        this.userGradeMapper = userGradeMapper;
    }

    @Override
    public UserGrade getUserGrade(Long id) {
        return userGradeMapper.get(id);
    }

    protected void updateUserGrade(UserGrade userGrade) {
        int affected = userGradeMapper.update(userGrade);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        userGrade.increaseVersion();
    }

    protected UserGrade addUserGrade(UserGrade userGrade) {
        userGrade.setCreatedDate(new Date());
        userGradeMapper.add(userGrade);
        return userGrade;
    }

    @Override
    public List<ExtendedUserGrade> listUserGrades(UserGradeQuery qo) {
        return userGradeMapper.query(qo);
    }

    @Override
    public ExtendedUserGrade queryOneUserGrade(UserGradeQuery qo) {
        qo.setPageSize(1);
        List<ExtendedUserGrade> datas = userGradeMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedUserGrade> queryUserGrades(UserGradeQuery qo) {
        int rows = userGradeMapper.count(qo);
        List<ExtendedUserGrade> datas = ((rows == 0)?new ArrayList<ExtendedUserGrade>():userGradeMapper.query(qo));
        return new Pagination<ExtendedUserGrade>(rows, datas);
    }

    @Override
    public int countUserGrades(UserGradeQuery qo) {
        return userGradeMapper.count(qo);
    }

}
