package arr;
import java.util.Scanner;
public class reva {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter how many numbers in a array");
	 int n=sc.nextInt();
	 System.out.println("enter numbers ");
	 int[] arr=new int[n];
	 
	
	 for(int i=0;i<n;i++) {
		 arr[i]=sc.nextInt();
	 }
	
	 System.out.println("reverse of the array");
	 for(int i=arr.length -1;i>=0;i--) {
		 System.out.print(arr[i]+" ");
	 }
	 
	 sc.close();
 }
}
