package Lection_17.Java_Design_Patterns.Examples.Prototype;

import java.util.ArrayList;
import java.util.List;

public class ToDoList implements Cloneable {
    private List toDoList;

    public ToDoList() {
        toDoList = new ArrayList();
    }

    public ToDoList(List list) {
        this.toDoList = list;
    }

    public void loadData() {
        toDoList.add("Сделать то");
        toDoList.add("Сделать сё");
        toDoList.add("Сходить туда");
        toDoList.add("Сходить сюда");
        toDoList.add("Принести то");
        toDoList.add("Принести сё");
    }

    public List getToDoList() {
        return toDoList;
    }

    @Override
    public Object clone() {
        List temp = new ArrayList();
        for (Object s : this.getToDoList()) {
            temp.add(s);
        }
        return new ToDoList(temp);
    }
}
