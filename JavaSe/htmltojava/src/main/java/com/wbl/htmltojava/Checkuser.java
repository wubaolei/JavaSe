package com.wbl.htmltojava;

public class Checkuser
{
	public String checklogin(String name,String pwd)
	{
		Linkdb db = new Linkdb();
		
		boolean tf = db.checkLogin(name, pwd);
		
		if(tf)
		{
			return name+"����½�ɹ�";
		}
		
		return "�Բ��𣬵�¼ʧ��";
	}
	
	
}
