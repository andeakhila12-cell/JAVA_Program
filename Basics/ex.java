package arr;
import java.util.Scanner;
public class ex {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter how many numbers in a array");
	 int n=sc.nextInt();
	 int[] arr=new int[n];
	
	 for(int i=0;i<n;i++) {
		 arr[i]=sc.nextInt();
	 }
	 int min=arr[0];
	 for(int i=1;i<n;i++) {
		 if(min>arr[i]){
			 min=arr[i];
		 }
	 }
	  System.out.print("Large number in the array:"+min); 

	 sc.close();
 }
}
