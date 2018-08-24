class Employeed {
	int age;
	String name;
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
	public void showEmployeeDetails()
	{
		System.out.println(name+"\t"+age);
	}
}

public class Employee {
	public static void main(String[] args) {
		Employeed e = new Employeed();
		e.setAge(34);
		e.setName("Mike");
		e.showEmployeeDetails();
	}
}

