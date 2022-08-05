package Lection_17.Java_Design_Patterns.Examples.Prototype;

import java.util.List;

public class DemoPrototypePattern {
    public static void main(String[] args) throws CloneNotSupportedException {
        ToDoList mondayToDoList = new ToDoList();
        mondayToDoList.loadData();
        ToDoList tuesdayToDoList = (ToDoList) mondayToDoList.clone();
        List list = tuesdayToDoList.getToDoList();
        list.add("Отдохнуть (Сколько можно работать то?)");
        ToDoList wednesdayToDoList = (ToDoList) tuesdayToDoList.clone();
        List list1 = wednesdayToDoList.getToDoList();
        list1.remove("Принести то");
        System.out.println("Задачи на понедельник: " + mondayToDoList
                .getToDoList());
        System.out.println("Задачи на вторник: " + list);
        System.out.println("Задачи на среду: " + list1);
    }
}
