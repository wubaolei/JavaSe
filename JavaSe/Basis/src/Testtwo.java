// ������������
//  1.��װ �����е�����˽�е����� private������������ֱ�ӷ������е�˽�б�����������ݷ��ʵİ�ȫ��
//	����˽�б����� �����е�˽�е����Խ��з���������( set / get | ������������ĸ��д)
//	ͨ�����������ж����ݵķ��ʣ�ͨ�����������Ƕ������ߣ����ݽ��а�ȫ����

public class Testtwo
{
	// ���� ʵ������ 
	String name;
	
	// ���� ʵ������
	int age;
	
	// �������� ��̬����
	static String cityname;
	
	// ��ں��� main
	public static void main(String[] args)
	{
		// ��ʵ�������ķ��� ��Ҫʵ���������Ķ���
		Testtwo a = new Testtwo();
		a.name = "��";				// ʵ��������ֵ
		a.age = 18;					// ʵ��������ֵ
		Testtwo.cityname = "��ͨ";	// ��̬���� Ҳ�������    ��ø�ֵ��ʽ��   ����.��̬������
									// �˱��������һ�� ȫ�����ñ����ע�����һ�α�����������������ֵ
		System.out.println("����Ϊ��" + a.name + ",����Ϊ��" + a.age + ",���ڳ���Ϊ��" + a.cityname);
	}
	
	
// ������������
//  1.��װ �����е�����˽�е����� private������������ֱ�ӷ������е�˽�б�����������ݷ��ʵİ�ȫ��
//	����˽�б����� �����е�˽�е����Խ��з���������( set / get | ������������ĸ��д)
//	ͨ�����������ж����ݵķ��ʣ�ͨ�����������Ƕ������ߣ����ݽ��а�ȫ����
	
	// ˽���ֶ�
	private String sname;
	private int sage;
	
	// ��java����ͨ�� set �� get �������������ݷ��� ������ݷ��ʵİ�ȫ��
	// ���������ķ��ʵ����η��������� public
	// set ����ֵ
	public void setSage(int sage)	// ����������
	{
		// this��ʾ��ǰ����˭�������������this�ͱ�ʾ˭
		this.sage = sage;
	}
	
	// get ��ȡֵ( ��ͬ�����໥���� )
	public int getSage()
	{
		return this.sage;		// ����ֵ
	}
	
	public void setSname(String sname)	// ����������
	{
		this.sname = sname;
	}
	public String getSname()
	{
		return this.sname;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}