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
		System.out.println("���ݷ��ʣ�����...");
		
		// �����Ƿ����
		try
		{
			// ����Զ�̷������
			IDataService dataservice = new UserDataServiceImpl();
			
			// �ڱ���ע�����̶˿�
			LocateRegistry.createRegistry(8200);
			
			// �� RMI ����
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
