package com.wbl.ch0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Testeight
{
	
/* �������ַ�ʽ
 * ��̬ --> int[] a = {};
 * ��̬ --> int[] b = new int();
 */
	
	String[] a = {"��¡"};
	String[] b = new String[2];
	
	Testeight()
	{
		System.out.println("a�ĳ���Ϊ��" + a.length);
		System.out.println("b�ĳ���Ϊ��" + b.length);
		
		b[0] = "·��";
		b[0] = "������";
		b[1] = "����";
		
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
			
			// ����sql���
			String sql = "select sname from t_stus";
			
			// ִ��sql
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			// ����һ�������
			ResultSet rs = stmt.executeQuery();
			String s="";
			
			String[] name = null;
			
			int count = 0;
			while(rs.next())
			{
				count++;
			}		// ��������ĸ���

			name = new String[count];
			int row = 0;
			
			rs.beforeFirst();		// �ص�������Ŀ�ͷ
									// ��Ϊ�����Ѿ�����һ�� rs.next()�����˽���������
									// ����ʹ��rs.next()
			while(rs.next())
			{
				name[row++] = rs.getString(1);
			}
			
			for(String a:name)		// foreach���� ���� jdk1.5 �汾
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
