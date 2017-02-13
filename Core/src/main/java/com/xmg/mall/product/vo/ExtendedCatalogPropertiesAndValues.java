package com.xmg.mall.product.vo;

import com.xmg.mall.product.domain.CatalogProperty;

import java.util.List;

/**
 * Created by lony on 2017/2/7.
 */
public class ExtendedCatalogPropertiesAndValues {
    private CatalogProperty catalogProperty;
    private List<ExtendedCatalogPropertyAndValues> catalogPropertyAndValues;

    public CatalogProperty getCatalogProperty() {
        return catalogProperty;
    }

    public void setCatalogProperty(CatalogProperty catalogProperty) {
        this.catalogProperty = catalogProperty;
    }

    public List<ExtendedCatalogPropertyAndValues> getCatalogPropertyAndValues() {
        return catalogPropertyAndValues;
    }

    public void setCatalogPropertyAndValues(List<ExtendedCatalogPropertyAndValues> catalogPropertyAndValues) {
        this.catalogPropertyAndValues = catalogPropertyAndValues;
    }
}

