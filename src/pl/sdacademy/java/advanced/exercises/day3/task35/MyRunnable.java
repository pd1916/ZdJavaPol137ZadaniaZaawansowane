package pl.sdacademy.java.advanced.exercises.day3.task35;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
