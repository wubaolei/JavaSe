package com.wbl.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

// RMI: R --> remoteԶ��		M --> method	I --> invocation
 
// ����̳�һ��Զ�̽ӿ�
public interface IDataService extends Remote
{
	// ��ѯ���ж��������ݣ�RMI�ӿ��еķ����������� RemoteException
	public int getCount(String tableName) throws RemoteException;
}
