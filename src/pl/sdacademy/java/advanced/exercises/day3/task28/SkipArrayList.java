package pl.sdacademy.java.advanced.exercises.day3.task28;

import java.util.ArrayList;
import java.util.List;

public class SkipArrayList<E> extends ArrayList<E> {

    public List<E> getEveryNthElement(int startIndex, int skip) {
        List<E> everyNthElements = new ArrayList<>();
        for(int i = startIndex; i < size(); i += skip + 1) {
            everyNthElements.add(get(i));
        }
        return everyNthElements;
    }
}
