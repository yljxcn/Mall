
package com.xmg.mall.product.service.impl;

import java.util.List;
import com.xmg.mall.product.mapper.TotalProductSkuPropertySequenceMapper;
import com.xmg.mall.product.qo.TotalProductSkuPropertySequenceQuery;
import com.xmg.mall.product.service.TotalProductSkuPropertySequenceService;
import com.xmg.mall.product.vo.TotalProductSkuPropertySequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalProductSkuPropertySequenceService")
public class BasicTotalProductSkuPropertySequenceService
    implements TotalProductSkuPropertySequenceService
{

    protected TotalProductSkuPropertySequenceMapper totalProductSkuPropertySequenceMapper;

    @Autowired
    public BasicTotalProductSkuPropertySequenceService setTotalProductSkuPropertySequenceMapper(TotalProductSkuPropertySequenceMapper totalProductSkuPropertySequenceMapper) {
        this.totalProductSkuPropertySequenceMapper = totalProductSkuPropertySequenceMapper;
        return this;
    }

    public List<TotalProductSkuPropertySequence> query(TotalProductSkuPropertySequenceQuery qo) {
        return this.totalProductSkuPropertySequenceMapper.query(qo);
    }

    public TotalProductSkuPropertySequence queryOne(TotalProductSkuPropertySequenceQuery qo) {
        qo.setPageSize(1);
        List<TotalProductSkuPropertySequence> datas = this.totalProductSkuPropertySequenceMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
