package com.wbl.threadlesson;

public class Test
{
	public static void main(String[] args)
	{
		UserService u = new UserService();
		
		UserClientService uc = new UserClientService(u);
		
		// ����ע��ķ���
		uc.registerUserInfo("123456");
	}
}
