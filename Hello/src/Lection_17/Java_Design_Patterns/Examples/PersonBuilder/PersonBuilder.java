package Lection_17.Java_Design_Patterns.Examples.PersonBuilder;

public class PersonBuilder implements Builder {
    private String name;
    private String surname;
    private int yearOfBirth;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Person getResult() {
        return new Person(name, surname, yearOfBirth);
    }
}
