package com.wbl.threadlesson2;

public class UseThread extends Thread
{
	private Object obj;
	
	public UseThread(Object obj)
	{
		this.obj = obj;
	}
	
	int sum = 0;
	
	public void run()
	{
//		synchronized(this)
//		{
//			for(int i = 0;i <= 100; i++)
//			{
//				sum += i;
//			}
//			
//			System.out.println(sum);
//			
//			System.out.println("�������");
//			
//			/**
//			 * ������һ��Ĭ�ϵĴ���   this.notify()
//			 * ���ͬ������еĲ���ͬһ������  ��ô �����Ҫд   ͬһ��������.notify()  ��д
//			**/
//			this.notify();
//		}
		
		synchronized(obj)
		{
			for(int i = 0; i <= 100; i++)
			{
				sum += i;
			}
			System.out.println("�������,���Ϊ:" + sum);
			
			// ��ʱ ��Ҫ����   ��Ϊͬһ�������Ǵ�����
			obj.notify();
		}
		
		
		
		
	}
	
	public int getSum()
	{
		return sum;
	}
}
