package pl.sdacademy.java.advanced.exercises.day1.task9_11;

public class Point2D implements Movable{
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        /*
        Point2D(0,3)
        MoveDirection(3,-2)
        Point2D(3, 1)
        */
        x += moveDirection.getX();
        y += moveDirection.getY();
    }
}
