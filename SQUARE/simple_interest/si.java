package basic;
import java.util.Scanner;
public class si {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter p:");
	 int p=sc.nextInt();
	 System.out.println("Enter t:");
	 int t=sc.nextInt();
	 System.out.println("Enter r:");
	 float r=sc.nextFloat();
	 System.out.println("simple interest will be:"+((p*t*r)/100));
	 sc.close();
 }
}
