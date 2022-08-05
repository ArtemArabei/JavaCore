package Lection_17.Java_Design_Patterns.Examples.PersonBuilder;

public class Person {
    private final String name;
    private final String surname;
    private final int yearOfBirth;

    public Person(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
