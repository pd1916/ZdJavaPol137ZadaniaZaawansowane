package pl.sdacademy.java.advanced.exercises.day2.task26;

import java.util.List;

public class Model {
    private final String name;
    private final int productionStartYear;
    private final List<Car> cars;

    public Model(String name, int productionStartYear, List<Car> cars) {
        this.name = name;
        this.productionStartYear = productionStartYear;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public int getProductionStartYear() {
        return productionStartYear;
    }

    public List<Car> getCars() {
        return cars;
    }
}