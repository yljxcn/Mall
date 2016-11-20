
package com.xmg.mall.product.domain;

import java.math.BigDecimal;
import com.xmg.mall.base.domain.BasicDomain;
import com.xmg.mall.base.domain.Mod;

public class Sku
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long mods = 0L;
    public final static long MODS_SHELVES = 1L;
    protected Long productId;
    protected String code;
    protected BigDecimal price;

    public Sku setMods(Long mods) {
        if (mods == null) {
            mods = 0L;
        }
        this.mods = mods;
        return this;
    }

    public Long getMods() {
        return this.mods;
    }

    public boolean hasShelves() {
        return Mod.hasMod(mods, MODS_SHELVES);
    }

    public Sku setShelves(boolean b) {
        this.mods = Mod.setMod(mods, MODS_SHELVES, b);
        return this;
    }

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
