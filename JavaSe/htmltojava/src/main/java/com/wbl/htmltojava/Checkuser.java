package com.wbl.htmltojava;

public class Checkuser
{
	public String Checkuser(String name,String pwd)
	{
		Linkdb db = new Linkdb();
		boolean tf = db.checkUser(name, pwd);
		if(tf)
		{
			return name+"��ӭ��¼";
		}
		return "�Բ��𣬵�¼ʧ��";
	}
	
	
	public String[] divdatas()
	{
		Linkdb db = new Linkdb();
		
		String[] datas = db.divvalue();
		
		return datas;
	}
}
