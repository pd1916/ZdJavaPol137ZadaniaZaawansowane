package pl.sdacademy.java.advanced.exercises.day2.task_20_21_22;

public class Main {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        int rectanglePerimeter = rectangle.calculatePerimeter();
        System.out.println("rectanglePerimeter: " + rectanglePerimeter);

        Shape triangle = new Triangle(2, 3, 4);
        int trianglePerimeter = triangle.calculatePerimeter();
        System.out.println("trianglePerimeter: " + trianglePerimeter);

        Shape hexagon = new Hexagon(2);
        int hexagonPerimeter = hexagon.calculatePerimeter();
        System.out.println("hexagonPerimeter: " + hexagonPerimeter);

        Shape cube = new Cube(3);
        double cubeVolume = ((Cube) cube).calculateVolume();
        int cubePerimeter = cube.calculatePerimeter();
        System.out.println("cubePerimeter: " + cubePerimeter);
        System.out.println("cubeVolume: " + cubeVolume);
        System.out.println("Fill: " + ((Cube) cube).fill(27.1));
    }
}
