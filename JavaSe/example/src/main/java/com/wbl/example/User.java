package com.wbl.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class User
{
	private Connection conn;
	
	public User()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/life","root",null);
			
			System.out.println("雷哥-------" + conn);
		}
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("我丢类");
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
