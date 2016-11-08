
package com.xmg.mall.product.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.ProductSkuPropertySequence;
import com.xmg.mall.product.mapper.ProductSkuPropertySequenceMapper;
import com.xmg.mall.product.qo.ProductSkuPropertySequenceQuery;
import com.xmg.mall.product.service.ProductSkuPropertySequenceService;
import com.xmg.mall.product.vo.ExtendedProductSkuPropertySequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productSkuPropertySequenceService")
public class BasicProductSkuPropertySequenceService
    implements ProductSkuPropertySequenceService
{

    private ProductSkuPropertySequenceMapper productSkuPropertySequenceMapper;

    @Autowired
    public void setProductSkuPropertySequenceMapper(ProductSkuPropertySequenceMapper productSkuPropertySequenceMapper) {
        this.productSkuPropertySequenceMapper = productSkuPropertySequenceMapper;
    }

    @Override
    public ProductSkuPropertySequence getProductSkuPropertySequence(Long id) {
        return productSkuPropertySequenceMapper.get(id);
    }

    protected void updateProductSkuPropertySequence(ProductSkuPropertySequence productSkuPropertySequence) {
        int affected = productSkuPropertySequenceMapper.update(productSkuPropertySequence);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        productSkuPropertySequence.increaseVersion();
    }

    protected ProductSkuPropertySequence addProductSkuPropertySequence(ProductSkuPropertySequence productSkuPropertySequence) {
        productSkuPropertySequence.setCreatedDate(new Date());
        productSkuPropertySequenceMapper.add(productSkuPropertySequence);
        return productSkuPropertySequence;
    }

    @Override
    public List<ExtendedProductSkuPropertySequence> listProductSkuPropertySequences(ProductSkuPropertySequenceQuery qo) {
        return productSkuPropertySequenceMapper.query(qo);
    }

    @Override
    public ExtendedProductSkuPropertySequence queryOneProductSkuPropertySequence(ProductSkuPropertySequenceQuery qo) {
        qo.setPageSize(1);
        List<ExtendedProductSkuPropertySequence> datas = productSkuPropertySequenceMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedProductSkuPropertySequence> queryProductSkuPropertySequences(ProductSkuPropertySequenceQuery qo) {
        int rows = productSkuPropertySequenceMapper.count(qo);
        List<ExtendedProductSkuPropertySequence> datas = ((rows == 0)?new ArrayList<ExtendedProductSkuPropertySequence>():productSkuPropertySequenceMapper.query(qo));
        return new Pagination<ExtendedProductSkuPropertySequence>(rows, datas);
    }

    @Override
    public int countProductSkuPropertySequences(ProductSkuPropertySequenceQuery qo) {
        return productSkuPropertySequenceMapper.count(qo);
    }

}
