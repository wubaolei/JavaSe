package com.wbl.task;

public class Rectangle
{
	double area;	// ���
	double pre;		// �ܳ�
	int length;	// ��
	int width;	// ��
	
	Rectangle(int width,int length)
	{
		this.width = width;
		this.length = length;
	}
	
	void showAll()
	{
		System.out.println("����" + this.length);
		System.out.println("��" + this.width);
		System.out.println("�ܳ���" + this.pre );
		System.out.println("�����"+this.area);
	}
	
	public void getArea(int length,int width)
	{
		this.length = length;
		this.width = width;
		this.area = this.width*this.length;
	}
//	public double setArea()
//	{
//		return this.area;
//	}
	
	public void getPre(int length,int width)
	{
		this.length = length;
		this.width = width;
		this.pre = (this.width+this.length)*2;
	}
//	public double setPre()
//	{
//		return this.pre;
//	}
	public static void main(String[] args)
	{
		Rectangle rec = new Rectangle(10,20);
		
		rec.getArea(rec.width, rec.length);
		rec.getPre(rec.width, rec.length);
		rec.showAll();
	}
}



// ��û�� �Ҳ��� ���˵