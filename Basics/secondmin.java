import java.util.Scanner;
public class secondmin {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter how many numbers:");
	 int n=sc.nextInt();
	 System.out.println("enter numbers");
	 int[] arr=new int[n];
	 for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	 }
	 int min=arr[0];
	 for(int i=1;i<n;i++) {
		 if(arr[i]<min){
			 min=arr[i];
		 }
	 }
	 int second=Integer.MAX_VALUE;
	 for(int i=0;i<n;i++) {
		 if (arr[i] <second && arr[i] >min) {
				second = arr[i];
			}
		}

		if (second == Integer.MAX_VALUE) {
			System.out.println("No second smallest number");
		} else {
			System.out.println("second smallest num array: " + second);
		}

		sc.close();
	 sc.close();
 }
}
