
package com.xmg.mall.product.domain;

import com.xmg.mall.base.domain.BasicDomain;
import com.xmg.mall.base.domain.Mod;

public class SkuProperty
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long mods = 0L;
    public final static long MODS_Effective = 1L;
    public final static long MODS_RELATIONSHIP = (MODS_Effective<< 1L);
    protected String name;
    protected String code;

    public SkuProperty setMods(Long mods) {
        if (mods == null) {
            mods = 0L;
        }
        this.mods = mods;
        return this;
    }

    public Long getMods() {
        return this.mods;
    }

    public boolean hasEffective() {
        return Mod.hasMod(mods, MODS_Effective);
    }

    public SkuProperty setEffective(boolean b) {
        this.mods = Mod.setMod(mods, MODS_Effective, b);
        return this;
    }

    public boolean hasRelationship() {
        return Mod.hasMod(mods, MODS_RELATIONSHIP);
    }

    public SkuProperty setRelationship(boolean b) {
        this.mods = Mod.setMod(mods, MODS_RELATIONSHIP, b);
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

}
