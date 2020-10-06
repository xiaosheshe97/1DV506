package xz222az_assign1;

import java.util.Scanner;

public class Quote {
    public static void main(String[] args) {
        //read in quote
        Scanner sc = new Scanner(System.in);
        System.out.print("Please give me something to quote: ");
        String quote = sc.nextLine();
        sc.close();

        //display the quote
        System.out.println("You said: \"" + quote + "\"");

    }
}
