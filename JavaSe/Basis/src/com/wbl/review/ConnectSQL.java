package com.wbl.review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectSQL
{
	Connection conSQL;
	
	ConnectSQL()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
						
			String url = "jdbc:mysql://localhost:3306/life?user=root&password=&userUnicode=true&characterEncoding=UTF8";
			
			conSQL = DriverManager.getConnection(url);
			
//			System.out.println(conSQL);
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
	
	public void executeSQL()
	{
		// 1.编写sql语句
		String sql = "select sname from t_stus";
		
		try
		{
			// 2.带入sql
			PreparedStatement stmt = conSQL.prepareStatement(sql);
			
			// 3.执行sql 存入结果集
			ResultSet rs = stmt.executeQuery();
			
			// 4.while循环
			while(rs.next())
			{
				String data = rs.getString(1);	// 查询出的数据按列来算  从 1 开始
				
				System.out.println(data);
			}
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		ConnectSQL con = new ConnectSQL();
		
		con.executeSQL();
	}
}
