
package com.xmg.mall.product.service.impl;

import java.util.List;
import com.xmg.mall.product.mapper.TotalSkuPropertyRelationshipValueMapper;
import com.xmg.mall.product.qo.TotalSkuPropertyRelationshipValueQuery;
import com.xmg.mall.product.service.TotalSkuPropertyRelationshipValueService;
import com.xmg.mall.product.vo.TotalSkuPropertyRelationshipValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalSkuPropertyRelationshipValueService")
public class BasicTotalSkuPropertyRelationshipValueService
    implements TotalSkuPropertyRelationshipValueService
{

    protected TotalSkuPropertyRelationshipValueMapper totalSkuPropertyRelationshipValueMapper;

    @Autowired
    public BasicTotalSkuPropertyRelationshipValueService setTotalSkuPropertyRelationshipValueMapper(TotalSkuPropertyRelationshipValueMapper totalSkuPropertyRelationshipValueMapper) {
        this.totalSkuPropertyRelationshipValueMapper = totalSkuPropertyRelationshipValueMapper;
        return this;
    }

    public List<TotalSkuPropertyRelationshipValue> query(TotalSkuPropertyRelationshipValueQuery qo) {
        return this.totalSkuPropertyRelationshipValueMapper.query(qo);
    }

    public TotalSkuPropertyRelationshipValue queryOne(TotalSkuPropertyRelationshipValueQuery qo) {
        qo.setPageSize(1);
        List<TotalSkuPropertyRelationshipValue> datas = this.totalSkuPropertyRelationshipValueMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
