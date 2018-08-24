import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.pojo.Student;

public class DemoSerialisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student(12,300,"Beth");
		
		try {
			FileOutputStream fo = new FileOutputStream("student.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			
			oo.writeObject(stu);
			oo.close();
			fo.close();
			
			System.out.println("done serialisation");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
