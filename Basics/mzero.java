package arr;
import java.util.Scanner;
public class mzero {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter a number");
	 int n=sc.nextInt();
	 System.out.println("enter numbers");
	 int[] arr=new int[n];
	 for(int i=0;i<n;i++) {
		 arr[i]=sc.nextInt();
	 }
	 System.out.println("original array");
	 for(int i=0;i<n;i++) {
		 System.out.print(arr[i]+" ");
	 }
	 System.out.println(" ");
	 int count=0;
	 for(int i=0;i<n-count;i++) {
		 if(arr[i]==0) {
			 for(int j=i;j<n-1;j++) {
				 arr[j]=arr[j+1];
			 }
			 arr[n-1]=0;
			 count++;
			i--;
		 }
	 }
	 System.out.println("move all zeroes at the end");
	 for(int i=0;i<n;i++) {
		 System.out.print(arr[i]+" ");
	 }
	 sc.close();
 }
}
