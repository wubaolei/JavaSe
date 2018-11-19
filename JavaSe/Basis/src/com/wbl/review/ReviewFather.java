package com.wbl.review;

public class ReviewFather
{
	int a;		//	整型		实例变量
	String b;	//	字符串	实例变量		双引号
	byte c;		//	整型		实例变量
	short d;	//	短整型	实例变量
	long e;		//	长整型	实例变量
	boolean f;	//	布尔		实例变量
	char g;		//	字符		实例变量		单引号
	double h;	//	双精度	实例变量		默认
	float i;	//	单精度	实例变量		数字后加 f
/*
 *	除了String是引用类型		其他都是基本数据类型
 */
	
	static int a1;		//	静态变量
	static String b1;	//	静态变量
/*
 *	继承关系中，静态变量无法继承 
 */
	
	private int a2;		//	私有变量
	private String b2;	//	私有变量
/*
 *	封装变量，对属性(数据)进行私有，通过方法访问时提高数据访问的安全性 
 */
	
	ReviewFather(String x)		//	构造方法
	{
		System.out.println("我喜欢" + x);
	}
	
	ReviewFather(int x)			//	构造方法	
	{
		System.out.println("显示的数字为：" + x);
	}
/*
 * 构造方法 随着对象的创建而执行
 * 同一个类中，方法名相同，参数列表不同，构成方法重载，多态的一种表现形式
 */
	
	public static void check()
	{
		System.out.println("父类静态方法");
	}
/*
 * 继承关系中，静态方法无法重写 
 */
	
	
	
	
	public int getA2()
	{
		return a2;
	}

	public void setA2(int a2)
	{
		this.a2 = a2;
	}

	public String getB2()
	{
		return b2;
	}

	public void setB2(String b2)
	{
		this.b2 = b2;
	}
}	
