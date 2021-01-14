import java.util.Scanner;

/**
 * To check whether the number is an increasing number or not.
 * @author Harika
 *
 */
public class Exercise7 {
	public static boolean checkNumber(int c)
	{
		int a=String.valueOf(c).length();
		int count=0;
		int d=9;
		while(c>0)
		{
			
			int b=c%10;
			if(b<=d)
			{
				count++;
			}
			d=b;
			c=c/10;
		 
		}
		if(count==a)
		    return true;
		else
			return false;
		
	}
	
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	boolean s=checkNumber(n);
	if(s)
	{
		System.out.println(n+" is an increasing number");
	}
	else
	{
		System.out.println(n+" is not an increasing number");
	}
	sc.close();
}
}
