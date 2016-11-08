package com.xmg.mall.base.query;

public enum JoinType {
	LEFT, INNER, RIGHT, OUTER;

	public String getName(){
		switch (this) {
		case LEFT:
			return "LEFT JOIN";
		case RIGHT:
			return "RIGHT JOIN";
		case OUTER:
			return "OUTER JOIN";
		default:
		case INNER:
			return "INNER JOIN";
		}
	}
}
