package pl.sdacademy.java.advanced.exercises.day3.task32;

import java.io.*;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class Task32 {

    public static void main(String[] args) {
        Path dirPath = Path.of("src/pl/sdacademy/java/advanced/exercises/day3/task32");
        Path outputFile = dirPath.resolve("cars.txt");
        List<Car> cars = List.of(
                new Car("Volvo", 300_000, true),
                new Car("BMW", 150_000, false),
                new Car(null, 100_000, false)
        );
        save(outputFile, cars);
        List<Car> result = read(outputFile);
        System.out.println("Result: " + result);
        /*
        zapisać do pliku listę samochodów -> List<Car>
        odczytać z pliku listę samochodów -> List<Car>
         */
    }

    private static void save(Path file, List<Car> content) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file.toFile()))) {
            oos.writeObject(content);
        } catch(IOException ex) {
            System.out.println(ex);
        }
    }

    private static List<Car> read(Path file) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file.toFile()))) {
            return (List<Car>) ois.readObject();
        } catch(IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return Collections.emptyList();
    }
}
