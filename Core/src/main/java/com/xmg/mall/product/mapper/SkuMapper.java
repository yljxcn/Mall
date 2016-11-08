
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.domain.Sku;
import com.xmg.mall.product.qo.SkuQuery;
import com.xmg.mall.product.vo.ExtendedSku;

public interface SkuMapper {


    public Sku get(Long id);

    public int update(Sku sku);

    public int add(Sku sku);

    public int delete(Long id);

    public int count(SkuQuery qo);

    public List<ExtendedSku> query(SkuQuery qo);

}
