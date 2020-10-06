package xz222az_assign3;

public class Point {
    private int x;
    private int y;

    public Point(){
    }
    public Point(int x1, int y1){
        x = x1;
        y = y1;
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }
    public boolean isEqualTo(Point p2){
        if (x == p2.x && y == p2.y){
            return true;
        }
        else
            return false;
    }
    public double distanceTo(Point p2){
        return Math.sqrt(Math.pow(x - p2.x,2) + Math.pow(y - p2.y,2));
    }
    public void move(int xm, int ym){
        x = x + xm;
        y = y + ym;
    }
    public void moveToXY(int xt,int yt){
        x = xt;
        y = yt;
    }
}
