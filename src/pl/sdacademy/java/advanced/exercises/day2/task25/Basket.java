package pl.sdacademy.java.advanced.exercises.day2.task25;

public class Basket {
    private int numberOfItems;

    public Basket() {
        this.numberOfItems = 0;
    }

    public void addToBasket() throws BasketFullCheckedException {
        if(numberOfItems == 10) {
            throw new BasketFullCheckedException("Too many items in the basket");
        }
        numberOfItems++;
    }

    public void removeFromBasket() throws BasketEmptyCheckedException {
        if(numberOfItems == 0) {
            throw new BasketEmptyCheckedException("Can't remove item from empty basket");
        }
        numberOfItems--;
    }
}
