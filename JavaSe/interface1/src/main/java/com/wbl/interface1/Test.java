package com.wbl.interface1;

public class Test
{
	private Fath b;
	
	public String getCode(String name)
	{
		
		switch(name)
		{
			case "Êý×Ö":
				b = new Son();
				break;
			case "ºº×Ö":
				b = new Hanzi();
				break;
		}
		return b.createCode();

	}
	
}
