
public class DemoStringEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "CITI";
		System.out.println("initial value for name:-"+name);
		
		String name1 = new String("CITI");
//		if(name1.equals(name))
		if(name1==name)
			System.out.println("EQUALS");
		else
			System.out.println("NOT EQUALS");
	}

}
