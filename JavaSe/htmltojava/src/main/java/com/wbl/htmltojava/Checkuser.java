package com.wbl.htmltojava;

import org.json.JSONArray;
import org.json.JSONObject;

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
	
	
//	public String[] divdatas()
//	{
//		Linkdb db = new Linkdb();
//		
//		String[] datas = db.divvalue();
//		
//		return datas;
//	}
	
	
	public String[][] navigationData()
	{
		Linkdb db = new Linkdb();
		
		String[][] datas = db.dataSQL();
		
		return datas;
	}
	
	
	public String[][] tableDatas(String cid)
	{
		Linkdb db = new Linkdb();
		
		String[][] datas = db.tableDatas(cid);
		
		return datas;
	}
	
	
	
	public String createAntvs(String cid)				// ����ת�� json ��ʽ
	{
		Linkdb db = new Linkdb();
		
		Object[][] datas = db.createAntv(cid);
		
		// ������������
		JSONArray array = new JSONArray();
		
		for(int i = 0; i < datas.length;i++)
		{
			// ����JSONObject����---> {} �������
			JSONObject jsonObj = new JSONObject();
			
			
			jsonObj.put("dataw", datas[i][1]);
			jsonObj.put("sex", datas[i][0]);
			
			array.put(jsonObj);
		}
		//System.out.println(array.toString());
		return array.toString();
		
		//return datas;
	}
}
