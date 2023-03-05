package pl.sdacademy.java.advanced.exercises.day2.task26;

import java.util.List;
import java.util.stream.Collectors;

public class Task26 {

    public static List<Model> point1(List<Manufacturer> manufacturers) {
        return manufacturers.stream()
                .flatMap(man -> man.getModels().stream())
                .collect(Collectors.toList());
    }

    public static List<Car> point2(List<Manufacturer> manufacturers) {
        return manufacturers.stream()
                .flatMap(man -> man.getModels().stream())
                .flatMap(model -> model.getCars().stream())
                .collect(Collectors.toList());
    }

    public static List<String> point3(List<Manufacturer> manufacturers) {
        return manufacturers
                .stream()
                .map(Manufacturer::getName)
                .collect(Collectors.toList());
    }

    public static List<Integer> point4(List<Manufacturer> manufacturers) {
        return manufacturers.stream()
                .map(Manufacturer::getYearOfCreation)
                .collect(Collectors.toList());
    }

    public static List<String> point5(List<Manufacturer> manufacturers) {
        return manufacturers.stream()
                .flatMap(man -> man.getModels().stream())
                .map(Model::getName)
                .collect(Collectors.toList());
    }

    public static List<Integer> point6(List<Manufacturer> manufacturers) {
        return manufacturers.stream()
                .flatMap(man -> man.getModels().stream())
                .map(Model::getProductionStartYear)
                .collect(Collectors.toList());
    }

    public static List<String> point7(List<Manufacturer> manufacturers) {
        return manufacturers.stream()
                .flatMap(man -> man.getModels().stream())
                .flatMap(model -> model.getCars().stream())
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    public static List<String> point8(List<Manufacturer> manufacturers) {
        return manufacturers.stream()
                .flatMap(man -> man.getModels().stream())
                .flatMap(model -> model.getCars().stream())
                .map(Car::getDescription)
                .collect(Collectors.toList());
    }

    public static List<Model> point9(List<Manufacturer> manufacturers) {
        return manufacturers.stream()
                .flatMap(man -> man.getModels().stream())
                .filter(model -> model.getProductionStartYear() % 2 == 0)
                .collect(Collectors.toList());
    }

    public static List<Car> point10(List<Manufacturer> manufacturers) {
        return manufacturers.stream()
                .filter(man -> man.getYearOfCreation() % 2 == 0)
                .flatMap(man -> man.getModels().stream())
                .flatMap(model -> model.getCars().stream())
                .collect(Collectors.toList());
    }

    public static List<Car> point11(List<Manufacturer> manufacturers) {
        return manufacturers.stream()
                .filter(man -> man.getYearOfCreation() % 2 == 1)
                .flatMap(man -> man.getModels().stream())
                .filter(model -> model.getProductionStartYear() % 2 == 0)
                .flatMap(model -> model.getCars().stream())
                .collect(Collectors.toList());
    }

    public static List<Car> point12(List<Manufacturer> manufacturers) {
        return manufacturers.stream()
                .filter(man -> man.getYearOfCreation() % 2 == 0)
                .flatMap(man -> man.getModels().stream())
                .filter(model -> model.getProductionStartYear() % 2 == 1)
                .flatMap(model -> model.getCars().stream())
                .filter(car -> car.getCarType() == CarType.CABRIO)
                .collect(Collectors.toList());
    }
}
