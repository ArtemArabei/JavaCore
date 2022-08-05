package Lection_7.Principles_of_OOP.Interface.Abstract_class;

public class Driver extends Person {
    int experience;

    public Driver(String fullName, int experience, int age) {
        this.fullName = fullName;
        this.experience = experience;
        this.age = age;
    }

    public String toString() {
        return "Водитель: ФИО " + fullName + ", возраст " + age + " лет, опыт " + experience + " лет";
    }

}
