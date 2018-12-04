package com.wbl.project0;

public class CheckUser
{
	public Object CheckUSE(String username,String password)
	{
		ConnectionSQL db = new ConnectionSQL();
		
		Object data = db.CheckUser(username, password);
		
		return data;
	}
	
	public String LogoImg()				// logoͼƬ
	{
		return "image/login.jpg";
	}
	
	
	public int InsertUser(String username,String password,String sex)		// ע��
	{
		ConnectionSQL db = new ConnectionSQL();
		
		int a = db.Insertuser(username, password, sex);
		
		return a;
	}
	
	
	public Fmenu[] listDatas()					//  �����˵�
	{
		ConnectionSQL db = new ConnectionSQL();
		
		Fmenu[] listdatas = db.getFmenuData();
		
		return listdatas;
	}
	
	public int CheckOnlyName(String name)		// �û�Ψһ
	{
		ConnectionSQL db = new ConnectionSQL();
		
		int a = db.CheckOnlyName(name);
		
		return a;
	}
	
	public String[] getMenulist()					// �����˵�
	{
		ConnectionSQL db = new ConnectionSQL();
		
		String[] datas = db.getMenuList();
				
		return datas;
	}
	
	public String[][] getTabledata(String txt,int initialnum,int barnum)		// ��ҳ������
	{
		ConnectionSQL db = new ConnectionSQL();
		
		String[][] datas = db.getTableData(txt,initialnum,barnum);
		
		return datas;
	}
	
	
	public int getSumcount(String name)
	{
		ConnectionSQL db = new ConnectionSQL();
		
		int data = db.getSumCount(name);
		
		return data;
	}
	
	public String[][] getimages()
	{
		ConnectionSQL db = new ConnectionSQL();
		
		String[][] datas = db.getImages();
		
		return datas;
	}
	
	
	public int updataimageshow(String num)
	{
		ConnectionSQL db = new ConnectionSQL();
		
		String[] data = num.split(",");

		int count = db.UpdateImageShow(data);
		
		return count;
	}
	
	
	public int updataimagehide(String num)
	{
		ConnectionSQL db = new ConnectionSQL();
		
		String[] data = num.split(",");
		
		int count = db.UpdateImageHide(data);
		
		return count;
	}
	
	
	
}
