package com.wbl.project0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ConnectionSQL
{
	Connection conn;

	public ConnectionSQL() // 链接数据库
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
	
	
	public int getCount(String tableName)			// 远程链接练习
	{
		String sql = "select count(*) from t_user";
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
		finally				// 无论发生什么 这个 finally 都会执行
		{	
			// 方法调用都 断开数据库链接
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
	

	public Object CheckUser(String username, String password) // 查询 某某存不存在数据库
	{
		String sql = "SELECT COUNT(*),uname FROM t_user WHERE uname = ? AND upwd= ?";

		Object data = null;

		try
		{
			PreparedStatement pstm = conn.prepareStatement(sql);

			pstm.setString(1, username);
			pstm.setString(2, password);

			ResultSet rs = pstm.executeQuery();
			while (rs.next())
			{
				if (rs.getInt(1) == 1)
				{
					data = rs.getString(2);
				}
				else
				{
					data = rs.getInt(1);
				}
			}
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	
	
	public int CheckOnlyName(String name)					// 注册用户名唯一
	{
		String sql = "SELECT COUNT(*) FROM t_user WHERE uname= ?";
		
		int a = 0;
		
		try
		{
			PreparedStatement pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, name);
			
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next())
			{
				a = rs.getInt(1);
			}
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

	public int Insertuser(String username, String password, String sex) // 插入数据
	{
		String sql = "INSERT INTO t_user(uname,upwd,usex) VALUES(?,?,?)";

		int a = 0;

		try
		{
			PreparedStatement pstm = conn.prepareStatement(sql);

			pstm.setString(1, username);
			pstm.setString(2, password);
			pstm.setString(3, sex);
			a = pstm.executeUpdate();
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return a;
	}

	public Fmenu[] getFmenuData()		// 左侧菜单列表 父级
	{
		String sql = "SELECT * FROM t_fmenu";

		Fmenu[] fmenu = null;

		try
		{
			PreparedStatement pstm = conn.prepareStatement(sql);

			ResultSet rs = pstm.executeQuery();

			int row = 0;
			while (rs.next())
			{
				row++;
			}
			fmenu = new Fmenu[row];

			rs.beforeFirst();

			int count = 0;
			while (rs.next())
			{
				Fmenu fm = new Fmenu();

				fm.setFid(rs.getInt(1));
				fm.setFname(rs.getString(2));

				fm.setCmenu(getCmenuData(rs.getInt(1)));

				fmenu[count++] = fm;
			}
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return fmenu;
	}

	public Cmenu[] getCmenuData(int id)					// 左侧菜单列表 子级
	{
		String sql = "SELECT * FROM t_cmenu WHERE fcid = ?";

		Cmenu[] cmenu = null;

		try
		{
			PreparedStatement pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			ResultSet rs = pstm.executeQuery();

			int row = 0;
			while (rs.next())
			{
				row++;
			}
			cmenu = new Cmenu[row];

			rs.beforeFirst();

			int count = 0;
			while (rs.next())
			{
				Cmenu cm = new Cmenu();

				cm.setCid(rs.getInt(1));

				cm.setCname(rs.getString(2));
				

				cmenu[count++] = cm;
			}
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cmenu;
	}


	public String[] getMenuList()			// 顶部菜单
	{
		String sql = "SELECT ejobaddress FROM t_emp GROUP BY ejobaddress";
		
		String[] datas = null;
		
		try
		{
			PreparedStatement pstm = conn.prepareStatement(sql);
			
			ResultSet rs = pstm.executeQuery();
			
			int row = 0;
			while(rs.next())
			{
				row++;
			}
			datas = new String[row];
			
			rs.beforeFirst();
			
			int count = 0;
			while(rs.next())
			{
				datas[count++] = rs.getString(1);
			}
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return datas;
	}
	
	public String[][] getTableData(String txt,int initialnum,int barnum)		// 每页数据
	{
//		String sql = "SELECT * FROM t_emp WHERE ejobaddress = ?";
		
		String sql = "SELECT * FROM t_emp WHERE ejobaddress = ? LIMIT ?,?";
		
		String[][] datas = null;
		
		try
		{
			PreparedStatement pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, txt);
			
			pstm.setInt(2, initialnum);
			
			pstm.setInt(3, barnum);
			
			ResultSet rs = pstm.executeQuery();
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			int col = rsmd.getColumnCount();
			
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
	
	public int getSumCount(String name)
	{
		String sql = "SELECT COUNT(*) FROM t_emp WHERE ejobaddress = ?";
		
		int data = 0;
		
		try
		{
			PreparedStatement pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, name);
			
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next())
			{
				data = rs.getInt(1);
			}
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
	}
	
	public String[][] getImages()
	{
		String sql = "SELECT * FROM t_swiper";
		
		String[][] datas = null;
		
		try
		{
			PreparedStatement pstm = conn.prepareStatement(sql);

			ResultSet rs = pstm.executeQuery();

			ResultSetMetaData rsmt = rs.getMetaData();
			int col = rsmt.getColumnCount();

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
				for(int i = 0; i < col;i++)
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
	
	
	public int UpdateImageShow(String[] data)
	{
		String sql = "UPDATE t_swiper SET sstatus = 1 WHERE sid = ?";
		
		int count = 0;
		
		try
		{
			PreparedStatement pstm = conn.prepareStatement(sql);
			
			for(String d:data)
			{
				pstm.setString(1, d);
				count = pstm.executeUpdate();
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
		
		return count;
	}
	
	
	
	public int UpdateImageHide(String[] data)
	{
		String sql = "UPDATE t_swiper SET sstatus = 0 WHERE sid = ?";
		
		int count = 0;
		
		try
		{
			PreparedStatement pstm = conn.prepareStatement(sql);
			
			for(String d:data)
			{
				pstm.setString(1, d);
				count = pstm.executeUpdate();
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
		
		return count;
	}
	
//	public static void main(String[] args)
//	{
//		ConnectionSQL db = new ConnectionSQL();
//		
//		int data =	db.getSumCount("新丝路");
//		
//		System.out.println(data);
//	}
	
}
