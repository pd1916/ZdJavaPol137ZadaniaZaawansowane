package pl.sdacademy.java.advanced.exercises.day3.task36;

public class Task36 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadPlaygroundRunnable("job_1"));
        Thread t2 = new Thread(new ThreadPlaygroundRunnable("job_2"));

        t1.start();
        t1.join();
        t2.start();
    }
}
