package com.wbl.ch0;

public abstract class Testsevenfather		// ����	�ؼ��� abstract
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
	
/* ���󷽷�
 * 1.����г��󷽷� ������һ���ǳ����࣬һ���� ����
 * 2.���󷽷� û�з����� ����{}
 */
}
