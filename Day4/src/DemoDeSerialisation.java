import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.pojo.Student;

public class DemoDeSerialisation {
	public static void main(String[] args) {
		String str = "I"+"like";
		String s2 = str.concat("hey");
		System.out.println(s2);
		FileInputStream fi;
		try {
			fi = new FileInputStream("student.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			Object obj = oi.readObject();
			Student stu = (Student)obj;
			System.out.println(stu.getName()+ "\t"+ stu.getTotal());
			
			oi.close();
			fi.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
