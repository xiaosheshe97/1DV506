package xz222az_assign1;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First number: ");
        int num1 = sc.nextInt();
        System.out.print("Second number: ");
        int num2 = sc.nextInt();
        System.out.print("Third number: ");
        int num3 = sc.nextInt();
        sc.close();

        if (num1 > num2 && num2 > num3){
            System.out.println("Correct order: " + num3 + " " + num2 + " " + num1);
        }
        else if (num3 > num2 && num2 > num1){
            System.out.println("Correct order: " + num1 + " " + num2 + " " + num3);
        }
        else if (num2 > num1 && num2 > num3 && num1 > num3){
            System.out.println("Correct order: " + num3 + " " + num1 + " " + num2);
        }
        else
            System.out.println("Correct order: " + num1 + " " + num3 + " " + num2);

    }
}
