package basic;
import java.util.Scanner;
public class strong{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	int num=n;
	int sum=0;
	while(n!=0) {
		int digit=n%10;
		int m=1;
		for(int i=1;i<=digit;i++) {
			m=m*i;
		}
		sum=sum+m;
		n=n/10;
	}
	if(num==sum) System.out.println("Number is a Strong number");
	else System.out.println("number is not an Strong");
sc.close();
}
}
