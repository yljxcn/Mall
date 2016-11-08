
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.domain.ProductAudit;
import com.xmg.mall.product.qo.ProductAuditQuery;
import com.xmg.mall.product.vo.ExtendedProductAudit;

public interface ProductAuditMapper {


    public ProductAudit get(Long id);

    public int update(ProductAudit productAudit);

    public int add(ProductAudit productAudit);

    public int delete(Long id);

    public int count(ProductAuditQuery qo);

    public List<ExtendedProductAudit> query(ProductAuditQuery qo);

}
