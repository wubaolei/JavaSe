package com.wbl.ch0;

/*
 * extends ����ֱ�ӵĸ��ӹ�ϵ ��ֻ��ֱ�Ӽ̳�һ������
 * ���Լ�Ӽ̳ж������
 * ������ object
 */

public class TestfiveSubclass extends Testfive	
{
	static
	{
		System.out.println("---->���ྲ̬����");
	}

	TestfiveSubclass()
	{
		//this(10);		// ���� TestfiveSubclass(int a)
		System.out.println("---->���๹�췽��");
	}

	TestfiveSubclass(int a)
	{
		super(a);		// ���� TestfiveSubclass(int a) �� a�����ʸ����еĹ��췽��
		System.out.println("---->���๹�췽��");
	}
/*
 * this() ������ ��һ����������superֻ�ܴ���һ�� �� �ڷ����ڵĵ�һ��
 * this() ���ʱ���Ĺ��췽��
 * super() ���ʸ����ṩ�Ĺ��췽��
 * �������û�в����б�������������ʽ�����Բ�д������һ���в����б��ͱ���д����
 * �������û�н��й��췽�������أ���ô���ݸ���Ĺ��췽���Ƿ��в����б������Ƿ�дsuper()����
 */

	{
		System.out.println("---->�������������");
	}

	public static void main(String[] args)
	{
		TestfiveSubclass s = new TestfiveSubclass();
		Testfive w = new Testfive();
/*
 * �������ڣ�
 * 		1.���ྲ̬����
 * 		2.���ྲ̬����
 * 		3.���๹�췽��
 * 			ʵ������󣬸�������������ڸ��๹�췽��֮ǰִ��
 * 			����û��main������ֻҪ������main��������ִ��
 * 		4.���๹�췽��
 * 			ʵ�������������������������๹�췽��֮ǰִ��
 * 			û��ʵ������ִֻ�� 1 �� 2 �ľ�̬����
 */
	}
}
