package com.pojo;

import java.util.Arrays;
//import java.util.ArrayList;

public class Student {

	String name;
	int[] marks = new int[2];
	private int rollno;
	public Student()
	{
		name = "NoOne";
		Arrays.fill(marks, 0);
		rollno = 101;
	}
	public Student(String name, int [] marks, int rollno)
	{
		this.name = name;
		this.marks = marks;
		this.rollno = rollno;
	}
	
	public void display() {
		System.out.println("Roll no:- "+ rollno+"\tName:- "+name);
		for(int num:marks)
		{
			System.out.print(num + "\t");
		}
		System.out.println();
	}
}
