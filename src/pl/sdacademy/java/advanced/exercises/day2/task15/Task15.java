package pl.sdacademy.java.advanced.exercises.day2.task15;

public class Task15 {
    public static void main(String[] args) {
        Car car = Car.OPEL;
        for(Car carToCompare : Car.values()) {
            System.out.printf("Czy %s jest szybszy niz %s: %b\n", car, carToCompare, car.isFasterThan(carToCompare));
        }

        car = Car.MERCEDES;
        for(Car carToCompare : Car.values()) {
            System.out.printf("Czy %s jest szybszy niz %s: %b\n", car, carToCompare, car.isFasterThan(carToCompare));
        }

        System.out.printf("Czy %s jest premium: %b\n", car, car.isPremium());
        System.out.printf("Czy %s jest premium: %b\n", Car.OPEL, Car.isPremium(Car.OPEL));
    }
}
