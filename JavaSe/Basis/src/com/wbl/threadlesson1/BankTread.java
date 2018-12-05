package com.wbl.threadlesson1;

public class BankTread extends Thread		// 创建线程
{
	/**
	 * 消费
	 */
	// 银行
	private Bank bank;
	// 消费多少
	private double money;
	// 初始化数据 方便向 main 线程传值
	public BankTread(Bank bank,double money,String name)
	{
		this.setName(name);
		
		this.money = money;

		this.bank = bank;
	}
	
	public void run()
	{
		this.bank.carryout(money,this.getName());
	}
}
