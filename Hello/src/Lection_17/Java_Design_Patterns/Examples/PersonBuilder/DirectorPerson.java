package Lection_17.Java_Design_Patterns.Examples.PersonBuilder;

import java.util.Scanner;

public class DirectorPerson {

    public void createPerson(Builder builder) {
        System.out.println("������� ���, ����� ����� ������� Enter");
        Scanner entireText = new Scanner(System.in);
        String nameOfPerson = entireText.nextLine();
        System.out.println("������� �������, ����� ����� ������� Enter");
        Scanner entireText2 = new Scanner(System.in);
        String surnameOfPerson = entireText2.nextLine();
        System.out.println("������� ��� ��������, ����� ����� ������� Enter");
        Scanner entireYear = new Scanner(System.in);
        int yearOfBirthOfPerson = entireYear.nextInt();
        builder.setName(nameOfPerson);
        builder.setSurname(surnameOfPerson);
        builder.setYearOfBirth(yearOfBirthOfPerson);
    }
}
