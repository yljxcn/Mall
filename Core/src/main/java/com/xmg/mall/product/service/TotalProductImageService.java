
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.product.qo.TotalProductImageQuery;
import com.xmg.mall.product.vo.TotalProductImage;

public interface TotalProductImageService {


    public List<TotalProductImage> query(TotalProductImageQuery qo);

    public TotalProductImage queryOne(TotalProductImageQuery qo);

}
