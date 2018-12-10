package com.wbl.threadlesson3;

public class UserThread2 extends Thread
{
	private Carry c;
	
	UserThread2(Carry c)
	{
		this.c = c;
	}

	
	public void run()
	{
		c.printB();
	}
}
