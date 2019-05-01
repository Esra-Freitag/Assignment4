package main;

public class Point2D extends Shape {

    private static String label = "point2D";
    private double x;
    private double y;

    public Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString(){
        return "(" + Integer.toString(x) + ", " + Integer.toString(y) + ")";
    }
}
