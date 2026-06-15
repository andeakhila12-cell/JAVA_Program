package basic;

import java.util.Scanner;

public class fah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius:");
        double celsius = sc.nextDouble();

        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        sc.close();
    }
}
