
package com.xmg.mall.product.domain;

import java.math.BigDecimal;
import com.xmg.mall.base.domain.BasicDomain;
import com.xmg.mall.base.domain.Mod;

public class Product
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long mods = 0L;
    public final static long MODS_SHELVES = 1L;
    public final static long MODS_RECOMMENDED = (MODS_SHELVES<< 1L);
    protected Long catalogId;
    protected Long brandId;
    protected String name;
    protected String keyword;
    protected String code;
    protected String image;
    protected BigDecimal marketPrice;
    protected BigDecimal basePrice;

    public Product setMods(Long mods) {
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

    public Product setShelves(boolean b) {
        this.mods = Mod.setMod(mods, MODS_SHELVES, b);
        return this;
    }

    public boolean hasRecommended() {
        return Mod.hasMod(mods, MODS_RECOMMENDED);
    }

    public Product setRecommended(boolean b) {
        this.mods = Mod.setMod(mods, MODS_RECOMMENDED, b);
        return this;
    }

    public Long getCatalogId() {
        return this.catalogId;
    }

    public Product setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    public Long getBrandId() {
        return this.brandId;
    }

    public Product setBrandId(Long brandId) {
        this.brandId = brandId;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public Product setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public Product setCode(String code) {
        this.code = code;
        return this;
    }

    public String getImage() {
        return this.image;
    }

    public Product setImage(String image) {
        this.image = image;
        return this;
    }

    public BigDecimal getMarketPrice() {
        return this.marketPrice;
    }

    public Product setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
        return this;
    }

    public BigDecimal getBasePrice() {
        return this.basePrice;
    }

    public Product setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
        return this;
    }

}
