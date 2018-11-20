package com.wbl.review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectOracle
{	
	void aaa()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "student", "student");
			
			System.out.println("ÔÙ¿´¿´£¿-->" + conn);
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
		ConnectOracle t = new ConnectOracle();
		
		t.aaa();
	}
	
	
	
	
}
