package com.wbl.io;

import java.io.File;
import java.io.IOException;

public class CreateFile
{
	public static void main(String[] args)
	{
		// File�࣬����һ��File�࣬�����˾���Ŀ¼���ļ�
		// �����ļ�
//		File f = new File("e://aa.txt");
//		
//		try
//		{
//			// �����ļ����� createNewFile()
//			f.createNewFile();
//		}
//		catch (IOException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		// �������ļ��е��ļ�
//		File f = new File("e://a//b//a.txt");
//		
//		// ��ȡ �ļ��� ��Ŀ¼
//		File ff = f.getParentFile();
//		System.out.println(ff);
//		
//		// ����Ŀ¼��mkdirֻ�ܵ�ǰĿ¼�����ܴ�����Ŀ¼
//		// mkdirs ������ǰĿ¼������Ŀ¼		�õĽ϶�
//		ff.mkdirs();	// ����Ŀ¼��������ļ��������ļ������� createNewFile()
//		
//		try
//		{
//			f.createNewFile();
//		}
//		catch (IOException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
		// �������·�� 	����ִ�д������
//		File f = new File(".//src//a//Base.java");
//		
//		f.getParentFile().mkdirs();			// ��д
//		
//		try
//		{
//			f.createNewFile();
//		}
//		catch (IOException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		// ��һ��д��
//		File f = new File("e:/a","a.txt");
//		
//		f.getParentFile().mkdirs();
//		
//		try
//		{
//			f.createNewFile();
//		}
//		catch (IOException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// ɾ���ļ���
		//f.getParentFile().deleteOnExit();
		
		// ɾ���ļ�
		//f.delete();
		
		
		
		
		
		// �����е�Ŀ¼�ﴴ���ļ�
//		File f = new File("e:/a/b/a.txt");
//		
//		// �ж��Ƿ����Ŀ¼
//		if(!f.getParentFile().exists())
//		{
//			f.getParentFile().mkdirs();
//		}
//		try
//		{
//			f.createNewFile();
//		}
//		catch (IOException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
}
