
package com.xmg.mall.user.mapper;

import java.util.List;
import com.xmg.mall.user.qo.TotalGradeQuery;
import com.xmg.mall.user.vo.TotalGrade;

public interface TotalGradeMapper {


    public List<TotalGrade> query(TotalGradeQuery qo);

}
