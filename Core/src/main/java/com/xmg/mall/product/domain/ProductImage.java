
package com.xmg.mall.product.domain;

import com.xmg.mall.base.domain.BasicDomain;
import com.xmg.mall.base.domain.Mod;

public class ProductImage
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long mods = 0L;
    public final static long MODS_COVER = 1L;
    protected Long productId;
    protected String image;
    protected Integer sequence;

    public ProductImage setMods(Long mods) {
        if (mods == null) {
            mods = 0L;
        }
        this.mods = mods;
        return this;
    }

    public Long getMods() {
        return this.mods;
    }

    public boolean hasCover() {
        return Mod.hasMod(mods, MODS_COVER);
    }

    public ProductImage setCover(boolean b) {
        this.mods = Mod.setMod(mods, MODS_COVER, b);
        return this;
    }

    public Long getProductId() {
        return this.productId;
    }

    public ProductImage setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public String getImage() {
        return this.image;
    }

    public ProductImage setImage(String image) {
        this.image = image;
        return this;
    }

    public Integer getSequence() {
        return this.sequence;
    }

    public ProductImage setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

}
