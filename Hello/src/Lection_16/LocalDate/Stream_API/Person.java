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
        return name + " " + surname + ", " + age + " лет";
    }

    public static void main(String[] args) {
        String[] names = {"Александр", "Сергей", "Дмитрий", "Алексей",
                "Андрей", "Максим", "Евгений", "Владимир", "Владислав",
                "Денис", "Михаил", "Николай", "Роман", "Игорь", "Артём",
                "Павел", "Олег", "Антон", "Юрий", "Иван", "Виталий", "Василий",
                "Виктор", "Никита", "Илья"};
        String[] surnames = {"Иванов", "Петров", "Смирнов", "Кузнецов",
                "Васильев", "Попов", "Волков", "Андреев", "Сергеев", "Новиков",
                "Соколов", "Михайлов", "Алексеев", "Павлов", "Романов",
                "Морозов", "Макаров", "Николаев", "Егоров", "Степанов",
                "Орлов", "Козлов", "Никитин", "Захаров", "Александров"};
        List<Person> groupOfPerson = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            groupOfPerson.add(new Person(names[(int) (Math.random() * 25)],
                    surnames[(int) (Math.random() * 25)],
                    (int) ((Math.random() * 16) + 15)));
        }

        System.out.println("У следующих людей возраст до 21 года:");

        Collection<String> groupOfChosenPerson = groupOfPerson.stream()
                .filter((p) -> p.getAge() < 21)
                .peek(p -> System.out.println(p.getName() + " "
                        + p.getSurname() + ", " + p.getAge() + " лет"))
                .sorted(Comparator.comparing(Person::getSurname)
                        .thenComparing(Person::getName))
                .limit(4)
                .map(Person::getSurname)
                .collect(Collectors.toList());

        System.out.println("\nФамилии 4 выбранных людей:");
        System.out.println(groupOfChosenPerson);
    }
}

