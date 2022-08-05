package Lection_18.XML.Parse.Student;

public class Student {
    String login;
    String name;
    String faculty;
    String telephone;
    Address address;

    @Override
    public String toString() {
        return "Student{" +
                "login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address=" + address +
                '}';
    }
}