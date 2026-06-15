package basic;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an ASCII value:");
        int ascii = sc.nextInt();

        char ch = (char) ascii;

        System.out.println("Character is: " + ch);

        sc.close();
    }
}
