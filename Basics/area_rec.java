package basic;
import java.util.Scanner;
public class area_rec {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Length of the rectangle:");
	 int l=sc.nextInt();
	 System.out.println("Breath of the rectangle:");
	 int b=sc.nextInt();
	 System.out.println("Area of the rectangle:"+(l*b));
	 sc.close();
 }
}
