/**
	 * Modifying the number by performing the difference between the every consecutive  digits.
	 * @author Harika
	 *
	 */
import java.util.Scanner;
import java.lang.*;
public class Exercise4 {
	
	public static String modifyNumber(int number1)
	{
		String s1= String.valueOf(number1);
		StringBuilder sb=new StringBuilder();
		int n=s1.length();
		for(int i=0;i<s1.length()-1;i++)
		{
			char ch1=s1.charAt(i);
			char ch2=s1.charAt(i+1);
			int r1=Integer.parseInt(String.valueOf(ch1));
			int r2=Integer.parseInt(String.valueOf(ch2));
			int difference=r1-r2;
			int b=Math.abs(difference);
			sb.append(b);
		}
		char ch3=s1.charAt(n-1);
		int r3=Integer.parseInt(String.valueOf(ch3));
		sb.append(r3);
		String r4=sb.toString();
		return r4;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int s=sc.nextInt();
		String result=modifyNumber(s);
		System.out.println(result);	
	}
}
