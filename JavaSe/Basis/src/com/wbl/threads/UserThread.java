package com.wbl.threads;

// Thread ���̵߳ĸ���
public class UserThread extends Thread
{
	public void run()
	{
		System.out.println("�̵߳�����-->" + Thread.currentThread().getName());
	}
}
