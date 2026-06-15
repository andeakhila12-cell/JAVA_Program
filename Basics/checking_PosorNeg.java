package basic;
import java.util.Scanner;
public class checking_PosorNeg {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a Number:");
	 int num=sc.nextInt();
	 if(num<0) {
		 System.out.println("Number is Negative");
	 }else if(num>0) {
		 System.out.println("Number is Positive");
	 }
	 else  System.out.println("Number is zero");
 }
}
