package com.wbl.threadlesson;

public class Test
{
	public static void main(String[] args)
	{
		UserService u = new UserService();
		
		UserClientService uc = new UserClientService(u);
		
		// 调用注册的方法
		uc.registerUserInfo("123456");
	}
}
