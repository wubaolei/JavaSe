package com.wbl.htmltojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Linkdb
{
	Connection conn;

	Linkdb()
	{
		String url = "jdbc:mysql://localhost:3306/life?user=root&password=&useUnicode=true&characterEncoding=UTF8";
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(url);
			System.out.println("连接成功：" + conn);
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
	
	
	public boolean checkLogin(String name,String pwd)
	{
		// 1.定义sql
		String sql = "SELECT  COUNT(*) FROM t_stus WHERE sname =? AND spwd =?";
		
		try
		{
			// 2.执行sql语句  运用
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			// 3.设置传入参数，下标是从1开始的
			stmt.setString(1, name);
			stmt.setString(2, pwd);
			
			// 4.select对应 --> executeQuery()
			// ResultSet是一个结果集，表示查询的结果
			ResultSet re = stmt.executeQuery();
			
			System.out.println(re);
			
			// 5.这个结果集一定要循环遍历
			// re.next() 返回true，就代表结果集，进入循环体
			while(re.next())
			{
				int count = re.getInt(1);
				System.out.println("---------->" + count + "---" + re.next());
				
				if(count>0)
				{
					return true;
				}
			}
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
}
