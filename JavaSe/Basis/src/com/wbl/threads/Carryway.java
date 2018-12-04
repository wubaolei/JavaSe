package com.wbl.threads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* ʶ���̵߳�һ��������Thread.currentThread().getName()
 * 1.ִ��main�����Ľ���main�̣߳�Ҳ�������߳�
 * 2.����һ���̣߳�����ʹ��start() ����
 */

public class Carryway
{
	Carryway()
	{
		System.out.println(Thread.currentThread().getName() + "�߳�����-->���췽��");
	}
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName() + "�̵߳�����-->main");
		
		//������һ���̶߳���
		Carryway c = new Carryway();
		

		
		// 1.�̳� Thread
		//��������  �������߳���main�߳�
		UserThread u = new UserThread();
		// u.run();
		
		//����һ���̵߳ķ���  start() --> ִ�����̵߳��̷߳��� run()
		u.start();
		
		
		
		// 2.ʵ�� Runnable
		// ����UserRunnable����
		//��������  �������߳���main�߳�
		UserRunnable ur = new UserRunnable();
		// ur.run();
		
		// ��һ��UserRunnable����ת����Thread����
		// Runnable�ӿ���һ��Thread�ĸ���
		Thread t = new Thread();
		//����һ���̵߳ķ���  start() --> ִ�����̵߳��̷߳��� run()
		t.start();
		
		
		
		// 3.�̳�TimeTask
		Timer timer = new Timer();		// ��ʱ��������
		
		/* �ö�ʱ��ȥ���������ʱ�����߳�
		 * 1.new UserTimerTask()��ʱ�߳������
		 * 2.1000����ʱ���ٺ���
		 * 3.3000��������ٺ��룬����ִ��
		 * */
		//timer.schedule(new UserTimerTask(), 1000, 3000);
		String strDate = "2018-12-03 13:48:00";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		// �ַ�������������ת��Date
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
		
		
		
		// 4.�̳߳�
		// ����һ���̶��̳߳� ���е��߳�����Ϊ 2 ��
		ExecutorService poolThread = Executors.newFixedThreadPool(2);
		
		for(int i = 0;i < 5; i++)
		{
			UserThread ut = new UserThread();
			
			poolThread.execute(ut);
		}
		
		poolThread.shutdown();
		
		
		
		
		// �̵߳�����ʱû��˳��ģ�����ԱҲ���ܿ��ƣ�����jvm���Ƶ�
		UserThread m1 = new UserThread();
		UserThread m2 = new UserThread();
		UserThread m3 = new UserThread();
		
		// ͨ���̵߳����ȼ����п��ƣ����ܾ��Ա�֤��ִ�У�ֻ����Կ��ܱ�֤
		m2.setPriority(Thread.MAX_PRIORITY);
		
		// ���߳���������
		m1.setName("�߳� 1 ");
		m2.setName("�߳� 2 ");
		m3.setName("�߳� 3 ");
		
		// �����̲߳����ǰ��մ����˳������Ⱥ�ִ�е�
		m2.start();
		//m2.start();			// ͬһ���̲߳����������Σ������ IllegalThreadStateException �쳣
		m1.start();		
		m3.start();
		
		
		
		
		// ��ϰTimerTask
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
