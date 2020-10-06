package xz222az_assign1;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        //read in Fahrenheit
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide a temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        sc.close();

        //convert Fahrenheit into Celsius
        double celsius = 5 / 9.0 * (fahrenheit - 32);

        //display the result
        System.out.println("Corresponding temperature in Celsius is " + celsius);
    }
}
