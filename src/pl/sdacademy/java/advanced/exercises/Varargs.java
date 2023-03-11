package pl.sdacademy.java.advanced.exercises;

import java.util.ArrayList;
import java.util.List;

public class Varargs {

    public static void main(String[] args) {
//        print(List.of("ala", "ma", "kota"));
//        System.out.println("***");
//        print(new String[]{"ala", "ma", "kota"});
//        System.out.println("***");
        printUsingVarargs("ala", "ma", "kota");
    }

    private static void print(List<String> inputs) {
        for(String input : inputs) {
            System.out.println(input);
        }
    }

    private static void print(String[] inputs) {
        for(String input : inputs) {
            System.out.println(input);
        }
    }

    private static void printUsingVarargs(String secondvalue, String... inputs) {
        for(String input : inputs) {
            System.out.println(input);
        }
    }
}
