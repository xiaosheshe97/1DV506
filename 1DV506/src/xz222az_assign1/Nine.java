package xz222az_assign1;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        //read in ready, if say no the program is over
        Scanner sc = new Scanner(System.in);
        System.out.print("Ready to play? (Y/N) ");
        String st = sc.next();
        char ch = Character.toUpperCase(st.charAt(0));

        int rollNum1 = 0;
        int rollNum2 = 0;
        int totalYou = 0;
        if (ch == 'Y'){
            rollNum1 = (int)(Math.random() * 6) + 1;
            System.out.println("You rolled " + rollNum1);
        }
        else
            System.exit(1);

        //would you roll again
        System.out.print("Would you like to roll again:(Y/N) ");
        st = sc.next();
        ch = Character.toUpperCase(st.charAt(0));
        sc.close();

        if (ch == 'Y'){
            rollNum2 = (int)(Math.random() * 6) + 1;
            totalYou = rollNum2 + rollNum1;
            System.out.println("You roll " + rollNum2 + " and in total you have " + totalYou);
        }
        else if (ch == 'N'){
            totalYou = rollNum1;
            System.out.println("In total you have " + totalYou);
        }
        else {
            System.out.println("Invalid input");
            System.exit(1);
        }

        //computer roll
        int num1 = (int)(Math.random() * 6) + 1;
        System.out.println("Computer rolled " + num1);

        //computer decide if it roll again
        int num2 = 0;
        int totalCom = 0;
        if ((int)(Math.random()*10) % 2 == 1){
            num2 = (int)(Math.random() * 6) + 1;
            totalCom = num1 + num2;
            System.out.println("Computer rolls again and gets " + num2 + " in total in " + totalCom);
        }
        else {
            totalCom = num1;
            System.out.println("Computer doesn't roll again and in total " + totalCom);
        }

        //compare both sum to 9 and see if anyone lose
        if (totalYou >= 10){
            System.out.println("You are fat and lose");
            System.exit(1);
        }
        else if (totalCom  >= 10){
            System.out.println("Computer are fat and lose");
            System.exit(1);
        }
        else if (9 - totalYou < 9 - totalCom){
            System.out.println("You won");
        }
        else if (9 - totalYou > 9 - totalCom){
            System.out.println("Computer won");
        }
        else
            System.out.println("Equal");

    }
}
