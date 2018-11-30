package com.wbl.mysqlandoracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public abstract class StaticDBInfo
{
	private Connection conn;
	
	private String driver;
	private String url;
	private String username;
	private String userpwd;

	public StaticDBInfo(String driver, String url, String username, String userpwd)
	{
		this.driver = driver;
		this.url = url;
		this.username = username;
		this.userpwd = userpwd;
	}
	
	public void getConnection()
	{
		try
		{
			Class.forName(this.driver);
			
			conn = DriverManager.getConnection(url,username,userpwd);
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
	

	public abstract String[] getDatas(String sql,Object[] params);
	
	public Connection getCon()
	{
		return conn;
	}

}
