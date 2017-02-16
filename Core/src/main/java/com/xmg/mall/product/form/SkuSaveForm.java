package com.xmg.mall.product.form;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by lony on 2017/2/15.
 */
public class SkuSaveForm {

    private List<SaveSku> saveSkus;

    public List<SaveSku> getSaveSkus() {
        return saveSkus;
    }

    public void setSaveSkus(List<SaveSku> saveSkus) {
        this.saveSkus = saveSkus;
    }

    // 因为没有 static，访问这个类还需要通过 SkuSaveForm 的实例访问，然后 Spring MVC 在绑定参数的时候是直接拿到这个类来进行实例化的
    public static class SaveSku {
        private String code;
        private BigDecimal price;
        private List<Long> skuPropertyIds;
        private List<String> skuPropertyValues;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public List<Long> getSkuPropertyIds() {
            return skuPropertyIds;
        }

        public void setSkuPropertyIds(List<Long> skuPropertyIds) {
            this.skuPropertyIds = skuPropertyIds;
        }

        public List<String> getSkuPropertyValues() {
            return skuPropertyValues;
        }

        public void setSkuPropertyValues(List<String> skuPropertyValues) {
            this.skuPropertyValues = skuPropertyValues;
        }
    }
}
