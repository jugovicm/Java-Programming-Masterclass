package udemy;

import static java.lang.Math.sqrt;

public class Point {
    private int x;
    private int y;

    public Point() {
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance (){
        return sqrt((0.0 - x) * (0.0 - x) + (0.0 - y) * (0.0 - y));
    }
    public double distance(int xB, int yB){
        return sqrt((xB - x) * (xB - x) + (yB - y) * (yB - y));
    }

    public double distance(Point p){
        double xB = p.getX();
        double yB = p.getY();
        return sqrt((xB - x) * (xB - x) + (yB - y) * (yB - y));
    }

}
