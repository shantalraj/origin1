import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoReadData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		InputStreamReader rd = new InputStreamReader(System.in);
		try {
			System.out.println("enter the value");
			int value = rd.read();
			System.out.println("you entered:-"+(char)value);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Please enter your name");
			String name = br.readLine();
			System.out.println("You entered:-"+name);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
