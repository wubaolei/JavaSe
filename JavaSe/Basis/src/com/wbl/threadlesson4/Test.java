package com.wbl.threadlesson4;

import java.util.Scanner;

public class Test
{
	static UserThread[] ut;
	
	static
	{
		ut = new UserThread[3];
		
		/**
		 * 创建三个线程
		 */
		
		for(int i = 0; i < ut.length; i++)
		{
			ut[i] = new UserThread();
			
			ut[i].start();
		}
		
	}
	
	public static void main(String[] args)
	{
		int i = 0;
		
		while(true)
		{
			Scanner s = new Scanner(System.in);
			
			String task = s.next();
			
			System.out.println("当前任务为：" + task);
			
//			for(int i = 0; i < ut.length; i++)
//			{
//				if(!ut[i].isF())
//				{
//					ut[i].setTask(task);
//					
//					ut[i].setF(true);
//				}
//				break;	// 跳出循环体
//			}
			/**
			 * 这里的for语句 是有点问题的
			 * 当 i=0 时，进入 if 判断，让其中的第一个线程执行，然后跳出循环
			 * 因为第一个线程还没有执行完成，又有任务进来时，i 还是 0，但是 i=0时的线程还没有执行完成，所以不会进入 if 再次执行
			 * 
			 * 解决方案：把 int i在while循环外面定义
			 * 如果在while里面定义 int i 每次循环 i 都为 0  
			 */
			
			for(;i<ut.length;)
			{
				if(!ut[i].isF())
				{
					ut[i].setTask(task);
					
					ut[i].setF(true);
					
					System.out.println("空闲的还有：" + (ut.length-i-1) + "个");
					
					i++;
					
					break;
				}
			}
			
			System.out.println("i 的值为：" + i);
			
			if(i >= ut.length)
			{
				i = 0;
			}
		}
	}
}
