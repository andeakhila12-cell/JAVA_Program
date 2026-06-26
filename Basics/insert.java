package arr;
import java.util.Scanner;
public class insert {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter how many number should be in the array");
	 int n=sc.nextInt();
	 System.out.println("enter elements");
	 int[] arr1=new int[n+1];
	 for(int i=0;i<n;i++) {
		 arr1[i]=sc.nextInt();
	 }
	
	 System.out.println("original array");
	 for(int i=0;i<n;i++) {
		 System.out.print(arr1[i]+" ");
	 }
	 System.out.println(" ");
	 System.out.println("enter the element to insert");
	 int a=sc.nextInt();
	 System.out.println("enter the positon");
	 int b=sc.nextInt();
	 for(int i=n;i>b;i--) {
			 arr1[i]=arr1[i-1];
		 }
	 arr1[b]=a;
	 System.out.println("after inserting");
	 for(int i=0;i<=n;i++) {
		 System.out.print(arr1[i]+" ");
	 }
	 sc.close();
 }
}
