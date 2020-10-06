package xz222az_assign2;

import java.util.Scanner;

public class Diamonds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a positive number: ");
        int numUp = sc.nextInt();
        sc.close();
        int numDown = numUp - 1;

        if (numUp > 0){
            //for print up row
            for(int row = 1; row <= numUp; row++){
                //for print blank
                for(int length = numUp; length > row; length--){
                    System.out.print(" ");
                }
                //for print *
                for(int length = 1; length <= 2  * row - 1; length++){
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int row = 1; row <= numDown; row++){
                for (int length = 1; length <= row; length++){
                    System.out.print(" ");
                }
                for (int length = 1; length <= 2 * (numDown - row) + 1; length++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else
            System.out.println("Invalid input");
    }
}