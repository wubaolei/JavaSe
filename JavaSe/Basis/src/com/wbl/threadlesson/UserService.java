package com.wbl.threadlesson;

public class UserService
{
	public void receiverClientMsg(Message msg,String phone)
	{
		System.out.println("���յ��ֻ���Ϊ��" + phone);
		
		System.out.println("����˴�����Ϣ���");
		
		String resultMsg = "����ֻ�����Ϊ��" + phone + ",����Ҫ�Ķ����Ѿ�ȷ����";
		
		// �ӿڻص�
		msg.nofityMessage(resultMsg);
	}
}
