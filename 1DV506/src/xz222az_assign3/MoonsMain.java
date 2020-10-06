package xz222az_assign3;

public class MoonsMain {
    public static void main(String[] args) {
        Planet mars = new Planet("Mars",4,2,1.666,1.382);

        Moon moon1 = new Moon();
        moon1.setName("Phobos");

        Moon moon2 = new Moon();
        moon2.setName("Deimos");

        mars.addMoons(moon1);
        mars.addMoons(moon2);

        String[] Moon = mars.getMoons();

        System.out.print("Moons of " + mars.getName() + ": \n" );
        for (int i = 0; i < Moon.length; i++){
            System.out.println("\t" + Moon[i]);
        }


    }
}
