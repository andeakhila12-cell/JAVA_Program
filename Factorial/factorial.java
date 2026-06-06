package com.practice;
import java.util.Scanner;
public class print {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter char");
	 char ch=sc.next().charAt(0);
	 int ascii=(int) ch;
	 System.out.println("char: "+ch);
	 System.out.println("ASCII: "+ascii);
	 sc.close();
 }
}
