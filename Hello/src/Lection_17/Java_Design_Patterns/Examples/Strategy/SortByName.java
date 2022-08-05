package Lection_17.Java_Design_Patterns.Examples.Strategy;

public class SortByName implements SortMethod{
    @Override
    public void sort() {
        System.out.println("Товары отсортированы по названию");
    }
}
