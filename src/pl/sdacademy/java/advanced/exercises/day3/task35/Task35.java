package pl.sdacademy.java.advanced.exercises.day3.task35;

import pl.sdacademy.java.advanced.exercises.day3.task34.MyThread;

public class Task35 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        System.out.println(Thread.activeCount());
    }
}
