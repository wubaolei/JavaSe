package com.wbl.interfaces;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// 实现这个远程方法的接口
// 实现rmi接口的类 必须再继承rmi，必须继承 UnicastRemoteObject
public class UserDataService extends UnicastRemoteObject implements IDataService
{

	protected UserDataService() throws RemoteException
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCount(String tableName) throws RemoteException
	{
		System.out.println("UserDataService is getCount start...");
		
		// TODO Auto-generated method stub
		return 0;
	}
}
