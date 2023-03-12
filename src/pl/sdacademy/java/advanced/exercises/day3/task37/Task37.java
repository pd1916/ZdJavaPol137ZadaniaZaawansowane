package pl.sdacademy.java.advanced.exercises.day3.task37;

import pl.sdacademy.java.advanced.exercises.day3.task36.ThreadPlaygroundRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task37 {
    public static void main(String[] args) {
        //Thread t1 = new Thread(new ThreadPlaygroundRunnable("job_1"));
        //t1.start();

        ExecutorService executor = Executors.newFixedThreadPool(20);
        for(int i = 0; i <= 10; i++) {
            executor.execute(new ThreadPlaygroundRunnable("job_1_" + i));
            System.out.println(executor);
        }
        executor.shutdown();
    }
}
