package com.wbl.mysqlandoracle;

import java.sql.Connection;

public class ConnectionMysql extends StaticDBInfo
{

	public ConnectionMysql(String driver, String url, String username, String userpwd)
	{
		super(driver, url, username, userpwd);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String[] getDatas(String sql, Object[] params)
	{
		// TODO Auto-generated method stub
		
		this.getConnection();
		
		Connection conn = this.getCon();
		
		
		
		
		return null;
	}
	
}
