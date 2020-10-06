package xz222az_assign3;

public class Hero {
    private String name;
    private int XP;
    private int attack;
    private int defence;
    Enemy enemy;
    Weapon weapon;
    Dice dice;

    public Hero(){
    }
    public Hero(String n,int xp){
        name = n;
        XP = xp;
    }
    public String getName(){
        return name;
    }
    public int getXP(){
        return XP;
    }
    public int getAttack(){
        return attack;
    }
    public void setAttack(int d){
        attack = d;
    }
    public int getDefence(){
        return defence;
    }
    public void setDefence(int def){
        defence = def;
    }
    public int lossXP(){
        XP = XP - enemy.getAttack();
        return XP;
    }
}
