package xz222az_assign1;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a temperature in °C: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter the wind speed (measured in m/s): ");
        double sppedM_S = sc.nextDouble();
        double speedPerK_H = sppedM_S / 1000 * 60 * 60;

        sc.close();

        double windChill = 13.12 + 0.6215 * temperature - 11.37 * Math.pow(speedPerK_H,0.16) +
                0.3965 * temperature * Math.pow(speedPerK_H,0.16);

        System.out.println("Temperature (C): " + temperature);
        System.out.println("Wind speed (m/s): " + sppedM_S);
        System.out.printf("Wind Chill Temperature (C): %3.1f", windChill);
    }
}
