package com.wbl.threadlesson2;

public class Test
{
	/**
	 * ���ﻻ����˵�� �е�û����������������֪��ʲô��˼��
	 * �߳�֮�佻������
	 * 1.���߳� --> ���߳� ������ 	���ù��췽�� 
	 * 2.���߳� --> ���߳� ������	������ synchronizedͬ����  ʹ�� notify
	 * 3.���߳� --> ���߳� ������
	 **/

	public static void main(String[] args)
	{
		Object obj = new Object();
		
		UseThread ut = new UseThread(obj);
		
		ut.start();
		
//		synchronized(ut)
//		{
//			try
//			{
//				/**
//				 * ���̳߳��� ut �̶߳�������������ﱻwait(),����
//				 * �ȴ����߳�run()ִ�����
//				 **/
//				ut.wait();
//				
//				System.out.println("---------");
//			}
//			catch (InterruptedException e)
//			{
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		synchronized(obj)
		{
			try
			{
				obj.wait();
				
				System.out.println("------------");
				
				/**
				 * ���synchronized(obj)  ���ﲻ�Ǻ����̳߳���ͬһ������
				 * ����ʹ�ӡ���� ���̵߳�������룬 רҵ�������
				 * 
				 * 5050
				 * �������
				 * 
				 * �Ҳ���ͬһ�����󣬾�Ҫ����ͬһ������
				 */
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println("1111111111");
		
	}
	
}
