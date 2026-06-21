package arr;
import java.util.Scanner;

public class secondl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter how many numbers:");
		int n = sc.nextInt();

		System.out.println("enter numbers:");
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		// Step 1: find largest
		int max = a[0];
		for (int i = 1; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		// Step 2: find second largest
		int second = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (a[i] > second && a[i] < max) {
				second = a[i];
			}
		}

		if (second == Integer.MIN_VALUE) {
			System.out.println("No second largest number");
		} else {
			System.out.println("second large number in the array: " + second);
		}

		sc.close();
	}
}
