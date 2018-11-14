package com.wbl.task;

public class Rectangle
{
	double area;	// 面积
	double pre;		// 周长
	int length;	// 长
	int width;	// 宽
	
	Rectangle(int width,int length)
	{
		this.width = width;
		this.length = length;
	}
	
	void showAll()
	{
		System.out.println("长：" + this.length);
		System.out.println("宽：" + this.width);
		System.out.println("周长：" + this.pre );
		System.out.println("面积："+this.area);
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



// 我没有 我不是 别胡说