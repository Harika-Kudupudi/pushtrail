/**
	 * Check whether the  string is a postive or not.
	 * @author Harika
	 *
	 */
import java.util.Scanner;
public class Exercise8 {

       public static boolean checkString(String a)
       {
	    int n=a.length();
	    for(int i=0;i<n-1;i++)
	    {
	    	char ch1=a.charAt(i);
	    	char ch2=a.charAt(i+1);
	    	int number1=(int)ch1;
	    	int number2=(int)ch2;
	    	if(number1 > number2)
	    	return false;
	     }
	    	  return true;
       }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		int n1=s.length();
		boolean s1 =checkString(s);
		if(s1)
		System.out.println(s+" is a positive string");
		else
			System.out.println(s+" is a negative string");	
		
	}
}
