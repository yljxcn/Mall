package com.xmg.mall.product.vo;

import com.xmg.mall.product.domain.CatalogProperty;

import java.util.List;

/**
 * Created by lony on 2017/2/7.
 */
public class ExtendedCatalogPropertiesAndValues {
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

