package pl.sdacademy.java.advanced.exercises.extras.task3;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static List<Product> pointA(List<Product> products) {
        return products.stream()
                .filter(p -> p.getCategory().equals("Computer"))
                .filter(p -> p.getPrice() > 5000d)
                .collect(Collectors.toList());
    }

    public static List<Product> pointB(List<Product> products) {
        return products.stream()
                .filter(p -> p.getCategory().equals("Computer"))
                .map(p -> new Product(p.getId(), p.getName(), p.getCategory(), p.getPrice()*0.8))
                .collect(Collectors.toList());
    }

    // można rozważyć zwracania Optional<Product>
    public static Product pointC(List<Product> products) {
        return products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Computer"))
                .min(Comparator.comparing(Product::getPrice))
                .get();
//        return products.stream()
//                .filter(p -> p.getCategory().equalsIgnoreCase("Computer"))
//                .sorted(Comparator.comparing(Product::getPrice))
//                .findFirst()
//                .get();
    }

    public static List<Order> pointD(List<Order> orders) {
        return orders.stream()
                .filter(o -> o.getProducts()
                        .stream()
                        .anyMatch(p -> p.getCategory().equalsIgnoreCase("Book"))
                )
                .collect(Collectors.toList());
    }

    public static List<Product> pointE(List<Order> orders) {
        return orders.stream()
                .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2022, 01, 1)) >= 0)
                .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2022, 02, 1)) <= 0)
                .flatMap(o -> o.getProducts().stream())
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<Order> pointF(List<Order> orders) {
        return orders.stream()
                .sorted(Comparator.comparing(Order::getOrderDate).reversed())
                .limit(2)
                .collect(Collectors.toList());
    }

    public static double pointG(List<Order> orders) {
        return orders.stream()
                .sorted(Comparator.comparing(Order::getOrderDate))
                .limit(1)
                .flatMap(o -> o.getProducts().stream())
                .mapToDouble(Product::getPrice)
                .sum();
    }
}