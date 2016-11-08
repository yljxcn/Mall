package com.xmg.mall.base.clock;

import java.util.Date;

public class SystemClock implements Clock {

    @Override
    public Date now() {
        return new Date();
    }


}
