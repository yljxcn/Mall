
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.qo.TotalProductDescriptionQuery;
import com.xmg.mall.product.vo.TotalProductDescription;

public interface TotalProductDescriptionMapper {


    public List<TotalProductDescription> query(TotalProductDescriptionQuery qo);

}
