
package com.xmg.mall.user.domain;

import java.math.BigDecimal;
import com.xmg.mall.base.domain.BasicDomain;
import com.xmg.mall.base.domain.Mod;

public class Grade
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long mods = 0L;
    public final static long MODS_SHOW_DISCOUNTED_PRICE = 1L;
    protected String name;
    protected Integer upperLimit;
    protected Integer lowerLimit;
    protected BigDecimal discount;
    protected Integer proportionalScoreValue;
    protected Integer proportionalAmountValue;

    public Grade setMods(Long mods) {
        if (mods == null) {
            mods = 0L;
        }
        this.mods = mods;
        return this;
    }

    public Long getMods() {
        return this.mods;
    }

    public boolean hasShowDiscountedPrice() {
        return Mod.hasMod(mods, MODS_SHOW_DISCOUNTED_PRICE);
    }

    public Grade setShowDiscountedPrice(boolean b) {
        this.mods = Mod.setMod(mods, MODS_SHOW_DISCOUNTED_PRICE, b);
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Grade setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getUpperLimit() {
        return this.upperLimit;
    }

    public Grade setUpperLimit(Integer upperLimit) {
        this.upperLimit = upperLimit;
        return this;
    }

    public Integer getLowerLimit() {
        return this.lowerLimit;
    }

    public Grade setLowerLimit(Integer lowerLimit) {
        this.lowerLimit = lowerLimit;
        return this;
    }

    public BigDecimal getDiscount() {
        return this.discount;
    }

    public Grade setDiscount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }

    public Integer getProportionalScoreValue() {
        return this.proportionalScoreValue;
    }

    public Grade setProportionalScoreValue(Integer proportionalScoreValue) {
        this.proportionalScoreValue = proportionalScoreValue;
        return this;
    }

    public Integer getProportionalAmountValue() {
        return this.proportionalAmountValue;
    }

    public Grade setProportionalAmountValue(Integer proportionalAmountValue) {
        this.proportionalAmountValue = proportionalAmountValue;
        return this;
    }

}
