package com.wbl.ch0;

public abstract class Testsevenfather		// 父类	关键字 abstract
{
	String name;
	int age;
	
	Testsevenfather(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void say()
	{
		this.check();
	}
	
	public abstract void check();
	
/* 抽象方法
 * 1.如果有抽象方法 这个类就一定是抽象类，一定是 父类
 * 2.抽象方法 没有方法体 即：{}
 */
}
