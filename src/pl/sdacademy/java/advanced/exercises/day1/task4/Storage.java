package pl.sdacademy.java.advanced.exercises.day1.task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    private final Map<String, List<String>> storage;

    public Storage() {
        this.storage = new HashMap<>();
    }

    public void addToStorage(String key, String value) {
        if(storage.containsKey(key)) {
            storage.get(key).add(value);
        } else {
            List<String> values = new ArrayList<>();
            values.add(value);
            storage.put(key, values);
        }
    }

    public void printValues(String key) {
        System.out.println(storage.get(key));
    }

    public void findValues(String searchedValue) {
        List<String> keys = storage
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(searchedValue))
                .map(entry -> entry.getKey())
                //.map(Map.Entry::getKey)
                .toList();
        System.out.println(keys);
    }
}
