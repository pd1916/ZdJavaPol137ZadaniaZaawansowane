package pl.sdacademy.java.advanced.exercises.day3.task31;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Task31 {
    public static void main(String[] args) {
        Map<String, Integer> counter = new HashMap<>();
        Path dirPath = Path.of("src/main/java/pl/sdacademy/java/advanced/exercises/day3/task31");
        Path inputFile = dirPath.resolve("course.txt");
        try(Stream<String> lines = Files.lines(inputFile)) {
            lines
                    .map(line -> line.replaceAll("[^\\p{L}\\s\\d]", "")) // \\p{L} -> single letter
                    .map(line -> line.split(" "))
                    .flatMap(Stream::of)
                    .forEach(s -> counter.compute(s, (k, v) -> v == null ? 1 : v + 1));
        } catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println(counter);
    }
}
