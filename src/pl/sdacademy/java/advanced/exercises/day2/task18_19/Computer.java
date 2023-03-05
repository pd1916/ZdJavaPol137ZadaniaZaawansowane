package pl.sdacademy.java.advanced.exercises.day2.task18_19;

import java.util.Objects;

public class Computer {
    private final String cpu;
    private final int ram;
    private final String manufacturer;
    private final String model;

    public Computer(String cpu, int ram, String companyName, String model) {
        this.cpu = cpu;
        this.ram = ram;
        this.manufacturer = companyName;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return
                ram == computer.ram &&
                        Objects.equals(cpu, computer.cpu) &&
                        Objects.equals(manufacturer, computer.manufacturer) &&
                        Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, manufacturer, model);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", companyName='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
