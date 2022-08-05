package Lection_10.Collections;

public class Client {

    private Basket thisClientBasket;

    Client(Basket thisClientBasket) {
        this.thisClientBasket = thisClientBasket;
    }

    public void showProducts(Basket basket) {
        thisClientBasket.showProducts(basket);
    }

    public void addProduct(String name, int price, int amount) {
        thisClientBasket.addProduct(name, price, amount);
    }

    public void sortProducts(String sortCriterion) {
        thisClientBasket.sortProducts(sortCriterion);
    }

}
