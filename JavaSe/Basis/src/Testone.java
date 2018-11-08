public class Testone
{
	// 实例变量 私有
	String name;	// 学生姓名	
	byte age;		// 学生年龄
	double salary;	// 工资
	// 静态变量 全局
	static String schoolName;	// 学校名字
	static int stuCount;		// 学生数量
	
	void addSalary()			// 声明方法
	{
		double addsa = 1000;	// 方法内定义 局部变量 使用时一定要赋值
		
		salary = salary + addsa;
		
		System.out.println("这个员工：" + name + ",加薪：" + addsa + ",实得工资：" + salary);
	}
	
	static void lazy()			// 声明静态方法
	{
		
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("I can saying no!");
		
		// 静态方法可以直接使用静态变量
		schoolName = "南科院";			// 存储在 静态全局存储区
		
		// 要访类的实例变量，首先创建这个类的实例对象
		Testone one = new Testone();	// 实例对象
		one.name = "Javascript";
		one.age = 18;
		one.salary = 5000;
		
		one.addSalary();				// 调用方法
		
		
		Testone two = new Testone();	// 实例对象
		two.name = "HTML 5";
		two.age = 19;
		
		System.out.println(one.schoolName + " 两个学校 " + two.schoolName);
		
		one.schoolName = "南大";				// schoolName 是静态全部变量 更改一处 实例化对象都会改变
		System.out.println(two.schoolName);
	}
}
