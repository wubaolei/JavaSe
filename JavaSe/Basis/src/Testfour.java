public class Testfour
{
	private int a = 2;	// ȫ�ֱ��� ʵ������
	
	void show(int a)
	{
		a = 6;			// �ֲ�����
		this.a = a;
/*
 * ���ݴ��ݵ�aֵ�����ǽ��뷽���� a = 6��
 * thisָ��p����this.a�൱��p.a����ʱpָ��Ķ��ڴ��a��ֵ�����ı�
 * this ˭���÷��� ��ָ��˭
 */
	}

	void show(Testfour p)  // Testfour p = p = new Testfour();
	{
		System.out.println("����--1--" + p.a);
		
		Testfour t = new Testfour();
		System.out.println("����--2--" + t.a);
		
		t.a= 10;
		System.out.println("����--3--" + t.a + p.a);
	}
	
	void show(Testfour p,Testfour t)	// ���¿�������ջ�ڴ�ֱ�ָ��ԭ�ȵ�p��t�Ķ��ڴ�
	{
		p = t;
		p.a = 100;
/* ע��һ�µ�p t�������¿��ٵ�
 * ���ݴ��ݵ�p��tֵ�����¿���ջ�ڴ�ֱ�ָ��ԭ�ȵ�p��t�Ķ��ڴ�
 * p = t	pָ��Ķ��ڴ淢���ı䣬pָ��t�Ķ��ڴ�
 * p.a		�ı�t�Ķ��ڴ棬ԭ�ȵ�p�Ķ��ڴ�aֵ����
 */
	}
	
	public static void main(String[] args)
	{
		int a = 5;
		
		Testfour p = new Testfour();
		System.out.println("1---" + p.a + "," + a);
/*
 * p.a ʵ������������ȫ�����������ٶ��ڴ�
 * a 	�ֲ�����û���κθı�
 */		
		
		p.show(a);
		System.out.println("2---" + p.a + "," + a);
/*
 * p.show(a)	���÷��� ��ֵa ����a���������͵�����Ӧ�ķ���
 * a 	�ֲ�����û���κθı�
 * ���ݵ��õķ���	p�Ķ��ڴ淢���仯 ���� p.aֵ�ı�
 */
		
		Testfour t = new Testfour();
		a = 9;
		p.show(p,t);
		System.out.println("3---" + p.a + "," + t.a + "," + a );
/*
 * p.show(p,t);		���÷��� ��ֵp,t ����p,t���������͵�����Ӧ�ķ���
 * a	�ֲ����������ı�
 * ���ݵ��õķ�����p.aֵ���䣬t.aֵ�ı䣬a�ı�
 * 
 */
		
	}
}







