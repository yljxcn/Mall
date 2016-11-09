
package com.xmg.mall.product.domain;

import java.util.Date;
import com.xmg.mall.base.domain.BasicDomain;
import com.xmg.mall.base.domain.Mod;

public class Brand
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long visibilityState = 0L;
    public final static long VISIBILITY_STATE_VISIBLE = 1L;
    protected Date foundTime;
    protected String logo;
    protected String chineseName;
    protected String englishName;
    protected String description;
    protected String url;
    protected Integer sequence;

    public Brand setVisibilityState(Long visibilityState) {
        if (visibilityState == null) {
            visibilityState = 0L;
        }
        this.visibilityState = visibilityState;
        return this;
    }

    public Long getVisibilityState() {
        return this.visibilityState;
    }

    public boolean hasVisible() {
        return Mod.hasMod(visibilityState, VISIBILITY_STATE_VISIBLE);
    }

    public Brand setVisible(boolean b) {
        this.visibilityState = Mod.setMod(visibilityState, VISIBILITY_STATE_VISIBLE, b);
        return this;
    }

    public Date getFoundTime() {
        return this.foundTime;
    }

    public Brand setFoundTime(Date foundTime) {
        this.foundTime = foundTime;
        return this;
    }

    public String getLogo() {
        return this.logo;
    }

    public Brand setLogo(String logo) {
        this.logo = logo;
        return this;
    }

    public String getChineseName() {
        return this.chineseName;
    }

    public Brand setChineseName(String chineseName) {
        this.chineseName = chineseName;
        return this;
    }

    public String getEnglishName() {
        return this.englishName;
    }

    public Brand setEnglishName(String englishName) {
        this.englishName = englishName;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Brand setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getUrl() {
        return this.url;
    }

    public Brand setUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getSequence() {
        return this.sequence;
    }

    public Brand setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

}
