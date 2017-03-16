
package com.xmg.mall.user.mapper;

import java.util.List;
import com.xmg.mall.user.qo.TotalUserGradeQuery;
import com.xmg.mall.user.vo.TotalUserGrade;

public interface TotalUserGradeMapper {


    public List<TotalUserGrade> query(TotalUserGradeQuery qo);

}
