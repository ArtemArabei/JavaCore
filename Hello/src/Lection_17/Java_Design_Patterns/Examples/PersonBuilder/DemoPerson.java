package Lection_17.Java_Design_Patterns.Examples.PersonBuilder;

public class DemoPerson {
    public static void main(String[] args) {
       DirectorPerson director = new DirectorPerson();

        PersonBuilder builder = new PersonBuilder();

        director.createPerson(builder);
        Person person = builder.getResult();

        System.out.println("Person created:\n" + person.getName() + " " + person.getSurname() + " " + person.getYearOfBirth() + " year of birth");
    }
}
