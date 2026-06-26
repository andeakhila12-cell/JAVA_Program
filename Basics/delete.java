package arr;
import java.util.Scanner;
public class delete {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter how many numbers");
	 int n=sc.nextInt();
	 int[] arr=new int[n];
	 System.out.println("enter numbers");
	 for(int i=0;i<n;i++) {
		 arr[i]=sc.nextInt();
	 }
	 System.out.println("original array");
	 for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	 }
	 System.out.println(" ");
	 System.out.println("enter the position should be delete");
	 int a=sc.nextInt();
	 for(int i=a;i<n-1;i++) {
		 arr[i]= arr[i+1];
	 }
	 System.out.println("after deleteing the element ");
	 for(int i=0;i<n-1;i++) {
		 System.out.print(arr[i]+" ");
	 }
	 sc.close();
 }
}
