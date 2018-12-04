package com.wbl.threads;



public class UserRunnable implements Runnable
{
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName() + "");
	}

}
