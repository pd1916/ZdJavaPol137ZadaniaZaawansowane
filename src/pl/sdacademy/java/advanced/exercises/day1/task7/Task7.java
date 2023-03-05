package pl.sdacademy.java.advanced.exercises.day1.task7;

public class Task7 {
    public static void main(String[] args) {
        WeaponClip weaponClip = new WeaponClip(3);
        System.out.println("IsLoaded? " + weaponClip.isLoaded());
        weaponClip.loadBullet("1");
        weaponClip.loadBullet("2");
        weaponClip.loadBullet("3");
        //weaponClip.loadBullet("4");
        System.out.println("IsLoaded? " + weaponClip.isLoaded());
        System.out.println("***");
        weaponClip.shot();
        weaponClip.shot();
        weaponClip.shot();
        System.out.println("IsLoaded? " + weaponClip.isLoaded());
        weaponClip.shot();
    }
}
