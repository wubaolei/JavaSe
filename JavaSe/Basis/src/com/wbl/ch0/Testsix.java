package com.wbl.ch0;

public class Testsix
{
	int a;
	int b;
	static int c;
	
	Testsix()
	{
		a = 1;
		b = 2;
		c = 3;
	}
	
	public int getA()
	{
		return a;
	}
	public void setA(int a)
	{
		this.a = a;
	}
	public int getB()
	{
		return b;
	}
	public void setB(int b)
	{
		this.b = b;
	}
	
	
	public static void zilei()
	{
		c += 10;
	}
	
}