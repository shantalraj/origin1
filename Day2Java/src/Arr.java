
public class Arr {
	public static void main(String []args) {
		int [] numbers = {12,34, 44,54,34,55,65,78,90,23,90};
		
//		numbers[1]=Integer.parseInt(args[1]);
//		numbers[2]=Integer.parseInt(args[2]);
//		numbers[3]=Integer.parseInt(args[3]);
//		numbers[4]=Integer.parseInt(args[4]);
//		
/*		for(int i=0;i<numbers.length;i++)				// Classic for loop till v1.5
		{
			System.out.println("\t"+numbers[i]);
		}
*/		
//		for(int x:numbers)								// Enhanced for loop for v1.8
//		{
//			System.out.println("\t"+x);
//		}
		int c =0;
		while(c < numbers.length)
		{
			System.out.print("\t" + numbers[c]);
			c++;
		}
		c = 0;
		System.out.println();
		do
		{
			
			System.out.print("\t" + numbers[c]);
			c++;

		}while(c < numbers.length);
		//int sum = numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4];
		
		//System.out.println("--------------\nSUM :- "+sum);
	}
}
