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
			// ��һ���������ݿ�����
			Class.forName("com.mysql.jdbc.Driver");
			
			// �������ݿ�
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
