package basic;
import java.util.Scanner;
public class palindromes {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String s=sc.nextLine();
	String str=s;
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	if(str.equals(rev)) {
	System.out.println("palindrome");
	}else System.out.println("not palindrome");
	sc.close();
	
	}

}
