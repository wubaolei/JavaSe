package com.wbl.threadlesson3;

public class Carry
{
	/**
	 * �����ǽ����ӡ A B
	 * 
	 * �����ӡ �� 1 ��ʼ ���޼�һ
	 * ���ȶ���һ��ȫ�ֱ���
	 */
	
	int o = 0;
	
	boolean flag;
	
	public void printA()
	{
		while(true)		// ��֤�̲߳�����
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
				
				// ���Ѻ�������ͬһ���������ı� wait()�̣߳��ָ�����
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
