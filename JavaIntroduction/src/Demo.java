
public class Demo {
	int x;
	public Demo() {
		x=10;
	}
	public void display()
	{
		System.out.println(x);
	}
}

class Test{
	public static void main(String []args)
	{
		Demo d = new Demo();
		d.display();
	}
}