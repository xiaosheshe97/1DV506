package xz222az_assign2;

import java.util.Scanner;

public class DateFormat {
    public static void main(String[] args) {
        //prompt input in number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        System.out.print("Enter a month (number): ");
        int month = sc.nextInt();
        System.out.print("Enter a day (number): ");
        int day =  sc.nextInt();

        //choose the way by method
        System.out.print("Enter a format (b/l/m): ");
        char ch = sc.next().charAt(0);

        sc.close();
        //display (convert to string by method
        endianTypes(ch, year, month, day);


    }
    public static void endianTypes(char ch, int year, int month, int day){
        //convert to string and add 0
        String stringYear = year + "";
        String stringMonth;
        if (month < 10){
            stringMonth = "0" + month;
        }
        else stringMonth = month + "";

        String stringDay;
        if (day < 10){
            stringDay = "0" + day;
        }
        else stringDay = day + "";

        switch (ch){
            case 'b':
                System.out.println(stringYear + "/" + stringMonth + "/" + stringDay);break;
            case 'l':
                System.out.println(stringDay+ "/" + stringMonth + "/" + stringYear);break;
            case 'm':
                System.out.println(stringMonth + "/" + stringDay + "/" + stringYear);
        }
    }


}
