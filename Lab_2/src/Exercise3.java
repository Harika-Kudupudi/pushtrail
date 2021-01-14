/**
 * Display after reversing the numbers in the array.
 * @author Harika
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
	private static int[] getSorted(int a[]) {
		int len = a.length;
		int array1[] = new int[len];
		String str[] = new String[len];
		for(int i =0;i<len;i++) {
		str[i] = Integer.toString(a[i]);

		StringBuffer s = new StringBuffer(str[i]);
		array1[i] = Integer.parseInt(s.reverse().toString());
		}
		Arrays.sort(array1);
		return array1;
		}
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int p[] = new int[n];
		for(int i = 0;i<n;i++) {
		p[i] = sc.nextInt();
		}
		int result[] = getSorted(p);
		for(int i =0;i<result.length;i++) {
		System.out.println(result[i]+" ");
		}

		sc.close();

		}

		}


