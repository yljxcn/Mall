
package com.xmg.mall.user.service;

import java.util.List;
import com.xmg.mall.user.qo.TotalUserGradeQuery;
import com.xmg.mall.user.vo.TotalUserGrade;

public interface TotalUserGradeService {


    public List<TotalUserGrade> query(TotalUserGradeQuery qo);

    public TotalUserGrade queryOne(TotalUserGradeQuery qo);

}
