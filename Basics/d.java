package arr;
import java.util.Scanner;
public class d {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter how many numbers:");
	 int n=sc.nextInt();
	 System.out.println("enter numbers");
	 int[] arr=new int[n];
	 for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	 }
	for(int i=0;i<n;i++) {
		for(int j=0;j<i;j++) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		
	}
	System.out.println("after sorting");
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	 }
	 sc.close();
 }
}
