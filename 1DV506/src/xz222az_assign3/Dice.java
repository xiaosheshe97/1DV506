package xz222az_assign3;

public class Dice {
    private int numOfDice;
    private int numOfSide;
    private int number;

    public Dice(){
    }
    public Dice(int nd, int ns, int num){
        numOfDice = nd;
        numOfSide = ns;
        number = num;
    }
    public int getNumOfDice(){
        return numOfDice;
    }
    public void setNumOfDice(int nd){
        numOfDice = nd;
    }
    public int getNumOfSide(){
        return numOfSide;
    }
    public void setNumOfSide(int ns){
        numOfSide = ns;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int num){
        number = num;
    }
}
