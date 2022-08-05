package Lection_16.LocalDate.Stream_API;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " " + surname + ", " + age + " ���";
    }

    public static void main(String[] args) {
        String[] names = {"���������", "������", "�������", "�������",
                "������", "������", "�������", "��������", "���������",
                "�����", "������", "�������", "�����", "�����", "����",
                "�����", "����", "�����", "����", "����", "�������", "�������",
                "������", "������", "����"};
        String[] surnames = {"������", "������", "�������", "��������",
                "��������", "�����", "������", "�������", "�������", "�������",
                "�������", "��������", "��������", "������", "�������",
                "�������", "�������", "��������", "������", "��������",
                "�����", "������", "�������", "�������", "�����������"};
        List<Person> groupOfPerson = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            groupOfPerson.add(new Person(names[(int) (Math.random() * 25)],
                    surnames[(int) (Math.random() * 25)],
                    (int) ((Math.random() * 16) + 15)));
        }

        System.out.println("� ��������� ����� ������� �� 21 ����:");

        Collection<String> groupOfChosenPerson = groupOfPerson.stream()
                .filter((p) -> p.getAge() < 21)
                .peek(p -> System.out.println(p.getName() + " "
                        + p.getSurname() + ", " + p.getAge() + " ���"))
                .sorted(Comparator.comparing(Person::getSurname)
                        .thenComparing(Person::getName))
                .limit(4)
                .map(Person::getSurname)
                .collect(Collectors.toList());

        System.out.println("\n������� 4 ��������� �����:");
        System.out.println(groupOfChosenPerson);
    }
}

