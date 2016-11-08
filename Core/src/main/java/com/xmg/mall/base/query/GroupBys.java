package com.xmg.mall.base.query;

import java.util.LinkedHashMap;

public class GroupBys extends LinkedHashMap<String, String> {

	private static final long serialVersionUID = 5674064419940573492L;

	public void addDateGroupBy(String name, DateGroupBy type) {

		if (type == null) {
			removeDateGroupBy(name);
			return;
		}

		put(name, type.getName());
	}

	public void addModsGroupBy(String name, Long mod) {
		put(name, String.format("& %s <> 0", mod));
	}

	public void addGroupBy(String name) {
		put(name, null);
	}

	public void removeGroupBy(String name) {
		remove(name);
	}

	public void removeDateGroupBy(String name) {
		remove(name);
	}
}
