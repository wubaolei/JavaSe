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
	public int hashCode() // ��д object���е� hashCode
	{
		// TODO Auto-generated method stub
		/**
		 * ������ֵ���� �ж� hashCode()
		 */
		return (this.name + this.age).hashCode();
	}

	@Override
	public boolean equals(Object obj) // ��д object���е� equals
	{
		// TODO Auto-generated method stub
		if (this == obj)
		{
			return true;
		}
		else if (obj instanceof TestHashSet)
		{
			// �ж� obj �Ƿ��� TestHashSet ��ʵ��
			TestHashSet t = (TestHashSet) obj;

			// �����ж� �����Ƿ�һ��
			return this.name == t.name;

			// �����ж� �����Ƿ�һ��
			// return this.age == t.age;
		}
		else
		{
			return false;
		}
	}

	@Override
	public int compareTo(Object arg0) // ��д Comparable�ӿ��еķ���
	{
		// TODO Auto-generated method stub

		// ����ת��
		TestHashSet t = (TestHashSet) arg0;

		// ���������Ҫ�Լ�д
		// ������������ѡ��������Ҫ�Ŀ������������
		return this.age - t.age;
	}
}
