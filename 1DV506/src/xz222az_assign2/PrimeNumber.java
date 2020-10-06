package xz222az_assign2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //iteration
        for (;;) {
            //prompt enter
            System.out.print("Give me a number: ");
            int num = sc.nextInt();
            //stop when it is negative
            if (num < 0){
                System.out.println("Good bye!");
                break;
            }
            //is prime
            if (isPrime(num)){
                System.out.println("This is a prime number.");
            }
            else
                System.out.println("This is not a prime number.");
        }
        sc.close();
    }
    public static boolean isPrime(int num){
        boolean isPrime = true;
        for (int divisor = 2; divisor <= num / 2; divisor++){
            if(num % divisor == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
