
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.domain.SkuProperty;
import com.xmg.mall.product.qo.SkuPropertyQuery;
import com.xmg.mall.product.vo.ExtendedSkuProperty;

public interface SkuPropertyMapper {


    public SkuProperty get(Long id);

    public int update(SkuProperty skuProperty);

    public int add(SkuProperty skuProperty);

    public int delete(Long id);

    public int count(SkuPropertyQuery qo);

    public List<ExtendedSkuProperty> query(SkuPropertyQuery qo);

}
