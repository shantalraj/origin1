
public class Person {
	private int age;
	private String name;
	
	// access_sp return_type fun_name(){  }
	public void display()
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
	public void setValues(int age, String name)
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
}
