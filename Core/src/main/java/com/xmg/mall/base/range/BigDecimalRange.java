package com.xmg.mall.base.range;

import java.math.BigDecimal;

public class BigDecimalRange extends Range<BigDecimal, Object> {

	public BigDecimalRange(BigDecimal e1, BigDecimal e2) {
		super(e1, e2, null);
	}
	
	public BigDecimalRange() {
		
	}
	
	@Override
	public String toString() {
		return getMinimum() + " ~ " + getMaximum();
	}
}
