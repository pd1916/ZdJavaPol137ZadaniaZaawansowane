package pl.sdacademy.java.advanced.exercises.day2.task24;

public class Basket {
    private int numberOfItems;

    public Basket() {
        this.numberOfItems = 0;
    }

    public void addToBasket() {
        if(numberOfItems == 10) {
            throw new BasketFullException("Too many items in the basket");
        }
        numberOfItems++;
    }

    public void removeFromBasket() {
        if(numberOfItems == 0) {
            throw new BasketEmptyException("Can't remove item from empty basket");
        }
        numberOfItems--;
    }
}
