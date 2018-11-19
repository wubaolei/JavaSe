package com.wbl.interface1;

import java.util.Random;

public class Hanzi implements Fath
{
	public String createCode()
	{
		String[] a = {"春雷","启明","刘备","关羽","张飞","吕布"}; 
			
		Random ran = new Random();
		int i = ran.nextInt(6);
		
		return "随机姓名：" + a[i];
		
	}
	
	
}
