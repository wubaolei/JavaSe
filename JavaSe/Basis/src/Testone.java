public class Testone
{
	// ʵ������ ˽��
	String name;	// ѧ������	
	byte age;		// ѧ������
	double salary;	// ����
	// ��̬���� ȫ��
	static String schoolName;	// ѧУ����
	static int stuCount;		// ѧ������
	
	void addSalary()			// ��������
	{
		double addsa = 1000;	// �����ڶ��� �ֲ����� ʹ��ʱһ��Ҫ��ֵ
		
		salary = salary + addsa;
		
		System.out.println("���Ա����" + name + ",��н��" + addsa + ",ʵ�ù��ʣ�" + salary);
	}
	
	static void lazy()			// ������̬����
	{
		
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("I can saying no!");
		
		// ��̬��������ֱ��ʹ�þ�̬����
		schoolName = "�Ͽ�Ժ";			// �洢�� ��̬ȫ�ִ洢��
		
		// Ҫ�����ʵ�����������ȴ���������ʵ������
		Testone one = new Testone();	// ʵ������
		one.name = "Javascript";
		one.age = 18;
		one.salary = 5000;
		
		one.addSalary();				// ���÷���
		
		
		Testone two = new Testone();	// ʵ������
		two.name = "HTML 5";
		two.age = 19;
		
		System.out.println(one.schoolName + " ����ѧУ " + two.schoolName);
		
		one.schoolName = "�ϴ�";				// schoolName �Ǿ�̬ȫ������ ����һ�� ʵ�������󶼻�ı�
		System.out.println(two.schoolName);
	}
}
