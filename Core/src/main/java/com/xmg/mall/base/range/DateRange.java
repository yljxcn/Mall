package com.xmg.mall.base.range;

import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;

public class DateRange extends Range<Date, Date> {
	public DateRange(Date start, Date end, Date now) {
		super(start, end, now);
	}

	@Override
	public String toString() {
		String string = "yyyy-MM-dd HH:mm:ss";
		return DateFormatUtils.format(getMinimum(), string) + " -> " + DateFormatUtils.format(getMaximum(), string);
	}
}