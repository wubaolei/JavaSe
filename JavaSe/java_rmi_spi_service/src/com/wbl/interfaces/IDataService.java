package com.wbl.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IDataService extends Remote
{
	public int getCount(String tableName) throws RemoteException;
}
