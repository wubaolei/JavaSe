package com.wbl.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Infile
{
	public static void main(String[] args)
	{
		/**
		 * �ֽ�����Ҫ��������ȡ �������ļ�������Ҳ���Զ�ȡ�ı��ļ��������ܲ��Ǻܺ�
		 */
		
//		File f = new File("e:/javaIO��.txt");
//		
//		try
//		{
//			f.createNewFile();
//			
//			// �ı�������FileInputStream
//			FileInputStream in = new FileInputStream("e:/javaIO��.txt");
//			
//			int len = 0;
//			
//			byte[] buffer = new byte[1024];
//			
//			while((len = in.read(buffer)) != -1)
//			{
//				System.out.println(new String(buffer));
//			}
//			
//		}
//		catch (FileNotFoundException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		catch (IOException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		try
		{
			// ������ --> ��ȡ�ļ�����
			FileInputStream ins = new FileInputStream("./src/com/wbl/ch0/Testsix.java");
			
			// ͬʱ�����ļ�
			// ����� --> д���ļ�����
			FileOutputStream ous = new FileOutputStream("./src/a/�ı�2.txt");
			
			int len = 0;
			
			// ���ֶ�ȡ�ı��Ƚ���������
//			while((len = ins.read()) != -1)
//			{
//				System.out.println((char)len);
//			}
			
			
			byte[] buffer = new byte[2*1024];
			
			while((len = ins.read(buffer)) != -1)
			{
				ous.write(buffer);
			}
			
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}
}
