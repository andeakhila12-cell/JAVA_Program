package arr;
import java.util.Scanner;
public class zero {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter a number");
	 int n=sc.nextInt();
	 int[] arr=new int[n];
	 System.out.println("enter elements");
	 for(int i=0;i<n;i++) {
		 arr[i]=sc.nextInt();
	 }
	 System.out.println("original array");
	 for(int i=0;i<n;i++) {
		 System.out.print(arr[i]);
	 }
	 System.out.println("");
	 int count=0;
	 for(int i=0;i<n;i++) {
		 if(arr[i]==0) {
			 count++;
			 for(int j=i;j<n-1;j++) {
				 arr[j]=arr[j+1];
			 }
			 i--;
		 }
	 }
	 System.out.println("after removing the zeroes");
	 for(int i=0;i<n-count;i++) {
		 System.out.print(arr[i]+" ");
	 }
	 sc.close();
 }
}
