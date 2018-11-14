package com.wbl.ch0;

/*
 * extends 建立直接的父子关系 ，只能直接继承一个父类
 * 可以间接继承多个父类
 * 最顶层的是 object
 */

public class TestfiveSubclass extends Testfive	
{
	static
	{
		System.out.println("---->子类静态方法");
	}

	TestfiveSubclass()
	{
		//this(10);		// 访问 TestfiveSubclass(int a)
		System.out.println("---->子类构造方法");
	}

	TestfiveSubclass(int a)
	{
		super(a);		// 接收 TestfiveSubclass(int a) 的 a，访问父类中的构造方法
		System.out.println("---->子类构造方法");
	}
/*
 * this() 有括号 是一个方法，与super只能存在一个 且 在方法内的第一行
 * this() 访问本类的构造方法
 * super() 访问父类提供的构造方法
 * 如果方法没有参数列表，则两个都是隐式，可以不写，但是一旦有参数列表，就必须写出来
 * 如果父类没有进行构造方法的重载，那么根据父类的构造方法是否有参数列表，决定是否写super()方法
 */

	{
		System.out.println("---->子类匿名代码块");
	}

	public static void main(String[] args)
	{
		TestfiveSubclass s = new TestfiveSubclass();
		Testfive w = new Testfive();
/*
 * 生命周期：
 * 		1.父类静态方法
 * 		2.子类静态方法
 * 		3.父类构造方法
 * 			实例对象后，父类匿名代码块在父类构造方法之前执行
 * 			哪怕没有main方法，只要子类有main方法就能执行
 * 		4.子类构造方法
 * 			实例对象后，子类匿名代码块在子类构造方法之前执行
 * 			没有实例对象，只执行 1 和 2 的静态方法
 */
	}
}
