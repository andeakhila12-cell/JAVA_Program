package arr;
import java.util.Scanner;
public class com {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter how many number");
	int n=sc.nextInt();
	int[] arr1=new int[n];
	int[] arr2=new int[n];
	System.out.println("numbers present in Array-1");
	for(int i=0;i<n;i++) {
		arr1[i]=sc.nextInt();
	}
	System.out.println("numbers present in Array-2");
	for(int i=0;i<n;i++) {
		arr2[i]=sc.nextInt();
	}
	boolean c=false;
	for(int i=0;i<n;i++) {
		if(arr1[i]==arr2[i]) {
			c=true;
		}
	}
	if(c==true) {
		System.out.println("both arrays are equal");
	}
	else System.out.println("both arrays are not equal");
	sc.close();
}
}
