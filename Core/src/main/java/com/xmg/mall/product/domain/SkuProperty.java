
package com.xmg.mall.product.domain;

import com.xmg.mall.base.domain.BasicDomain;
import com.xmg.mall.base.domain.Mod;

public class SkuProperty
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long flags = 0L;
    public final static long FLAGS_Effective = 1L;
    public final static long FLAGS_RELATIONSHIP = (FLAGS_Effective<< 1L);
    protected String name;
    protected String code;
    protected String image;

    public SkuProperty setFlags(Long flags) {
        if (flags == null) {
            flags = 0L;
        }
        this.flags = flags;
        return this;
    }

    public Long getFlags() {
        return this.flags;
    }

    public boolean hasEffective() {
        return Mod.hasMod(flags, FLAGS_Effective);
    }

    public SkuProperty setEffective(boolean b) {
        this.flags = Mod.setMod(flags, FLAGS_Effective, b);
        return this;
    }

    public boolean hasRelationship() {
        return Mod.hasMod(flags, FLAGS_RELATIONSHIP);
    }

    public SkuProperty setRelationship(boolean b) {
        this.flags = Mod.setMod(flags, FLAGS_RELATIONSHIP, b);
        return this;
    }

    public String getName() {
        return this.name;
    }

    public SkuProperty setName(String name) {
        this.name = name;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public SkuProperty setCode(String code) {
        this.code = code;
        return this;
    }

    public String getImage() {
        return this.image;
    }

    public SkuProperty setImage(String image) {
        this.image = image;
        return this;
    }

}
