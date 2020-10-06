package xz222az_assign3;

public class Enemy {
    private String name;
    private int XP;
    private int attack;
    private int defence;
    Hero hero;
    Dice dice;

    public Enemy(){
    }
    public Enemy(String n,int xp){
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
        XP = XP - hero.getAttack();
        return XP;
    }
}
