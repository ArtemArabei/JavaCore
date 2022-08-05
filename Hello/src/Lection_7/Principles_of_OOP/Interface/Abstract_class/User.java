package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public abstract class User {

    String name;

    User (String name) {
        this.name = name;
    }

    protected abstract int getIncome();

}
