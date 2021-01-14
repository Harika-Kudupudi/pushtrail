/**
 * To check if a number is a power of two or not.
 * @author Harika
 *
 */
import java.util.Scanner;
public class Exercise8 {
	public static boolean checkNumber(int n)
	{
		while(n>=2) {
			
		if(n%2!=0)
	        return false;
		n=n/2;
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean s=checkNumber(n);
		if(s)
		{
			System.out.println(n+" is a power of 2");
		}
		else
		{
			System.out.println(n+" is not a power of 2");
		}
		sc.close();
	}
	}


