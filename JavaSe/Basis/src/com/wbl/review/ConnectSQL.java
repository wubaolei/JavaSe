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
		// 1.��дsql���
		String sql = "select sname from t_stus";
		
		try
		{
			// 2.����sql
			PreparedStatement stmt = conSQL.prepareStatement(sql);
			
			// 3.ִ��sql ��������
			ResultSet rs = stmt.executeQuery();
			
			// 4.whileѭ��
			while(rs.next())
			{
				String data = rs.getString(1);	// ��ѯ�������ݰ�������  �� 1 ��ʼ
				
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
