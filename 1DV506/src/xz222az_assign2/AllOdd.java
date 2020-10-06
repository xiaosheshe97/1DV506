package xz222az_assign2;

public class AllOdd {
    public static void main(String[] args) {
        int[] array = new  int[10];
        System.out.print("Complete array: ");

        for (int i = 0; i < 10; i++){
            array[i] = (int)((Math.random() * 100) + 1);
            System.out.print(array[i] + " ");
        }
        System.out.print("\nAll odd numbers: ");

        for (int count = 0; count < 10; count++){
            if (array [count] % 2 == 1){
                System.out.print(array[count] + " ");
            }
        }

    }

}
