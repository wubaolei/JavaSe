package com.wbl.review;

public class ReviewSon extends ReviewFather
{
	int a;		//	与父类同名	实例变量
	String b;	//	与父类同名
	int c;		//	子类特有
	
	static int a1;	//	与父类同名	静态变量
	static int a2;	//	子类特有
	ReviewSon()
	{
		super(10);
	}
/*
 *	子类构造方法依赖父类的构造方法
 *	如果父类的构造方法有参数列表，那么在子类中，子类的构造方法要么有相同的参数列表，要么在构造方法内加上 super(参数列表值)
 */
	
	
	public static void main(String[] args)
	{
		
	}
}
