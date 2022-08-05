package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public class Person2 extends Student {

    int salary = 6;

    Person2(String name) {
        super(name);
    }

    public int getIncome() {
        if (salary > 0) {
            return grant + salary;
        } else {
            if (grant > 0) {
                return grant;
            } else return 0;
        }
    }

    public static void main(String[] args) {
        Person2 ivan = new Person2("Иван");
        System.out.println("Доход студента по имени " + ivan.name
                + " составляет " + ivan.getIncome());
    }
}
