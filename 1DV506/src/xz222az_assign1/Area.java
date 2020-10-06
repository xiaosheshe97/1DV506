package xz222az_assign1;

import java.util.Random;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide radius: ");
        float radius = sc.nextFloat();
        sc.close();

        final double PAI = 3.1415926;
        double area = PAI * radius * radius;

        System.out.printf("Corresponding area is %3.1f", area);
    }
}
