
public class DemoWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer obj=new Integer(10);
		int value = obj.intValue();
//		Unboxing
		int data = obj;
		obj=200;
		
		System.out.println(value);
		System.out.println(obj);
		System.out.println(data);
	}

}
