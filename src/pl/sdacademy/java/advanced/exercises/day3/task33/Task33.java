package pl.sdacademy.java.advanced.exercises.day3.task33;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Task33 {
    public static void main(String[] args) {
        Path dir = Path.of("src/pl/sdacademy/java/advanced/exercises/day3/task33");
        List<String> names = ImageFinder.find(dir);
        System.out.println(names);
    }
}
