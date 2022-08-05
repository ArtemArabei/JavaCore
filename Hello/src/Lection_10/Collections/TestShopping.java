package Lection_10.Collections;

import java.util.ArrayList;
import java.util.List;

public class TestShopping {

    public static void main(String[] args) {
        List<Product> thisClientProducts = new ArrayList<>();
        Basket thisClientBasket = new Basket(thisClientProducts);
        Client clientTom = new Client(thisClientBasket);
        clientTom.addProduct("Bread", 3, 2);
        clientTom.addProduct("Milk", 2, 7);
        clientTom.addProduct("Meat", 20, 3);
        clientTom.addProduct("Cheese", 17, 4);
        clientTom.addProduct("Potato", 1, 5);
        clientTom.showProducts(thisClientBasket);
        clientTom.addProduct("Sugar", 5, 1);
        clientTom.showProducts(thisClientBasket);
        clientTom.addProduct("Milk", 2, 7);
        clientTom.showProducts(thisClientBasket);
        clientTom.addProduct("Sugar", 5, 12);
        clientTom.showProducts(thisClientBasket);
        clientTom.sortProducts("name");
        clientTom.showProducts(thisClientBasket);
        clientTom.sortProducts("price");
        clientTom.showProducts(thisClientBasket);
        clientTom.sortProducts("amount");
        clientTom.showProducts(thisClientBasket);
    }
}

