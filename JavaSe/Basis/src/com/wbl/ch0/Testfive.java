package com.wbl.ch0;

public class Testfive
{
	int a = 10;
	static String b = "20";
	
	static
	{
		System.out.println("---->父类静态方法");
	}
	
	Testfive()
	{
		System.out.println("---->父类构造方法");
	}
	
	Testfive(int a)
	{
		System.out.println("---->父类构造方法");
	}
	
	{
		System.out.println("---->父类匿名代码块");
	}
	
//	public static void main(String[] args)
//	{
//		Testfive a = new Testfive();
//		Testfive b = new Testfive(10);	// 构造方法重载
//	}
}
