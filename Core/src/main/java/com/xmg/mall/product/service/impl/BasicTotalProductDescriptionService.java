
package com.xmg.mall.product.service.impl;

import java.util.List;
import com.xmg.mall.product.mapper.TotalProductDescriptionMapper;
import com.xmg.mall.product.qo.TotalProductDescriptionQuery;
import com.xmg.mall.product.service.TotalProductDescriptionService;
import com.xmg.mall.product.vo.TotalProductDescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalProductDescriptionService")
public class BasicTotalProductDescriptionService
    implements TotalProductDescriptionService
{

    protected TotalProductDescriptionMapper totalProductDescriptionMapper;

    @Autowired
    public BasicTotalProductDescriptionService setTotalProductDescriptionMapper(TotalProductDescriptionMapper totalProductDescriptionMapper) {
        this.totalProductDescriptionMapper = totalProductDescriptionMapper;
        return this;
    }

    public List<TotalProductDescription> query(TotalProductDescriptionQuery qo) {
        return this.totalProductDescriptionMapper.query(qo);
    }

    public TotalProductDescription queryOne(TotalProductDescriptionQuery qo) {
        qo.setPageSize(1);
        List<TotalProductDescription> datas = this.totalProductDescriptionMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
