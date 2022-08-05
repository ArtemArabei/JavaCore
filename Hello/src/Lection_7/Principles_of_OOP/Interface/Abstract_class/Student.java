package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public class Student extends User {

    int grant = 4;

    Student(String name) {
        super(name);
    }

    @Override
    protected int getIncome() {
        if (grant > 0) {
            return grant;
        } else return 0;
    }

}
