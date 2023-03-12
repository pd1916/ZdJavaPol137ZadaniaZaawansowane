package pl.sdacademy.java.advanced.exercises.day3.task33;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ImageFinder {

    public static List<String> find(Path directory) {
        try(Stream<Path> walk = Files.walk(directory)) {
            return walk
                    .map(path -> path.toFile().getName())
                    .filter(name -> name.endsWith(".png") || name.endsWith(".jpg"))
                    .toList();
        } catch(IOException e) {
            System.out.println("Exception: " + e);
        }
        return Collections.emptyList();
    }
}
