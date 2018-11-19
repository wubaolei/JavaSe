package com.wbl.interface1;

public class Son implements Fath
{
	public String createCode()
	{
		String c="";
		for(int i = 0;i<4;i++)
		{
			double a = Math.floor(Math.random()*10);
			int b = (int)a;
			c = c+b;
		}
		
		return "ÑéÖ¤ÂëÎª£º"+c;
	}
}
