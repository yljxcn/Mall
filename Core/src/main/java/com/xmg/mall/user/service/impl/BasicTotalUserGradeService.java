
package com.xmg.mall.user.service.impl;

import java.util.List;
import com.xmg.mall.user.mapper.TotalUserGradeMapper;
import com.xmg.mall.user.qo.TotalUserGradeQuery;
import com.xmg.mall.user.service.TotalUserGradeService;
import com.xmg.mall.user.vo.TotalUserGrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalUserGradeService")
public class BasicTotalUserGradeService
    implements TotalUserGradeService
{

    protected TotalUserGradeMapper totalUserGradeMapper;

    @Autowired
    public BasicTotalUserGradeService setTotalUserGradeMapper(TotalUserGradeMapper totalUserGradeMapper) {
        this.totalUserGradeMapper = totalUserGradeMapper;
        return this;
    }

    public List<TotalUserGrade> query(TotalUserGradeQuery qo) {
        return this.totalUserGradeMapper.query(qo);
    }

    public TotalUserGrade queryOne(TotalUserGradeQuery qo) {
        qo.setPageSize(1);
        List<TotalUserGrade> datas = this.totalUserGradeMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
