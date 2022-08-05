package Lection_17.Java_Design_Patterns.Examples.Composite;

import java.util.ArrayList;
import java.util.List;

public class Director extends Manager{
    public String name;
    List<Employee> employees = new ArrayList<>();

    Director (String name){
        super(name);
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(name);
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }
}
