package com.wbl.threadlesson1;

public class Test
{
	public static void main(String[] args)
	{
		Bank b = new Bank("ank",200);
		
		BankTread bt = new BankTread(b, 200,"΢��");
		BankTread bt1 = new BankTread(b, -400,"֧����");
		BankTread bt2 = new BankTread(b, 600,"���п�");

		
		bt.start();
		bt1.start();
		bt2.start();
	}
}
