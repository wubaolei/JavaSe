package com.wbl.htmltojava;

public class Checkuser
{
	public String checklogin(String name,String pwd)
	{
		Linkdb db = new Linkdb();
		
		boolean tf = db.checkLogin(name, pwd);
		
		if(tf)
		{
			return name+"，登陆成功";
		}
		
		return "对不起，登录失败";
	}
	
	
}
