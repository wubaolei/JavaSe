package com.wbl.threadlesson4;

import java.util.Scanner;

public class Test
{
	static UserThread[] ut;
	
	static
	{
		ut = new UserThread[3];
		
		/**
		 * ���������߳�
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
			
			System.out.println("��ǰ����Ϊ��" + task);
			
//			for(int i = 0; i < ut.length; i++)
//			{
//				if(!ut[i].isF())
//				{
//					ut[i].setTask(task);
//					
//					ut[i].setF(true);
//				}
//				break;	// ����ѭ����
//			}
			/**
			 * �����for��� ���е������
			 * �� i=0 ʱ������ if �жϣ������еĵ�һ���߳�ִ�У�Ȼ������ѭ��
			 * ��Ϊ��һ���̻߳�û��ִ����ɣ������������ʱ��i ���� 0������ i=0ʱ���̻߳�û��ִ����ɣ����Բ������ if �ٴ�ִ��
			 * 
			 * ����������� int i��whileѭ�����涨��
			 * �����while���涨�� int i ÿ��ѭ�� i ��Ϊ 0  
			 */
			
			for(;i<ut.length;)
			{
				if(!ut[i].isF())
				{
					ut[i].setTask(task);
					
					ut[i].setF(true);
					
					System.out.println("���еĻ��У�" + (ut.length-i-1) + "��");
					
					i++;
					
					break;
				}
			}
			
			System.out.println("i ��ֵΪ��" + i);
			
			if(i >= ut.length)
			{
				i = 0;
			}
		}
	}
}
