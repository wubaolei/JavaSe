public class Testthree
{
	static		// ��̬�����
	{
		System.out.println("��̬����飬��������ִ�еģ�ִֻ��һ��");
	}
	
	{			// ��������
		System.out.println("�������飬���ǵڶ�ִ�еģ����Ҹ������Ĵ�������ִ��");
	}
	
	Testthree()	// ���췽��
	{
		System.out.println("���캯��");
	}
	
	public void show()			// ʵ������
	{
		System.out.println("ʵ������");
	}
	public static void check()  // ��̬���� ( ��Ϊ��static )
	{
		System.out.println("��̬����");
	}
	
	public static void main(String[] args)
	{
/*
 * ִ��˳�򣺳��� ��̬����� �� �������� �����Ķ��ǰ����϶���˳��ִ��
 * 
 */
		Testthree a = new Testthree();
		a.check();
		Testthree b = new Testthree();
		a.show();
	}
}
