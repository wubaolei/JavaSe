/*
 * 1.在Testtwo类中自己访问自己
 * 2.在另外一个类中 访问Testtwo类中的属性
 * 
 * */

public class TesttwoVisit
{
	public static void main(String[] args)
	{
		// 跨类访问属性 与 原类访问属性是一样的
		Testtwo b = new Testtwo();		// 实例化
		b.setSage(20);					// set设置值
		b.setSname("烟花易冷");			// set设置值
		System.out.println("名字为：" + b.getSname() +"，年龄为：" + b.getSage());  // 在输出值中 则为 get 获取值
	}
	
}
