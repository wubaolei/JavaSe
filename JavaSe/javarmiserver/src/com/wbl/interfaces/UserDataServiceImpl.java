package com.wbl.interfaces;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class UserDataServiceImpl extends UnicastRemoteObject  implements IDataService
{

	protected UserDataServiceImpl() throws RemoteException
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCount(String tableName) throws RemoteException
	{
		System.out.println("UserDataServiceImpl is getCount start...");
		// TODO Auto-generated method stub
		
		ConnectionSQL db = new ConnectionSQL();
		
		int count = db.getCount(tableName);
		
		System.out.println("数据结果为：" + count);
		
		return count;
	}
	 
}
