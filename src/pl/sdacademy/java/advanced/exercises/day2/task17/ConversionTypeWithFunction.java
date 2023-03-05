package pl.sdacademy.java.advanced.exercises.day2.task17;

import java.util.function.Function;

public enum ConversionTypeWithFunction {
    METERS_TO_YARDS(v -> 1.09f * v),
    YARDS_TO_METERS(v -> v / 1.09f),
    CENTIMETERS_TO_INCHES(v -> v * 0.39f),
    INCHES_TO_CENTIMETER(v -> v / 0.39f),
    KILOMETERS_TO_MILES(v -> v * 0.62f),
    MILES_TO_KILOMETERS(v -> v / 0.62f);

    private final Function<Float, Float> conversionType;

    ConversionTypeWithFunction(Function<Float, Float> conversionType) {
        this.conversionType = conversionType;
    }

    public Function<Float, Float> getConversionType() {
        return conversionType;
    }
}
