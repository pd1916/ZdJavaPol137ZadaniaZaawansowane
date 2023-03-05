package pl.sdacademy.java.advanced.exercises.day2.task_20_21_22;

public class Cube extends Shape3D implements Fillable {
    private final int a;

    public Cube(int a) {
        this.a = a;
    }

    @Override
    public int calculatePerimeter() {
        // 12 * a
        return 12 * a;
    }

    @Override
    public double calculateVolume() {
        //a^3
        return Math.pow(a, 3);
    }


    @Override
    public int fill(double volume) {
        double maxVolume = calculateVolume();
        if(maxVolume == volume) {
            return 0; //wlaliśmy idealną ilość wody
        } else if(maxVolume > volume) {
            return -1; // wlaliśmy zbyt mało wody
        }
        return 1; // wlaliśmy za dużo wody
    }
}
