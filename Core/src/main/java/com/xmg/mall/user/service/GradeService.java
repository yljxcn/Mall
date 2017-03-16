
package com.xmg.mall.user.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.user.domain.Grade;
import com.xmg.mall.user.qo.GradeQuery;
import com.xmg.mall.user.vo.ExtendedGrade;

public interface GradeService {


    public Grade getGrade(Long id);

    public ExtendedGrade queryOneGrade(GradeQuery qo);

    public List<ExtendedGrade> listGrades(GradeQuery qo);

    public Pagination<ExtendedGrade> queryGrades(GradeQuery qo);

    public int countGrades(GradeQuery qo);

}
