package pl.sdacademy.java.advanced.exercises.day3.task27;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Joiner<T> {
    private final String delimiter;

    public Joiner(String delimiter) {
        this.delimiter = delimiter;
    }

    public String join(T... items) {
        return Stream.of(items)
                //.map(t -> t.toString())
                .map(T::toString)
                .collect(Collectors.joining(delimiter));
    }
}
