package arr;
import java.util.Scanner;
public class duplicate {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many number");
		int n=sc.nextInt();
		System.out.println("enter numbers");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("after removing the duplicates");
		for(int i=0;i<n;i++) {
			boolean isduplicate=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					isduplicate=true;
					break;
				}
			}
			if(!isduplicate) {
				System.out.print(arr[i]+" ");
			}
			
		}
		
		sc.close();
	}
}		
