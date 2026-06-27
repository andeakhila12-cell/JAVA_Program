package basic;
import java.util.Scanner;
public class coe{
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter a number");
	 int n=sc.nextInt();
	 int rev=0;
	 int c1=0,c2=0;
	 while(n!=0) {
		 int digit=n%10;
		 n=n/10;
		 if(digit%2==0) {
			 c1++;
		 }
		 else c2++;
	 }
	 System.out.println("even digits"+c1);
	 System.out.println("odd digits"+c2);
	
 }
}
