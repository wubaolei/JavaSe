package com.wbl.storagedatapractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OracleDB
{
	private Connection conn;
	
	OracleDB()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","student","student");
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
	
	
	public List getHashMapDatas()			// 用 HashMap 装数据
	{
		String sql = "select * from pra";
		
		List list = new ArrayList();
		
		try
		{
			PreparedStatement pstm = conn.prepareStatement(sql);
			
			ResultSet rs = pstm.executeQuery();
			
			// 为了下面获取数据库中的 列数
			ResultSetMetaData rsmd = rs.getMetaData();
			
			// 循环行数
			while(rs.next())
			{
				Map map = new HashMap();	// 创建 HashMap集合
				
				for(int i = 0; i < rsmd.getColumnCount(); i++)
				{
					// 这里是开始赋值了	都是从 1 开始的
					// 第一个值是 键名 也就是 数据库中的字段名
					// 第二个值是 值 也就是 数据库中字段对应的数据
					map.put(rsmd.getColumnName(i+1), rs.getObject(i+1));
				}
				
				list.add(map);
			}
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
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
		
		return list;
	}
	
	
	public static void main(String[] args)
	{
		OracleDB odb = new OracleDB();
		
		// 调用接口中的 变量
		String s = Cond.PRA_KEY;
		
		// 把接口中的变量分割，获取 表名
		// subString()    从 第 0 个开始算 遇到的 第一个 分号
		String tablename = s.substring(0,s.indexOf(";"));
		
		// 把表名分割出，余下的数据
		String s1 = s.substring(s.indexOf(";")+1);
//		System.out.println(s1);
		
		// 以 逗号 分割
		String[] fieldname = s1.split(",");
		
		List list =  odb.getHashMapDatas();
		
		for(int i = 0; i < list.size(); i++)
		{
			// 大类型 转 小类型
			Map map = (Map) list.get(i);
			
			for(String key:fieldname)
			{
				// 输出每个字段的数据
				System.out.println(map.get(key));
			}
		}
	}
	
	
	
}
