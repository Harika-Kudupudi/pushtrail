import java.util.Scanner;
/**
 * Display String in reverse order word by word
 * @author Harika
 *
 */
public class Exercise2 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your choice:\n1. Red\n2. Yellow\n3. Green");
	int n=sc.nextInt();
	switch(n)
	{
	case 1:
		System.out.println("Stop");
		break;
	case 2:
		System.out.println("Ready");
		break;
	case 3:
		System.out.println("Go");
		break;
	}
}
}
