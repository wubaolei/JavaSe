package com.wbl.interfaces;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// ʵ�����Զ�̷����Ľӿ�
// ʵ��rmi�ӿڵ��� �����ټ̳�rmi������̳� UnicastRemoteObject
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
