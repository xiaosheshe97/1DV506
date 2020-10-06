package xz222az_assign1;

public class RandomSum {
    public static void main(String[] args) {
        //generate random number
        int number1 = (int)(Math.random() * 100) + 1;
        int number2 = (int)(Math.random() * 100) + 1;
        int number3 = (int)(Math.random() * 100) + 1;
        int number4 = (int)(Math.random() * 100) + 1;
        int number5 = (int)(Math.random() * 100) + 1;

        //display the result
        System.out.println("Five random numbers: " + number1 + " " + number2 + " " +
                number3 + " " + number4 + " " + number5);
        System.out.println("There sum is " + (number1 + number2 + number3 + number4 + number5));

    }
}
