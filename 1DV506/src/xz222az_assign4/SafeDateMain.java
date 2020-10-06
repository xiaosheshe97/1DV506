package xz222az_assign4;

import java.util.Scanner;

public class SafeDateMain {
    public static void main(String[] args) {
        DateFormat date = new DateFormat();
        Scanner sc = new Scanner(System.in);
        date.setFormat('l');
        date.setPunctuation('/');

        System.out.print("Give me a year: ");
        int year = sc.nextInt();
        do {
            if (year == 0) {
                break;
            }
            System.out.print("Give me a month: ");
            int month = sc.nextInt();
            System.out.print("Give me a day: ");
            int day = sc.nextInt();

            try {
            date.setYear(year);
            date.setMonth(month);
            date.setDay(day);
            System.out.println(date.getDate(true));
            }
            catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }

            System.out.print("Give me a year: ");
            year = sc.nextInt();

        }while (year != 0);
        sc.close();
        System.out.println("Bye, bye!");
    }
}
