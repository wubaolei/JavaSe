package com.wbl.threadlesson1;

public class Bank
{
	// ��ʼ�����п�������
	// ����
	private String card;
	// ���
	private double money;
	public Bank(String card,double money)
	{
		this.card = card;
		
		this.money = money;
	}
	
	// ������
	public void carryout(double omoney,String name)
	{
//		System.out.println("����Ҫ����Ľ��");
//		if( (money + omoney)<0 )
//		{
//			System.out.println("���㣬���ֵ");
//		}
//		else
//		{
//			money = money + omoney;
//			System.out.println("�仯������Ϊ��" + money + "���õ��Ƿ�ʽΪ��" + name);
//			System.out.println("�������");
//		}
		
		/**
		 * �����Ǽ򵥵ĵ����߳�
		 * �������ڣ�ֻ�ܵ�һ��ִֵ����֮�󣬲���ִ����һ��ֵ��ִ��Ч�ʱȽϵ�
		 **/
		
		System.out.println("����Ҫ����Ľ��");
		/**
		 * 1.synchronized���η�����ֻ�Ǳ�ʾ������������м�������
		 * 2.�ܹ�������������ǰ����  �������ͬһ���������
		 * 		û��ͬһ������ʹ���һ��
		 * 
		 * ������ͬ����  ������ȷ ��������ִ������
		 */
		synchronized (this)
		{
			if((this.money + omoney) < 0)
			{
				System.out.println("���㣬���ֵ");
			}
			
			else
			{
				this.money = this.money + omoney;
				
				System.out.println("�仯��Ľ��Ϊ��" + this.money + "���õķ�ʽΪ��" + name);
			}
		}
		System.out.println("�������");
		
	}
}
