package xz222az_assign2;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide 10 integers: ");

        int max = sc.nextInt();
        int secondMax = sc.nextInt();
        int num;

        for (int i = 0; i < 8; i++){
            num = sc.nextInt();
            if (num >= max){
                secondMax = max;
                max = num;
            }
            else{
                if (num >= secondMax){
                    secondMax = num;
                }
            }

        }
        sc.close();
        System.out.println("The second largest is: " + secondMax);
    }
}
