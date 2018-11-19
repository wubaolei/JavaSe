package com.wbl.ch0;

public class Testsevenson extends Testsevenfather
{

	Testsevenson(String name, int age)
	{
		super(name, age);
	}

	@Override			// 注解
	public void check()
	{
		// TODO Auto-generated method stub
		
		System.out.println(this.name + "说：我今年" + this.age + "了");
	}
}
