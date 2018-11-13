public class Testfour
{
	private int a = 2;	// 全局变量 实例变量
	
	void show(int a)
	{
		a = 6;			// 局部变量
		this.a = a;
/*
 * 根据传递的a值，但是进入方法后 a = 6；
 * this指向p对象，this.a相当于p.a，此时p指向的堆内存的a的值发生改变
 * this 谁调用方法 就指向谁
 */
	}

	void show(Testfour p)  // Testfour p = p = new Testfour();
	{
		System.out.println("方法--1--" + p.a);
		
		Testfour t = new Testfour();
		System.out.println("方法--2--" + t.a);
		
		t.a= 10;
		System.out.println("方法--3--" + t.a + p.a);
	}
	
	void show(Testfour p,Testfour t)	// 重新开辟两个栈内存分别指向原先的p，t的堆内存
	{
		p = t;
		p.a = 100;
/* 注意一下的p t都是重新开辟的
 * 根据传递的p，t值，重新开辟栈内存分别指向原先的p，t的堆内存
 * p = t	p指向的堆内存发生改变，p指向t的堆内存
 * p.a		改变t的堆内存，原先的p的堆内存a值不变
 */
	}
	
	public static void main(String[] args)
	{
		int a = 5;
		
		Testfour p = new Testfour();
		System.out.println("1---" + p.a + "," + a);
/*
 * p.a 实例化方法访问全部变量，开辟堆内存
 * a 	局部变量没有任何改变
 */		
		
		p.show(a);
		System.out.println("2---" + p.a + "," + a);
/*
 * p.show(a)	调用方法 传值a 根据a的数据类型调用相应的方法
 * a 	局部变量没有任何改变
 * 根据调用的方法	p的堆内存发生变化 所以 p.a值改变
 */
		
		Testfour t = new Testfour();
		a = 9;
		p.show(p,t);
		System.out.println("3---" + p.a + "," + t.a + "," + a );
/*
 * p.show(p,t);		调用方法 传值p,t 根据p,t的数据类型调用相应的方法
 * a	局部变量发生改变
 * 根据调用的方法，p.a值不变，t.a值改变，a改变
 * 
 */
		
	}
}







