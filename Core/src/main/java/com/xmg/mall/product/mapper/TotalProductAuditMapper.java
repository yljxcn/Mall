
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.qo.TotalProductAuditQuery;
import com.xmg.mall.product.vo.TotalProductAudit;

public interface TotalProductAuditMapper {


    public List<TotalProductAudit> query(TotalProductAuditQuery qo);

}
