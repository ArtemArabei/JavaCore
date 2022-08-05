package Lection_5.Packages_classes_objects.Access_modifiers.Constructors;

public class Person2 {
    private String fullName;
    private int age;

    public Person2() {
        this("Иванов Иван Иванович", 25);
    }

    public Person2(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
        movePerson(this.fullName, this.age);
        talkPerson(this.fullName, this.age);
    }

    public void movePerson(String fullName, int age) {
        System.out.println(fullName + " возрастом " + age + " лет, ходит");
    }

    public void talkPerson(String fullName, int age) {
        System.out.println(fullName + " возрастом " + age + " лет, говорит");
    }
}
