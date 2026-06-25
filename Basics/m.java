package arr;
import java.util.Scanner;
public class m {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number");
	 int n=sc.nextInt();
	 int[] arr1=new int[n];
	 int [] mer=new int[2*n];
	 System.out.println("enter array 1 numbers:");
	 for(int i=0;i<n;i++) {
		 arr1[i]=sc.nextInt();
		 mer[i]=arr1[i];
		 
	 }
	 int[] arr2=new int[n];
	 System.out.println("enter array 2 numbers:");
	 for(int i=0;i<n;i++) {
		 arr2[i]=sc.nextInt();
		 mer[n+i]=arr2[i];
	 }
	 System.out.println("merging of 2 arrays");
	 for(int i=0;i<2*n;i++) {
		 System.out.print(mer[i]+" ");
	 }
	 sc.close();
 }
}
