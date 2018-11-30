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
			return name+"欢迎登录";
		}
		return "对不起，登录失败";
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
	
	
	
	public String createAntvs(String cid)				// 数据转化 json 格式
	{
		Linkdb db = new Linkdb();
		
		Object[][] datas = db.createAntv(cid);
		
		// 数据容器倒换
		JSONArray array = new JSONArray();
		
		for(int i = 0; i < datas.length;i++)
		{
			// 创建JSONObject对象---> {} 这个符号
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
