package com.xmg.mall.product.vo;

/**
 * Created by lony on 2017/2/13.
 */
public class ExtendedCatalogPropertyAndValues {
    private ExtendedCatalogPropertyValue catalogPropertyValue;
    private boolean show;

    public ExtendedCatalogPropertyValue getCatalogPropertyValue() {
        return catalogPropertyValue;
    }

    public void setCatalogPropertyValue(ExtendedCatalogPropertyValue catalogPropertyValue) {
        this.catalogPropertyValue = catalogPropertyValue;
    }

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }
}
