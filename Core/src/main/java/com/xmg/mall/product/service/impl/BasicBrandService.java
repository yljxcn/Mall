
package com.xmg.mall.product.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.Brand;
import com.xmg.mall.product.mapper.BrandMapper;
import com.xmg.mall.product.qo.BrandQuery;
import com.xmg.mall.product.service.BrandService;
import com.xmg.mall.product.vo.ExtendedBrand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("brandService")
public class BasicBrandService
    implements BrandService
{

    private BrandMapper brandMapper;

    @Autowired
    public void setBrandMapper(BrandMapper brandMapper) {
        this.brandMapper = brandMapper;
    }

    @Override
    public Brand getBrand(Long id) {
        return brandMapper.get(id);
    }

    protected void updateBrand(Brand brand) {
        int affected = brandMapper.update(brand);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        brand.increaseVersion();
    }

    protected Brand addBrand(Brand brand) {
        brand.setCreatedDate(new Date());
        brandMapper.add(brand);
        return brand;
    }

    @Override
    public List<ExtendedBrand> listBrands(BrandQuery qo) {
        return brandMapper.query(qo);
    }

    @Override
    public ExtendedBrand queryOneBrand(BrandQuery qo) {
        qo.setPageSize(1);
        List<ExtendedBrand> datas = brandMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedBrand> queryBrands(BrandQuery qo) {
        int rows = brandMapper.count(qo);
        List<ExtendedBrand> datas = ((rows == 0)?new ArrayList<ExtendedBrand>():brandMapper.query(qo));
        return new Pagination<ExtendedBrand>(rows, datas);
    }

    @Override
    public int countBrands(BrandQuery qo) {
        return brandMapper.count(qo);
    }

}
