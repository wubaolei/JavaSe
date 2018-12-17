package com.wbl.storagedata;

public class TestHashSet implements Comparable
{
	private int age;

	private String name;

	TestHashSet(int age, String name)
	{
		this.age = age;

		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public int hashCode() // 重写 object类中的 hashCode
	{
		// TODO Auto-generated method stub
		/**
		 * 将两个值连接 判断 hashCode()
		 */
		return (this.name + this.age).hashCode();
	}

	@Override
	public boolean equals(Object obj) // 重写 object类中的 equals
	{
		// TODO Auto-generated method stub
		if (this == obj)
		{
			return true;
		}
		else if (obj instanceof TestHashSet)
		{
			// 判断 obj 是否是 TestHashSet 的实例
			TestHashSet t = (TestHashSet) obj;

			// 这里判断 名字是否一致
			return this.name == t.name;

			// 这里判断 年龄是否一致
			// return this.age == t.age;
		}
		else
		{
			return false;
		}
	}

	@Override
	public int compareTo(Object arg0) // 重写 Comparable接口中的方法
	{
		// TODO Auto-generated method stub

		// 类型转换
		TestHashSet t = (TestHashSet) arg0;

		// 排序规则需要自己写
		// 这里的排序规则选用需求需要的可以排序的属性
		return this.age - t.age;
	}
}
