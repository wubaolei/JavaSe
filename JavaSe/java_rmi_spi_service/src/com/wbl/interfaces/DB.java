package com.wbl.interfaces;

public interface DB
{
	// ����**�������
	public int getCount(String tableName);
	
//	DB()
//	{
//		try
//		{
//			String url = "jdbc:mysql://localhost:3306/life?user=root&password=&userUnicode=true&characterEncoding=UTF8";
//			
//			Class.forName("com.mysql.jdbc.Driver");
//			
//			con = DriverManager.getConnection(url);
//			
////			System.out.println(con);
//		}
//		catch (ClassNotFoundException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		catch (SQLException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	
//	public static void main(String[] args)
//	{
//		DB db = new DB();
//	}
}
