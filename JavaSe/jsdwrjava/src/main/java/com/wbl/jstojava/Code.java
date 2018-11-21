package com.wbl.jstojava;

import java.util.Random;

public class Code
{
	public String code()
	{
		String m="";
		for(int i = 0;i<4;i++)
		{
			double x = Math.floor(Math.random()*10);
			int c = (int)x;
			m = m + c;
		}
		return m;
	}
	
	public String namei()
	{
		String[] n = {"梊議議","ヴ議議","呤議議","燠議議"};
		Random ran = new Random();
		int i = ran.nextInt(3);
		return "斕疑" + n[i];
	}
	
	public int[] wl()
	{
		int[] a = new int[2];
		double x = Math.floor(Math.random()*1000);
		double y = Math.floor(Math.random()*1000);
		
		if((x<500 && x>100) || (y<500 && y>100))
		{
			int width = (int)x;
			int height = (int)y;
			a[0] = width;
			a[1] = height;
		}
		else
		{
			a[0] = 200;
			a[1] = 200;
		}
		return a;
	}
	
	
	
	
}
