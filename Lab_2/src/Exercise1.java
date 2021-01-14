/**
 * Display second smallest element in tha array.
 * @author Harika
 *
 */
import java.util.Arrays;
import java.util.Scanner;
public class Exercise1 {
public static int getSecondSmallest(int[] a)
{
	Arrays.sort(a);
	int second_smallest=a[1];
	return second_smallest;
	
}

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n");
	int p=sc.nextInt();
	int q[]=new int[p];
	System.out.println("Enter the elements: ");
	for(int i=0;i<p;i++)
	{
		q[i]=sc.nextInt();
	}
	Exercise1 e=new Exercise1();
	int result=e.getSecondSmallest(q);
	System.out.println("The second smallest element in the array is "+result);
}
}

