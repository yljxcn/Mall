
package com.xmg.mall.user.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.user.domain.UserGrade;
import com.xmg.mall.user.qo.UserGradeQuery;
import com.xmg.mall.user.vo.ExtendedUserGrade;

public interface UserGradeService {


    public UserGrade getUserGrade(Long id);

    public ExtendedUserGrade queryOneUserGrade(UserGradeQuery qo);

    public List<ExtendedUserGrade> listUserGrades(UserGradeQuery qo);

    public Pagination<ExtendedUserGrade> queryUserGrades(UserGradeQuery qo);

    public int countUserGrades(UserGradeQuery qo);

}
