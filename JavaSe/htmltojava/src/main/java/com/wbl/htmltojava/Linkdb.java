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
		String url = "jdbc:mysql://localhost:3306/life?user=root&password=&userUnicode=true&characterEncoding=UTF8";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(url);
			
//			System.out.println("���ӳɹ�" + conn);
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
	
	public boolean checkUser(String name,String pwd)
	{
		//1.����sqk���
		String sql = "select count(*) from t_stus where sname=?and spwd=?";

		try
		{
			//2.ִ��sql���
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			//3.��ֵ��sql	setString �� 1 ��ʼ ��where��������Ҫ����ֵ���Ǽ���
			stmt.setString(1, name);
			stmt.setString(2, pwd);
			
			//4.����һ������� Resultset
			//select ��Ӧ --> executeQuery()
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				int count = rs.getInt(1);
				
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
