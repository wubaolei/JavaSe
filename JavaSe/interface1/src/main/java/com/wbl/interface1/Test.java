package com.wbl.interface1;

public class Test
{
	private Fath b;
	
	public String getCode(String name)
	{
		
		switch(name)
		{
			case "����":
				b = new Son();
				break;
			case "����":
				b = new Hanzi();
				break;
		}
		return b.createCode();

	}
	
}
