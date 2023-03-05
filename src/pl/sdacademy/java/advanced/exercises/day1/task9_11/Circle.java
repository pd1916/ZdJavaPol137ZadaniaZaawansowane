package pl.sdacademy.java.advanced.exercises.day1.task9_11;

public class Circle implements Movable, Resizable{
    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    /*
    pierwiastek((x−h)^2+(y−k)^2)=r
     */
    public double getRadius() {
        return Math.sqrt(
                Math.pow(point.getX() - center.getX(), 2)
                + Math.pow(point.getY() - center.getY(), 2)
        );
    }

    /*
    2 * pi * r
     */
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    /*
    pi * r^2
     */
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);
        point.move(moveDirection);
    }

    @Override
    public void resize(double resizeFactor) {
        double newX = ((point.getX() - center.getX()) * resizeFactor) + center.getX();
        point.setX(newX);
        double newY = ((point.getY() - center.getY()) * resizeFactor) + center.getY();
        point.setY(newY);
    }
}
