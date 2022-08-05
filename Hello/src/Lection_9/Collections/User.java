package Lection_9.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class User {

    private String name;
    private int age;


    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static class NameComparator implements Comparator<User> {
        public int compare(User u1, User u2) {
            return u1.name.compareTo(u2.name);
        }
    }

    public static class AgeComparator implements Comparator<User> {
        public int compare(User u1, User u2) {
            if (u1.age == u2.age) return 0;
            else if (u1.age > u2.age) return -1;
            else return 1;
        }
    }

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Ivan", 25));
        users.add(new User("Ann", 28));
        users.add(new User("Alex", 30));
        users.add(new User("Max", 20));
        users.add(new User("Helen", 35));
        users.add(new User("Mary", 25));
        System.out.println("��������� ������ ������������� �������� ���:");
        for (int i = 0; i < users.size(); i++) {
            System.out.println("������������ " + users.get(i).name
                    + ",\t������� " + users.get(i).age + " ���");
        }
        System.out.println("����� ���������� �� ����� ������ ������������� " +
                "�������� ���:");
        Collections.sort(users, new NameComparator());
        for (User user : users) {
            System.out.println("������������ " + user.name + ",\t������� "
                    + user.age + " ���");
        }
        System.out.println("����� ���������� �� �������� � �������� ������� " +
                "������ ������������� �������� ���:");
        Collections.sort(users, new AgeComparator());
        for (User user : users) {
            System.out.println("������������ " + user.name + ",\t������� "
                    + user.age + " ���");
        }
    }
}
