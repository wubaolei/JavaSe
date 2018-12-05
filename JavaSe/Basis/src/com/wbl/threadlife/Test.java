package com.wbl.threadlife;

public class Test
{
	public static void main(String[] args)
	{
		System.out.println("这个线程的名字是：" + Thread.currentThread().getName());
		
		UserThread u = new UserThread();
		
		u.start();
		
		int count = 505;
		
//		int sum = u.getSum();
//		
//		System.out.println("结果为："  + (sum + count));
/* 因为此时有两个线程，一个是main主线程，一个是UserThread子线程
 * 使用 join() 方法 让子线程合并到主线程来运行
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
		
		System.out.println("运行结果为：" + (u.getSum() + count));
		
		
	}
}
