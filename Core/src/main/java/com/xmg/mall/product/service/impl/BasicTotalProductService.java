
package com.xmg.mall.product.service.impl;

import java.util.List;
import com.xmg.mall.product.mapper.TotalProductMapper;
import com.xmg.mall.product.qo.TotalProductQuery;
import com.xmg.mall.product.service.TotalProductService;
import com.xmg.mall.product.vo.TotalProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalProductService")
public class BasicTotalProductService
    implements TotalProductService
{

    protected TotalProductMapper totalProductMapper;

    @Autowired
    public BasicTotalProductService setTotalProductMapper(TotalProductMapper totalProductMapper) {
        this.totalProductMapper = totalProductMapper;
        return this;
    }

    public List<TotalProduct> query(TotalProductQuery qo) {
        return this.totalProductMapper.query(qo);
    }

    public TotalProduct queryOne(TotalProductQuery qo) {
        qo.setPageSize(1);
        List<TotalProduct> datas = this.totalProductMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
