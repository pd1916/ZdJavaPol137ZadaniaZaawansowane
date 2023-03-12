package pl.sdacademy.java.advanced.exercises.day3.task34;

public class MyThread extends Thread {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("[" + name + "]" + " Początek wątku");
        System.out.println("[" + name + "]" + " Idę sobie spać");
        try {
            Thread.sleep(10000);
        } catch(InterruptedException e) {
            System.out.println("[" + name + "]" + " ktoś mi przeszkodził!");
        }
        System.out.println("[" + name + "]" + " Wstałem");
    }
}
