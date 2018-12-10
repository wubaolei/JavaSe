package com.wbl.threadlesson3;

public class Carry
{
	/**
	 * 现在是交替打印 A B
	 * 
	 * 如果打印 从 1 开始 无限加一
	 * 首先定义一个全局变量
	 */
	
	int o = 0;
	
	boolean flag;
	
	public void printA()
	{
		while(true)		// 保证线程不死亡
		{
			synchronized(this)
			{
				if(flag)
				{
					try
					{
						this.wait();
					}
					catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println(Thread.currentThread().getName() +  "--> A " + o++);
				
				try
				{
					Thread.sleep(3000);
				}
				catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				// 唤醒和它持有同一个对象锁的被 wait()线程，恢复运行
				this.notify();
				
				flag = true;
				
				
			}
		}
	}
	
	public void printB()
	{
		while(true)
		{
			synchronized(this)
			{
				if(!flag)
				{
					try
					{
						this.wait();
					}
					catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println(Thread.currentThread().getName() + "--> B " + o++ );
				
				try
				{
					Thread.sleep(3000);
				}
				catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				this.notify();
				
				flag = false;
			}
		}
	}
}
