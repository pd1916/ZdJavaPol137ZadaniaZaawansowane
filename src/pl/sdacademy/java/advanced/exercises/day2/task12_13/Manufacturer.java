package pl.sdacademy.java.advanced.exercises.day2.task12_13;

import java.util.Objects;

public class Manufacturer {
    private String name;
    private int foundedYear;
    private String country;

    public Manufacturer(String name, int foundedYear, String country) {
        this.name = name;
        this.foundedYear = foundedYear;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getFoundedYear() {
        return foundedYear;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return foundedYear == that.foundedYear && Objects.equals(name, that.name) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, foundedYear, country);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Manufacturer{");
        sb.append("name='").append(name).append('\'');
        sb.append(", foundedYear=").append(foundedYear);
        sb.append(", country='").append(country).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
