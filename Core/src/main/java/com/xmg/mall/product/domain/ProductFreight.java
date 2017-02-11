
package com.xmg.mall.product.domain;

import java.math.BigDecimal;
import com.xmg.mall.base.domain.BasicDomain;
import com.xmg.mall.base.domain.Mod;

public class ProductFreight
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long mods = 0L;
    public final static long MODS_FREE = 1L;
    protected Long productId;
    protected BigDecimal lowerLimit;
    protected BigDecimal freight;

    public ProductFreight setMods(Long mods) {
        if (mods == null) {
            mods = 0L;
        }
        this.mods = mods;
        return this;
    }

    public Long getMods() {
        return this.mods;
    }

    public boolean hasFree() {
        return Mod.hasMod(mods, MODS_FREE);
    }

    public ProductFreight setFree(boolean b) {
        this.mods = Mod.setMod(mods, MODS_FREE, b);
        return this;
    }

    public Long getProductId() {
        return this.productId;
    }

    public ProductFreight setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public BigDecimal getLowerLimit() {
        return this.lowerLimit;
    }

    public ProductFreight setLowerLimit(BigDecimal lowerLimit) {
        this.lowerLimit = lowerLimit;
        return this;
    }

    public BigDecimal getFreight() {
        return this.freight;
    }

    public ProductFreight setFreight(BigDecimal freight) {
        this.freight = freight;
        return this;
    }

}
