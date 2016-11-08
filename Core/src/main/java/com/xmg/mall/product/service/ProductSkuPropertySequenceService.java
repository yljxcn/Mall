
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.ProductSkuPropertySequence;
import com.xmg.mall.product.qo.ProductSkuPropertySequenceQuery;
import com.xmg.mall.product.vo.ExtendedProductSkuPropertySequence;

public interface ProductSkuPropertySequenceService {


    public ProductSkuPropertySequence getProductSkuPropertySequence(Long id);

    public ExtendedProductSkuPropertySequence queryOneProductSkuPropertySequence(ProductSkuPropertySequenceQuery qo);

    public List<ExtendedProductSkuPropertySequence> listProductSkuPropertySequences(ProductSkuPropertySequenceQuery qo);

    public Pagination<ExtendedProductSkuPropertySequence> queryProductSkuPropertySequences(ProductSkuPropertySequenceQuery qo);

    public int countProductSkuPropertySequences(ProductSkuPropertySequenceQuery qo);

}
