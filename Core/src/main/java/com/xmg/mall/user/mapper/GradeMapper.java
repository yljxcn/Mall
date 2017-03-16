
package com.xmg.mall.user.mapper;

import java.util.List;
import com.xmg.mall.user.domain.Grade;
import com.xmg.mall.user.qo.GradeQuery;
import com.xmg.mall.user.vo.ExtendedGrade;

public interface GradeMapper {


    public Grade get(Long id);

    public int update(Grade grade);

    public int add(Grade grade);

    public int delete(Long id);

    public int count(GradeQuery qo);

    public List<ExtendedGrade> query(GradeQuery qo);

}
