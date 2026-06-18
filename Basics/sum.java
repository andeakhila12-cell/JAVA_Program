package basic;
import java.util.Scanner;
public class sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0;
		while(n!=0) {
			int digit=n%10;
			sum=n*10+digit;
		    n=n/10;
		}
		System.out.println("sum of the digit:"+sum);
		sc.close();
		
	}

}
