package arr;
import java.util.Scanner;
public class element {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter how many number");
	 int n=sc.nextInt();
	 int[] arr=new int[n];
	 for(int i=0;i<n;i++) {
		 		 arr[i]=sc.nextInt();
	 }
	   
	 System.out.println("enter a number :");
	 int a=sc.nextInt();
	 boolean temp=false;
	 for(int i=0;i<n;i++) {
		 if(arr[i]==a) {
			 temp=true;
			 break;
		 }
	 }
		if(temp==true) System.out.println("number is present in the array");
	 else System.out.println("number is not present");
	 sc.close();
 }
 }

