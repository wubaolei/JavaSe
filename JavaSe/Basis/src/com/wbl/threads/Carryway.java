package com.wbl.threads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* 识别线程的一个方法：Thread.currentThread().getName()
 * 1.执行main方法的叫做main线程，也叫做主线程
 * 2.启动一个线程，必须使用start() 方法
 */

public class Carryway
{
	Carryway()
	{
		System.out.println(Thread.currentThread().getName() + "线程名字-->构造方法");
	}
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName() + "线程的名字-->main");
		
		//创建了一个线程对象
		Carryway c = new Carryway();
		

		
		// 1.继承 Thread
		//方法调用  工作的线程是main线程
		UserThread u = new UserThread();
		// u.run();
		
		//启动一个线程的方法  start() --> 执行了线程的线程方法 run()
		u.start();
		
		
		
		// 2.实现 Runnable
		// 创建UserRunnable对象
		//方法调用  工作的线程是main线程
		UserRunnable ur = new UserRunnable();
		// ur.run();
		
		// 把一个UserRunnable对象转换成Thread对象
		// Runnable接口是一个Thread的父类
		Thread t = new Thread();
		//启动一个线程的方法  start() --> 执行了线程的线程方法 run()
		t.start();
		
		
		
		// 3.继承TimeTask
		Timer timer = new Timer();		// 定时器来启动
		
		/* 用定时器去调用这个定时任务线程
		 * 1.new UserTimerTask()定时线程类对象
		 * 2.1000，延时多少毫秒
		 * 3.3000，间隔多少毫秒，反复执行
		 * */
		//timer.schedule(new UserTimerTask(), 1000, 3000);
		String strDate = "2018-12-03 13:48:00";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		// 字符串的日期类型转换Date
		Date starDate = null;

		try
		{
			starDate = sdf.parse(strDate);
		}
		catch (ParseException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		timer.schedule(new UserTimerTask(), starDate, 3000);
		
		
		
		// 4.线程池
		// 创建一个固定线程池 池中的线程数量为 2 个
		ExecutorService poolThread = Executors.newFixedThreadPool(2);
		
		for(int i = 0;i < 5; i++)
		{
			UserThread ut = new UserThread();
			
			poolThread.execute(ut);
		}
		
		poolThread.shutdown();
		
		
		
		
		// 线程的启动时没有顺序的，程序员也不能控制，而是jvm控制的
		UserThread m1 = new UserThread();
		UserThread m2 = new UserThread();
		UserThread m3 = new UserThread();
		
		// 通过线程的优先级进行控制，不能绝对保证先执行，只能相对可能保证
		m2.setPriority(Thread.MAX_PRIORITY);
		
		// 给线程设置名字
		m1.setName("线程 1 ");
		m2.setName("线程 2 ");
		m3.setName("线程 3 ");
		
		// 三个线程并不是按照代码的顺序进行先后执行的
		m2.start();
		//m2.start();			// 同一个线程不能启动两次，会出现 IllegalThreadStateException 异常
		m1.start();		
		m3.start();
		
		
		
		
		// 练习TimerTask
		Timer ts = new Timer();
		String setDate = "2018-12-03 14:30:00";
		SimpleDateFormat sdft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try
		{
			Date dsdate = sdft.parse(setDate);
			ts.schedule(new UserTimerPra(), dsdate,5000);
		}
		catch (ParseException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
