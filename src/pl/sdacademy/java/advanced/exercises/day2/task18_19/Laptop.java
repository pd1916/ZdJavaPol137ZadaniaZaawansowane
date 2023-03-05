package pl.sdacademy.java.advanced.exercises.day2.task18_19;

import java.util.Objects;

public class Laptop extends Computer {
    private final int battery;

    public Laptop(String cpu, int ram, String companyName, String model, int battery) {
        super(cpu, ram, companyName, model);
        this.battery = battery;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        if(!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return battery == laptop.battery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "battery=" + battery +
                "} " + super.toString();
    }
}
