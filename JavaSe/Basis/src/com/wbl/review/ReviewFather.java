package com.wbl.review;

public class ReviewFather
{
	int a;		//	����		ʵ������
	String b;	//	�ַ���	ʵ������		˫����
	byte c;		//	����		ʵ������
	short d;	//	������	ʵ������
	long e;		//	������	ʵ������
	boolean f;	//	����		ʵ������
	char g;		//	�ַ�		ʵ������		������
	double h;	//	˫����	ʵ������		Ĭ��
	float i;	//	������	ʵ������		���ֺ�� f
/*
 *	����String����������		�������ǻ�����������
 */
	
	static int a1;		//	��̬����
	static String b1;	//	��̬����
/*
 *	�̳й�ϵ�У���̬�����޷��̳� 
 */
	
	private int a2;		//	˽�б���
	private String b2;	//	˽�б���
/*
 *	��װ������������(����)����˽�У�ͨ����������ʱ������ݷ��ʵİ�ȫ�� 
 */
	
	ReviewFather(String x)		//	���췽��
	{
		System.out.println("��ϲ��" + x);
	}
	
	ReviewFather(int x)			//	���췽��	
	{
		System.out.println("��ʾ������Ϊ��" + x);
	}
/*
 * ���췽�� ���Ŷ���Ĵ�����ִ��
 * ͬһ�����У���������ͬ�������б�ͬ�����ɷ������أ���̬��һ�ֱ�����ʽ
 */
	
	public static void check()
	{
		System.out.println("���ྲ̬����");
	}
/*
 * �̳й�ϵ�У���̬�����޷���д 
 */
	
	
	
	
	public int getA2()
	{
		return a2;
	}

	public void setA2(int a2)
	{
		this.a2 = a2;
	}

	public String getB2()
	{
		return b2;
	}

	public void setB2(String b2)
	{
		this.b2 = b2;
	}
}	
