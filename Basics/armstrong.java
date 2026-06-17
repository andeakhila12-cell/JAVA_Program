package basic;
import java.util.Scanner;
public class armstrong {
 public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number:");
	 int n=sc.nextInt();
	 int num=n;
	 int sum=0;
	 while(n!=0) {
		 int digit=n%10;
		 sum=sum+(digit*digit*digit);
		 n=n/10;
		
	 }
	 if(num==sum)
	 System.out.println("armstrong");
	 else  System.out.println("not an armstrong");
	 sc.close();
	 
 }
}
