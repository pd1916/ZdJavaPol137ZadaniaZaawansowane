package pl.sdacademy.java.advanced.exercises.extras.task2;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task2 {

    public static List<Programmer> pointA(List<Programmer> programmers) {
        return programmers.stream()
                .filter(p -> p.getPerson().getSex().equals("Men"))
                .collect(Collectors.toList());
    }

    public static List<Programmer> pointB(List<Programmer> programmers) {
        return programmers.stream()
                .filter(p -> p.getPerson().getAge() >= 18)
                .filter(p -> p.getProgrammingLanguages().contains("Java"))
                .collect(Collectors.toList());
    }

    public static List<Programmer> pointC(List<Programmer> programmers) {
        return programmers.stream()
                .filter(p -> p.getProgrammingLanguages().size() > 1)
                .collect(Collectors.toList());
    }

    public static List<Programmer> pointD(List<Programmer> programmers) {
        return programmers.stream()
                .filter(p -> p.getPerson().getSex().equals("Women"))
                .filter(p -> p.getProgrammingLanguages().contains("Java") && p.getProgrammingLanguages().contains("C#"))
                .collect(Collectors.toList());
    }

    public static List<String> pointE(List<Programmer> programmers) {
        return programmers.stream()
                .filter(p -> p.getPerson().getSex().equals("Men"))
                .map(p -> p.getPerson().getName())
                .collect(Collectors.toList());
    }

    public static Set<String> pointF(List<Programmer> programmers) {
        return programmers.stream()
                .map(Programmer::getProgrammingLanguages)
                .flatMap(List::stream)
                .collect(Collectors.toSet());
    }

    public static List<String> pointG(List<Programmer> programmers) {
        return programmers.stream()
                .filter(p -> p.getProgrammingLanguages().size() > 1)
                .map(p -> p.getPerson().getLastname())
                .collect(Collectors.toList());
    }

    public static boolean pointH(List<Programmer> programmers) {
        return programmers.stream()
                .anyMatch(p -> p.getProgrammingLanguages().size() == 0);
    }

    public static long pointI(List<Programmer> programmers) {
        return programmers.stream()
                .filter(p -> p.getPerson().getSex().equals("Women"))
                .filter(p -> !p.getProgrammingLanguages().isEmpty())
                .map(Programmer::getProgrammingLanguages)
                .distinct()
                .count();
    }


}