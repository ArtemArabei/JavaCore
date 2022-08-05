package Lection_17.Java_Design_Patterns.Examples.Composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
    public String name;
    List<Employee> employees = new ArrayList<>();

    Manager (String name){
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