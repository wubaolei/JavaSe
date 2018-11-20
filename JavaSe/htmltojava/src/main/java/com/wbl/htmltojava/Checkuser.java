package com.wbl.htmltojava;

public class Checkuser
{
	public String Checkuser(String name,String pwd)
	{
		Linkdb db = new Linkdb();
		boolean tf = db.checkUser(name, pwd);
		if(tf)
		{
			return name+"»¶Ó­µÇÂ¼";
		}
		return "¶Ô²»Æð£¬µÇÂ¼Ê§°Ü";
		
	}
}
