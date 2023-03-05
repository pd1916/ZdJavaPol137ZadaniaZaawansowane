package pl.sdacademy.java.advanced.exercises.day1.task7;

import java.util.ArrayDeque;
import java.util.Deque;

public class WeaponClip {
    // LIFO -> last input, first output -> np Stack, Deque
    // FIFO -> first input, first output -> np Queue
    //private final Stack<String> weaponClip = new Stack<>();
    private final Deque<String> weaponClip = new ArrayDeque<>();
    private final int maxNumberOfBulletInClip;

    public WeaponClip(int clipCapacity) {
        maxNumberOfBulletInClip = clipCapacity;
    }

    public void loadBullet(String bullet) {
        if(maxNumberOfBulletInClip == weaponClip.size()) {
            throw new IllegalArgumentException("Clip is fill");
        }
        weaponClip.push(bullet);
    }

    public boolean isLoaded() {
        return weaponClip.size() >= 1;
        //return !weaponClip.empty(); // dla Stack
        //return !weaponClip.isEmpty() // dla Deque
    }

    public void shot() {
        if(isLoaded()) {
            System.out.println(weaponClip.pop());
        } else {
            System.out.println("Clip is empty");
        }
    }
}
