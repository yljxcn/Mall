
package com.xmg.mall.user.service;

import java.util.List;
import com.xmg.mall.user.qo.TotalGradeQuery;
import com.xmg.mall.user.vo.TotalGrade;

public interface TotalGradeService {


    public List<TotalGrade> query(TotalGradeQuery qo);

    public TotalGrade queryOne(TotalGradeQuery qo);

}
