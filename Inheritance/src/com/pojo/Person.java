package com.pojo;

public class Person {
	private int age;
	private String name;
	
	// access_sp return_type fun_name(){  }
	public void display(int i)
	{
		System.out.println("Name:- "+name+"\t"+"Age:- "+age);	
	}
	public Person()
	{
		age = 18;
		name = "Chad";
	}
	public void setValues()
	{
		age = 20;
		name = "Shantal";
	}
	public Person(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person p = (Person)obj;								// downcasting
		return (p.name.equals(name) && p.age == this.age);
	}
}
