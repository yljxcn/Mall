package com.xmg.mall.base.query;

import java.util.Iterator;
import java.util.List;

public class Pagination<T> {
	
	private int rows;						// 总数据行数
	private List<T> datas;					// 当前页数据
	
	public static interface DataFilter<T>{
		boolean accept(T data);
	}
	public static interface DataHandler<T>{
		void handle(T data);
	}
	
	public boolean hasRows(){
		return rows != 0;
	}
	
	public void filterDatas(DataFilter<T> filter){
		Iterator<T> iterator = datas.iterator();
		while(iterator.hasNext()){
			if(!filter.accept(iterator.next()))
				iterator.remove();
		}
	}
	
	public void handleDatas(DataHandler<T> handler){
		Iterator<T> iterator = datas.iterator();
		while(iterator.hasNext()){
			handler.handle(iterator.next());
		}
	}
	
	public Pagination(int rows, List<T> datas) {
		this.rows = rows;
		this.datas = datas;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public List<T> getDatas() {
		return datas;
	}

	public void setDatas(List<T> datas) {
		this.datas = datas;
	}
}
