
package com.xmg.mall.user.service.impl;

import java.util.List;
import com.xmg.mall.user.mapper.TotalGradeMapper;
import com.xmg.mall.user.qo.TotalGradeQuery;
import com.xmg.mall.user.service.TotalGradeService;
import com.xmg.mall.user.vo.TotalGrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalGradeService")
public class BasicTotalGradeService
    implements TotalGradeService
{

    protected TotalGradeMapper totalGradeMapper;

    @Autowired
    public BasicTotalGradeService setTotalGradeMapper(TotalGradeMapper totalGradeMapper) {
        this.totalGradeMapper = totalGradeMapper;
        return this;
    }

    public List<TotalGrade> query(TotalGradeQuery qo) {
        return this.totalGradeMapper.query(qo);
    }

    public TotalGrade queryOne(TotalGradeQuery qo) {
        qo.setPageSize(1);
        List<TotalGrade> datas = this.totalGradeMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
