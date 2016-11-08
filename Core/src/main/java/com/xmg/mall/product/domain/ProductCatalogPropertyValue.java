
package com.xmg.mall.product.domain;

import java.math.BigDecimal;
import com.xmg.mall.base.domain.BasicDomain;
import com.xmg.mall.base.domain.Mod;

public class ProductCatalogPropertyValue
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long flags = 0L;
    public final static long FLAGS_FREE = 1L;
    protected java.lang.Long productId;
    protected BigDecimal lowerLimit;
    protected BigDecimal freight;

    public ProductCatalogPropertyValue setFlags(Long flags) {
        if (flags == null) {
            flags = 0L;
        }
        this.flags = flags;
        return this;
    }

    public Long getFlags() {
        return this.flags;
    }

    public boolean hasFree() {
        return Mod.hasMod(flags, FLAGS_FREE);
    }

    public ProductCatalogPropertyValue setFree(boolean b) {
        this.flags = Mod.setMod(flags, FLAGS_FREE, b);
        return this;
    }

    public java.lang.Long getProductId() {
        return this.productId;
    }

    public ProductCatalogPropertyValue setProductId(java.lang.Long productId) {
        this.productId = productId;
        return this;
    }

    public BigDecimal getLowerLimit() {
        return this.lowerLimit;
    }

    public ProductCatalogPropertyValue setLowerLimit(BigDecimal lowerLimit) {
        this.lowerLimit = lowerLimit;
        return this;
    }

    public BigDecimal getFreight() {
        return this.freight;
    }

    public ProductCatalogPropertyValue setFreight(BigDecimal freight) {
        this.freight = freight;
        return this;
    }

}
