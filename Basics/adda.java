package arr;
import java.util.Scanner;
public class adda {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many rows:");
		int r=sc.nextInt();
		System.out.println("enter how many col:");
		int c=sc.nextInt();
		int[][] arr1=new int[r][c];
		int[][] arr2=new int[r][c];
		int sum=0;
		System.out.println("enter 1st array:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter 2nd array:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("sum of two arrays:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				sum=arr1[i][j]+arr2[i][j];
				System.out.print(" "+sum);
			}
			 System.out.println();
		}
		
		sc.close();
	}

}
