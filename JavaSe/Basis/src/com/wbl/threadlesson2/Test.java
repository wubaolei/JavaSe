package com.wbl.threadlesson2;

public class Test
{
	/**
	 * 这里换了种说明 有点没听懂，看到方法就知道什么意思了
	 * 线程之间交换数据
	 * 1.主线程 --> 子线程 传数据 	利用构造方法 
	 * 2.子线程 --> 主线程 传数据	必须在 synchronized同步快  使用 notify
	 * 3.子线程 --> 子线程 传数据
	 **/

	public static void main(String[] args)
	{
		Object obj = new Object();
		
		UseThread ut = new UseThread(obj);
		
		ut.start();
		
//		synchronized(ut)
//		{
//			try
//			{
//				/**
//				 * 主线程持有 ut 线程对象的锁，在这里被wait(),阻塞
//				 * 等待子线程run()执行完成
//				 **/
//				ut.wait();
//				
//				System.out.println("---------");
//			}
//			catch (InterruptedException e)
//			{
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		synchronized(obj)
		{
			try
			{
				obj.wait();
				
				System.out.println("------------");
				
				/**
				 * 如果synchronized(obj)  这里不是和子线程持有同一个对象，
				 * 这里就打印不出 主线程的其余代码， 专业术语：死锁
				 * 
				 * 5050
				 * 计算完成
				 * 
				 * 找不到同一个对象，就要创造同一个对象
				 */
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println("1111111111");
		
	}
	
}
