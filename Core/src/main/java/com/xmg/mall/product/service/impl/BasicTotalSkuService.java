
package com.xmg.mall.product.service.impl;

import java.util.List;
import com.xmg.mall.product.mapper.TotalSkuMapper;
import com.xmg.mall.product.qo.TotalSkuQuery;
import com.xmg.mall.product.service.TotalSkuService;
import com.xmg.mall.product.vo.TotalSku;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalSkuService")
public class BasicTotalSkuService
    implements TotalSkuService
{

    protected TotalSkuMapper totalSkuMapper;

    @Autowired
    public BasicTotalSkuService setTotalSkuMapper(TotalSkuMapper totalSkuMapper) {
        this.totalSkuMapper = totalSkuMapper;
        return this;
    }

    public List<TotalSku> query(TotalSkuQuery qo) {
        return this.totalSkuMapper.query(qo);
    }

    public TotalSku queryOne(TotalSkuQuery qo) {
        qo.setPageSize(1);
        List<TotalSku> datas = this.totalSkuMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
