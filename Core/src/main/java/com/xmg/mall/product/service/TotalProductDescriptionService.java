
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.product.qo.TotalProductDescriptionQuery;
import com.xmg.mall.product.vo.TotalProductDescription;

public interface TotalProductDescriptionService {


    public List<TotalProductDescription> query(TotalProductDescriptionQuery qo);

    public TotalProductDescription queryOne(TotalProductDescriptionQuery qo);

}
