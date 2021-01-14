/**
	 * Displaying the number of characters and words in a string.
	 * @author Harika
	 *
	 */
import java.util.Scanner;
public class Exercise5 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		int n1=s.length();
		String[] a=s.split(" ");
		int n2=a.length;
		
		System.out.println("The number of characters are: "+n1);
		System.out.println("The number of words are: "+n2);	
		
	}
}
