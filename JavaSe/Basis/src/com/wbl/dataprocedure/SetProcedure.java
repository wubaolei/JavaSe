package com.wbl.dataprocedure;

import java.awt.Window.Type;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.concurrent.Callable;

import oracle.jdbc.OracleTypes;

public class SetProcedure
{
	Connection conn;

	SetProcedure()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "student", "student");

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

	
	
	public void getProcedure(int num, String tablename, int yeshu)
	{
		String sql = "{call t_one(?,?,?,?)}";

		try
		{
			CallableStatement cstm = conn.prepareCall(sql);

			cstm.setInt(1, num);
			cstm.setString(2, tablename);
			cstm.setInt(3, yeshu);

			cstm.registerOutParameter(4, OracleTypes.CURSOR);

			cstm.execute();
			
			ResultSet rs = (ResultSet) cstm.getObject(4);

			while (rs.next())
			{
				System.out.println(rs.getInt(2) + "," + rs.getString(3));
			}

		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	public void getTwo(int num, String tablename, int yeshu)
	{
		String sql = "{?=call t_two(?,?,?)}";
		
		try
		{
			CallableStatement cstm = conn.prepareCall(sql);
			
			// Oracle���ص���һ�� sys_refcursor ����  ��һ�������
			cstm.registerOutParameter(1, OracleTypes.CURSOR);
			cstm.setInt(2, num);
			cstm.setString(3, tablename);
			cstm.setInt(4, yeshu);
			
			cstm.execute();
			
			// ���ݿⷵ�ص��ǽ����ʱ  ��Ҫת���� resultSet��ʽ
			ResultSet rs = (ResultSet) cstm.getObject(1);
			
			while(rs.next())
			{
				System.out.println(rs.getInt(2) + "," + rs.getString(3));
			}
			
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public void getPageData(String tablename,int numb,int curr)
	{
		String sql = "{call paging(?,?,?,?,?)}";
		
		try
		{

			// ʹ�� call ִ�� �洢����
			CallableStatement cstm = conn.prepareCall(sql);
			
			// ���ò���   in ϵ��
			cstm.setString(1, tablename);
			cstm.setInt(2, numb);
			cstm.setInt(3, curr);
			
			// ���ò���  out ϵ��
			cstm.registerOutParameter(4, Types.INTEGER);
			cstm.registerOutParameter(5, OracleTypes.CURSOR);
			
			//ִ��
			cstm.execute();
			
			int num = cstm.getInt(4);
			
			System.out.println(num);
			
			
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args)
	{
		SetProcedure s = new SetProcedure();

//		s.getPageData("pra",2,3);
//		s.getProcedure(2,"pra",3);
	}
}
