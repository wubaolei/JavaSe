package com.wbl.threadlife;

public class Test
{
	public static void main(String[] args)
	{
		System.out.println("����̵߳������ǣ�" + Thread.currentThread().getName());
		
		UserThread u = new UserThread();
		
		u.start();
		
		int count = 505;
		
//		int sum = u.getSum();
//		
//		System.out.println("���Ϊ��"  + (sum + count));
/* ��Ϊ��ʱ�������̣߳�һ����main���̣߳�һ����UserThread���߳�
 * ʹ�� join() ���� �����̺߳ϲ������߳�������
 * */
		try
		{
			u.join();
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("���н��Ϊ��" + (u.getSum() + count));
		
		
	}
}
