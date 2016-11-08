
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.qo.TotalProductImageQuery;
import com.xmg.mall.product.vo.TotalProductImage;

public interface TotalProductImageMapper {


    public List<TotalProductImage> query(TotalProductImageQuery qo);

}
