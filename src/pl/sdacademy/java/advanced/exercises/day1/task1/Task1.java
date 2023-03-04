package pl.sdacademy.java.advanced.exercises.day1.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {
        List<String> unsorted = List.of("A", "B", "X", "D", "C");
        List<String> result = sortUsingAnonymousClass(unsorted);
        System.out.println(result);

        result = sortUsingOwnComparator(unsorted);
        System.out.println(result);

        result = sortUsingLambda(unsorted);
        System.out.println(result);

        result = sortUsingStream(unsorted);
        System.out.println(result);

        result = sortUsingList(unsorted);
        System.out.println(result);
    }

    private static List<String> sortUsingAnonymousClass(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                /*
                o1, o2
                -> gdy o1 większe od o2 zwraca +
                -> gdy o1 mniejsze od o2 zwraca -
                -> gdy o1 równe o2 zwraca 0
                 */
                return -o1.compareTo(o2);
                //return o2.compareTo(o1);
            }
        });
        return sorted;
    }

    private static List<String> sortUsingOwnComparator(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new MyOwnComparator());
        return sorted;
    }

    private static List<String> sortUsingLambda(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, (o1, o2) -> -o1.compareTo(o2));
        return sorted;
    }

    private static List<String> sortUsingStream(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        return sorted
                .stream()
                .sorted(Comparator.reverseOrder())
                //.collect(Collectors.toList())
                .toList();
    }

    private static List<String> sortUsingList(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        sorted.sort(Comparator.reverseOrder());
        return sorted;
    }
}
