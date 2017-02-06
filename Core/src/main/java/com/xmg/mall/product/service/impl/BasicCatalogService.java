
package com.xmg.mall.product.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.Catalog;
import com.xmg.mall.product.domain.CatalogProperty;
import com.xmg.mall.product.domain.CatalogPropertyValue;
import com.xmg.mall.product.mapper.CatalogMapper;
import com.xmg.mall.product.qo.CatalogQuery;
import com.xmg.mall.product.service.CatalogPropertyService;
import com.xmg.mall.product.service.CatalogPropertyValueService;
import com.xmg.mall.product.service.CatalogService;
import com.xmg.mall.product.service.ProductModuleService;
import com.xmg.mall.product.vo.ExtendedCatalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("catalogService")
public class BasicCatalogService
    implements CatalogService
{

    private CatalogMapper catalogMapper;
    private ProductModuleService productModuleService;

    @Autowired
    public void setCatalogMapper(CatalogMapper catalogMapper) {
        this.catalogMapper = catalogMapper;
    }

    @Autowired
    public void setProductModuleService(ProductModuleService productModuleService) {
        this.productModuleService = productModuleService;
    }

    @Override
    public Catalog getCatalog(Long id) {
        return catalogMapper.get(id);
    }

    protected void updateCatalog(Catalog catalog) {
        int affected = catalogMapper.update(catalog);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        catalog.increaseVersion();
    }

    protected Catalog addCatalog(Catalog catalog) {
        catalog.setCreatedDate(new Date());
        catalogMapper.add(catalog);
        return catalog;
    }

    @Override
    public List<ExtendedCatalog> listCatalogs(CatalogQuery qo) {
        return catalogMapper.query(qo);
    }

    @Override
    public ExtendedCatalog queryOneCatalog(CatalogQuery qo) {
        qo.setPageSize(1);
        List<ExtendedCatalog> datas = catalogMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedCatalog> queryCatalogs(CatalogQuery qo) {
        int rows = catalogMapper.count(qo);
        List<ExtendedCatalog> datas = ((rows == 0)?new ArrayList<ExtendedCatalog>():catalogMapper.query(qo));
        return new Pagination<ExtendedCatalog>(rows, datas);
    }

    @Override
    public int countCatalogs(CatalogQuery qo) {
        return catalogMapper.count(qo);
    }

    @Override
    public void save(Catalog catalog, List<CatalogProperty> catalogProperties, List<CatalogPropertyValue> catalogPropertyValues) {
        // TODO 参数验证
        // 保存分类
        catalogMapper.add(catalog);

        // 保存分类属性
        for (int i = 0; i < catalogProperties.size(); i++) {
            CatalogProperty catalogProperty = catalogProperties.get(i);
            catalogProperty.setCatalogId(catalog.getId());
            catalogProperty.setSequence(i);
            productModuleService.getCatalogPropertyService().save(catalogProperty);
        }

        // 保存分类属性值
        for (int i = 0; i < catalogPropertyValues.size(); i++) {
            CatalogPropertyValue catalogPropertyValue = catalogPropertyValues.get(i);
            CatalogProperty catalogProperty = catalogProperties.get(i);
            if(catalogProperty.isRelationship()){
                String values = catalogPropertyValue.getValue();
                String[] valueArray = values.split(",|，");
                for (int j = 0; j < valueArray.length; j++) {
                    CatalogPropertyValue temp = new CatalogPropertyValue();
                    temp.setSequence(j);
                    temp.setCatalogPropertyId(catalogProperty.getId());
                    temp.setValue(valueArray[j]);
                    productModuleService.getCatalogPropertyValueService().save(temp);
                }
            }else {
                catalogPropertyValue.setCatalogPropertyId(catalogProperty.getId());
                catalogPropertyValue.setSequence(0);
                productModuleService.getCatalogPropertyValueService().save(catalogPropertyValue);
            }
        }
    }

    @Override
    public void update(Catalog catalog, List<CatalogProperty> catalogProperties, List<CatalogPropertyValue> catalogPropertyValues) {
        // TODO 参数验证
        catalogMapper.update(catalog);

        // TODO 能否允许删除已被关联的分类属性

    }

}
