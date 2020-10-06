package xz222az_assign2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //prompt enter ignore space and case
        System.out.print("Enter a word or sentence: ");
        String st = sc.nextLine().replaceAll(" ","").toLowerCase();

        //iteration
        while (!st.equals("stop")) {
            //is Palindrome
            if (isPalindrome(st)) {
                System.out.println("That was a Palindrome");
            } else
                System.out.println("That wasn't a Palindrome");
            System.out.print("Enter a word or sentence: ");
            st = sc.nextLine().replaceAll(" ","").toLowerCase();
        }
        sc.close();

    }
    //method
    public static boolean isPalindrome(String st){
        boolean isPalindrome = true;
        int length = st.length();
        int low = 0;
        int high = length - 1;
        while (low < high){
            if (st.charAt(low) != st.charAt(high)){
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        return isPalindrome;
    }
}
