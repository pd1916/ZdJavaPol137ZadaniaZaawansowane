package pl.sdacademy.java.advanced.exercises.day3.task28;

import java.util.List;

public class Task28 {
    public static void main(String[] args) {
        SkipArrayList<String> skipArrayList = new SkipArrayList<>();
        skipArrayList.addAll(List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "l"));
        List<String> everyNthElement = skipArrayList.getEveryNthElement(2, 3);
        System.out.println(everyNthElement);

        SkipArrayList<Integer> skipArrayList_2 = new SkipArrayList<>();
        skipArrayList_2.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
        List<Integer> everyNthElement_2 = skipArrayList_2.getEveryNthElement(5, 2);
        System.out.println(everyNthElement_2);
    }
}
