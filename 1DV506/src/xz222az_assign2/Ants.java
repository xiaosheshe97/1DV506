package xz222az_assign2;



import java.util.Random;

public class Ants {
    public static void main(String[] args) {
        Random rnd = new Random();

        //create a board
        int ROW;
        int COL;
        int[][] board = new int[8][8];
        for (ROW = 0; ROW < 8; ROW++){
            for (COL = 0; COL < 8 ; COL++){
                board[ROW][COL] = ROW * 8 + COL + 1;
            }
        }
        System.out.print("Ant" + "\n=====\n\n");

        //iteration 10 times
        int sum = 0;
        for (int i = 0; i < 10; i++){

            //create ant array and first position
            int[][] antArray = new int[8][8];
            int row = rnd.nextInt(8);
            int col = rnd.nextInt(8);
            antArray[row][col] = row * 8 + col + 1;
            int step = 0;

            //if doesnt contain every number in board iteration
            while (!isEqual(board,antArray)){
                //create random number as direction
                int direction = rnd.nextInt(4);
                //select direction
                //up
                if (direction == 0){
                    //add to array and step
                    // if it to edge doesnt count
                    if (row - 1 >= 0){
                        row--;
                        antArray[row][col] = row * 8 + col + 1;
                        step++;
                    }
                }
                //down
                if (direction == 1){
                    if (row + 1 <= 7){
                        row++;
                        antArray[row][col] = row * 8 + col + 1;
                        step++;

                    }
                }
                //left
                if (direction == 2){
                    if (col - 1 >= 0){
                        col--;
                        antArray[row][col] = row * 8 + col + 1;
                        step++;
                    }
                }
                //right
                if (direction == 3){
                    if (col + 1 <= 7){
                        col++;
                        antArray[row][col] = row * 8 + col + 1;
                        step++;
                    }
                }
            }
            sum += step;
            System.out.println("Number of steps in simulation " + (i+1) + ": " + step);
        }
        System.out.println("Average amount of steps: " + (sum / 10.0));
            }

            public static boolean isEqual(int[][] a, int[][] b){
                boolean isEqual = true;
                if (a.length != b.length){
                    return false;
                }
                for (int i = 0; i < a.length - 1; i++){
                    if (!java.util.Arrays.equals(a[i],b[i]))
                        return false;
                }
                return isEqual;
            }
}
