package com.wbl.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

// RMI: R --> remote远程		M --> method	I --> invocation
 
// 必须继承一个远程接口
public interface IDataService extends Remote
{
	// 查询表中多少条数据，RMI接口中的方法必须声明 RemoteException
	public int getCount(String tableName) throws RemoteException;
}
