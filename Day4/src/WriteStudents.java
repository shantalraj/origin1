import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.myinterfaces.StudentFileIO;
import com.pojo.Student;

public abstract class WriteStudents implements StudentFileIO {
	public int writeStudents(Student []student)
	{
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
		return 0;
	}
	public Student[] readStudents()
	{
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
		return null;
		
	}
}


