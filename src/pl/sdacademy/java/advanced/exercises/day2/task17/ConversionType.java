package pl.sdacademy.java.advanced.exercises.day2.task17;

public enum ConversionType {
    METERS_TO_YARDS(1.09f),
    YARDS_TO_METERS(0.91f),
    CENTIMETERS_TO_INCHES(0.39f),
    INCHES_TO_CENTIMETER(2.54f),
    KILOMETERS_TO_MILES(0.62f),
    MILES_TO_KILOMETERS(1.61f);

    private final float value;

    ConversionType(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }
}
