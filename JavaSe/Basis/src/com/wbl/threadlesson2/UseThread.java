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
//			System.out.println("计算完成");
//			
//			/**
//			 * 这里有一行默认的代码   this.notify()
//			 * 如果同步块持有的不是同一个对象  那么 这里就要写   同一个对象名.notify()  必写
//			**/
//			this.notify();
//		}
		
		synchronized(obj)
		{
			for(int i = 0; i <= 100; i++)
			{
				sum += i;
			}
			System.out.println("计算完成,结果为:" + sum);
			
			// 此时 需要唤醒   因为同一个对象是创建的
			obj.notify();
		}
		
		
		
		
	}
	
	public int getSum()
	{
		return sum;
	}
}
