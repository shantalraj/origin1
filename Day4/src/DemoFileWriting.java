import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriting {
	public static void main(String[] args) {
		try {
			FileWriter fileWr = new FileWriter("abc.txt",true);
			fileWr.write("Citi,Pune");
			System.out.println("File Created and Data inserted");
			fileWr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
