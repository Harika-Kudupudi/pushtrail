import java.util.Scanner;

/**
 * Diffrence between sum of squares of first n natural numbers and the square of first n natural numbers 
 * @author Harika
 *
 */
public class Exercise6 {

	public static int calculateDifference(int n)
	{
		int sum=0;
		int sum_of_squares=(n*(n+1)*((2*n)+1))/6;
		int b=(n*(n+1))/2; 
		int square_of_the_sum=b*b;
		sum=sum_of_squares - square_of_the_sum;
		return sum;
		
	}


public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n :");
int a=sc.nextInt();
int c=calculateDifference(a);
System.out.println("The difference is : "+c);
}

}