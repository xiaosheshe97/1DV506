package xz222az_assign3;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Planet {
    private String name;
    private int positionFromSun;
    private int noOfMoons;
    private double aphelion;
    private double perihelion;
    //exercise3
    private ArrayList<Moon> moons = new ArrayList<>();

    public Planet(){
    }
    public Planet(String theName, int positionFromSun, int noOfMoons, double aphelion, double perihelion){
        setName(theName);
        setPositionFromSun(positionFromSun);
        setNoOfMoons(noOfMoons);
        setAphelion(aphelion);
        setPerihelion(perihelion);

    }

    public String getName(){
            return name;
    }
    public void setName(String theName){
        if (theName.equals("")){
            name = "Unknown planet";
        }
        else {
            name = theName;
        }
    }

    public int getPositionFromSun() {
        return positionFromSun;
    }
    public void setPositionFromSun(int thePositionFromSun){
        if (thePositionFromSun >= 1 && thePositionFromSun <= 9){
            positionFromSun = thePositionFromSun;
        }
        else
            positionFromSun = 0;
    }

    public int getNoOfMoons(){
        return noOfMoons;
    }
    public void setNoOfMoons(int theNoOfMoons){
        if (theNoOfMoons > 0 && theNoOfMoons <= 100){
            noOfMoons = theNoOfMoons;
        }
        else
            noOfMoons = 0;
    }
    public double getAphelion(){
        return aphelion;
    }
    public void setAphelion(double theAphelion){
        if (theAphelion > 0 && theAphelion <= 50){
            aphelion = theAphelion;
        }
        else
            aphelion = 0;
    }
    public double getPerihelion(){
        return perihelion;
    }
    public void setPerihelion(double thePerihelion){
        if (thePerihelion > 0 && thePerihelion <= 30){
            perihelion = thePerihelion;
        }
        else
            perihelion = 0;
    }
    //exercise 3
    public void addMoons(Moon newMoon){
        moons.add(newMoon);
    }
    public String[] getMoons(){
        String[] Moon = new String[noOfMoons];
        for (int i = 0; i < moons.size(); i++){
            Moon[i] = moons.get(i).getName();
        }
        return Moon;
    }
}
