package xz222az_assign2;

public class BirthdayCandles {
    public static void main(String[] args) {
        int totalBoxes = 0;
        int newBoxes = 0;
        int remainCandles = 0;

        //iterate 100 times and add new boxes to total boxes
        for (int age = 1; age <= 100; age++) {

            //if remainCandles are not enough and need new box
            //calculate remainCandles
            if (remainCandles < age){
                //if just only need one box,
                if (age - remainCandles < 24)
                    newBoxes = 1;

                //need more than one boxes
                else {
                    //new boxes are integer
                    if((age - remainCandles) % 24 == 0) {
                        newBoxes = (age - remainCandles) / 24;
                    }
                    //new boxes need to be add more
                    else{
                        newBoxes = (age - remainCandles) / 24 + 1;
                    }
                }
                remainCandles = remainCandles + newBoxes * 24 - age;
            }

            //for remainCandles are enough and do not need new box and calculate remainCandles
            else{
                newBoxes = 0;
                remainCandles = remainCandles - age;
            }
            totalBoxes = totalBoxes + newBoxes;

            //print if new box is not 0
            if (newBoxes != 0){
                System.out.println("Before birthday " + age + ", buy " + newBoxes + " box(es)");
            }
        }


        System.out.println("\nTotal number of boxes: " + totalBoxes+", Remaining candles: " + remainCandles);

    }
}

