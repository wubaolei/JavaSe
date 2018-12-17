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
	
	
	public List getHashMapDatas()			// �� HashMap װ����
	{
		String sql = "select * from pra";
		
		List list = new ArrayList();
		
		try
		{
			PreparedStatement pstm = conn.prepareStatement(sql);
			
			ResultSet rs = pstm.executeQuery();
			
			// Ϊ�������ȡ���ݿ��е� ����
			ResultSetMetaData rsmd = rs.getMetaData();
			
			// ѭ������
			while(rs.next())
			{
				Map map = new HashMap();	// ���� HashMap����
				
				for(int i = 0; i < rsmd.getColumnCount(); i++)
				{
					// �����ǿ�ʼ��ֵ��	���Ǵ� 1 ��ʼ��
					// ��һ��ֵ�� ���� Ҳ���� ���ݿ��е��ֶ���
					// �ڶ���ֵ�� ֵ Ҳ���� ���ݿ����ֶζ�Ӧ������
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
		
		// ���ýӿ��е� ����
		String s = Cond.PRA_KEY;
		
		// �ѽӿ��еı����ָ��ȡ ����
		// subString()    �� �� 0 ����ʼ�� ������ ��һ�� �ֺ�
		String tablename = s.substring(0,s.indexOf(";"));
		
		// �ѱ����ָ�������µ�����
		String s1 = s.substring(s.indexOf(";")+1);
//		System.out.println(s1);
		
		// �� ���� �ָ�
		String[] fieldname = s1.split(",");
		
		List list =  odb.getHashMapDatas();
		
		for(int i = 0; i < list.size(); i++)
		{
			// ������ ת С����
			Map map = (Map) list.get(i);
			
			for(String key:fieldname)
			{
				// ���ÿ���ֶε�����
				System.out.println(map.get(key));
			}
		}
	}
	
	
	
}
