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
		
		Testsix n = m;			// ��ת��
		n.zilei();
		System.out.println(n.a);		// 4
		
		System.out.println(n.c);		// 16

/*
 *������ �� ���� ����ͬ������ʱ���໥�������޷��̳С�
 *������ �� ���� ���þ�̬����ʱ �໥�������޷���д--> ֻ�����Լ����ڵľ�̬������
 *��̬���������� �����ڶ���
 */
	}
}