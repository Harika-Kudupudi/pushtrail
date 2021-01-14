/**
	 * Displaying eah Integer using Tokenizer class and adding them.
	 * @author Harika
	 *
	 */
import java.util.StringTokenizer;
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the string:");
	String s=sc.nextLine();
	StringTokenizer st=new StringTokenizer(s," ");
	while(st.hasMoreTokens()){
		System.out.println(st.nextToken());
		
	}
	String[] a=s.split(" ");
	int n=a.length;
	int[] b=new int[n];
	for(int i=0;i<n;i++)
	{
		b[i]=Integer.parseInt(a[i]);
	}
		int sum=0;
		for(int j=0;j<n;j++)
		{
			sum=sum+b[j];
		}
	
	 System.out.println("Total sum is : " +sum);
	
	
	}
	}
