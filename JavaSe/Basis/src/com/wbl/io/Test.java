package com.wbl.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

public class Test
{
	// 查询有多少文件
	ArrayList<String> a = new ArrayList<String>();
	
	public void searchFiles(File cf)
	{
		// 获取所有文件夹 及文件
		File[] f = cf.listFiles();
		
		// 遍历 f
		for(File i:f)
		{
			// 判断 i 是否是 文件
			if(i.isFile())
			{
				// 获取文件的名字
				String fileName = i.getName();
//				
//				// 截取最后一个 点
//				String txt = fileName.substring(fileName.lastIndexOf("."));
//				
//				// 判断被截取的是不是 .txt 类型
//				if(txt.equals(".txt"))
//				{
//					a.add(fileName);
//				}
				
				// 另一种判断 文件类型
				if(fileName.endsWith(".txt"))
				{
					a.add(fileName);
					
					// 打印文件名
					System.out.println("这个txt的文件名为：" + fileName);
				}
				
			}
			else
			{
				System.out.println(i.getName());
				
				// 不是文件 就 重新调用当前方法在进行遍历
				searchFiles(i);
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		File f = new File("e:/a");
		
		Test t = new Test();
		
		t.searchFiles(f);
		
		// 没有把 a 定义成静态变量
		System.out.println("txt的文件有：" + t.a.size());
	}
	
	
	
}
