package pl.sdacademy.java.advanced.exercises.day1.task5;

public class Task5 {
    public static void main(String[] args) {

        SdaHashSet<String> mySet = new SdaHashSet<>();
        mySet.add("A");
        mySet.add("A");
        mySet.add("B");
        System.out.println(mySet.size());
        System.out.println(mySet.contains("A"));
        mySet.remove("A");
        System.out.println(mySet.contains("A"));
        mySet.clear();
        System.out.println(mySet.size());
    }
}
