
package com.xmg.mall.product.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.Impression;
import com.xmg.mall.product.mapper.ImpressionMapper;
import com.xmg.mall.product.qo.ImpressionQuery;
import com.xmg.mall.product.service.ImpressionService;
import com.xmg.mall.product.vo.ExtendedImpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("impressionService")
public class BasicImpressionService
    implements ImpressionService
{

    private ImpressionMapper impressionMapper;

    @Autowired
    public void setImpressionMapper(ImpressionMapper impressionMapper) {
        this.impressionMapper = impressionMapper;
    }

    @Override
    public Impression getImpression(Long id) {
        return impressionMapper.get(id);
    }

    protected void updateImpression(Impression impression) {
        int affected = impressionMapper.update(impression);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        impression.increaseVersion();
    }

    protected Impression addImpression(Impression impression) {
        impression.setCreatedDate(new Date());
        impressionMapper.add(impression);
        return impression;
    }

    @Override
    public List<ExtendedImpression> listImpressions(ImpressionQuery qo) {
        return impressionMapper.query(qo);
    }

    @Override
    public ExtendedImpression queryOneImpression(ImpressionQuery qo) {
        qo.setPageSize(1);
        List<ExtendedImpression> datas = impressionMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedImpression> queryImpressions(ImpressionQuery qo) {
        int rows = impressionMapper.count(qo);
        List<ExtendedImpression> datas = ((rows == 0)?new ArrayList<ExtendedImpression>():impressionMapper.query(qo));
        return new Pagination<ExtendedImpression>(rows, datas);
    }

    @Override
    public int countImpressions(ImpressionQuery qo) {
        return impressionMapper.count(qo);
    }

}
