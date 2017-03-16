
package com.xmg.mall.system.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.system.domain.Area;
import com.xmg.mall.system.mapper.AreaMapper;
import com.xmg.mall.system.qo.AreaQuery;
import com.xmg.mall.system.service.AreaService;
import com.xmg.mall.system.vo.ExtendedArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("areaService")
public class BasicAreaService
    implements AreaService
{

    private AreaMapper areaMapper;

    @Autowired
    public void setAreaMapper(AreaMapper areaMapper) {
        this.areaMapper = areaMapper;
    }

    @Override
    public Area getArea(Long id) {
        return areaMapper.get(id);
    }

    protected void updateArea(Area area) {
        int affected = areaMapper.update(area);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        area.increaseVersion();
    }

    protected Area addArea(Area area) {
        area.setCreatedDate(new Date());
        areaMapper.add(area);
        return area;
    }

    @Override
    public List<ExtendedArea> listAreas(AreaQuery qo) {
        return areaMapper.query(qo);
    }

    @Override
    public ExtendedArea queryOneArea(AreaQuery qo) {
        qo.setPageSize(1);
        List<ExtendedArea> datas = areaMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedArea> queryAreas(AreaQuery qo) {
        int rows = areaMapper.count(qo);
        List<ExtendedArea> datas = ((rows == 0)?new ArrayList<ExtendedArea>():areaMapper.query(qo));
        return new Pagination<ExtendedArea>(rows, datas);
    }

    @Override
    public int countAreas(AreaQuery qo) {
        return areaMapper.count(qo);
    }

}
