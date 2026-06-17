package basic;
import java.util.Scanner;
public class lcm {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter a number");
	 int n1=sc.nextInt();
	 int n2=sc.nextInt();
	 int max = (n1 > n2) ? n1 : n2;

     while (true) {
         if (max % n1 == 0 && max % n2 == 0) {
             System.out.println("LCM is: " + max);
             break;
         }
         max++;
     }
	 sc.close();
 }
}
