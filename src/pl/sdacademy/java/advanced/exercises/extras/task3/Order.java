package pl.sdacademy.java.advanced.exercises.extras.task3;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

public class Order {
    private final Long id;
    private final LocalDate orderDate;
    private final List<Product> products;

    public Order(Long id, List<Product> products, LocalDate orderDate) {
        this.id = id;
        this.orderDate = orderDate;
        this.products = products;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Order.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("orderDate=" + orderDate)
                .add("products=" + products)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(orderDate, order.orderDate) && Objects.equals(products, order.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderDate, products);
    }
}
