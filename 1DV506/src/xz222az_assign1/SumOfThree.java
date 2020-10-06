package xz222az_assign1;

import java.util.Scanner;

public class SumOfThree {
    public static void main(String[] args) {
        //read in a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide a three digit number: ");
        int number = sc.nextInt();
        sc.close();

        //get the three digits
        int digits1 = number / 100;
        int digits2 = number / 10 % 10;
        int digits3 = number % 10;

        //compute the sum
        int sum = digits1 + digits2 + digits3;

        //display the result
        System.out.print("Sum of digits: " + sum);

    }
}
