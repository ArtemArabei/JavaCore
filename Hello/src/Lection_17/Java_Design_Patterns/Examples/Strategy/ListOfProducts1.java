package Lection_17.Java_Design_Patterns.Examples.Strategy;

public class ListOfProducts1 extends Products{
    public ListOfProducts1() {
        setSortMethod(new SortByPrice());
    }
}
