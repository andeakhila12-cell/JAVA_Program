package arr;
import java.util.Scanner;
public class arrc {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter how many numbers in a array");
	 int n=sc.nextInt();
	 System.out.println("enter numbers ");
	 int[] arr=new int[n];
	 
	
	 for(int i=0;i<n;i++) {
		 arr[i]=sc.nextInt();
	 }
	int c1=0;
	int c2=0;
	 
	 for(int i=0;i<n;i++) {
		 if(arr[i]%2==0){
		 c1++;
		 }else c2++;
	 }
	 System.out.println("count of even number in an array: "+c1);
	 System.out.println("count of even number in an array: "+c2);
	 sc.close();
 }
}
