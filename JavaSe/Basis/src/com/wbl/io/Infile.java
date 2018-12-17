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
		 * 字节流主要是用来读取 二进制文件，但是也可以读取文本文件但是性能不是很好
		 */
		
//		File f = new File("e:/javaIO流.txt");
//		
//		try
//		{
//			f.createNewFile();
//			
//			// 文本输入流FileInputStream
//			FileInputStream in = new FileInputStream("e:/javaIO流.txt");
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
			// 输入流 --> 读取文件数据
			FileInputStream ins = new FileInputStream("./src/com/wbl/ch0/Testsix.java");
			
			// 同时创建文件
			// 输出流 --> 写进文件数据
			FileOutputStream ous = new FileOutputStream("./src/a/文本2.txt");
			
			int len = 0;
			
			// 这种读取文本比较消耗性能
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
