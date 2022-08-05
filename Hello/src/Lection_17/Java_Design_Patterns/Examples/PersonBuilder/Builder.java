package Lection_17.Java_Design_Patterns.Examples.PersonBuilder;

public interface Builder {
    void setName (String name);

    void setSurname (String surname);

    void setYearOfBirth(int yearOfBirth);
}
