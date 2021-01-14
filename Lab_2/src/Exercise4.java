/**
 * Remove the duplicate elements in java.
 * @author Harika
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
	
		private static int[] modifyArray(int a[]) {
			int n = a.length;
			int[] temp = new int[n];
			int j = 0;
			Arrays.sort(a);
			for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
			temp[j++] = a[i];
			}
			}
			temp[j++] = a[n - 1];
			int sorta[] = new int[j];
			for (int k = 0; k < j; k++) {
			sorta[k] = temp[k];
			}

			return sorta;
			}

			public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no of elements");
			int n = sc.nextInt();
			System.out.println("Enter the elements");
			int p[] = new int[n];
			for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
			}
			System.out.println("sorted array is : ");
			int[] result = modifyArray(p);
			for(int i = result.length-1;i >=0;i--) {
			System.out.println(result[i]);
			}

			}

			}

