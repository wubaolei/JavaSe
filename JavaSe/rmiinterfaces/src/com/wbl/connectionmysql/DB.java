package com.wbl.connectionmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB
{
	
	Connection conn = null;
	
	DB()				// 连接数据库
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306//life?user=root&password=&userUnicode=true&characterEncoding=UTF8";
			
			conn = DriverManager.getConnection(url);
			
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
}
