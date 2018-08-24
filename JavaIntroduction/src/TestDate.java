
public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		Date d2 = new Date(11,"October",2017);
		
		d.display();
		d2.display();
		d.setDay(20);
		d.setMonth("July");
		//d.modify(20, "July", 2018);
		d.display();
	}

}
