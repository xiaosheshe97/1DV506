package xz222az_assign1;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        //read in numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a number of seconds: ");
        int seconds = sc.nextInt();
        sc.close();

        //calculate hours, minutes and seconds
        int hours = seconds / 60 / 60;
        int minutes = seconds / 60 % 60;
        int remainSeconds = seconds % 60;

        //display
        System.out.println("This corresponds to: " + hours + " hours, " + minutes + " minutes and " + remainSeconds + " seconds");
    }
}
