package pl.sdacademy.java.advanced.exercises.day3.task34;

public class Task34 {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println(Thread.activeCount());
        MyThread myThread1 = new MyThread();
        myThread1.start();
        myThread1.join();

        System.out.println("[main] idę sobie spać");
        Thread.sleep(3000);
        System.out.println("[main] Wstałem");
//        System.out.println("[main] przeszkadzam pierwszemu wątkowi");
//        myThread1.interrupt();
//        System.out.println("[main] już poprzeszkadzałem pierwszemu wątkowi");

        MyThread myThread2 = new MyThread();
        myThread2.start();
    }
}
