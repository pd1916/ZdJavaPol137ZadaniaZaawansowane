package pl.sdacademy.java.advanced.exercises.day2.task24;

public class Task24 {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        //basket.addToBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        try {
            basket.removeFromBasket();
        } catch (BasketEmptyException ex) {
            System.out.println("jestem z BasketEmptyException");
        } catch (RuntimeException ex) {
            System.out.println("jestem z RuntimeException");
        }
        System.out.println();
    }
}
