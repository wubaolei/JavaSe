package com.wbl.io;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DB
{
	Connection con;
	
	DB()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/life?user=root&password=&userUnicode=true&characterEncoding=UTF8");
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
	
	
	public void getDatas()
	{
		String sql = "select * from t_stus";
		
		List list = new ArrayList();
	}
	
	
	
	
	
	
	
	/**
	 * git
	 * javase/java_file_io/src/com/lixin/lesson3/
	 * 
	 */
	
	
	
	
}
