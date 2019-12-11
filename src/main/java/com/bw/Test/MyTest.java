package com.bw.Test;

import java.util.Scanner;

import org.junit.Test;

import com.bw.utils.MyUtil;

public class MyTest {

	
	public static Scanner sc = new Scanner(System.in);
	
	//第一题根据传入的日期获取年龄
	@Test
	public void Test1(){
		System.out.println("根据传入的日期获取年龄");
		System.out.println("请输入日期:");
		String s = sc.next();
		System.out.println(MyUtil.getAge(s));
	}
	
	//第二题根据传入的参数获取该日期的月初日期
	@Test
	public void Test2(){
		System.out.println("根据传入的参数获取该日期的月初日期");
		System.out.println("请输入日期:");
		String s = sc.next();
		System.out.println(MyUtil.getDateByMonthInit(s));
	}
	
	
	//第三题根据传入的参数获取该日器的月末日期
	@Test
	public void Test3(){
		System.out.println("根据传入的参数获取该日器的月末日期");
		System.out.println("请输入日期:");
		String s = sc.next();
		System.out.println(MyUtil.getDateByMonthLast(s));
	}
	
	
	//第四题求未来日期离今天还剩的天数
	@Test
	public void Test4(){
		System.out.println("求未来日期离今天还剩的天数");
		System.out.println("请输入日期:");
		String s = sc.next();
		System.out.println(MyUtil.getDaysByFuture(s));
	}
	
	
	//第五题求过去日期离今天过去的天数
	@Test
	public void Test5(){
		System.out.println("求过去日期离今天过去的天数");
		System.out.println("请输入日期:");
		String s = sc.next();
		System.out.println(MyUtil.getDaysByDeparted(s));
	}
}
