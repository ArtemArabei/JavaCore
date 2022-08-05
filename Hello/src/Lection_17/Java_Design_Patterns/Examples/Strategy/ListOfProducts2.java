package Lection_17.Java_Design_Patterns.Examples.Strategy;

public class ListOfProducts2 extends Products{
    public ListOfProducts2() {
        setSortMethod(new SortByName());
    }
}
