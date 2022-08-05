package Lection_17.Java_Design_Patterns.Examples.PersonBuilder;

import java.util.Scanner;

public class DirectorPerson {

    public void createPerson(Builder builder) {
        System.out.println("¬ведите им€, после ввода нажмите Enter");
        Scanner entireText = new Scanner(System.in);
        String nameOfPerson = entireText.nextLine();
        System.out.println("¬ведите фамилию, после ввода нажмите Enter");
        Scanner entireText2 = new Scanner(System.in);
        String surnameOfPerson = entireText2.nextLine();
        System.out.println("¬ведите год рождени€, после ввода нажмите Enter");
        Scanner entireYear = new Scanner(System.in);
        int yearOfBirthOfPerson = entireYear.nextInt();
        builder.setName(nameOfPerson);
        builder.setSurname(surnameOfPerson);
        builder.setYearOfBirth(yearOfBirthOfPerson);
    }
}
