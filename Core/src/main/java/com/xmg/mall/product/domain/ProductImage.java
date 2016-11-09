
package com.xmg.mall.product.domain;

import com.xmg.mall.base.domain.BasicDomain;
import com.xmg.mall.base.domain.Mod;

public class ProductImage
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long flags = 0L;
    public final static long FLAGS_COVER = 1L;
    protected Long productId;
    protected String image;
    protected Integer sequence;

    public ProductImage setFlags(Long flags) {
        if (flags == null) {
            flags = 0L;
        }
        this.flags = flags;
        return this;
    }

    public Long getFlags() {
        return this.flags;
    }

    public boolean hasCover() {
        return Mod.hasMod(flags, FLAGS_COVER);
    }

    public ProductImage setCover(boolean b) {
        this.flags = Mod.setMod(flags, FLAGS_COVER, b);
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
