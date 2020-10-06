package xz222az_assign1;

import java.util.Scanner;

public class Programming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the first programming language? ");
        String st1 = sc.nextLine();
        char ch1 = Character.toUpperCase(st1.charAt(0));

        System.out.print("And the second? ");
        String st2 = sc.nextLine();
        char ch2 = Character.toUpperCase(st2.charAt(0));

        System.out.print("And the third? ");
        String st3 = sc.nextLine();
        char ch3 = Character.toUpperCase(st3.charAt(0));

        sc.close();
        String temp = null;

       if (st1.compareToIgnoreCase(st2) > 0){
           temp = st1;
           st1 = st2;
           st2 = temp;
       }
       if (st1.compareToIgnoreCase(st3) > 0){
           temp = st1;
           st1 = st3;
           st3 = temp;
       }
       if (st2.compareToIgnoreCase(st3) > 0){
           temp = st2;
           st2 = st3;
           st3 = temp;
       }
        System.out.println(st1 + " " + st2 + " " + st3);
    }
}
