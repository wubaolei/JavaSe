package com.wbl.example;

import java.sql.Connection;

public class User
{
	private Connection conn;
	
	public User()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");

			
			System.out.println("雷哥");
		}
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("我丢类");
		}
	}
	
	
	
	static void aaa()
	{
		
	}
	
	public static void main(String[] args)
	{
//		User u1 = new User();
		
		User.aaa();
	}
}
