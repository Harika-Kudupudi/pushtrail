import java.util.Scanner;

/**
 * Display the prime numbers below n
 * @author Harika
 *
 */
public class Exercise4 {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the last term: ");
	int n=sc.nextInt();
	printprime(n);
	
}
	public static void printprime(int n)
	{
		
		for(int i=2;i<=n;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
				
			}
			if(count<=2)
			{
				System.out.print(i+" ");
			}
		}
			
		}
	}

