
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Class_name ref_name
		Person p;	// variable not data member
		
		// ref_name = new Class_name
		p = new Person();	//allocates the memory
		//ref_name.name_of_fun();
		//p.setValues(23,"John");
		p.display();	
		
		// gives null and 0 as of now
		p = new Person();
		p.setValues(21,"Cathy");	//function overloading
		p.display();
		p.setAge(1000);
		//p.setValues();				//function overloading
		p.display();
		
		// 2 objects 1 reference... called reinitialisation of object...
	}

}
