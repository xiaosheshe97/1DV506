package xz222az_assign1;

import java.util.Scanner;

public class DoctorWho {
    public static void main(String[] args) {
        //read in year
        Scanner sc = new Scanner(System.in);
        System.out.print("What year? ");
        int year = sc.nextInt();
        sc.close();

        if (year < 1963)
            System.out.println("Doctor Who did not start");
        else if (year < 1989)
            System.out.println("That was the original series.");
        else if (year < 2005)
            System.out.println("That year it was a pause.");
        else if (year < 2020)
            System.out.println("That is the modern doctor.");
        else
            System.out.println("No news on a doctor yet, but one can hope!");
    }
}
