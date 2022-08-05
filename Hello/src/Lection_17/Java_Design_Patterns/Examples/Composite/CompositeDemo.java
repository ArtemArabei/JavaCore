package Lection_17.Java_Design_Patterns.Examples.Composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Employee staff = new Staff("a");
        Employee alex = new Worker("Alex");
        Employee igor = new Worker("Igor");
        Employee maxim = new Manager("Maxim");
        Employee boris = new Director("Boris");
        staff.add(alex);
        staff.add(igor);
        staff.add(maxim);
        staff.add(boris);
        staff.printName();
    }
}


