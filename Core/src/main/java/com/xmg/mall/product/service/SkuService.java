
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.Sku;
import com.xmg.mall.product.qo.SkuQuery;
import com.xmg.mall.product.vo.ExtendedSku;

public interface SkuService {


    public Sku getSku(Long id);

    public ExtendedSku queryOneSku(SkuQuery qo);

    public List<ExtendedSku> listSkus(SkuQuery qo);

    public Pagination<ExtendedSku> querySkus(SkuQuery qo);

    public int countSkus(SkuQuery qo);

}
