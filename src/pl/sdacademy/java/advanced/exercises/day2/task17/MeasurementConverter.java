package pl.sdacademy.java.advanced.exercises.day2.task17;

public class MeasurementConverter {
    public float convert(float value, ConversionType conversionType) {
        /*
        value = 10
        type = cm na cale
        10 cm ile to cali?
        10cm * przelicznik => 10cm * 0,39
         */
        return value * conversionType.getValue();
    }

    public float convert(float value, ConversionTypeWithFunction conversionType) {
        return conversionType.getConversionType().apply(value);
    }
}
