
package com.xmg.mall.product.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.ProductAudit;
import com.xmg.mall.product.mapper.ProductAuditMapper;
import com.xmg.mall.product.qo.ProductAuditQuery;
import com.xmg.mall.product.service.ProductAuditService;
import com.xmg.mall.product.vo.ExtendedProductAudit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productAuditService")
public class BasicProductAuditService
    implements ProductAuditService
{

    private ProductAuditMapper productAuditMapper;

    @Autowired
    public void setProductAuditMapper(ProductAuditMapper productAuditMapper) {
        this.productAuditMapper = productAuditMapper;
    }

    @Override
    public ProductAudit getProductAudit(Long id) {
        return productAuditMapper.get(id);
    }

    protected void updateProductAudit(ProductAudit productAudit) {
        int affected = productAuditMapper.update(productAudit);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        productAudit.increaseVersion();
    }

    protected ProductAudit addProductAudit(ProductAudit productAudit) {
        productAudit.setCreatedDate(new Date());
        productAuditMapper.add(productAudit);
        return productAudit;
    }

    @Override
    public List<ExtendedProductAudit> listProductAudits(ProductAuditQuery qo) {
        return productAuditMapper.query(qo);
    }

    @Override
    public ExtendedProductAudit queryOneProductAudit(ProductAuditQuery qo) {
        qo.setPageSize(1);
        List<ExtendedProductAudit> datas = productAuditMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedProductAudit> queryProductAudits(ProductAuditQuery qo) {
        int rows = productAuditMapper.count(qo);
        List<ExtendedProductAudit> datas = ((rows == 0)?new ArrayList<ExtendedProductAudit>():productAuditMapper.query(qo));
        return new Pagination<ExtendedProductAudit>(rows, datas);
    }

    @Override
    public int countProductAudits(ProductAuditQuery qo) {
        return productAuditMapper.count(qo);
    }

}
