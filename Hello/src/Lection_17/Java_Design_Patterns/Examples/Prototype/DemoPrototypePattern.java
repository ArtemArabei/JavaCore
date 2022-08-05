package Lection_17.Java_Design_Patterns.Examples.Prototype;

import java.util.List;

public class DemoPrototypePattern {
    public static void main(String[] args) throws CloneNotSupportedException {
        ToDoList mondayToDoList = new ToDoList();
        mondayToDoList.loadData();
        ToDoList tuesdayToDoList = (ToDoList) mondayToDoList.clone();
        List list = tuesdayToDoList.getToDoList();
        list.add("��������� (������� ����� �������� ��?)");
        ToDoList wednesdayToDoList = (ToDoList) tuesdayToDoList.clone();
        List list1 = wednesdayToDoList.getToDoList();
        list1.remove("�������� ��");
        System.out.println("������ �� �����������: " + mondayToDoList
                .getToDoList());
        System.out.println("������ �� �������: " + list);
        System.out.println("������ �� �����: " + list1);
    }
}
