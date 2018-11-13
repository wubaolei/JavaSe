public class Testthree
{
	static		// 静态代码块
	{
		System.out.println("静态代码块，我是最先执行的，只执行一次");
	}
	
	{			// 构造代码块
		System.out.println("构造代码块，我是第二执行的，而且跟随对象的创建反复执行");
	}
	
	Testthree()	// 构造方法
	{
		System.out.println("构造函数");
	}
	
	public void show()			// 实例方法
	{
		System.out.println("实例方法");
	}
	public static void check()  // 静态方法 ( 因为有static )
	{
		System.out.println("静态方法");
	}
	
	public static void main(String[] args)
	{
/*
 * 执行顺序：除开 静态代码块 和 构造代码块 其他的都是按自上而下顺序执行
 * 
 */
		Testthree a = new Testthree();
		a.check();
		Testthree b = new Testthree();
		a.show();
	}
}
