/*
 * 1.��Testtwo�����Լ������Լ�
 * 2.������һ������ ����Testtwo���е�����
 * 
 * 
 * 
 * 
 */

public class TesttwoVisit
{
	public static void main(String[] args)
	{
		// ����������� �� ԭ�����������һ����
		Testtwo b = new Testtwo();		// ʵ����
		b.setSage(20);					// set����ֵ
		b.setSname("�̻�����");			// set����ֵ
		Testtwo.cityname = "����";		// ԭ�����õľ�ֵ̬�޷����ݣ�����������
		System.out.println("����Ϊ��" + b.getSname() +"������Ϊ��" + b.getSage() + "�����ڳ��У�" + b.cityname);  // �����ֵ�� ��Ϊ get ��ȡֵ
	}
	
}
