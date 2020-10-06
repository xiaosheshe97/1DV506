package xz222az_assign2;

import java.util.Scanner;

public class SimpleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();
        sc.close();

        //for print row
        if (num > 0) {
            for (int row = 1; row <= num; row++) {
                //for print blank
                for (int blank = 0; blank < row; blank++) {
                    System.out.print(" ");
                }
                //for print *
                for (int length = 1; length <= num - row + 1; length++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else
            System.out.println("The number was not valid");
    }
}
