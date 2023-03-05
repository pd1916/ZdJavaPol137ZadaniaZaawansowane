package pl.sdacademy.java.advanced.exercises.extras.task2;

import java.util.List;
import java.util.Objects;

public class Programmer {
    private final Person person;
    private final List<String> programmingLanguages;

    public Programmer(Person person, List<String> programmingLanguages) {
        this.person = person;
        this.programmingLanguages = programmingLanguages;
    }

    public Person getPerson() {
        return person;
    }

    public List<String> getProgrammingLanguages() {
        return programmingLanguages;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Programmer that = (Programmer) o;
        return Objects.equals(person, that.person) && Objects.equals(programmingLanguages, that.programmingLanguages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, programmingLanguages);
    }
}