package com.pojo;

public class TestEmployee1 {
	public static void main(String[] args) {
		Person p1 = new Person(12, "ABC");				//Combo1,2,3
		Person p2 = new Person(12, "ABC");				//Combo1,3
//		Person p2 = p1;									//Combo2
//		if(p1==p2)										//Combo1,2
		if(p1.equals(p2))								//Combo3
			System.out.println("equal");
		else
			System.out.println("not equal");
	}
}
