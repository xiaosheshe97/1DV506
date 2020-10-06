package xz222az_assign2;

import java.util.Scanner;

public class EveryOther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start integer: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the end integer: ");
        int n2 = sc.nextInt();
        sc.close();

        while (n1 <= n2){
            System.out.print(n1 + " ");
            n1 = n1 + 2;
        }

    }
}
