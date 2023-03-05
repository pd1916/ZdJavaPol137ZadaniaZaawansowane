package pl.sdacademy.java.advanced.exercises.day2.task12_13;

import java.util.List;

public class Task12 {
    public static void main(String[] args) {
        Manufacturer benz = new Manufacturer("Benz", 1883, "Germany");
        Manufacturer mercedes = new Manufacturer("Mercedes", 1901, "Germany");
        Manufacturer volvo = new Manufacturer("Volvo", 1926, "Sweden");
        Manufacturer fiat = new Manufacturer("Fiat", 1899, "Italy");

        Car x500 = new Car("x500", "Fiat", 35_000, 2010, List.of(fiat), EngineType.S3);
        Car gls_1 = new Car("GLS", "Mercedes", 500_000, 2022, List.of(mercedes, benz), EngineType.V12);
        Car gls_2 = new Car("GLS", "Mercedes", 200_000, 2019, List.of(mercedes, benz), EngineType.V8);
        Car xc90_1 = new Car("xc90", "Volvo", 300_000, 2022, List.of(volvo), EngineType.V12);
        Car xc90_2 = new Car("xc90", "Volvo", 150_000, 2018, List.of(volvo), EngineType.V6);
        Car xc60_1 = new Car("xc60", "Volvo", 200_000, 2020, List.of(volvo), EngineType.S6);
        Car xc60_2 = new Car("xc60", "Volvo", 20_00, 1998, List.of(volvo), EngineType.S3);

        CarService carService = new CarService();
        carService.add(x500);
        carService.add(gls_1);
        carService.add(gls_2);
        carService.add(xc90_1);
        carService.add(xc90_2);
        carService.add(xc60_1);
        carService.add(xc60_2);

        System.out.println("getCarsWithV12Engine: " + carService.getCarsWithV12Engine());
        System.out.println("getCarsProducedBefore1999: " + carService.getCarsProducedBefore1999());

//        List<Car> returnedListOfCars = carService.getAll();
//        System.out.println(returnedListOfCars);
//        System.out.println(returnedListOfCars.size());
//
//        carService.add(xc90_1);
//
//        System.out.println(returnedListOfCars);
//        System.out.println(returnedListOfCars.size());
//
//        returnedListOfCars.clear();
    }
}
