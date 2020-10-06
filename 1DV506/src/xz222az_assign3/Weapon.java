package xz222az_assign3;

public class Weapon {
    private String name;
    private int damage;

    public Weapon(){
    }
    public Weapon(String n, int d){
        name = n;
        damage = d;
    }
    public String getName(){
        return name;
    }
    public int getDamage(){
        return damage;
    }
}
