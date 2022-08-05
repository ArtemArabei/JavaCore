package Lection_17.Java_Design_Patterns.Examples;

import java.time.LocalDate;

public class TestDateDemo {
    public static void main(String[] args) {
        DateDemo date1 = DateDemo.getInstance("������� " + LocalDate.now());
        DateDemo date2 = DateDemo.getInstance("������ "
                + LocalDate.now().plusDays(1));
        date1.printDate();
        date2.printDate();
    }
}