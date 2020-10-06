package xz222az_assign2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Random rnd = new Random();
        System.out.println("The Lotto numbers this week:");

        for (int i = 0; i < 7; i++){
            int value = rnd.nextInt(35) + 1;
            while (array.contains(value)){
               value = rnd.nextInt(35) + 1;
            }
            array.add(value);

        }
        java.util.Collections.sort(array);
        for (int i = 0; i < 7; i++) {
            System.out.print(array.get(i) + " ");
        }
    }
}
