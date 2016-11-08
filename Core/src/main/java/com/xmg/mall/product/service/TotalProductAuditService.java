
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.product.qo.TotalProductAuditQuery;
import com.xmg.mall.product.vo.TotalProductAudit;

public interface TotalProductAuditService {


    public List<TotalProductAudit> query(TotalProductAuditQuery qo);

    public TotalProductAudit queryOne(TotalProductAuditQuery qo);

}
