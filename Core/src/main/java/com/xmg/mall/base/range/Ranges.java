package com.xmg.mall.base.range;

import java.util.List;

public class Ranges<T extends Comparable<T>, V> {

	private List<Range<T, V>> ranges;

	public void setRanges(List<Range<T, V>> ranges) {
		this.ranges = ranges;
	}
	
	public Range<T, V> getRange(T value){	
		for(Range<T, V> range : ranges){
			if(range.within(value))
				return range;
		}
		return null;
	}
	
}
