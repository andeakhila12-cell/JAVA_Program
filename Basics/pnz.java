package arr;
import java.util.Scanner;
public class pnz {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many numbers");
		int n=sc.nextInt();
		System.out.println("enter numbers:");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int c1=0;
		int c2=0;
		int c3=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>0) c1++;
			else if(arr[i]<0) c2++;
			else c3++;
		}
		System.out.println("positive numbers in the array: "+c1);
		System.out.println("negative numbers in the array: "+c2);
		System.out.println("zeros in the array: "+c3);
		
	}

}
