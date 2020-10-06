package xz222az_assign1;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        //read in price and payment
        Scanner sc = new Scanner(System.in);
        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Payment: ");
        int payment = sc.nextInt();
        sc.close();

        //compute change
        int change = (int)Math.round(payment - price + 0.5);


        //compute the number of coins
        int kr1000 = change / 1000;
        int kr500 = (change % 1000 / 500);
        int kr200 = (change % 1000 % 500 / 200);
        int kr100 = (change % 1000 % 500 % 200 / 100);
        int kr50 = (change % 1000 % 500 % 200 % 100 / 50);
        int kr20 = (change % 1000 % 500 % 200 % 100 % 50 / 20);
        int kr10 = (change % 1000 % 500 % 200 % 100 % 50 % 20 / 10);
        int kr5 = (change % 1000 % 500 % 200 % 100 % 50 % 20 % 10 / 5);
        int kr2 = (change % 1000 % 500 % 200 % 100 % 50 % 20 % 10 % 5 / 2);
        int kr1 = (change % 1000 % 500 % 200 % 100 % 50 % 20 % 10 % 5 % 2);

        //display the result
        System.out.println("Price: " + price + "\nPayment: " + payment + "\nChange: " + change + "\n1000 kr bills: " +
                kr1000 + "\n 500 kr bills: " + kr500 + " \n 200 kr bills: " + kr200 + "\n 100 kr bills: " + kr100 +
                "\n  50 kr bills: " + kr50 + "\n  20 kr bills: " + kr20 + "\n  10 kr bills: " + kr10 + "\n   5 kr bills: " +
                kr5 + "\n   2 kr bills: " + kr2 + "\n   1 kr bills: " + kr1);
    }
}
