
package com.xmg.mall.system.service;

import java.util.List;
import com.xmg.mall.system.qo.TotalAreaQuery;
import com.xmg.mall.system.vo.TotalArea;

public interface TotalAreaService {


    public List<TotalArea> query(TotalAreaQuery qo);

    public TotalArea queryOne(TotalAreaQuery qo);

}
