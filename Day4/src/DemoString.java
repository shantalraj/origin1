
public class DemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Citi";
		System.out.println("initial value for name:- "+name);
//		name.concat(",Pune");									//String object is immutable, Combo1
		name = name.concat(",Pune");
//		name = name.replace('i','e');
//		name = name.substring(3);
		int len = name.length();
		System.out.println(len);
//		name = name.toLowerCase();
		char c = name.charAt(5);
		System.out.println(c);
		
		System.out.println(name.indexOf("un"));
		StringBuffer sbuf = new StringBuffer("CITICORP");
		StringBuilder sbui = new StringBuilder("CITICORP");
//		sbui.append(" , PUNE");
		sbuf.append(", Pune");
		System.out.println(sbui);
		
		System.out.println(sbuf.reverse());
		
		
		System.out.println("after concatenation:- "+name); 				
	}

}
