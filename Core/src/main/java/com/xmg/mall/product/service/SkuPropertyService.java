
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.SkuProperty;
import com.xmg.mall.product.qo.SkuPropertyQuery;
import com.xmg.mall.product.vo.ExtendedSkuProperty;

public interface SkuPropertyService {


    public SkuProperty getSkuProperty(Long id);

    public ExtendedSkuProperty queryOneSkuProperty(SkuPropertyQuery qo);

    public List<ExtendedSkuProperty> listSkuPropertys(SkuPropertyQuery qo);

    public Pagination<ExtendedSkuProperty> querySkuPropertys(SkuPropertyQuery qo);

    public int countSkuPropertys(SkuPropertyQuery qo);

}
