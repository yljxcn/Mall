package com.xmg.mall.web.controller.product;

import com.xmg.mall.product.domain.CatalogProperty;
import com.xmg.mall.product.vo.ExtendedCatalogPropertyValue;

import java.util.List;

/**
 * Created by lony on 2017/2/7.
 */
public class CatalogPropertiesAndValuesVO{
    private CatalogProperty catalogProperty;
    private List<ExtendedCatalogPropertyValue> catalogPropertyValues;

    public CatalogProperty getCatalogProperty() {
        return catalogProperty;
    }

    public void setCatalogProperty(CatalogProperty catalogProperty) {
        this.catalogProperty = catalogProperty;
    }

    public List<ExtendedCatalogPropertyValue> getCatalogPropertyValues() {
        return catalogPropertyValues;
    }

    public void setCatalogPropertyValues(List<ExtendedCatalogPropertyValue> catalogPropertyValues) {
        this.catalogPropertyValues = catalogPropertyValues;
    }
}

