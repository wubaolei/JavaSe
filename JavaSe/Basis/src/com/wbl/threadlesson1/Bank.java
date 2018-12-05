package com.wbl.threadlesson1;

public class Bank
{
	// 初始化银行卡的数据
	// 卡号
	private String card;
	// 余额
	private double money;
	public Bank(String card,double money)
	{
		this.card = card;
		
		this.money = money;
	}
	
	// 处理金额
	public void carryout(double omoney,String name)
	{
//		System.out.println("传递要处理的金额");
//		if( (money + omoney)<0 )
//		{
//			System.out.println("余额不足，请充值");
//		}
//		else
//		{
//			money = money + omoney;
//			System.out.println("变化后的余额为：" + money + "，用的是方式为：" + name);
//			System.out.println("处理完毕");
//		}
		
		/**
		 * 上面是简单的调用线程
		 * 不足至于，只能等一个值执行完之后，才能执行下一个值，执行效率比较低
		 **/
		
		System.out.println("传递要处理的金额");
		/**
		 * 1.synchronized修饰方法，只是表示给这个方法进行枷锁操作
		 * 2.能够所著的条件的前提是  必须持有同一个对象的锁
		 * 		没有同一个对象就创造一个
		 * 
		 * 这里是同步块  锁定精确 提升程序执行性能
		 */
		synchronized (this)
		{
			if((this.money + omoney) < 0)
			{
				System.out.println("余额不足，请充值");
			}
			
			else
			{
				this.money = this.money + omoney;
				
				System.out.println("变化后的金额为：" + this.money + "，用的方式为：" + name);
			}
		}
		System.out.println("处理结束");
		
	}
}
