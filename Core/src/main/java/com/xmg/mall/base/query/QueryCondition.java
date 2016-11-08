package com.xmg.mall.base.query;

import java.util.LinkedHashMap;
import java.util.Map;



public class QueryCondition {

	public static final int ORDER_BY_KEYWORD_NONE = 0;
	public static final int ORDER_BY_KEYWORD_ASC = ORDER_BY_KEYWORD_NONE + 1;
	public static final int ORDER_BY_KEYWORD_DESC = ORDER_BY_KEYWORD_ASC + 1;

	private Integer page = 1;
	private Integer pageSize = 15;
	private Map<String, String> orderBys = new LinkedHashMap<String, String>();

	protected void setOrderBy(String propertyName, int keyword){
		if(keyword == ORDER_BY_KEYWORD_NONE){
			removeOrderBy(propertyName);
			return;
		}
		orderBys.put(propertyName, keyword == ORDER_BY_KEYWORD_ASC
										? "ASC"
										: "DESC");
	}

	protected void setOrderBy(String propertyName){
		setOrderBy(propertyName, ORDER_BY_KEYWORD_ASC);
	}

	protected void removeOrderBy(String propertyName){
		orderBys.remove(propertyName);
	}

	protected Integer getOrderByKeyword(String propertyName){
		String keyword = orderBys.get(propertyName);

		if(keyword == null)
			return ORDER_BY_KEYWORD_NONE;
		if(keyword.equals("ASC"))
			return ORDER_BY_KEYWORD_ASC;
		return ORDER_BY_KEYWORD_DESC;
	}

	public Integer getStart() {
		return (getPage() - 1) * pageSize;
	}

	public void setPage(Integer page) {
		if (page == null || page <= 0)
			return;
		this.page = page;
	}

	public Integer getPage() {
		return page;
	}

	public void setPageSize(Integer pageSize) {
		if (pageSize == null || pageSize <= 0)
			return;
		this.pageSize = pageSize;
	}

	public void setMaxPageSize(){
		this.pageSize = 0;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public Map<String, String> getOrderBys() {
		return orderBys;
	}
}
