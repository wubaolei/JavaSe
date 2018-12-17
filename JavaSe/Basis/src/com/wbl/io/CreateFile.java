package com.wbl.io;

import java.io.File;
import java.io.IOException;

public class CreateFile
{
	public static void main(String[] args)
	{
		// File类，构建一个File类，构建了具体目录和文件
		// 创建文件
//		File f = new File("e://aa.txt");
//		
//		try
//		{
//			// 创建文件方法 createNewFile()
//			f.createNewFile();
//		}
//		catch (IOException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		// 创建带文件夹的文件
//		File f = new File("e://a//b//a.txt");
//		
//		// 获取 文件夹 的目录
//		File ff = f.getParentFile();
//		System.out.println(ff);
//		
//		// 创建目录：mkdir只能当前目录，不能创建子目录
//		// mkdirs 创建当前目录包括子目录		用的较多
//		ff.mkdirs();	// 创建目录后，如果有文件，创建文件依旧是 createNewFile()
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
		
		
		
		
		// 创建相对路径 	详情执行代码见晓
//		File f = new File(".//src//a//Base.java");
//		
//		f.getParentFile().mkdirs();			// 简写
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
		
		
		
		// 另一种写法
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
		
		// 删除文件夹
		//f.getParentFile().deleteOnExit();
		
		// 删除文件
		//f.delete();
		
		
		
		
		
		// 在已有的目录里创建文件
//		File f = new File("e:/a/b/a.txt");
//		
//		// 判断是否存在目录
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
