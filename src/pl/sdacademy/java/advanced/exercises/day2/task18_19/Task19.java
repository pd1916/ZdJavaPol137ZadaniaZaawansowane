package pl.sdacademy.java.advanced.exercises.day2.task18_19;

public class Task19 {

    public static void main(String[] args) {
        Computer computer = new Computer("IntelCore i5", 16, "Apple", "MacBook");
        Computer laptop1 = new Laptop("IntelCore i7", 12, "Lenovo", "ABC", 10);
        Computer laptop2 = new Laptop("IntelCore i7", 12, "Lenovo", "ABC", 11);

        System.out.println(computer);
        System.out.println(laptop1);
        System.out.println(laptop2);
    }
}
