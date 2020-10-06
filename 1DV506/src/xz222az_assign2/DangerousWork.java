package xz222az_assign2;

import java.util.Scanner;

public class DangerousWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How much would you like to earn? ");
        int money = sc.nextInt();
        sc.close();

        double sum = 0.01;
        double dailySalary = 0.01;
        int day = 1;

        while (sum < money){
            dailySalary = dailySalary * 2;
            sum += dailySalary;
            day++;
        }
        if (day <= 30)
        System.out.println("You will have your money in " + day + " days");
        else
            System.out.println("You will have your money in " + day + " days but you may not survive after 30 days");
    }
}
