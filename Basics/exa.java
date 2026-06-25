package arr;
import java.util.Scanner;
public class exa {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter how many number");
	int n=sc.nextInt();
	int[] arr1=new int[n];
	int[] arr2=new int[n];
	
	System.out.println("enter numbers");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("copied array");
		for(int i=0;i<n;i++) {
			arr2[i]=arr1[i];
			System.out.print(arr2[i]+" ");
		}
		
	sc.close();
}
}
