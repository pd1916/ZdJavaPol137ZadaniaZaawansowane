package pl.sdacademy.java.advanced.exercises.day2.task16;

import java.util.Arrays;

public enum Runner {
    BEGINNER(1024, Integer.MAX_VALUE),
    INTERMEDIATE(512, 1024),
    ADVANCED(0, 512);

    private final int minMinutes;
    private final int maxMinutes;

    private static final Runner[] VALUES = values();

    Runner(int minMinutes, int maxMinutes) {
        this.minMinutes = minMinutes;
        this.maxMinutes = maxMinutes;
    }

    public static Runner getFitnessLevel(int runningTime) {
        return Arrays.stream(VALUES)
                .filter(runner -> runningTime > runner.minMinutes && runningTime <= runner.maxMinutes)
                .findFirst()
                //.orElse(BEGINNER);
                .orElseThrow(() -> new IllegalArgumentException("Podany czas jest spoza możliwych przedziałów"));
    }
}
