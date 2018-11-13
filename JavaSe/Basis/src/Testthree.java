public class Testthree
{

	String a;

	static int b;

	static		// 静态代码块
	{
		b = 10;						// 直接访问静态变量

		//a = "10";					// 实例变量 访问报错
		Testthree t = new Testthree();
		t.a = "10";					// 实例化对象 才能访问实例变量

		System.out.println("静态代码块，我是最先执行的，只执行一次");

/*
 * 这里的执行顺序
 * 1.执行静态变量
 * 2.静态变量里面有实例化对象
 * 3.实例化对象先执行构造代码块
 * */
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
		b = 20;		// 直接访问静态变量

		//a = "10";   // 实例变量 访问报错
		Testthree t = new Testthree();
		t.a = "10";	  // 实例化对象 才能访问实例变量

		System.out.println("静态方法");
	}

	public static void main(String[] args)
	{
/*
 * 类的生命周期：
 * 		1.main是入口函数，按照顺序执行
 * 		2.静态代码块最先执行，并且只执行一次，不需要调用
 * 		3.按照代码的顺序执行，创建对象时，如果有匿名代码块，最先执行匿名代码块，再执行构造方法
 * 		4.访问机制，静态代码块 和 静态方法可以直接访问静态变量，不能直接访问实例变量，否则得实例化对象，才能访问
 * 		5.
 */
		Testthree a = new Testthree();
		a.check();
		Testthree b = new Testthree();
		a.show();
	}
}