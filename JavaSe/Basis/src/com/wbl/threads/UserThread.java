package com.wbl.threads;

// Thread 是线程的父类
public class UserThread extends Thread
{
	public void run()
	{
		System.out.println("线程的名字-->" + Thread.currentThread().getName());
	}
}
