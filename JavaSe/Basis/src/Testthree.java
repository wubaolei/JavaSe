public class Testthree
{

	String a;

	static int b;

	static		// ��̬�����
	{
		b = 10;						// ֱ�ӷ��ʾ�̬����

		//a = "10";					// ʵ������ ���ʱ���
		Testthree t = new Testthree();
		t.a = "10";					// ʵ�������� ���ܷ���ʵ������

		System.out.println("��̬����飬��������ִ�еģ�ִֻ��һ��");

/*
 * �����ִ��˳��
 * 1.ִ�о�̬����
 * 2.��̬����������ʵ��������
 * 3.ʵ����������ִ�й�������
 * */
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
		b = 20;		// ֱ�ӷ��ʾ�̬����

		//a = "10";   // ʵ������ ���ʱ���
		Testthree t = new Testthree();
		t.a = "10";	  // ʵ�������� ���ܷ���ʵ������

		System.out.println("��̬����");
	}

	public static void main(String[] args)
	{
/*
 * ����������ڣ�
 * 		1.main����ں���������˳��ִ��
 * 		2.��̬���������ִ�У�����ִֻ��һ�Σ�����Ҫ����
 * 		3.���մ����˳��ִ�У���������ʱ���������������飬����ִ����������飬��ִ�й��췽��
 * 		4.���ʻ��ƣ���̬����� �� ��̬��������ֱ�ӷ��ʾ�̬����������ֱ�ӷ���ʵ�������������ʵ�������󣬲��ܷ���
 * 		5.
 */
		Testthree a = new Testthree();
		a.check();
		Testthree b = new Testthree();
		a.show();
	}
}