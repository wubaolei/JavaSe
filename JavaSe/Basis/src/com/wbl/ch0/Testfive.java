package com.wbl.ch0;

public class Testfive
{
	int a = 10;
	static String b = "20";
	
	static
	{
		System.out.println("---->���ྲ̬����");
	}
	
	Testfive()
	{
		System.out.println("---->���๹�췽��");
	}
	
	Testfive(int a)
	{
		System.out.println("---->���๹�췽��");
	}
	
	{
		System.out.println("---->�������������");
	}
	
//	public static void main(String[] args)
//	{
//		Testfive a = new Testfive();
//		Testfive b = new Testfive(10);	// ���췽������
//	}
}
