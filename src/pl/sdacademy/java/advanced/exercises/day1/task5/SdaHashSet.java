package pl.sdacademy.java.advanced.exercises.day1.task5;

import java.util.HashMap;
import java.util.Map;

public class SdaHashSet<T> {

    private final Map<T, ?> map = new HashMap<>();

    public void add(T object) {
        map.put(object, null);
    }

    public void remove(T object) {
        map.remove(object);
    }

    public int size() {
        return map.size();
    }

    public boolean contains(T object) {
        return map.containsKey(object);
    }

    public void clear() {
        map.clear();
    }
}