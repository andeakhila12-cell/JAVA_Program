package basic;

import java.util.Scanner;
class cal{
	void series(int n) {
		 int a=0;
		 int b=1;
		 for(int i=1;i<=n;i++) {
			 System.out.print(a+" " );
			 int c=a+b;
			 a=b;
			 b=c;
			 }
	}
}
public class fib {
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number:");
	 int n=sc.nextInt();
	 cal obj=new cal();
	 obj.series(n);
	 sc.close();
 }
}
