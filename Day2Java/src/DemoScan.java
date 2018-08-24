import java.util.Scanner;

public class DemoScan {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = s.nextInt();
		
		System.out.println("please enter second number");
		int num1 = s.nextInt();
		
		System.out.println("Add:- "+ (num+num1));
	}
}
