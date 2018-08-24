import java.util.ArrayList;
public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(12);
		list.add(34);
		list.add(12);
		list.add(new Integer(234));
		list.add(2, 56); 						//#greatThingy
		System.out.println(list);
		System.out.println(list.size());
		
		list.remove(4);
		System.out.println(list);
		System.out.println(list.size());
		
		list.remove(new Integer(56));
		System.out.println(list);
		System.out.println(list.size());
	}

}
