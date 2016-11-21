
package com.xmg.mall.product.service.impl;

import java.util.List;
import com.xmg.mall.product.mapper.TotalSkuPropertyMapper;
import com.xmg.mall.product.qo.TotalSkuPropertyQuery;
import com.xmg.mall.product.service.TotalSkuPropertyService;
import com.xmg.mall.product.vo.TotalSkuProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalSkuPropertyService")
public class BasicTotalSkuPropertyService
    implements TotalSkuPropertyService
{

    protected TotalSkuPropertyMapper totalSkuPropertyMapper;

    @Autowired
    public BasicTotalSkuPropertyService setTotalSkuPropertyMapper(TotalSkuPropertyMapper totalSkuPropertyMapper) {
        this.totalSkuPropertyMapper = totalSkuPropertyMapper;
        return this;
    }

    public List<TotalSkuProperty> query(TotalSkuPropertyQuery qo) {
        return this.totalSkuPropertyMapper.query(qo);
    }

    public TotalSkuProperty queryOne(TotalSkuPropertyQuery qo) {
        qo.setPageSize(1);
        List<TotalSkuProperty> datas = this.totalSkuPropertyMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
