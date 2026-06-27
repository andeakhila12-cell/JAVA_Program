package arr;
import java.util.Scanner;
public class missing{
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
	 int sum=0;
	 for(int i=0;i<n;i++) {
		 sum=arr[i]+sum;
	 }
	 int totalNumbers=n+1;
	 int expectedSum = totalNumbers * (totalNumbers + 1) / 2;
	 int miss=expectedSum-sum;
	 System.out.println("missing number:"+miss);
	 sc.close();
 }
}
