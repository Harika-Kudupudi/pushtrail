/**
	 * Replacing the consonants in the string with the next alphabet.
	 * @author Harika
	 *
	 */
import java.util.Scanner;
public class Exercise3 {

	public static String alterString(String a)
	{
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
			{
				sb.append(ch);
		}
			else
			{
				char ch1=(char)(((int)ch)+1);
				sb.append(ch1);
			}
		}
		String s2=sb.toString();
		return s2;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		String s1=s.toLowerCase();
		String result=alterString(s1);
		System.out.println("Before replacing: "+s1);
		System.out.println("After replacing: "+result);
}
}
