
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.product.qo.TotalProductQuery;
import com.xmg.mall.product.vo.TotalProduct;

public interface TotalProductService {


    public List<TotalProduct> query(TotalProductQuery qo);

    public TotalProduct queryOne(TotalProductQuery qo);

}
