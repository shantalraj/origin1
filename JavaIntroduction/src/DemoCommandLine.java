
public class DemoCommandLine {
	public static void main(String[] args) {
		System.out.println("no. of Arguments:- "+ args.length);
		int sum=0;
		for(String x:args)
		{
			sum = sum+Integer.parseInt(x);
//			System.out.println("argument:- "+x);
		}
		System.out.println(sum);
	}
}

