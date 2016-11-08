
package com.xmg.mall.product.domain;

import java.math.BigDecimal;
import com.xmg.mall.base.domain.BasicDomain;

public class Sku
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long productId;
    protected String code;
    protected BigDecimal price;

    public Long getProductId() {
        return this.productId;
    }

    public Sku setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public Sku setCode(String code) {
        this.code = code;
        return this;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public Sku setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

}
