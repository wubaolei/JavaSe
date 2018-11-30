package com.wbl.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.wbl.interfaces.IDataService;

public class Client
{
	// �ӿ����ص�
	// ������Լ����Լ�����  �ӿ����ͽӿڰ�������һ��
	// ����Լ����������  �ӿ����ͽӿڰ�������һ��
	// �����ǿͻ���  ����ͨ������˵� ip ��ַ���ʷ����
	public void getTableCount()
	{
		try
		{
			
			// ���� rmi ������ַ �������ӱ���
			// ǰ��� �� cmd �� �� ping + �Է���ip
			IDataService dataservice = (IDataService) Naming.lookup("rmi://127.0.0.1:8200/dataservice");
			
			// ���ݿ����
			int count = dataservice.getCount("t_user");
			
			System.out.println("Զ�̷��ʽ��Ϊ��" + count);
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
