
package com.xmg.mall.product.domain;

import java.math.BigDecimal;
import com.xmg.mall.base.domain.BasicDomain;
import com.xmg.mall.base.domain.Mod;

public class Product
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long flags = 0L;
    public final static long FLAGS_SHELVES = 1L;
    public final static long FLAGS_RECOMMENDED = (FLAGS_SHELVES<< 1L);
    protected java.lang.Long catalogId;
    protected java.lang.Long brandId;
    protected String name;
    protected String keyword;
    protected String code;
    protected String image;
    protected BigDecimal marketPrice;
    protected BigDecimal basePrice;

    public Product setFlags(Long flags) {
        if (flags == null) {
            flags = 0L;
        }
        this.flags = flags;
        return this;
    }

    public Long getFlags() {
        return this.flags;
    }

    public boolean hasShelves() {
        return Mod.hasMod(flags, FLAGS_SHELVES);
    }

    public Product setShelves(boolean b) {
        this.flags = Mod.setMod(flags, FLAGS_SHELVES, b);
        return this;
    }

    public boolean hasRecommended() {
        return Mod.hasMod(flags, FLAGS_RECOMMENDED);
    }

    public Product setRecommended(boolean b) {
        this.flags = Mod.setMod(flags, FLAGS_RECOMMENDED, b);
        return this;
    }

    public java.lang.Long getCatalogId() {
        return this.catalogId;
    }

    public Product setCatalogId(java.lang.Long catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    public java.lang.Long getBrandId() {
        return this.brandId;
    }

    public Product setBrandId(java.lang.Long brandId) {
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
