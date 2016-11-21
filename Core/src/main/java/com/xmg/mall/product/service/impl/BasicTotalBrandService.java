
package com.xmg.mall.product.service.impl;

import java.util.List;
import com.xmg.mall.product.mapper.TotalBrandMapper;
import com.xmg.mall.product.qo.TotalBrandQuery;
import com.xmg.mall.product.service.TotalBrandService;
import com.xmg.mall.product.vo.TotalBrand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalBrandService")
public class BasicTotalBrandService
    implements TotalBrandService
{

    protected TotalBrandMapper totalBrandMapper;

    @Autowired
    public BasicTotalBrandService setTotalBrandMapper(TotalBrandMapper totalBrandMapper) {
        this.totalBrandMapper = totalBrandMapper;
        return this;
    }

    public List<TotalBrand> query(TotalBrandQuery qo) {
        return this.totalBrandMapper.query(qo);
    }

    public TotalBrand queryOne(TotalBrandQuery qo) {
        qo.setPageSize(1);
        List<TotalBrand> datas = this.totalBrandMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
