package com.wbl.interfaces;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class DataConsoleApp
{
	public static void main(String[] args)
	{
		System.out.println("数据访问，启动...");
		
		// 这里是服务端
		try
		{
			// 声明远程服务对象
			IDataService dataservice = new UserDataServiceImpl();
			
			// 在本地注册服务短端口
			LocateRegistry.createRegistry(8200);
			
			// 绑定 RMI 服务
			Naming.bind("rmi://127.0.0.1:8200/dataservice", dataservice);
		}
		catch (RemoteException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (AlreadyBoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
