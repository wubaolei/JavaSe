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
			System.out.println("���ӳɹ���" + conn);
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
		// 1.����sql
		String sql = "SELECT  COUNT(*) FROM t_stus WHERE sname =? AND spwd =?";
		
		try
		{
			// 2.ִ��sql���  ����
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			// 3.���ô���������±��Ǵ�1��ʼ��
			stmt.setString(1, name);
			stmt.setString(2, pwd);
			
			// 4.select��Ӧ --> executeQuery()
			// ResultSet��һ�����������ʾ��ѯ�Ľ��
			ResultSet re = stmt.executeQuery();
			
			System.out.println(re);
			
			// 5.��������һ��Ҫѭ������
			// re.next() ����true���ʹ�������������ѭ����
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
