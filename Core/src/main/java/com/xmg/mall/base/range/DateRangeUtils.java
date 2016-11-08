package com.xmg.mall.base.range;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

public class DateRangeUtils {

	public final static int DATE_RANGE_LAST_DAY = 0;
	public final static int DATE_RANGE_LAST_WEEK = 1;
	public final static int DATE_RANGE_LAST_MONTH = 2;
	public final static int DATE_RANGE_LAST_YEAR = 3;

	public final static int DATE_RANGE_THIS_DAY = 4;
	public final static int DATE_RANGE_THIS_WEEK = 5;
	public final static int DATE_RANGE_THIS_MONTH = 6;
	public final static int DATE_RANGE_THIS_YEAR = 7;

	public final static int DATE_RANGE_THAT_YEAR = 8;

	public static DateRange getByType(Integer type, Date now){
		if(type == null)
			return getThisMonth(now);

		switch (type) {
		case DATE_RANGE_LAST_DAY: return getLastDay(now);
		case DATE_RANGE_LAST_WEEK: return getLastWeek(now);
		case DATE_RANGE_LAST_MONTH: return getLastMonth(now);
		case DATE_RANGE_LAST_YEAR: return getLastYear(now);
		case DATE_RANGE_THIS_DAY: return getThisDay(now);
		case DATE_RANGE_THIS_MONTH: return getThisMonth(now);
		case DATE_RANGE_THIS_YEAR: return getThisYear(now);
		case DATE_RANGE_THIS_WEEK: return getThisWeek(now);
		case DATE_RANGE_THAT_YEAR: return getThatYear(now);
		default: return getLastMonth(now);
		}
	}

	public static DateRange getThatYear(Date now) {
		if(now == null)
			now = new Date();
		Date start = DateUtils.addYears(now, -10);
		return new DateRange(start, now, now);
	}

	public static DateRange getThatYear() {
		return getThatYear(null);
	}

	public static DateRange getByType(Integer type){
		return getByType(type, null);
	}

	public static DateRange getLastHour(){
		return getLast(Calendar.HOUR_OF_DAY);
	}

	public static DateRange getThisHour(){
		return getThis(Calendar.HOUR_OF_DAY);
	}

	public static DateRange getLastDay(){
 		return getLast(Calendar.DAY_OF_MONTH);
	}

	public static DateRange getThisDay(){
		return getThis(Calendar.DAY_OF_MONTH);
	}

	public static DateRange getLastMonth(){
		return getLast(Calendar.MONTH);
	}

	public static DateRange getThisMonth(){
		return getThis(Calendar.MONTH);
	}

	public static DateRange getLastYear(){
		return getLast(Calendar.YEAR);
	}

	public static DateRange getThisYear(){
		return getThis(Calendar.YEAR);
	}

	public static DateRange getLastHour(Date now){
		return getLast(now, Calendar.HOUR_OF_DAY);
	}

	public static DateRange getThisHour(Date now){
		return getThis(now, Calendar.HOUR_OF_DAY);
	}

	public static DateRange getLastDay(Date now){
		return getLast(now, Calendar.DAY_OF_MONTH);
	}

	public static DateRange getThisDay(Date now){
		return getThis(now, Calendar.DAY_OF_MONTH);
	}

	public static DateRange getLastMonth(Date now){
		return getLast(now, Calendar.MONTH);
	}

	public static DateRange getThisMonth(Date now){
		return getThis(now, Calendar.MONTH);
	}

	public static DateRange getLastYear(Date now){
		return getLast(now, Calendar.YEAR);
	}

	public static DateRange getLastWeek(){
		return getLastWeek(new Date());
	}

	public static DateRange getLastWeek(Date now){
		Date end = null;
		if(now == null){
			now = new Date();
			end = now;
		}else{
			end = DateUtils.ceiling(now, Calendar.DAY_OF_MONTH);
		}
		Date start = DateUtils.addDays(now, -6);
		return new DateRange(start, end, now);
	}

	public static DateRange getThisWeek(){
		return getThisWeek(null);
	}

	public static DateRange getThisWeek(Date now){
		Date end = null;
		if(now == null){
			now = new Date();
			end = now;
		}else{
			end = DateUtils.ceiling(now, Calendar.DAY_OF_MONTH);
		}

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(now);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		calendar.add(Calendar.DAY_OF_MONTH, dayOfWeek == 1 ? -6 : 2 - dayOfWeek);

		return new DateRange(DateUtils.truncate(calendar.getTime(), Calendar.DAY_OF_MONTH), end, now);
	}

	public static DateRange getThisYear(Date now){
		return getThis(now, Calendar.YEAR);
	}

	private static DateRange getLast(int field){
		return getLast(null, field);
	}

	private static DateRange getThis(int field){
		return getThis(null, field);
	}

	private static DateRange getLast(Date now, int field){
		Date end = null;
		if(now == null){
			now = new Date();
			end = now;
		}else{
			end = DateUtils.ceiling(now, Calendar.DAY_OF_MONTH);
		}

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(end);
		calendar.add(field, -1);
		Date start = calendar.getTime();


		return new DateRange(start, end, now);
	}

	private static DateRange getThis(Date now, int field){

		Date end = null;
		if(now == null){
			now = new Date();
			end = now;
		}else{
			end = DateUtils.ceiling(now, Calendar.DAY_OF_MONTH);
		}

		Date start = DateUtils.truncate(now, field);
		return new DateRange(start, end, now);
	}

	public static void main(String[] args) {
		Date now = DateUtils.addDays(new Date(), -1);

		System.out.println("This day:" + DateRangeUtils.getThisDay());
		System.out.println("Last day:" + DateRangeUtils.getLastDay());

		System.out.println("This week:" + DateRangeUtils.getThisWeek());
		System.out.println("Last week:" + DateRangeUtils.getLastWeek());

		System.out.println("This month:" + DateRangeUtils.getThisMonth());
		System.out.println("Last month:" + DateRangeUtils.getLastMonth());

		System.out.println("This year:" + DateRangeUtils.getThisYear());
		System.out.println("Last year" + DateRangeUtils.getLastYear());

		System.out.println("- This day:" + DateRangeUtils.getThisDay(now));
		System.out.println("- This week:" + DateRangeUtils.getThisWeek(now));
	}
}
