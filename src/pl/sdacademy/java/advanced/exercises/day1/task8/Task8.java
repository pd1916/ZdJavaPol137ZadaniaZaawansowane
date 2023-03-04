package pl.sdacademy.java.advanced.exercises.day1.task8;

public class Task8 {
    public static void main(String[] args) {
        Validator validator = new ParcelValidator();
        Parcel parcelNotExpress = new Parcel(35, 40, 45, 28, false);
        Parcel parcelExpress = new Parcel(35, 40, 45, 13, true);

        System.out.println(validator.validate(parcelNotExpress));
        System.out.println(validator.validate(parcelExpress));
    }
}
