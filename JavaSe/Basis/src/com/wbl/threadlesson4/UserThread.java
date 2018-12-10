package com.wbl.threadlesson4;

public class UserThread extends Thread
{
	boolean f;
	
	String task;
	
	public void run()
	{
		while(true)		// ��֤�̲߳�������
		{
			
			synchronized(this)
			{
				if(!f)
				{
					/**
					 * f Ĭ��false ִ����������
					 * ÿһ�����������̶߳���wait() �ȴ�������
					 */
					System.out.println(Thread.currentThread().getName() + "�����ڿ���");
					
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
					 * �� f Ϊ trueʱ  ִ�������ʼ�������񣬲�ִ�����
					 * ��ɺ� �� f ���ԭ����ֵ
					 */
					
					System.out.println( Thread.currentThread().getName() + "����ʼ�����������������" + task );
					
					try
					{
						Thread.sleep(10000);
					}
					catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println( Thread.currentThread().getName() + "����������");

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
			
			this.notify();		// wait ..... notify   ������ synchronizedͬ��������
		}
	}
	
	/**
	 * ����ΪʲôҪ set �� get
	 * ��Ϊ ��Ҫ��ȡ������ֵ ���޸�  ���ǲ���ͬһ������  ���Բ�ͬ���� ��Ҫ�໥��ֵ
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
