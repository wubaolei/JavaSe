public class Testone
{
	// ʵ������ ˽��
	String name;	// ѧ������	
	byte age;		// ѧ������
	
	// ��̬���� ȫ��
	static String schoolName;	// ѧУ����
	static int stuCount;		// ѧ������
	
	public static void main(String[] args)
	{
		System.out.println("I can saying no!");
		
		// ��̬��������ֱ��ʹ�þ�̬����
		schoolName = "�Ͽ�Ժ";			// �洢�� ��̬ȫ�ִ洢��
		
		// Ҫ�����ʵ�����������ȴ���������ʵ������
		Testone one = new Testone();	// ʵ������
		one.name = "Javascript";
		one.age = 18;
		
		Testone two = new Testone();	// ʵ������
		two.name = "HTML 5";
		two.age = 19;
		
		System.out.println(one.schoolName + " ����ѧУ " + two.schoolName);
		
		one.schoolName = "�ϴ�";				// schoolName �Ǿ�̬ȫ������
		System.out.println(two.schoolName);
		
		
	}
}
