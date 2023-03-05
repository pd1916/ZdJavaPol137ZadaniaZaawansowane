package pl.sdacademy.java.advanced.exercises.day2.task26;

import java.util.List;

public class Manufacturer {
    private final String name;
    private final int yearOfCreation;
    List<Model> models;

    public Manufacturer(String name, int yearOfCreation, List<Model> models) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.models = models;
    }

    public String getName() {
        return name;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public List<Model> getModels() {
        return models;
    }
}