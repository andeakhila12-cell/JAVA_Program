package arr;
import java.util.Scanner;
public class c {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many number should contain the array");
		int n=sc.nextInt();
		System.out.println("enter number");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
            boolean alreadyCounted = false;
            int count = 0;

            // check if arr[i] already appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                for (int j = 0; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                System.out.println(arr[i] + " -> " + count + " times");
            }
        }
		sc.close();
	}

}
