
package com.xmg.mall.product.service;

import java.util.List;
import java.util.Map;

import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.Product;
import com.xmg.mall.product.domain.SkuProperty;
import com.xmg.mall.product.domain.SkuPropertyValue;
import com.xmg.mall.product.qo.SkuPropertyQuery;
import com.xmg.mall.product.vo.ExtendedSkuProperty;

public interface SkuPropertyService {


    public SkuProperty getSkuProperty(Long id);

    public ExtendedSkuProperty queryOneSkuProperty(SkuPropertyQuery qo);

    public List<ExtendedSkuProperty> listSkuPropertys(SkuPropertyQuery qo);

    public Pagination<ExtendedSkuProperty> querySkuPropertys(SkuPropertyQuery qo);

    public int countSkuPropertys(SkuPropertyQuery qo);

    List<Map<String,Object>> generateSkus(Long productId, List<SkuProperty> skuProperties, List<SkuPropertyValue> skuPropertyValues);
}
