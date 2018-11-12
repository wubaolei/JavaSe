// 面向对象的特征
//  1.封装 对类中的属性私有的设置 private，这样不可以直接访问类中的私有变量，提高数据访问的安全性
//	访问私有变量： 对类中的私有的属性进行方法的设置( set / get | 属性名，首字母大写)
//	通过方法来进行对数据的访问，通过方法，我们对设置者，数据进行安全控制

public class Testtwo
{
	// 姓名 实例变量 
	String name;
	
	// 年龄 实例变量
	int age;
	
	// 城市名字 静态变量
	static String cityname;
	
	// 入口函数 main
	public static void main(String[] args)
	{
		// 对实例变量的访问 先要实例化这个类的对象
		Testtwo a = new Testtwo();
		a.name = "大咖";				// 实例变量赋值
		a.age = 18;					// 实例变量赋值
		Testtwo.cityname = "南通";	// 静态变量 也叫类变量    最好赋值形式是   类名.静态变量名
									// 此变量，变更一次 全部都得变更，注意最后一次变更，则是这个变量的值
		System.out.println("名字为：" + a.name + ",年龄为：" + a.age + ",所在城市为：" + a.cityname);
	}
	
	
// 面向对象的特征
//  1.封装	对类中的属性变量的数据进行安全性保护，在其他类中无法直接赋值访问( 原类中可以直接访问 )
//	对类中的属性私有的设置 private，这样不可以直接访问类中的私有变量，提高数据访问的安全性
//	访问私有变量： 对类中的私有的属性进行方法的设置( set / get | 属性名，首字母大写)
//	通过方法来进行对数据的访问，通过方法，我们对设置者，数据进行安全控制
	
	// 私有字段
	private String sname;
	private int sage;
	
	// 在java里面通过 set 和 get 方法来进行数据访问 提高数据访问的安全性
	// 两个方法的访问的修饰符都定义问 public
	// set 设置值
	public void setSage(int sage)	// 对年龄设置
	{
		// this表示当前对象，谁调用这个方法，this就表示谁
		// 但是  this 不能写在 static 静态方法中
		this.sage = sage;
	}
	
	// get 获取值( 不同的类相互访问 )
	public int getSage()
	{
		return this.sage;		// 返回值
	}
	
	public void setSname(String sname)	// 对名字设置
	{
		this.sname = sname;
	}
	public String getSname()
	{
		return this.sname;
	}
}
