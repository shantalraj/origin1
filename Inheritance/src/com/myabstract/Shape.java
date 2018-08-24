package com.myabstract;

abstract public class Shape {
	private String name;
	public Shape() {
		
	}
	public Shape(String name) {
		super();
		this.name = name;
	}
	public void description()
	{
		System.out.println("Name:- " + name);
	}
	abstract public double area();
}

