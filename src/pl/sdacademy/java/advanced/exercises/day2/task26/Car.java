package pl.sdacademy.java.advanced.exercises.day2.task26;

public class Car {
    private final String name;
    private final String description;
    private final CarType carType;

    public Car(String name, String description, CarType carType) {
        this.name = name;
        this.description = description;
        this.carType = carType;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public CarType getCarType() {
        return carType;
    }
}