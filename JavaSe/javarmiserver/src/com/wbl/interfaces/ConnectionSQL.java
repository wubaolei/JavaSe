package com.wbl.interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ConnectionSQL
{
	Connection conn;

	public ConnectionSQL() // �������ݿ�
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/life?user=root&password=&userUnicode=true&characterEncoding=UTF8";
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
	
	
	public int getCount(String tableName)			// Զ��������ϰ
	{
		String sql = "SELECT COUNT(*) FROM " + tableName;
		int count = 0;
		try
		{
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while(rs.next())
			{
				count = rs.getInt(1);
			}
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally				// ���۷���ʲô ��� finally ����ִ��
		{	
			// �������ö� �Ͽ����ݿ�����
			if(null != conn)
			{
				try
				{
					conn.close();
				}
				catch (SQLException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return count;
	}
}
