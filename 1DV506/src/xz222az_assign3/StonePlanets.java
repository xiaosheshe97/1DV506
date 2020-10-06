package xz222az_assign3;

import java.awt.font.FontRenderContext;

public class StonePlanets {
    public static void main(String[] args) {
        Planet mercury = new Planet();
        mercury.setName("Mercury");
        mercury.setAphelion(0.47);
        mercury.setPerihelion(0.31);
        mercury.setNoOfMoons(0);

        Planet venus = new Planet();
        venus.setName("Venus");
        venus.setAphelion(0.72);
        venus.setPerihelion(0.72);
        venus.setNoOfMoons(0);

        Planet earth = new Planet();
        earth.setName("Earth");
        earth.setAphelion(1.0);
        earth.setPerihelion(0.99);
        earth.setNoOfMoons(1);

        Moon earthMoon = new Moon();
        earthMoon.setName("The Moon");
        earth.addMoons(earthMoon);

        Planet mars = new Planet();
        mars.setName("Mars");
        mars.setAphelion(1.666);
        mars.setPerihelion(1.382);
        mars.setNoOfMoons(2);

        Moon marsMoon1 = new Moon();
        marsMoon1.setName("Phobos");

        Moon marsMoon2 = new Moon();
        marsMoon2.setName("Deimos");

        mars.addMoons(marsMoon1);
        mars.addMoons(marsMoon2);



        Planet[] planets = {mercury,venus,earth,mars};
        for (int i = 0; i < 4; i++){
            System.out.println("Planet " + planets[i].getName() + " has aphelion " + planets[i].getAphelion() +
                    " AU, perihelion " + planets[i].getPerihelion() + " AU and " + planets[i].getNoOfMoons() + " Moons");

            if (planets[i].getNoOfMoons() != 0){
                String[] Moons = planets[i].getMoons();
                for (int j = 0; j < Moons.length; j++){
                    System.out.println("\t" + Moons[j]);
                }
            }

        }
    }
}
