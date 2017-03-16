
package com.xmg.mall.user.mapper;

import java.util.List;
import com.xmg.mall.user.domain.UserGrade;
import com.xmg.mall.user.qo.UserGradeQuery;
import com.xmg.mall.user.vo.ExtendedUserGrade;

public interface UserGradeMapper {


    public UserGrade get(Long id);

    public int update(UserGrade userGrade);

    public int add(UserGrade userGrade);

    public int delete(Long id);

    public int count(UserGradeQuery qo);

    public List<ExtendedUserGrade> query(UserGradeQuery qo);

}
