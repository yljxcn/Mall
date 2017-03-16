
package com.xmg.mall.system.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.system.domain.Street;
import com.xmg.mall.system.mapper.StreetMapper;
import com.xmg.mall.system.qo.StreetQuery;
import com.xmg.mall.system.service.StreetService;
import com.xmg.mall.system.vo.ExtendedStreet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("streetService")
public class BasicStreetService
    implements StreetService
{

    private StreetMapper streetMapper;

    @Autowired
    public void setStreetMapper(StreetMapper streetMapper) {
        this.streetMapper = streetMapper;
    }

    @Override
    public Street getStreet(Long id) {
        return streetMapper.get(id);
    }

    protected void updateStreet(Street street) {
        int affected = streetMapper.update(street);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        street.increaseVersion();
    }

    protected Street addStreet(Street street) {
        street.setCreatedDate(new Date());
        streetMapper.add(street);
        return street;
    }

    @Override
    public List<ExtendedStreet> listStreets(StreetQuery qo) {
        return streetMapper.query(qo);
    }

    @Override
    public ExtendedStreet queryOneStreet(StreetQuery qo) {
        qo.setPageSize(1);
        List<ExtendedStreet> datas = streetMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedStreet> queryStreets(StreetQuery qo) {
        int rows = streetMapper.count(qo);
        List<ExtendedStreet> datas = ((rows == 0)?new ArrayList<ExtendedStreet>():streetMapper.query(qo));
        return new Pagination<ExtendedStreet>(rows, datas);
    }

    @Override
    public int countStreets(StreetQuery qo) {
        return streetMapper.count(qo);
    }

}
