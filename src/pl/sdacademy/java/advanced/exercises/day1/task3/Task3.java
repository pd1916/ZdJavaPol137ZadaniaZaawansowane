package pl.sdacademy.java.advanced.exercises.day1.task3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> input = new LinkedHashMap<>();
        input.put("Java", 18);
        input.put("Python", 1);
        input.put("C", 10);
        input.put("Scala", 7);
        input.put("PHP", 0);
        //print(input);
        printWithStream(input);
    }

    private static void print(Map<String, Integer> input) {
        int i = 1;
        for(Map.Entry<String, Integer> entry : input.entrySet()) {
            if(i == input.size()) {
                System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue() + ".");
            } else {
                System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue() + ",");
            }
            i++;
        }
    }

    private static void printWithStream(Map<String, Integer> input) {
        String result = input
                .entrySet()
                .stream()
                .map(entry -> "Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue())
                .collect(Collectors.joining(",\n", "", "."));
        System.out.println(result);
    }
}
