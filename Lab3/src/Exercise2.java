/**
	 * Creating the mirror Image of a String.
	 * @author Harika
	 *
	 */
import java.util.Scanner;
public class Exercise2 {
     
	public static String getImage(String a)
	{
		StringBuffer sb=new StringBuffer(a);
		sb.reverse();
		a=sb.toString();
		return a;
	}
	
	
	
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String:");
	String s=sc.nextLine();
	String result=getImage(s);
	System.out.println(s+"|"+result);	
}
}
