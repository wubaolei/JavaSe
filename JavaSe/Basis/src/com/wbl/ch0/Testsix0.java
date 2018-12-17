package com.wbl.ch0;

public class Testsix0 extends Testsix
{
//	int a;
//	int b;

	Testsix0()
	{
		a = 4;
		b = 5;
		c = 6;
	}
	
	public static void zilei()
	{
		c += 2;
	}

	public static void main(String[] args)
	{
		Testsix0 m = new Testsix0();
		System.out.println(m.a);	// 4
		
		Testsix n = m;			// 子转父
		n.zilei();
		System.out.println(n.a);		// 4
		
		System.out.println(n.c);		// 16

/*
 *当子类 与 父类 中有同名变量时，相互独立，无法继承。
 *当子类 与 父类 调用静态方法时 相互独立，无法重写--> 只调用自己体内的静态方法，
 *静态方法属于类 不属于对象
 */
	}
}