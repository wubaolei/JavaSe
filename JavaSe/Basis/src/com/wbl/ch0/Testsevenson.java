package com.wbl.ch0;

public class Testsevenson extends Testsevenfather
{

	Testsevenson(String name, int age)
	{
		super(name, age);
	}

	@Override			// ע��
	public void check()
	{
		// TODO Auto-generated method stub
		
		System.out.println(this.name + "˵���ҽ���" + this.age + "��");
	}
}
