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
		System.out.println("��ע����ֻ���Ϊ��" + phone);
		
		// �첽����
		// һ���˰�����һ����ȥ����������飬����Ҫ����ɻ�����ʲô���ص���Ϣ����һ���˼������Լ���ͷ������
		/**��ӡ�Ľ����
		 * ��ע����ֻ���Ϊ��123456
		 * �ͻ���������ע��ĺ��뷢��123456,���ͳɹ�
		 * ���յ��ֻ���Ϊ��123456
		 * ����˴�����Ϣ���
		 * ����ֻ�����Ϊ��123456,����Ҫ�Ķ����Ѿ�ȷ����
		 * */
		new Thread(new Runnable()		// �����������ڲ���
		{
			@Override
			public void run()
			{
				// TODO Auto-generated method stub
				
				UserClientService.this.service.receiverClientMsg(UserClientService.this, phone);
			}
		}).start();
		
		// ͬ������
		/**��ӡ�Ľ��Ϊ��
		 * ��ע����ֻ���Ϊ��123456
		 * ���յ��ֻ���Ϊ��123456
		 * ����˴�����Ϣ���
		 * ����ֻ�����Ϊ��123456,����Ҫ�Ķ����Ѿ�ȷ����
		 * �ͻ���������ע��ĺ��뷢��123456,���ͳɹ�
		 * */
		//service.receiverClientMsg(UserClientService.this, phone);

		System.out.println("�ͻ���������ע��ĺ��뷢��" + phone + ",���ͳɹ�");

	}
}
