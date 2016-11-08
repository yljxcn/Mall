
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.ProductAudit;
import com.xmg.mall.product.qo.ProductAuditQuery;
import com.xmg.mall.product.vo.ExtendedProductAudit;

public interface ProductAuditService {


    public ProductAudit getProductAudit(Long id);

    public ExtendedProductAudit queryOneProductAudit(ProductAuditQuery qo);

    public List<ExtendedProductAudit> listProductAudits(ProductAuditQuery qo);

    public Pagination<ExtendedProductAudit> queryProductAudits(ProductAuditQuery qo);

    public int countProductAudits(ProductAuditQuery qo);

}
