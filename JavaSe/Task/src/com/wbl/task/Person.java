package com.wbl.task;

public class Person
{
	String name;
	double height;
	double weight;
	
	void sayHello(String name,double height,double weight)
	{
		this.name = name;
		this.height = height;
		this.weight = weight;
		
		System.out.println("hello,my name is " + this.name);
	}
}
