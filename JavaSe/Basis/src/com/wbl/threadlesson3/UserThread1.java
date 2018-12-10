package com.wbl.threadlesson3;

public class UserThread1 extends Thread
{
	private Carry c;
	
	UserThread1(Carry c)
	{
		this.c = c;
	}
	
	public void run()
	{
		c.printA();
	}
	
}
