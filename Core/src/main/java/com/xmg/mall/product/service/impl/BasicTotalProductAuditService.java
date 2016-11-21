
package com.xmg.mall.product.service.impl;

import java.util.List;
import com.xmg.mall.product.mapper.TotalProductAuditMapper;
import com.xmg.mall.product.qo.TotalProductAuditQuery;
import com.xmg.mall.product.service.TotalProductAuditService;
import com.xmg.mall.product.vo.TotalProductAudit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalProductAuditService")
public class BasicTotalProductAuditService
    implements TotalProductAuditService
{

    protected TotalProductAuditMapper totalProductAuditMapper;

    @Autowired
    public BasicTotalProductAuditService setTotalProductAuditMapper(TotalProductAuditMapper totalProductAuditMapper) {
        this.totalProductAuditMapper = totalProductAuditMapper;
        return this;
    }

    public List<TotalProductAudit> query(TotalProductAuditQuery qo) {
        return this.totalProductAuditMapper.query(qo);
    }

    public TotalProductAudit queryOne(TotalProductAuditQuery qo) {
        qo.setPageSize(1);
        List<TotalProductAudit> datas = this.totalProductAuditMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
