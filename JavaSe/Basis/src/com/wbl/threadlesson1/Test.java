package com.wbl.threadlesson1;

public class Test
{
	public static void main(String[] args)
	{
		Bank b = new Bank("ank",200);
		
		BankTread bt = new BankTread(b, 200,"微信");
		BankTread bt1 = new BankTread(b, -400,"支付宝");
		BankTread bt2 = new BankTread(b, 600,"银行卡");

		
		bt.start();
		bt1.start();
		bt2.start();
	}
}
