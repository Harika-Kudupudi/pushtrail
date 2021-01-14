import java.util.Scanner;
/**
 * Display String in reverse order word by word
 * @author Harika
 *
 */
public class Exercise3 {
	static int a=1;
	static int b=1;
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Without using Recursion
		/**System.out.println("Enter the nth term: ");
		int n=sc.nextInt();
		int a=1;
		int b=1;
		int sum=0;
		System.out.print(a+" "+b);
		for(int i=0;i<n-2;i++)
		{
			sum=a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
		}*/
		//using Recursion
		System.out.println("Enter the nth term: ");
		int n=sc.nextInt();
		System.out.print(a+" "+b);
		printseries(n-2);
			
}
	private static void printseries(int n)
	{
		
		if(n>0)
		{
		int c=a+b;
		a=b;
		b=c;
		System.out.print(" "+c);
		printseries(n-1);
		
		}
		
	}
}