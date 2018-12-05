package com.wbl.threadlesson;

public class UserService
{
	public void receiverClientMsg(Message msg,String phone)
	{
		System.out.println("接收的手机号为：" + phone);
		
		System.out.println("服务端处理消息完毕");
		
		String resultMsg = "你的手机号码为：" + phone + ",你需要的东西已经确定的";
		
		// 接口回调
		msg.nofityMessage(resultMsg);
	}
}
