
package com.xmg.mall.system.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.system.domain.Province;
import com.xmg.mall.system.mapper.ProvinceMapper;
import com.xmg.mall.system.qo.ProvinceQuery;
import com.xmg.mall.system.service.ProvinceService;
import com.xmg.mall.system.vo.ExtendedProvince;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("provinceService")
public class BasicProvinceService
    implements ProvinceService
{

    private ProvinceMapper provinceMapper;

    @Autowired
    public void setProvinceMapper(ProvinceMapper provinceMapper) {
        this.provinceMapper = provinceMapper;
    }

    @Override
    public Province getProvince(Long id) {
        return provinceMapper.get(id);
    }

    protected void updateProvince(Province province) {
        int affected = provinceMapper.update(province);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        province.increaseVersion();
    }

    protected Province addProvince(Province province) {
        province.setCreatedDate(new Date());
        provinceMapper.add(province);
        return province;
    }

    @Override
    public List<ExtendedProvince> listProvinces(ProvinceQuery qo) {
        return provinceMapper.query(qo);
    }

    @Override
    public ExtendedProvince queryOneProvince(ProvinceQuery qo) {
        qo.setPageSize(1);
        List<ExtendedProvince> datas = provinceMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedProvince> queryProvinces(ProvinceQuery qo) {
        int rows = provinceMapper.count(qo);
        List<ExtendedProvince> datas = ((rows == 0)?new ArrayList<ExtendedProvince>():provinceMapper.query(qo));
        return new Pagination<ExtendedProvince>(rows, datas);
    }

    @Override
    public int countProvinces(ProvinceQuery qo) {
        return provinceMapper.count(qo);
    }

}
