package arr;
import java.util.Scanner;
public class a {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter a number");
	 int n=sc.nextInt();
	 System.out.println("enter elements");
	 int[] arr=new int[n];
	 for(int i=0;i<n;i++) {
		 arr[i]=sc.nextInt();
	 }
	 System.out.println("enter pair of the sum");
	 int sum=sc.nextInt();
	 for(int i=0;i<n;i++) {
		 for(int j=0;j<i;j++) {
			 if(arr[i]+arr[j]==sum) {
				 System.out.println("Pair:("+arr[i]+","+arr[j]+")");
			 }
		 }
	 }
	 sc.close();
	
 }
}
