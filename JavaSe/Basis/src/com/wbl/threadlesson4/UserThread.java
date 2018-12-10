package com.wbl.threadlesson4;

public class UserThread extends Thread
{
	boolean f;
	
	String task;
	
	public void run()
	{
		while(true)		// 保证线程不会死亡
		{
			
			synchronized(this)
			{
				if(!f)
				{
					/**
					 * f 默认false 执行这里的语句
					 * 每一个被创建的线程都被wait() 等待被唤醒
					 */
					System.out.println(Thread.currentThread().getName() + "，现在空闲");
					
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
				
				else
				{
					/**
					 * 当 f 为 true时  执行这里，开始处理任务，并执行完成
					 * 完成后 让 f 变成原来的值
					 */
					
					System.out.println( Thread.currentThread().getName() + "，开始工作，运行这个任务：" + task );
					
					try
					{
						Thread.sleep(10000);
					}
					catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println( Thread.currentThread().getName() + "，工作结束");

					f = false;
				}
			}
		}
	}

	public boolean isF()
	{
		return f;
	}

	public void setF(boolean f)
	{
		synchronized(this)
		{
			this.f = f;
			
			this.notify();		// wait ..... notify   必须在 synchronized同步块里面
		}
	}
	
	/**
	 * 关于为什么要 set 与 get
	 * 因为 需要获取这两个值 并修改  但是不再同一个类中  所以不同的类 需要相互传值
	 * @return
	 */

	public String getTask()
	{
		return task;
	}

	public void setTask(String task)
	{
		this.task = task;
	}
}
