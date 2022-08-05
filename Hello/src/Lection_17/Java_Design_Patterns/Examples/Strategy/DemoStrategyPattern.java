package Lection_17.Java_Design_Patterns.Examples.Strategy;

public class DemoStrategyPattern {
    public static void main(String[] args) {
        ListOfProducts1 list1 = new ListOfProducts1();
        list1.sortProducts();
        list1.setSortMethod(new SortByName());
        list1.sortProducts();
        System.out.println();
        ListOfProducts2 list2 = new ListOfProducts2();
        list2.sortProducts();
        list2.setSortMethod(new SortByPrice());
        list2.sortProducts();
    }
}
