package com.wbl.threadlesson;

public class UserClientService implements Message
{
	private UserService service;

	public UserClientService(UserService service)
	{
		this.service = service;
	}
	
	@Override
	public void nofityMessage(String msg)
	{
		// TODO Auto-generated method stub

		System.out.println(msg);
	}

	public void registerUserInfo(String phone)
	{
		System.out.println("你注册的手机号为：" + phone);
		
		// 异步调用
		// 一个人安排另一个人去做另外的事情，不需要他完成或是有什么返回的消息，第一个人继续做自己手头的事情
		/**打印的结果：
		 * 你注册的手机号为：123456
		 * 客户服务中心注册的号码发送123456,发送成功
		 * 接收的手机号为：123456
		 * 服务端处理消息完毕
		 * 你的手机号码为：123456,你需要的东西已经确定的
		 * */
		new Thread(new Runnable()		// 这里是匿名内部类
		{
			@Override
			public void run()
			{
				// TODO Auto-generated method stub
				
				UserClientService.this.service.receiverClientMsg(UserClientService.this, phone);
			}
		}).start();
		
		// 同步调用
		/**打印的结果为：
		 * 你注册的手机号为：123456
		 * 接收的手机号为：123456
		 * 服务端处理消息完毕
		 * 你的手机号码为：123456,你需要的东西已经确定的
		 * 客户服务中心注册的号码发送123456,发送成功
		 * */
		//service.receiverClientMsg(UserClientService.this, phone);

		System.out.println("客户服务中心注册的号码发送" + phone + ",发送成功");

	}
}
