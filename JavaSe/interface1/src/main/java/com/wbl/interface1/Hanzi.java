package com.wbl.interface1;

import java.util.Random;

public class Hanzi implements Fath
{
	public String createCode()
	{
		String[] a = {"����","����","����","����","�ŷ�","����"}; 
			
		Random ran = new Random();
		int i = ran.nextInt(6);
		
		return "���������" + a[i];
		
	}
	
	
}
