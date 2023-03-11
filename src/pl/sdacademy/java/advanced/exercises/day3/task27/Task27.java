package pl.sdacademy.java.advanced.exercises.day3.task27;

public class Task27 {
    public static void main(String[] args) {
        Joiner<String> joiner = new Joiner<>("|");
        String result = joiner.join("a", "b", "c", "d");
        System.out.println(result);

        Joiner<Double> joiner2 = new Joiner<>("+");
        result = joiner2.join(2.0, 5.0, 6.3);
        System.out.println(result);

        Joiner<Boolean> joiner3 = new Joiner<>("?");
        result = joiner3.join(true, false, true);
        System.out.println(result);

        Joiner<Person> joiner4 = new Joiner<>("_");
        result = joiner4.join(
                new Person("Ala", "Nowak", 30),
                new Person("Jan", "Kowalski", 40)
        );
        System.out.println(result);
    }
}
