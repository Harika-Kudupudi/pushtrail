import java.util.Scanner;

/**
 * Display sum of the n numbers divisible by 3 0r 5.
 * @author Harika
 *
 */
public class Exercise5 {
	
	public static int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n");
	int a=sc.nextInt();
	int c=calculateSum(a);
	System.out.println("The sum is "+c);
}
}

