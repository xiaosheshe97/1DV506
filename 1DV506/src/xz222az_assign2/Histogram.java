package xz222az_assign2;

import java.util.Random;

public class Histogram {
    public static void main(String[] args) {
        Random rnd = new Random();
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        //loop 500 times
        for (int count = 0; count < 500; count++){
            //generate random number from 1 to 6
            int num = rnd.nextInt(6) + 1;
            switch (num){
                case 1: n1++;break;
                case 2: n2++;break;
                case 3: n3++;break;
                case 4: n4++;break;
                case 5: n5++;break;
                case 6: n6++;
            }
        }
        System.out.print("One   (" + n1 + "):");
        for (int count = 0; count < n1; count++){
            System.out.print("*");
        }
        System.out.print("\nTwo   (" + n2 + "):");
        for (int count = 0; count < n2; count++){
            System.out.print("*");
        }
        System.out.print("\nThree (" + n3 + "):");
        for (int count = 0; count < n3; count++){
            System.out.print("*");
        }System.out.print("\nFour  (" + n4 + "):");
        for (int count = 0; count < n4; count++){
            System.out.print("*");
        }System.out.print("\nFive  (" + n5 + "):");
        for (int count = 0; count < n5; count++){
            System.out.print("*");
        }System.out.print("\nSix   (" + n6 + "):");
        for (int count = 0; count < n6; count++){
            System.out.print("*");
        }
    }
}
