package pl.sdacademy.java.advanced.exercises.day2.task_20_21_22;

public class Hexagon extends Shape{
    private final int a;

    public Hexagon(int a) {
        this.a = a;
    }

    @Override
    public int calculatePerimeter() {
        return 6 * a;
    }
}
