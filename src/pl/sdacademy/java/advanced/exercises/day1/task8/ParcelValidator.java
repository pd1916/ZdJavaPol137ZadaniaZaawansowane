package pl.sdacademy.java.advanced.exercises.day1.task8;


public class ParcelValidator implements Validator {
    private static final int TOTAL_MAX_LENGTH = 300;
    private static final int SINGLE_MAX_LENGTH = 30;
    private static final int MAX_WEIGHT_FOR_EXPRESS = 15;
    private static final int MAX_WEIGHT_FOR_NOT_EXPRESS = 30;

    @Override
    public boolean validate(Parcel parcel) {
        return isXYZLessThan300(parcel)
                && isEachDimensionAreMoreThan30(parcel)
                && isWeightIsCorrect(parcel);
    }

    private boolean isWeightIsCorrect(Parcel parcel) {
        return (parcel.isExpress() && parcel.getWeight() <= MAX_WEIGHT_FOR_EXPRESS)
                || (!parcel.isExpress() && parcel.getWeight() <= MAX_WEIGHT_FOR_NOT_EXPRESS);
    }

    private boolean isEachDimensionAreMoreThan30(Parcel parcel) {
        return parcel.getxLength() >= SINGLE_MAX_LENGTH
                && parcel.getyLength() >= SINGLE_MAX_LENGTH
                && parcel.getzLength() >= SINGLE_MAX_LENGTH;
    }

    private boolean isXYZLessThan300(Parcel parcel) {
        return (parcel.getxLength() + parcel.getyLength() + parcel.getzLength()) <= TOTAL_MAX_LENGTH;
    }
}