package com.wbl.htmltojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import sun.awt.image.ImageWatched.Link;



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
			
//			System.out.println("连接成功" + conn);
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
		//1.定义sqk语句
		String sql = "select count(*) from t_stus where sname=?and spwd=?";

		try
		{
			//2.执行sql语句
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			//3.传值进sql	setString 从 1 开始 看where的条件需要几个值就是几个
			stmt.setString(1, name);
			stmt.setString(2, pwd);
			
			//4.返回一个结果集 Resultset
			//select 对应 --> executeQuery()
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
	
	public String[][] dataSQL()
	{
		String[][] datas = null;
		
		try
		{
			String sql = "SELECT cid,cname FROM t_classes";

			PreparedStatement stmt = conn.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			// 获取列数
			ResultSetMetaData rsmd = rs.getMetaData();

			int col = rsmd.getColumnCount();

			// 获取行数
			int row = 0;

			while(rs.next())
			{
				row++;
			}
			datas = new String[row][col];

			rs.beforeFirst();		// 从头开始

			int count = 0;			// 开始装载数据
			while(rs.next())		// 第一层循环
			{
				for(int i = 0; i < col; i++)	// 第二层循环
				{
					datas[count][i] = rs.getString(i+1);	// i 是从 0 开始的  而getString() 是从 1 开始的
				}
				count++;			// 第二层循环出来 count+1，再次进入第二层循环
			}
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return datas;
	}
	
	

	public String[][] tableDatas(String cid)
	{
		String sql = "SELECT * FROM n_compute WHERE ncid =?";
		
		String[][] datas=null;
		try
		{
			PreparedStatement pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, cid);
			
			ResultSet rs = pstm.executeQuery();
			
			// 设置列
			ResultSetMetaData rsmd = rs.getMetaData();
			
			int col = rsmd.getColumnCount();
			
			//设置行
			int row = 0;
			while(rs.next())
			{
				row++;
			}
			
			datas = new String[row][col];
			
			rs.beforeFirst();
			
			int count = 0;
			while(rs.next())
			{
				for(int i = 0; i < col; i++)
				{
					datas[count][i] = rs.getString(i+1);
				}
				
				count++;
			}
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return datas;
	}
	
	
	public Object[][] createAntv(String cid)	// 创建报表
	{
		String sql = "SELECT nsex,COUNT(*) FROM (SELECT * FROM n_compute WHERE ncid=?)AS newtable GROUP BY nsex";
		
		Object[][] datas = null;
		
		try
		{
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			// 带入参数
			pstmt.setString(1,cid);
			
			// 定义结果集
			ResultSet rs = pstmt.executeQuery();
			
			// 获取数据的列数
			ResultSetMetaData rsmt = rs.getMetaData();
			int col = rsmt.getColumnCount();
			
			// 获取数据的行数
			int row = 0;
			while( rs.next() )
			{
				row++;
			}
			datas = new Object[row][col];	// 完美定义数组
			
			rs.beforeFirst();
			
			int count = 0;
			while(rs.next())
			{
				for( int i = 0; i < col; i++)
				{
					datas[count][i] = rs.getObject(i+1);
				}
				
				count++;
			}
			
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return datas;
	}
	
	
	
	
}
