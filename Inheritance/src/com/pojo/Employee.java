package com.pojo;

public class Employee extends Person {
	private double empSal;
	private int empID;
	
	public Employee()
	{
		super();
		empID = 0;
		empSal = 1000;
	}
	
	public Employee(int empId, double empSal, int age, String name)
	{
		super(age,name);
		this.empID = empId;
		this.empSal = empSal;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}
//	public void display()
	public void display(int x)
	{
		super.display(x);
		System.out.println("empID:- "+empID+"\tSalary:- "+empSal);
//		System.out.println("Name:-\t"+ getName() +"\tAge:-"+ getAge() + "\tEmployee ID:-" + empID+"\t"+empSal);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ " " +empID + " " + empSal;
	}
}
