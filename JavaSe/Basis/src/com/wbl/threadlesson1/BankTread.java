package com.wbl.threadlesson1;

public class BankTread extends Thread		// �����߳�
{
	/**
	 * ����
	 */
	// ����
	private Bank bank;
	// ���Ѷ���
	private double money;
	// ��ʼ������ ������ main �̴߳�ֵ
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
