package com.wbl.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.wbl.interfaces.IDataService;

public class Client
{
	// 接口是重点
	// 如果是自己与自己相连  接口名和接口包名得是一样
	// 如果自己与别人相连  接口名和接口包名得是一样
	// 这里是客户端  可以通过服务端的 ip 地址访问服务端
	public void getTableCount()
	{
		try
		{
			
			// 这里 rmi 更换地址 可以链接别人
			// 前提得 在 cmd 中 用 ping + 对方的ip
			IDataService dataservice = (IDataService) Naming.lookup("rmi://127.0.0.1:8200/dataservice");
			
			// 数据库表名
			int count = dataservice.getCount("t_user");
			
			System.out.println("远程访问结果为：" + count);
		}
		catch (MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (RemoteException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (NotBoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		Client c = new Client();
		
		c.getTableCount();
	}
}
