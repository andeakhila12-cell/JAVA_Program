package arr;
import java.util.Scanner;
public class ce {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter how many numbers");
	 int n=sc.nextInt();
	 int[] arr1=new int[n];
	 int[] arr2=new int[n];
	 System.out.println("enter array-1");
	 for(int i=0;i<n;i++) {
		 arr1[i]=sc.nextInt();
	 }
	 System.out.println("enter array-2");
	 for(int i=0;i<n;i++) {
		 arr2[i]=sc.nextInt();
	 }
	 
	 for(int i=0;i<n;i++) {
		 for(int j=0;j<n;j++) {
			if(arr1[i]==arr2[j]) {
				System.out.println("common element are:" +arr1[i]+" ");
				break;
			}
		 }
	 }
	 sc.close();
 }
}
