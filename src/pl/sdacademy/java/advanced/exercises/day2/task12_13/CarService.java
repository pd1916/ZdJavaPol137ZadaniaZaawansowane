package pl.sdacademy.java.advanced.exercises.day2.task12_13;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private final List<Car> cars = new ArrayList<>();

    public void add(Car car) {
        cars.add(car);
    }

    public void remove(Car car) {
        cars.remove(car);
    }

    public List<Car> getAll() {
        //return cars; // cały czas operujemy na tej samej liscie cars
        //return List.copyOf(cars); // tworzy niemodyfikowalną listę
        return new ArrayList<>(cars); // tworzy modyfikowalną listę
    }
}
