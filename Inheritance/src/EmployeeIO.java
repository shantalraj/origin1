import com.pojo.Employee;

public interface EmployeeIO {
	double PI = 3.14;
	String NAME = "CITY";							//by default public static final
	
	public Employee readEmployee();
	public void writeEmployee(Employee employee);				//by default abstract
}
