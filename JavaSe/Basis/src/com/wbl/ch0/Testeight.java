package com.wbl.ch0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Testeight
{
	
/* 数组两种方式
 * 静态 --> int[] a = {};
 * 动态 --> int[] b = new int();
 */
	
	String[] a = {"索隆"};
	String[] b = new String[2];
	
	Testeight()
	{
		System.out.println("a的长度为：" + a.length);
		System.out.println("b的长度为：" + b.length);
		
		b[0] = "路飞";
		b[0] = "乌索普";
		b[1] = "娜美";
		
		System.out.println(b[0]);
		
		System.out.println("----------------");
	}
	
	
	
	
	public void Linksql()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/life","root",null);
			
//			System.out.println("----" + conn);
			
			// 建立sql语句
			String sql = "select sname from t_stus";
			
			// 执行sql
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			// 返回一个结果集
			ResultSet rs = stmt.executeQuery();
			String s="";
			
			String[] name = null;
			
			int count = 0;
			while(rs.next())
			{
				count++;
			}		// 设置数组的个数

			name = new String[count];
			int row = 0;
			
			rs.beforeFirst();		// 回到结果集的开头
									// 因为上面已经有了一个 rs.next()，到了结果集的最后
									// 重新使用rs.next()
			while(rs.next())
			{
				name[row++] = rs.getString(1);
			}
			
			for(String a:name)		// foreach遍历 适用 jdk1.5 版本
			{
				System.out.println(a);
			}
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
	
	public static void main(String[] args)
	{
		Testeight e = new Testeight();
		e.Linksql();
	}
}
