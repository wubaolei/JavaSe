package com.wbl.review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectSQL
{

	public void cc()
	{
		try
		{
			// 第一步加载数据库驱动
			Class.forName("com.mysql.jdbc.Driver");
			
			// 连接数据库
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/life", "root", null);
			
			System.out.println(conn);
		}
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args)
	{
		ConnectSQL c = new ConnectSQL();
		c.cc();
	}
	
}
