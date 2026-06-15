package com.practice;
import java.util.*;
public class palindrome {
 public static void main(String[] args) {
	 System.out.println("Enter a string: ");
	 Scanner sc=new Scanner(System.in);
	 String s=sc.nextLine();
	 String temp=s;
	 String rev="";
	 for(int i=s.length()-1;i>=0;i--){

		 rev+=s.charAt(i);
		 }

		 if(temp.equals(rev))

		 System.out.println("palindrome");

		 else

		 System.out.println("Not palindrome");
		 sc.close();
 }
 
}
