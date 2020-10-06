package xz222az_assign3;

public class MarsMain {
    public static void main(String[] args) {
        Planet mars = new Planet("Mars",4,2,1.666,1.382);

        System.out.println(mars.getName() + ":");
        System.out.println("\tPosition:   " + mars.getPositionFromSun());
        System.out.println("\tMoons:      " + mars.getNoOfMoons());
        System.out.println("\tAphelion:   " + mars.getAphelion());
        System.out.println("\tPerihelion: " + mars.getPerihelion());

    }
}
