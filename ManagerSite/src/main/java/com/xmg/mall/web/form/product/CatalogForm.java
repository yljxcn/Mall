package com.xmg.mall.web.form.product;

import com.xmg.mall.product.domain.Catalog;
import com.xmg.mall.product.domain.CatalogProperty;
import com.xmg.mall.product.domain.CatalogPropertyValue;

import java.util.List;

/**
 * Created by lony on 2017/2/4.
 */
public class CatalogForm {
    private Catalog catalog;
    private List<CatalogProperty> catalogProperties;
    private List<CatalogPropertyValue> catalogPropertyValues;

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public List<CatalogProperty> getCatalogProperties() {
        return catalogProperties;
    }

    public void setCatalogProperties(List<CatalogProperty> catalogProperties) {
        this.catalogProperties = catalogProperties;
    }

    public List<CatalogPropertyValue> getCatalogPropertyValues() {
        return catalogPropertyValues;
    }

    public void setCatalogPropertyValues(List<CatalogPropertyValue> catalogPropertyValues) {
        this.catalogPropertyValues = catalogPropertyValues;
    }
}
