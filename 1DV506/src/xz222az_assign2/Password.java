package xz222az_assign2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password:");
        String st = sc.nextLine();

        //iteration till isValid
        while (!valid(st)){
            System.out.println("Enter a password:");
            st = sc.nextLine();
        }
        sc.close();
        System.out.println("Password is valid!");
    }

    public static boolean valid(String st) {
        boolean valid;
        if (checkLength(st) && checkCharacter(st))
            return true;
        else
            return false;

    }

    public static boolean checkLength(String st){
        if (st.length() < 10) {
            return false;
        }
        else return true;
    }

    public static boolean checkCharacter(String st){
        char ch;
        int countNum = 0;
        int countUpp = 0;
        int countSpecial = 0;
        for (int i = 0; i < st.length() - 1; i++){
            ch = st.charAt(i);
            if ('0' <= ch && ch <= '9'){
                countNum++;
            }
            else if ('A' <= ch && ch <= 'Z'){
                countUpp++;
            }
            else if (!(ch >= 'a' && ch <= 'z')){
                countSpecial++;
            }
        }
        if (countNum >= 2 && countUpp >= 2 && countSpecial >= 2){
            return true;
        }
        else
            return false;
    }
}