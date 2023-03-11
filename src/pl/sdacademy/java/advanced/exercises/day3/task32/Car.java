package pl.sdacademy.java.advanced.exercises.day3.task32;

import java.io.Serializable;

public class Car implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String model;
    private final double price;
    private final boolean isNew;

    public Car(String model, double price, boolean isNew) {
        this.model = model;
        this.price = price;
        this.isNew = isNew;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", isNew=" + isNew +
                '}';
    }
}
