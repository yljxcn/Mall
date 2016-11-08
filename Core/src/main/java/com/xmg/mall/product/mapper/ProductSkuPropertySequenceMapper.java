
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.domain.ProductSkuPropertySequence;
import com.xmg.mall.product.qo.ProductSkuPropertySequenceQuery;
import com.xmg.mall.product.vo.ExtendedProductSkuPropertySequence;

public interface ProductSkuPropertySequenceMapper {


    public ProductSkuPropertySequence get(Long id);

    public int update(ProductSkuPropertySequence productSkuPropertySequence);

    public int add(ProductSkuPropertySequence productSkuPropertySequence);

    public int delete(Long id);

    public int count(ProductSkuPropertySequenceQuery qo);

    public List<ExtendedProductSkuPropertySequence> query(ProductSkuPropertySequenceQuery qo);

}
