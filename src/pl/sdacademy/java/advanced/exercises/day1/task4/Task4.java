package pl.sdacademy.java.advanced.exercises.day1.task4;

public class Task4 {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("0", "value0_1");
        storage.addToStorage("0", "value0_2");
        storage.addToStorage("1", "value1_1");
        storage.addToStorage("1", "value0_1");
        storage.addToStorage("2", "value2_1");

        System.out.println("printValues");
        storage.printValues("2");

        System.out.println("findValues");
        storage.findValues("value0_2");
    }
}
