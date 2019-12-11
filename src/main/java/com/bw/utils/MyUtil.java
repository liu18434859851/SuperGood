package com.bw.utils;

import java.util.Date;

public class MyUtil {

	
	//根据传入的日期获取年龄
	//示例:
	public static long getAge (String src) {
		long i = DateUtils.getYears(src);
		return i;
	
		
	}
	
	
	//根据传入的参数获取该日期的月初日期，
	//例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
	
	public static String getDateByMonthInit (String src) {
		
		String d = DateUtils.getDateByMonthInit(src);
		
		return d;
		
		}
	
	
	//根据传入的参数获取该日器的月末日期，例如给定的日期为
	//“2019-09-19 19:29:39”，返回“2019-09-30 23:59:59”，注意月大月小以及闰年。
	public static String getDateByMonthLast(String src) {
			String y = DateUtils.getDateByMonthLast(src);
			return y;
		}
	
	
	//求未来日期离今天还剩的天数
	
	public static long getDaysByFuture (String future) {
		long d = DateUtils.getDaysByDeparted(future);
		return d;
		}
	
	
	
	//求过去日期离今天过去的天数
	public static long getDaysByDeparted (String future) {
		long d = DateUtils.getDaysByDeparted(future);
		return d;
		}
}
