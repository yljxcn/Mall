
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.qo.TotalProductQuery;
import com.xmg.mall.product.vo.TotalProduct;

public interface TotalProductMapper {


    public List<TotalProduct> query(TotalProductQuery qo);

}
