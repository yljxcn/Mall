
package com.xmg.mall.user.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.user.domain.Grade;
import com.xmg.mall.user.mapper.GradeMapper;
import com.xmg.mall.user.qo.GradeQuery;
import com.xmg.mall.user.service.GradeService;
import com.xmg.mall.user.vo.ExtendedGrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("gradeService")
public class BasicGradeService
    implements GradeService
{

    private GradeMapper gradeMapper;

    @Autowired
    public void setGradeMapper(GradeMapper gradeMapper) {
        this.gradeMapper = gradeMapper;
    }

    @Override
    public Grade getGrade(Long id) {
        return gradeMapper.get(id);
    }

    protected void updateGrade(Grade grade) {
        int affected = gradeMapper.update(grade);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        grade.increaseVersion();
    }

    protected Grade addGrade(Grade grade) {
        grade.setCreatedDate(new Date());
        gradeMapper.add(grade);
        return grade;
    }

    @Override
    public List<ExtendedGrade> listGrades(GradeQuery qo) {
        return gradeMapper.query(qo);
    }

    @Override
    public ExtendedGrade queryOneGrade(GradeQuery qo) {
        qo.setPageSize(1);
        List<ExtendedGrade> datas = gradeMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedGrade> queryGrades(GradeQuery qo) {
        int rows = gradeMapper.count(qo);
        List<ExtendedGrade> datas = ((rows == 0)?new ArrayList<ExtendedGrade>():gradeMapper.query(qo));
        return new Pagination<ExtendedGrade>(rows, datas);
    }

    @Override
    public int countGrades(GradeQuery qo) {
        return gradeMapper.count(qo);
    }

}
