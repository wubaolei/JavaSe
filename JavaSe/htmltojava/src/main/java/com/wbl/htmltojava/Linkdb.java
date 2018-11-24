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
	
	public String[][] dataSQL()
	{
		String[][] datas = null;
		
		try
		{
			String sql = "SELECT cid,cname FROM t_classes";

			PreparedStatement stmt = conn.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			// ��ȡ����
			ResultSetMetaData rsmd = rs.getMetaData();

			int col = rsmd.getColumnCount();

			// ��ȡ����
			int row = 0;

			while(rs.next())
			{
				row++;
			}
			datas = new String[row][col];

			rs.beforeFirst();		// ��ͷ��ʼ

			int count = 0;			// ��ʼװ������
			while(rs.next())		// ��һ��ѭ��
			{
				for(int i = 0; i < col; i++)	// �ڶ���ѭ��
				{
					datas[count][i] = rs.getString(i+1);	// i �Ǵ� 0 ��ʼ��  ��getString() �Ǵ� 1 ��ʼ��
				}
				count++;			// �ڶ���ѭ������ count+1���ٴν���ڶ���ѭ��
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
			
			// ������
			ResultSetMetaData rsmd = rs.getMetaData();
			
			int col = rsmd.getColumnCount();
			
			//������
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
	
	
	public Object[][] createAntv(String cid)	// ��������
	{
		String sql = "SELECT nsex,COUNT(*) FROM (SELECT * FROM n_compute WHERE ncid=?)AS newtable GROUP BY nsex";
		
		Object[][] datas = null;
		
		try
		{
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			// �������
			pstmt.setString(1,cid);
			
			// ��������
			ResultSet rs = pstmt.executeQuery();
			
			// ��ȡ���ݵ�����
			ResultSetMetaData rsmt = rs.getMetaData();
			int col = rsmt.getColumnCount();
			
			// ��ȡ���ݵ�����
			int row = 0;
			while( rs.next() )
			{
				row++;
			}
			datas = new Object[row][col];	// ������������
			
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
