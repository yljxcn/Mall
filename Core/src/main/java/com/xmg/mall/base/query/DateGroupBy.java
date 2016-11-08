package com.xmg.mall.base.query;

public enum DateGroupBy {

	HOUR, DAY, MONTH, YEAR;

	public String getName() {

		switch (this) {
		case DAY:
			return "DAY";
		case MONTH:
			return "MONTH";
		case YEAR:
			return "YEAR";
		case HOUR:
			return "HOUR";
		}

		return "DAY";
	}

}
