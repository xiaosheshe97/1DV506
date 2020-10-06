package xz222az_assign2;

import java.util.Scanner;

public class CalcNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;
        do {
            System.out.print("Give me a number: ");
            num = sc.nextInt();
            sum += num;
        }while (num != 0);

        sc.close();
        System.out.println("The sum is " + sum);
    }
}
