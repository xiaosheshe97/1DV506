package xz222az_assign1;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two point x1, y1, x2, y2: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        sc.close();

        double distance = Math.sqrt(Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2));
        System.out.printf("Point x1: " + x1 + "\nPoint y1: " + y1 + "\nPoint x2: " + x2 +
                "\nPoint y2: " + y2 + "\nThe distance is %4.3f: ", distance);
    }
}
