package Lection_17.Java_Design_Patterns.Examples.Strategy;

public class Products {
    private SortMethod sortMethod;

    public void setSortMethod(SortMethod sortMethod) {
        this.sortMethod = sortMethod;
    }

    public void sortProducts() {
        sortMethod.sort();
    }
}
