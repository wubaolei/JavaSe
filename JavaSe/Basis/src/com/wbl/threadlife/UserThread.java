package com.wbl.threadlife;

public class UserThread extends Thread
{
	int sum = 0;
	
	public void run()
	{
		for(int i = 0; i <= 100; i++)
		{
			sum += i;
		}
	}
	
	public int getSum()
	{
		return sum;
	}
	
}
