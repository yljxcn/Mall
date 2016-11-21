
package com.xmg.mall.product.service.impl;

import java.util.List;
import com.xmg.mall.product.mapper.TotalProductImageMapper;
import com.xmg.mall.product.qo.TotalProductImageQuery;
import com.xmg.mall.product.service.TotalProductImageService;
import com.xmg.mall.product.vo.TotalProductImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalProductImageService")
public class BasicTotalProductImageService
    implements TotalProductImageService
{

    protected TotalProductImageMapper totalProductImageMapper;

    @Autowired
    public BasicTotalProductImageService setTotalProductImageMapper(TotalProductImageMapper totalProductImageMapper) {
        this.totalProductImageMapper = totalProductImageMapper;
        return this;
    }

    public List<TotalProductImage> query(TotalProductImageQuery qo) {
        return this.totalProductImageMapper.query(qo);
    }

    public TotalProductImage queryOne(TotalProductImageQuery qo) {
        qo.setPageSize(1);
        List<TotalProductImage> datas = this.totalProductImageMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
