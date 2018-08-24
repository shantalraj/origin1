
public class Employee {
	private int empId;
	private double salary;
	private String empName;
	private String companyName;
	
	public Employee()
	{
		empId = 10;
		empName = "Shantal";
		salary = 100000;
		companyName = "CitiCorp";
	}
	public Employee(int empId, String empName, double salary)
	{
		this();			//Invokes the default constructor first of all
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		//this.companyName = "Citicorp";
	}
	public void display()
	{
		System.out.println(empId+ "\t" + empName + "\t\t" + salary + "\t" + companyName);
	}
}
