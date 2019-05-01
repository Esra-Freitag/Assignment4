package svg.shape;

public class Point2D extends Shape {


    private double x;
    private double y;

    public Point2D(double x, double y){
        super("point2d");
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
        return "(" + Double.toString(x) + ", " + Double.toString(y) + ")";
    }
}
