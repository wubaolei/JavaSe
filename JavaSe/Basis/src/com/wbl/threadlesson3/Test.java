package com.wbl.threadlesson3;

public class Test
{
	public static void main(String[] args)
	{
		Carry c = new Carry();
		
		UserThread1 a = new UserThread1(c);
		
		UserThread2 b = new UserThread2(c);
		
		a.start();
		
		b.start();
	}
}
